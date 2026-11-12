package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class BatteryMonitorObserverNative implements BatteryMonitorObserver {
    protected long peer;

    public static class BatteryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new BatteryMonitorObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryChargingStatusChanged(boolean z14);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryStatusError(String str);
}
