package com.xiaomi.hm.health.devicelib;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceHr {
    private HMDeviceSource a;
    private long b = System.currentTimeMillis();
    private int c;

    public DeviceHr(HMDeviceSource hMDeviceSource, int i) {
        this.a = HMDeviceSource.VDEVICE;
        this.a = hMDeviceSource;
        this.c = i;
    }

    public int getHr() {
        return this.c;
    }

    public HMDeviceSource getSource() {
        return this.a;
    }

    public long getTime() {
        return this.b;
    }

    public void setHr(int i) {
        this.c = i;
    }

    public void setSource(HMDeviceSource hMDeviceSource) {
        this.a = hMDeviceSource;
    }

    public void setTime(long j) {
        this.b = j;
    }

    public String toString() {
        return "DeviceHr{source=" + this.a + ", time=" + new Date(this.b) + ", hr=" + this.c + '}';
    }
}
