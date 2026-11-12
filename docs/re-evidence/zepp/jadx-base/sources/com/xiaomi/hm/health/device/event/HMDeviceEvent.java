package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceEvent {
    private HMDeviceType a;

    public HMDeviceEvent(HMDeviceType hMDeviceType) {
        this.a = HMDeviceType.MILI;
        this.a = hMDeviceType;
    }

    public HMDeviceType getDeviceType() {
        return this.a;
    }
}
