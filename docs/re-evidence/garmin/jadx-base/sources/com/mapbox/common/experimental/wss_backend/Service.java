package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface Service {
    void cancelConnection(long j8, ResultCallback resultCallback);

    long connect(Request request, RequestObserver requestObserver);

    void setPingTimeout(long j8);

    void write(long j8, Data data);
}
