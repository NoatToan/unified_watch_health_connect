package com.ximalaya.ting.android.sdkdownloader.http;

import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;

/* JADX INFO: loaded from: classes22.dex */
final class b implements RequestTracker {
    private final RequestTracker a;

    public b(RequestTracker requestTracker) {
        this.a = requestTracker;
    }

    public void a(String str, Throwable th) {
        Logger.e("RequestTrackerWrapper", str, th);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onCancelled(UriRequest uriRequest) {
        try {
            this.a.onCancelled(uriRequest);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onError(UriRequest uriRequest, Throwable th, boolean z) {
        try {
            this.a.onError(uriRequest, th, z);
        } catch (Throwable th2) {
            a(th2.getMessage(), th2);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onFinished(UriRequest uriRequest) {
        try {
            this.a.onFinished(uriRequest);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onRemoved(UriRequest uriRequest) {
        try {
            this.a.onRemoved(uriRequest);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onRequestCreated(UriRequest uriRequest) {
        try {
            this.a.onRequestCreated(uriRequest);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onStart(RequestParams requestParams) {
        try {
            this.a.onStart(requestParams);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onSuccess(UriRequest uriRequest, Object obj) {
        try {
            this.a.onSuccess(uriRequest, obj);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker
    public void onWaiting(RequestParams requestParams) {
        try {
            this.a.onWaiting(requestParams);
        } catch (Throwable th) {
            a(th.getMessage(), th);
        }
    }
}
