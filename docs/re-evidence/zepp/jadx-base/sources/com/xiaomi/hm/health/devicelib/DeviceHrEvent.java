package com.xiaomi.hm.health.devicelib;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceHrEvent {
    private int a;
    private int b;
    private HMDeviceSource c;

    public DeviceHrEvent() {
        this.a = 1;
        this.b = -1;
        this.c = HMDeviceSource.VDEVICE;
    }

    public int getHr() {
        return this.b;
    }

    public HMDeviceSource getSource() {
        return this.c;
    }

    public int getState() {
        return this.a;
    }

    public boolean isDisconnected() {
        return this.a == 2;
    }

    public boolean isLowBattery() {
        return this.a == 3;
    }

    public boolean isSuccess() {
        return this.a == 1;
    }

    public boolean isTimeout() {
        return this.a == 4;
    }

    public void setSource(HMDeviceSource hMDeviceSource) {
        this.c = hMDeviceSource;
    }

    public void setState(int i) {
        this.a = i;
    }

    public String toString() {
        return "DeviceHrEvent{mSource:" + this.c + ",mState=" + this.a + ",mHr=" + this.b + '}';
    }

    public DeviceHrEvent(HMDeviceSource hMDeviceSource, int i, int i2) {
        this.a = 1;
        this.b = -1;
        this.c = HMDeviceSource.VDEVICE;
        this.c = hMDeviceSource;
        this.a = i;
        this.b = i2;
    }

    public DeviceHrEvent(HMDeviceSource hMDeviceSource, int i) {
        this.a = 1;
        this.b = -1;
        this.c = HMDeviceSource.VDEVICE;
        this.c = hMDeviceSource;
        this.b = i;
    }

    public DeviceHrEvent(int i) {
        this.a = 1;
        this.b = -1;
        this.c = HMDeviceSource.VDEVICE;
        this.b = i;
    }
}
