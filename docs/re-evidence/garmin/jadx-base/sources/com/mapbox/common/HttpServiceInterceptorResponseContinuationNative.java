package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpServiceInterceptorResponseContinuationNative implements HttpServiceInterceptorResponseContinuation {
    private long peer;

    public static class HttpServiceInterceptorResponseContinuationPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorResponseContinuationPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorResponseContinuationNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceInterceptorResponseContinuationNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpServiceInterceptorResponseContinuationPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpServiceInterceptorResponseContinuation
    public native void run(HttpResponse httpResponse);
}
