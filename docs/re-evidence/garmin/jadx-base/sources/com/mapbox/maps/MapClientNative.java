package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MapClientNative implements MapClient {
    protected long peer;

    public static class MapClientPeerCleaner implements Runnable {
        private long peer;

        public MapClientPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapClientNative.cleanNativePeer(this.peer);
        }
    }

    public MapClientNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MapClientPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.MapClient
    public native void scheduleRepaint();
}
