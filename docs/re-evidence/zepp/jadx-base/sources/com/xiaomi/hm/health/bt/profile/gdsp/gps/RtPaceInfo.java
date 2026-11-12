package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class RtPaceInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private int b;
    private int c;
    private int d;

    public RtPaceInfo(long time, int pace) {
        this.a = time;
        this.b = pace;
    }

    public int getCadence() {
        return this.c;
    }

    public int getPace() {
        return this.b;
    }

    public int getStride() {
        return this.d;
    }

    public long getTime() {
        return this.a;
    }

    public void setCadence(int cadence) {
        this.c = cadence;
    }

    public void setPace(int pace) {
        this.b = pace;
    }

    public void setStride(int stride) {
        this.d = stride;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public String toString() {
        return "RtPaceInfo{time=" + this.a + ", pace=" + this.b + '}';
    }

    public RtPaceInfo(long time, int pace, int cadence, int stride) {
        this.a = time;
        this.b = pace;
        this.c = cadence;
        this.d = stride;
    }
}
