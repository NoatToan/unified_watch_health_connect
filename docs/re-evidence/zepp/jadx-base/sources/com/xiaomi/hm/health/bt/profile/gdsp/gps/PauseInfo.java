package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class PauseInfo implements Serializable {
    public static final int PAUSE_AUTO = 3;
    public static final int PAUSE_MANUAL = 2;
    private static final long serialVersionUID = 1;
    private long a;
    private int b = -1;
    private int c = -1;
    private int d = 2;
    private int e;

    public PauseInfo(long time, int offset) {
        this.a = time;
        this.e = offset;
    }

    public int getGpsPauseIndex() {
        return this.b;
    }

    public int getGpsResumeIndex() {
        return this.c;
    }

    public int getOffset() {
        return this.e;
    }

    public long getTime() {
        return this.a;
    }

    public int getType() {
        return this.d;
    }

    public void setGpsPauseIndex(int gpsIndex) {
        this.b = gpsIndex;
    }

    public void setGpsResumeIndex(int gpsResumeIndex) {
        this.c = gpsResumeIndex;
    }

    public void setOffset(int offset) {
        this.e = offset;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public void setType(int type) {
        this.d = type;
    }

    public String toString() {
        return "PauseInfo{time=" + this.a + ", gpsPauseIndex=" + this.b + ", gpsResumeIndex=" + this.c + ", type=" + this.d + ", offset=" + this.e + '}';
    }
}
