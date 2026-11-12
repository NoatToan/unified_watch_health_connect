package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryMonitorFactory {
    protected long peer;

    public static class BatteryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BatteryMonitorFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native BatteryMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new BatteryMonitorFactoryPeerCleaner(j8));
    }

    public static native void setUserDefined(BatteryMonitorInterface batteryMonitorInterface);
}
