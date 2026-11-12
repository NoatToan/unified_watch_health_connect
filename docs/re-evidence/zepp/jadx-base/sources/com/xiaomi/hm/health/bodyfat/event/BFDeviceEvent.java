package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes19.dex */
public class BFDeviceEvent {
    private HMDeviceType a;

    public BFDeviceEvent(HMDeviceType hMDeviceType) {
        this.a = HMDeviceType.MILI;
        this.a = hMDeviceType;
    }

    public HMDeviceType getDeviceType() {
        return this.a;
    }
}
