package com.twitter.auth;

import javax.ws.rs.Priorities;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import ch.ivyteam.ivy.rest.client.FeatureConfig;
import ch.ivyteam.ivy.rest.client.authentication.HttpBasicAuthenticationFeature;
import ch.ivyteam.ivy.rest.client.oauth2.OAuth2BearerFilter;
import ch.ivyteam.ivy.rest.client.oauth2.OAuth2TokenRequester.AuthContext;
import ch.ivyteam.ivy.rest.client.oauth2.uri.OAuth2UriProperty;

public class OAuth2Feature implements Feature
{
  public static interface Property
  {
***REMOVED***String CLIENT_ID = "API.key";
***REMOVED***String USER_KEY = "API.secretKey";
***REMOVED***String AUTH_BASE_URI = "AUTH.baseUri";
  }
  
  @Override
  public boolean configure(FeatureContext context)
  {
***REMOVED***var config = new FeatureConfig(context.getConfiguration(), OAuth2Feature.class);
***REMOVED***var oauth2 = new OAuth2BearerFilter(
***REMOVED***  OAuth2Feature::requestToken, 
***REMOVED***  new OAuth2UriProperty(config, Property.AUTH_BASE_URI, "https://api.twitter.com/oauth2")
***REMOVED***);
***REMOVED***context.register(oauth2, Priorities.AUTHORIZATION);
***REMOVED***return true;
  }
  
  private static Response requestToken(AuthContext ctxt)
  {
***REMOVED***Form authForm = new Form("grant_type", "client_credentials");
***REMOVED***var response = ctxt.target
***REMOVED***  .register(HttpBasicAuthenticationFeature.basic(
***REMOVED******REMOVED*** ctxt.config.readMandatory(Property.CLIENT_ID), 
***REMOVED******REMOVED*** ctxt.config.readMandatory(Property.USER_KEY))
***REMOVED***  )
***REMOVED***  .request()
***REMOVED***  .post(Entity.form(authForm));
***REMOVED***return response;
  }
}
