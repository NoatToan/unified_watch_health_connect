package com.xiaomi.hm.health.devicelib;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.GaitInfo;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceStep {
    private HMDeviceSource a;
    private int b;
    private long c;
    private int d;
    private int e;
    private GaitInfo f;

    public DeviceStep() {
        this.a = HMDeviceSource.VDEVICE;
        this.b = -1;
        this.c = 0L;
        this.d = 0;
        this.e = -1;
        this.f = null;
    }

    public int getBrandType() {
        return this.b;
    }

    public int getFront() {
        return this.e;
    }

    public HMDeviceSource getSource() {
        return this.a;
    }

    public GaitInfo getStepInfo() {
        return this.f;
    }

    public long getTime() {
        return this.c;
    }

    public int getTotal() {
        return this.d;
    }

    public void setBrandType(int i) {
        this.b = i;
    }

    public void setFront(int i) {
        this.e = i;
    }

    public void setSource(HMDeviceSource hMDeviceSource) {
        this.a = hMDeviceSource;
    }

    public void setStepInfo(GaitInfo gaitInfo) {
        this.f = gaitInfo;
    }

    public void setTime(long j) {
        this.c = j;
    }

    public void setTotal(int i) {
        this.d = i;
    }

    public String toString() {
        return "{source=" + this.a + ", brandType=" + this.b + ", time=" + this.c + ", total=" + this.d + ", front=" + this.e + ", stepInfo=" + this.f + '}';
    }

    public DeviceStep(HMDeviceSource hMDeviceSource, int i, int i2) {
        this(hMDeviceSource, i, i2, null);
    }

    private DeviceStep(HMDeviceSource hMDeviceSource, int i, int i2, GaitInfo gaitInfo) {
        this(hMDeviceSource, -1, i, i2, gaitInfo);
    }

    public DeviceStep(HMDeviceSource hMDeviceSource, int i, int i2, int i3, GaitInfo gaitInfo) {
        this.a = HMDeviceSource.VDEVICE;
        this.b = -1;
        this.c = 0L;
        this.d = 0;
        this.e = -1;
        this.f = null;
        this.a = hMDeviceSource;
        this.d = i2;
        this.e = i3;
        this.f = gaitInfo;
        this.c = System.currentTimeMillis();
        this.b = i;
    }
}
