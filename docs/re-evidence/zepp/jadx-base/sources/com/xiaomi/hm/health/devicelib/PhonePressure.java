package com.xiaomi.hm.health.devicelib;

import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class PhonePressure {
    private long a = System.currentTimeMillis();
    private float b;

    public PhonePressure(float f) {
        this.b = f;
    }

    public float getPressure() {
        return this.b;
    }

    public long getTime() {
        return this.a;
    }

    public void setPressure(float f) {
        this.b = f;
    }

    public void setTime(long j) {
        this.a = j;
    }

    public String toString() {
        return "PhonePressure{time=" + new Date(this.a) + ", pressure=" + this.b + '}';
    }
}
