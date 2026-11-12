package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class CustomLayerHostNative implements CustomLayerHost {
    protected long peer;

    public static class CustomLayerHostPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerHostPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerHostNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerHostNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CustomLayerHostPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void contextLost();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void initialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void render(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
