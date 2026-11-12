package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionMetadataCallbackNative implements TileRegionMetadataCallback {
    private long peer;

    public static class TileRegionMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionMetadataCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionMetadataCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionMetadataCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionMetadataCallback
    public native void run(Expected<TileRegionError, Value> expected);
}
