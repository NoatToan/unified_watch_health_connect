package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MapLoadedCallbackNative implements MapLoadedCallback {
    private long peer;

    public static class MapLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MapLoadedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.MapLoadedCallback
    public native void run(MapLoaded mapLoaded);
}
