package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class DeviceLocationProviderFactoryNative implements DeviceLocationProviderFactory {
    protected long peer;

    public static class DeviceLocationProviderFactoryPeerCleaner implements Runnable {
        private long peer;

        public DeviceLocationProviderFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderFactoryNative.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderFactoryNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new DeviceLocationProviderFactoryPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.location.DeviceLocationProviderFactory
    public native Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);
}
