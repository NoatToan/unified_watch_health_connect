package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MapIdleCallbackNative implements MapIdleCallback {
    private long peer;

    public static class MapIdleCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapIdleCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapIdleCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapIdleCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MapIdleCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.MapIdleCallback
    public native void run(MapIdle mapIdle);
}
