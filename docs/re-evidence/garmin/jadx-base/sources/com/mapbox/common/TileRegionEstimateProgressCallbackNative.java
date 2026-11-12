package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionEstimateProgressCallbackNative implements TileRegionEstimateProgressCallback {
    private long peer;

    public static class TileRegionEstimateProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionEstimateProgressCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionEstimateProgressCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionEstimateProgressCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionEstimateProgressCallback
    public native void run(TileRegionEstimateProgress tileRegionEstimateProgress);
}
