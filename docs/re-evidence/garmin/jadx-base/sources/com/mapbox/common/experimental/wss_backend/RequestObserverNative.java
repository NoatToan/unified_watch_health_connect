package com.mapbox.common.experimental.wss_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes2.dex */
final class RequestObserverNative implements RequestObserver {
    protected long peer;

    public static class RequestObserverPeerCleaner implements Runnable {
        private long peer;

        public RequestObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RequestObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new RequestObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onData(long j8, WsOpCode wsOpCode, boolean z14);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onFailed(long j8, HttpRequestError httpRequestError, Integer num);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onResponse(long j8, ResponseData responseData);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSucceeded(long j8);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSwitchingProtocols(long j8);
}
