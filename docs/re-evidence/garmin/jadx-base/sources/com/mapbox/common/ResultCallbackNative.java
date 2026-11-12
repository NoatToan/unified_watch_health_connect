package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ResultCallbackNative implements ResultCallback {
    private long peer;

    public static class ResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResultCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResultCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ResultCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ResultCallback
    public native void run(boolean z14);
}
