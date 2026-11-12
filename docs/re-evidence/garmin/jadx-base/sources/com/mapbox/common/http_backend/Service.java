package com.mapbox.common.http_backend;

import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface Service {
    void cancelRequest(long j8, ResultCallback resultCallback);

    long request(Request request, RequestObserver requestObserver);

    void setMaxRequestsPerHost(byte b14);

    boolean supportsKeepCompression();
}
