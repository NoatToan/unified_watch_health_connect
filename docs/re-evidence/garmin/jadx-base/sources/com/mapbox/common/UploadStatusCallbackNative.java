package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class UploadStatusCallbackNative implements UploadStatusCallback {
    private long peer;

    public static class UploadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public UploadStatusCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private UploadStatusCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new UploadStatusCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.UploadStatusCallback
    public native void run(UploadStatus uploadStatus);
}
