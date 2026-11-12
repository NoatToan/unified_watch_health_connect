package com.xiaomi.hm.health.devicelib;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceBattery {
    private int a;

    public DeviceBattery(int i) {
        this.a = 100;
        this.a = i;
    }

    public int getLevel() {
        return this.a;
    }
}
