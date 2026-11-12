package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;

/* JADX INFO: loaded from: classes19.dex */
public class BFDeviceBatteryEvent extends BFDeviceEvent {
    private BatteryInfo b;

    public BFDeviceBatteryEvent(HMDeviceType hMDeviceType, BatteryInfo batteryInfo) {
        super(hMDeviceType);
        this.b = batteryInfo;
    }

    public BatteryInfo getBatteryInfo() {
        return this.b;
    }
}
