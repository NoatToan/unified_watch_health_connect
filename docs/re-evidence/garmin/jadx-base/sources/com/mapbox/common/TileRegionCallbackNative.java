package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionCallbackNative implements TileRegionCallback {
    private long peer;

    public static class TileRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionCallback
    public native void run(Expected<TileRegionError, TileRegion> expected);
}
