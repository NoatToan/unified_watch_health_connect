package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class LocationServiceObserverNative implements LocationServiceObserver {
    protected long peer;

    public static class LocationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new LocationServiceObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAvailabilityChanged(boolean z14);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
