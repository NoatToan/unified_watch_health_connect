package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class OfflineRegionObserverNative implements OfflineRegionObserver {
    protected long peer;

    public static class OfflineRegionObserverPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionObserverNative.cleanNativePeer(this.peer);
        }
    }

    public OfflineRegionObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineRegionObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void errorOccurred(OfflineRegionError offlineRegionError);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void statusChanged(OfflineRegionStatus offlineRegionStatus);
}
