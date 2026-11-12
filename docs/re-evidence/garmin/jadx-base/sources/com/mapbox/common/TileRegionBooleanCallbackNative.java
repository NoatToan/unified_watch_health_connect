package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class TileRegionBooleanCallbackNative implements TileRegionBooleanCallback {
    private long peer;

    public static class TileRegionBooleanCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionBooleanCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionBooleanCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionBooleanCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileRegionBooleanCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TileRegionBooleanCallback
    public native void run(Expected<TileRegionError, Boolean> expected);
}
