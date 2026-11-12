package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class DownloadStatusCallbackNative implements DownloadStatusCallback {
    private long peer;

    public static class DownloadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public DownloadStatusCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private DownloadStatusCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new DownloadStatusCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.DownloadStatusCallback
    public native void run(DownloadStatus downloadStatus);
}
