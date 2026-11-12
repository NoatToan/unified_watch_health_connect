package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpServiceInterceptorInterfaceNative implements HttpServiceInterceptorInterface {
    protected long peer;

    public static class HttpServiceInterceptorInterfacePeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public HttpServiceInterceptorInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpServiceInterceptorInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
