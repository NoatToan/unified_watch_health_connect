package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MapLoadingErrorCallbackNative implements MapLoadingErrorCallback {
    private long peer;

    public static class MapLoadingErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadingErrorCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadingErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadingErrorCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MapLoadingErrorCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public native void run(MapLoadingError mapLoadingError);
}
