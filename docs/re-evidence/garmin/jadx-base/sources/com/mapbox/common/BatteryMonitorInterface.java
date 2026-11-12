package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface BatteryMonitorInterface {
    void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);
}
