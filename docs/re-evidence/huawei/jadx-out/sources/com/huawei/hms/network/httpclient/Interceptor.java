package com.huawei.hms.network.httpclient;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Interceptor {

    /* JADX INFO: loaded from: classes34.dex */
    public static abstract class Chain {
        public abstract Response<ResponseBody> proceed(Request request) throws IOException;

        public abstract Request request();

        public abstract RequestFinishedInfo requestFinishedInfo();
    }

    public abstract Response<ResponseBody> intercept(Chain chain) throws IOException;
}
