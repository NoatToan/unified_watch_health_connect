package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionLoadProgressCallbackNative implements TileRegionLoadProgressCallback {
    private long peer;

    public static class TileRegionLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionLoadProgressCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionLoadProgressCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionLoadProgressCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionLoadProgressCallback
    public native void run(TileRegionLoadProgress tileRegionLoadProgress);
}
