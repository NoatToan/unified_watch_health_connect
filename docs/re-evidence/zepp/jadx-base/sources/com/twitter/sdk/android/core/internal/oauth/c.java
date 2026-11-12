package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes18.dex */
abstract class c {
    private static final String e = "TwitterAndroidSDK";
    private final TwitterCore a;
    private final TwitterApi b;
    private final String c;
    private final Retrofit d = new Retrofit.Builder().baseUrl(getApi().getBaseHostUrl()).client(new OkHttpClient.Builder().addInterceptor(new a()).certificatePinner(OkHttpClientHelper.getCertificatePinner()).build()).addConverterFactory(GsonConverterFactory.create()).build();

    public class a implements Interceptor {
        public a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", c.this.getUserAgent()).build());
        }
    }

    public c(TwitterCore twitterCore, TwitterApi twitterApi) {
        this.a = twitterCore;
        this.b = twitterApi;
        this.c = TwitterApi.buildUserAgent(e, twitterCore.getVersion());
    }

    public TwitterApi getApi() {
        return this.b;
    }

    public Retrofit getRetrofit() {
        return this.d;
    }

    public TwitterCore getTwitterCore() {
        return this.a;
    }

    public String getUserAgent() {
        return this.c;
    }
}
