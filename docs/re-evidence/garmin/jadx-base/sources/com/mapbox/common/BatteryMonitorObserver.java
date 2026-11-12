package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface BatteryMonitorObserver {
    void onBatteryChargingStatusChanged(boolean z14);

    void onBatteryStatusError(String str);
}
