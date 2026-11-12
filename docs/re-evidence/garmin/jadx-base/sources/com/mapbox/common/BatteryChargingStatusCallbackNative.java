package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class BatteryChargingStatusCallbackNative implements BatteryChargingStatusCallback {
    private long peer;

    public static class BatteryChargingStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public BatteryChargingStatusCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryChargingStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private BatteryChargingStatusCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new BatteryChargingStatusCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.BatteryChargingStatusCallback
    public native void run(Expected<String, Boolean> expected);
}
