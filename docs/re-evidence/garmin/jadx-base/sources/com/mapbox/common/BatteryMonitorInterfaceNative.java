package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class BatteryMonitorInterfaceNative implements BatteryMonitorInterface {
    protected long peer;

    public static class BatteryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new BatteryMonitorInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);
}
