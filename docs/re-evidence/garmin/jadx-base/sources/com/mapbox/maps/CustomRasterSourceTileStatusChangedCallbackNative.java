package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class CustomRasterSourceTileStatusChangedCallbackNative implements CustomRasterSourceTileStatusChangedCallback {
    private long peer;

    public static class CustomRasterSourceTileStatusChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileStatusChangedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileStatusChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CustomRasterSourceTileStatusChangedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CustomRasterSourceTileStatusChangedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CustomRasterSourceTileStatusChangedCallback
    public native void run(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);
}
