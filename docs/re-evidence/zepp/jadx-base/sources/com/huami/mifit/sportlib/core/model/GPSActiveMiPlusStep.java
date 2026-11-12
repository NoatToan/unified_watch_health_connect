package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveMiPlusStep {
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;

    public GPSActiveMiPlusStep() {
        this.a = -1L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 2;
    }

    public int getFlyTime() {
        return this.d;
    }

    public int getLeftRight() {
        return this.e;
    }

    public int getStep() {
        return this.b;
    }

    public int getTouchTime() {
        return this.c;
    }

    public long getTrackId() {
        return this.a;
    }

    public void setFlyTime(int i) {
        this.d = i;
    }

    public void setStep(int i) {
        this.b = i;
    }

    public void setTouchTime(int i) {
        this.c = i;
    }

    public void setTrackId(long j) {
        this.a = j;
    }

    public GPSActiveMiPlusStep(int i) {
        this.a = -1L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 2;
        this.a = i;
    }

    public GPSActiveMiPlusStep(long j, int i, int i2, int i3) {
        this.a = -1L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 2;
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public GPSActiveMiPlusStep(long j, int i, int i2, int i3, int i4) {
        this.a = -1L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 2;
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
