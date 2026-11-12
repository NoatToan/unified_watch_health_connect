package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.location.DeviceLocationProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class TelemetryLocationProvider {
    protected long peer;

    public static class TelemetryLocationProviderPeerCleaner implements Runnable {
        private long peer;

        public TelemetryLocationProviderPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryLocationProvider.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryLocationProvider(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native DeviceLocationProvider getDeviceLocationProvider();

    public static native void setDeviceLocationProvider(DeviceLocationProvider deviceLocationProvider);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryLocationProviderPeerCleaner(j8));
    }
}
