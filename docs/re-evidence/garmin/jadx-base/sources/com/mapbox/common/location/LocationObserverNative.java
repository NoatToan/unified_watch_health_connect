package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class LocationObserverNative implements LocationObserver {
    protected long peer;

    public static class LocationObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new LocationObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.location.LocationObserver
    public native void onLocationUpdateReceived(List<Location> list);
}
