package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceAlarmEvent extends HMDeviceEvent {
    public boolean fromDevice;

    public HMDeviceAlarmEvent(HMDeviceType hMDeviceType) {
        super(hMDeviceType);
        this.fromDevice = true;
    }

    @Override // com.xiaomi.hm.health.device.event.HMDeviceEvent
    public HMDeviceType getDeviceType() {
        return super.getDeviceType();
    }
}
