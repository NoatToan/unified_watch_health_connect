package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityRunningData {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ActivityRunningData() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = -1;
    }

    public int getFrontSteps() {
        return this.c * 2;
    }

    public int getMode() {
        return this.e;
    }

    public float getPercent() {
        return this.b / 15.0f;
    }

    public int getTime() {
        return this.a * 10;
    }

    public int getTotalSteps() {
        return this.d * 2;
    }

    public void setFrontSteps(int steps) {
        this.c = steps;
    }

    public void setPercent(int percent) {
        this.b = percent;
    }

    public void setTime(int time) {
        this.a = time;
    }

    public void setTotalSteps(int steps) {
        this.d = steps;
    }

    public byte[] toBytes() {
        return new byte[]{(byte) (((this.a & 15) << 4) | (this.b & 15)), (byte) this.c, (byte) this.d};
    }

    public String toString() {
        return "{time:" + this.a + ",percent:" + this.b + ",frontSteps:" + this.c + ",totalSteps:" + this.d + i.d;
    }

    public ActivityRunningData(int time, int percent, int frontSteps, int totalSteps) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.a = time;
        this.b = percent;
        this.c = frontSteps;
        this.d = totalSteps;
        this.e = (byte) (((time & 15) << 4) | (percent & 15));
    }

    public ActivityRunningData(byte mode, byte frontSteps, byte totalSteps) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.e = mode;
        this.a = (mode >> 4) & 15;
        this.b = mode & 15;
        this.c = frontSteps & 255;
        this.d = totalSteps & 255;
    }
}
