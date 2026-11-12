package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SportStatisInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public int b;
    public int c;
    public int d;

    public SportStatisInfo(int aveHr, int avePace, int aveStride) {
        this.a = aveHr;
        this.b = avePace;
        this.c = aveStride;
    }

    public int getAveHr() {
        return this.a;
    }

    public int getAvePace() {
        return this.b;
    }

    public int getAveStride() {
        return this.c;
    }

    public int getMaxHr() {
        return this.d;
    }

    public void setAveHr(int aveHr) {
        this.a = aveHr;
    }

    public void setAvePace(int avePace) {
        this.b = avePace;
    }

    public void setAveStride(int aveStride) {
        this.c = aveStride;
    }

    public void setMaxHr(int maxHr) {
        this.d = maxHr;
    }

    public String toString() {
        return "SportStatisInfo{aveHr=" + this.a + ", avePace=" + this.b + ", aveStride=" + this.c + ", maxHr=" + this.d + '}';
    }

    public SportStatisInfo(int aveHr, int avePace, int aveStride, int maxHr) {
        this.a = aveHr;
        this.b = avePace;
        this.c = aveStride;
        this.d = maxHr;
    }
}
