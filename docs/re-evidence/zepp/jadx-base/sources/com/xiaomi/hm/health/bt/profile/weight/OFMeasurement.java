package com.xiaomi.hm.health.bt.profile.weight;

/* JADX INFO: loaded from: classes18.dex */
public class OFMeasurement {
    public static final int FLAG_MEASURED = 2;
    public static final int FLAG_MEASURING = 1;
    public int a;
    public int b;

    public OFMeasurement() {
        this.a = 1;
        this.b = 0;
    }

    public int getFlag() {
        return this.a;
    }

    public int getTime() {
        return this.b;
    }

    public boolean isFinish() {
        return this.a == 2;
    }

    public void setFlag(int flag) {
        this.a = flag;
    }

    public void setTime(int time) {
        this.b = time;
    }

    public String toString() {
        return "OFMeasurement{flag=" + this.a + ", time=" + this.b + '}';
    }

    public OFMeasurement(int flag, int time) {
        this.a = 1;
        this.b = 0;
        this.a = flag;
        this.b = time;
    }
}
