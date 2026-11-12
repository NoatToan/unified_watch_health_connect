package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionGeometryCallbackNative implements TileRegionGeometryCallback {
    private long peer;

    public static class TileRegionGeometryCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionGeometryCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionGeometryCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionGeometryCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionGeometryCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionGeometryCallback
    public native void run(Expected<TileRegionError, Geometry> expected);
}
