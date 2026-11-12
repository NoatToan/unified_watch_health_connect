package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionEstimateResultCallbackNative implements TileRegionEstimateResultCallback {
    private long peer;

    public static class TileRegionEstimateResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionEstimateResultCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionEstimateResultCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionEstimateResultCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionEstimateResultCallback
    public native void run(Expected<TileRegionError, TileRegionEstimateResult> expected);
}
