package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class OAuth1aHeaders {
    public static final String HEADER_AUTH_CREDENTIALS = "X-Verify-Credentials-Authorization";
    public static final String HEADER_AUTH_SERVICE_PROVIDER = "X-Auth-Service-Provider";

    public b a(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return new b(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
    }

    public String getAuthorizationHeader(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return a(twitterAuthConfig, twitterAuthToken, str, str2, str3, map).e();
    }

    public Map<String, String> getOAuthEchoHeaders(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        HashMap map2 = new HashMap(2);
        map2.put(HEADER_AUTH_CREDENTIALS, getAuthorizationHeader(twitterAuthConfig, twitterAuthToken, str, str2, str3, map));
        map2.put(HEADER_AUTH_SERVICE_PROVIDER, str3);
        return map2;
    }
}
