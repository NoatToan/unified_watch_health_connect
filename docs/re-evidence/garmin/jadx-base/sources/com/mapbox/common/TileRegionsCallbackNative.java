package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionsCallbackNative implements TileRegionsCallback {
    private long peer;

    public static class TileRegionsCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionsCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionsCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionsCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionsCallback
    public native void run(Expected<TileRegionError, List<TileRegion>> expected);
}
