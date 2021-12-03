package com.axonivy.connector.twitter.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.twitter.api.client.Tweet;
import com.twitter.api.client.User;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;

@IvyProcessTest
public class TwitterTest {

  private static final BpmProcess testee = BpmProcess.path("Twitter");

  @BeforeEach
  void beforeEach(AppFixture fixture) {
***REMOVED***fixture.environment("test");
  }

  @Test
  void findUser(BpmClient bpmClient) throws NoSuchFieldException {
***REMOVED***BpmElement startable = testee.elementName("findUser(String)");
***REMOVED***ExecutionResult result = bpmClient.start().subProcess(startable).execute("axonivy");
***REMOVED***var user = (User) result.data().last().get("user");
***REMOVED***assertThat(user.getName()).isEqualTo("Axon Ivy");
***REMOVED***assertThat(user.getUsername()).isEqualTo("axonivy");
  }

  @Test
  void findTweets(BpmClient bpmClient) throws NoSuchFieldException {
***REMOVED***BpmElement startable = testee.elementName("findTweets(String)");
***REMOVED***ExecutionResult result = bpmClient.start().subProcess(startable).execute("axonivy");
***REMOVED***@SuppressWarnings("unchecked")
***REMOVED***var tweets = (List<Tweet>) result.data().last().get("tweets");
***REMOVED***assertThat(tweets).hasSize(1);
***REMOVED***assertThat(tweets.get(0).getText()).isEqualTo("this is a test tweet: axonivy.");
  }
}
