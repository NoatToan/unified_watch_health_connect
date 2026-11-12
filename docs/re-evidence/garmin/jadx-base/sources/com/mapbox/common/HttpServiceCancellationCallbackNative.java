package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpServiceCancellationCallbackNative implements HttpServiceCancellationCallback {
    private long peer;

    public static class HttpServiceCancellationCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceCancellationCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceCancellationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceCancellationCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpServiceCancellationCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpServiceCancellationCallback
    public native void run(long j8, HttpRequest httpRequest);
}
