package com.huawei.openalliance.ad.net.http;

import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes12.dex */
public interface i {
    HttpConnection a(Request request);

    OkHttpClient.Builder a(OkHttpClient.Builder builder);
}
