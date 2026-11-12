package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceBatteryEvent extends HMDeviceEvent {
    private BatteryInfo b;

    public HMDeviceBatteryEvent(HMDeviceType hMDeviceType, BatteryInfo batteryInfo) {
        super(hMDeviceType);
        this.b = null;
        this.b = batteryInfo;
    }

    public BatteryInfo getBatteryInfo() {
        return this.b;
    }
}
