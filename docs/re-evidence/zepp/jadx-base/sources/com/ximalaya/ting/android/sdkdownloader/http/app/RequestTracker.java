package com.ximalaya.ting.android.sdkdownloader.http.app;

import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;

/* JADX INFO: loaded from: classes22.dex */
public interface RequestTracker {
    void onCancelled(UriRequest uriRequest);

    void onError(UriRequest uriRequest, Throwable th, boolean z);

    void onFinished(UriRequest uriRequest);

    void onRemoved(UriRequest uriRequest);

    void onRequestCreated(UriRequest uriRequest);

    void onStart(RequestParams requestParams);

    void onSuccess(UriRequest uriRequest, Object obj);

    void onWaiting(RequestParams requestParams);
}
