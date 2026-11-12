package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestObserver {
    void onData(long j8, WsOpCode wsOpCode, boolean z14);

    void onFailed(long j8, HttpRequestError httpRequestError, Integer num);

    void onResponse(long j8, ResponseData responseData);

    void onSucceeded(long j8);

    void onSwitchingProtocols(long j8);
}
