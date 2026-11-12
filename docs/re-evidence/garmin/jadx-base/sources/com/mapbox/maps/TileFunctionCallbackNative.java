package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class TileFunctionCallbackNative implements TileFunctionCallback {
    private long peer;

    public static class TileFunctionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileFunctionCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileFunctionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileFunctionCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TileFunctionCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.TileFunctionCallback
    public native void run(CanonicalTileID canonicalTileID);
}
