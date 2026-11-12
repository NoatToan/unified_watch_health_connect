package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMVibrateType;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceVibrateEvent extends HMDeviceEvent {
    private HMVibrateType b;

    public HMDeviceVibrateEvent(HMVibrateType hMVibrateType) {
        super(HMDeviceType.MILI);
        this.b = HMVibrateType.MOTOR_UNKNOWN;
        this.b = hMVibrateType;
    }

    public HMVibrateType getVibrateType() {
        return this.b;
    }
}
