package com.axonivy.connector.twitter;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Hidden;

@Path("twitterMock/2")
@PermitAll
@Hidden
public class TwitterMock {

  @GET
  @Path("users/by/username/{username}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response findUser(@PathParam("username") String username) {
***REMOVED***return Response.status(200)
***REMOVED******REMOVED******REMOVED***.entity("{\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***\"data\": {\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"id\": \"2829273353\",\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"name\": \"Axon Ivy\",\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"username\": \"" + username + "\"\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***}\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "}")
***REMOVED******REMOVED******REMOVED***.build();
  }

  @GET
  @Path("tweets/search/recent")
  @Produces(MediaType.APPLICATION_JSON)
  public Response findTweets(@QueryParam("query") String query) {
***REMOVED***return Response.status(200)
***REMOVED******REMOVED******REMOVED***.entity("{\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***\"data\": [\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***{\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED******REMOVED***\"id\": \"1466242658364391426\",\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED******REMOVED***\"text\": \"this is a test tweet: " + query + ".\"\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***}\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***],\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***\"meta\": {\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"newest_id\": \"1466242658364391426\",\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"oldest_id\": \"1466242658364391426\",\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED******REMOVED***\"result_count\": 1\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "***REMOVED***}\n"
***REMOVED******REMOVED******REMOVED******REMOVED******REMOVED***+ "}")
***REMOVED******REMOVED******REMOVED***.build();
  }
}
