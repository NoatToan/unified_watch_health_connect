package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServiceFactory {
    protected long peer;

    public static class LocationServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceFactory.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static LocationService getOrCreate() {
        return LocationServiceImpl.createPlatformLocationService();
    }

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new LocationServiceFactoryPeerCleaner(j8));
    }
}
