package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceRealtimeStepEvent extends HMDeviceEvent {
    private RealtimeStep b;

    public HMDeviceRealtimeStepEvent(HMDeviceType hMDeviceType, RealtimeStep realtimeStep) {
        super(hMDeviceType);
        this.b = null;
        this.b = realtimeStep;
    }

    public RealtimeStep getRealtimeStep() {
        return this.b;
    }

    public String toString() {
        return "RealtimeStep:" + this.b.toString();
    }
}
