package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class CustomRasterSourceTileRendererNative implements CustomRasterSourceTileRenderer {
    protected long peer;

    public static class CustomRasterSourceTileRendererPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileRendererPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileRendererNative.cleanNativePeer(this.peer);
        }
    }

    public CustomRasterSourceTileRendererNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CustomRasterSourceTileRendererPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void contextLost();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void initialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
