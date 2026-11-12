package com.huawei.hms.framework.network.restclient.hwhttp;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface Interceptor {

    /* JADX INFO: loaded from: classes34.dex */
    @Deprecated
    public interface Chain {
        Response proceed(Request request) throws IOException;

        Request request();
    }

    Response intercept(Chain chain) throws IOException;
}
