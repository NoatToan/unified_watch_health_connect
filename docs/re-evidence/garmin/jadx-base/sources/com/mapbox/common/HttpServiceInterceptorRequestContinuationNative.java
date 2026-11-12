package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpServiceInterceptorRequestContinuationNative implements HttpServiceInterceptorRequestContinuation {
    private long peer;

    public static class HttpServiceInterceptorRequestContinuationPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorRequestContinuationPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorRequestContinuationNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceInterceptorRequestContinuationNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpServiceInterceptorRequestContinuationPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpServiceInterceptorRequestContinuation
    public native void run(HttpRequestOrResponse httpRequestOrResponse);
}
