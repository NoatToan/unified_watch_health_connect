package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class OAuth1aInterceptor implements Interceptor {
    public final Session<? extends TwitterAuthToken> a;
    public final TwitterAuthConfig b;

    public OAuth1aInterceptor(Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        this.a = session;
        this.b = twitterAuthConfig;
    }

    public String a(Request request) throws IOException {
        return new OAuth1aHeaders().getAuthorizationHeader(this.b, (TwitterAuthToken) this.a.getAuthToken(), null, request.method(), request.url().toString(), b(request));
    }

    public Map<String, String> b(Request request) throws IOException {
        HashMap map = new HashMap();
        if ("POST".equals(request.method().toUpperCase(Locale.US))) {
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody instanceof FormBody) {
                FormBody formBody = (FormBody) requestBodyBody;
                for (int i = 0; i < formBody.size(); i++) {
                    map.put(formBody.encodedName(i), formBody.value(i));
                }
            }
        }
        return map;
    }

    public HttpUrl c(HttpUrl httpUrl) {
        HttpUrl.Builder builderQuery = httpUrl.newBuilder().query(null);
        int iQuerySize = httpUrl.querySize();
        for (int i = 0; i < iQuerySize; i++) {
            builderQuery.addEncodedQueryParameter(UrlUtils.percentEncode(httpUrl.queryParameterName(i)), UrlUtils.percentEncode(httpUrl.queryParameterValue(i)));
        }
        return builderQuery.build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request requestBuild = request.newBuilder().url(c(request.url())).build();
        return chain.proceed(requestBuild.newBuilder().header("Authorization", a(requestBuild)).build());
    }
}
