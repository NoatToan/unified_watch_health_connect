package com.xiaomi.account.http;

import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public abstract class HttpFactory {
    public HttpClient createHttpClient() {
        return createHttpClient(new HttpClientConfig.Builder().build());
    }

    public abstract HttpClient createHttpClient(HttpClientConfig httpClientConfig);

    public HttpClient createHttpClient(Network network) {
        return createHttpClient(new HttpClientConfig.Builder().network(network).build());
    }
}
