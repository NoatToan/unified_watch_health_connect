package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceBindEvent extends HMDeviceEvent {
    private boolean b;

    public HMDeviceBindEvent(boolean z, HMDeviceType hMDeviceType) {
        super(hMDeviceType);
        this.b = false;
        this.b = z;
    }

    public boolean isBound() {
        return this.b;
    }

    public String toString() {
        return "HMDeviceBindEvent{mIsBound=" + this.b + ", type: " + getDeviceType() + '}';
    }
}
