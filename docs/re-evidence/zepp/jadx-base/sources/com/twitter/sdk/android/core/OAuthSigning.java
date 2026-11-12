package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class OAuthSigning {
    public static final String d = "https://api.twitter.com/1.1/account/verify_credentials.json";
    public final TwitterAuthConfig a;
    public final TwitterAuthToken b;
    public final OAuth1aHeaders c;

    public OAuthSigning(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken) {
        this(twitterAuthConfig, twitterAuthToken, new OAuth1aHeaders());
    }

    public String getAuthorizationHeader(String str, String str2, Map<String, String> map) {
        return this.c.getAuthorizationHeader(this.a, this.b, null, str, str2, map);
    }

    public Map<String, String> getOAuthEchoHeaders(String str, String str2, Map<String, String> map) {
        return this.c.getOAuthEchoHeaders(this.a, this.b, null, str, str2, map);
    }

    public Map<String, String> getOAuthEchoHeadersForVerifyCredentials() {
        return this.c.getOAuthEchoHeaders(this.a, this.b, null, "GET", d, null);
    }

    public OAuthSigning(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, OAuth1aHeaders oAuth1aHeaders) {
        if (twitterAuthConfig == null) {
            throw new IllegalArgumentException("authConfig must not be null");
        }
        if (twitterAuthToken == null) {
            throw new IllegalArgumentException("authToken must not be null");
        }
        this.a = twitterAuthConfig;
        this.b = twitterAuthToken;
        this.c = oAuth1aHeaders;
    }
}
