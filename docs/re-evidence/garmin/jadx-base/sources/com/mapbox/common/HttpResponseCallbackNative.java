package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpResponseCallbackNative implements HttpResponseCallback {
    private long peer;

    public static class HttpResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpResponseCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpResponseCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpResponseCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpResponseCallback
    public native void run(HttpResponse httpResponse);
}
