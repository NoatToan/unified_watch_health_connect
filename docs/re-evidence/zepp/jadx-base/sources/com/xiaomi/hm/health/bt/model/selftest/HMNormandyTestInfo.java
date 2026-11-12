package com.xiaomi.hm.health.bt.model.selftest;

/* JADX INFO: loaded from: classes19.dex */
public class HMNormandyTestInfo {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public HMNormandyTestInfo() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public boolean isAdcOk() {
        return this.e;
    }

    public boolean isFlashIdOk() {
        return this.a;
    }

    public boolean isFlashRwOk() {
        return this.b;
    }

    public boolean isSensorIdOk() {
        return this.c;
    }

    public boolean isSensorTestOk() {
        return this.d;
    }

    public String toString() {
        return "HMNormandyTestInfo{flashIdOk=" + this.a + ", flashRwOk=" + this.b + ", sensorIdOk=" + this.c + ", sensorTestOk=" + this.d + ", adcOk=" + this.e + '}';
    }

    public HMNormandyTestInfo(boolean flashIdOk, boolean flashRwOk, boolean sensorIdOk, boolean sensorTestOk, boolean adcOk) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.a = flashIdOk;
        this.b = flashRwOk;
        this.c = sensorIdOk;
        this.d = sensorTestOk;
        this.e = adcOk;
    }
}
