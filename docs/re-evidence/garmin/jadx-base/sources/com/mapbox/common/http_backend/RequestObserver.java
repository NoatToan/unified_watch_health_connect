package com.mapbox.common.http_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestObserver {
    void onData(long j8);

    void onFailed(long j8, HttpRequestError httpRequestError);

    void onResponse(long j8, ResponseData responseData);

    void onSucceeded(long j8);
}
