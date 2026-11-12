package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceAuthEvent extends HMDeviceEvent {
    private HMAuthState b;
    private HMDeviceSource c;

    public HMDeviceAuthEvent(HMDeviceSource hMDeviceSource, HMAuthState hMAuthState) {
        super(hMDeviceSource.getType());
        this.b = hMAuthState;
        this.c = hMDeviceSource;
    }

    public HMDeviceSource getDeviceSource() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.device.event.HMDeviceEvent
    public HMDeviceType getDeviceType() {
        return super.getDeviceType();
    }

    public HMAuthState getState() {
        return this.b;
    }

    public String toString() {
        return "{state=" + this.b + ", source=" + this.c + '}';
    }
}
