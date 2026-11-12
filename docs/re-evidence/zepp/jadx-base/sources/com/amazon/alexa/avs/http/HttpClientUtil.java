package com.amazon.alexa.avs.http;

import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class HttpClientUtil {
    private static final long PING_INTERVAL = 5;
    private static final long READ_TIMEOUT = 60;

    public static OkHttpClient createNewHttpClient() {
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return builderNewBuilder.pingInterval(5L, timeUnit).connectionPool(new ConnectionPool(1, 5L, timeUnit)).readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).build();
    }
}
