package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveStep {
    private long a;
    private long b;
    private int c;
    private float d;
    private float e;

    public GPSActiveStep(long j, long j2, int i, float f, float f2) {
        this.a = -1L;
        this.b = -1L;
        this.c = -1;
        this.d = -1.0f;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = f;
        this.e = f2;
    }

    public int getStep() {
        return this.c;
    }

    public float getStepFreq() {
        return this.e;
    }

    public float getStepLength() {
        return this.d;
    }

    public long getTimestamp() {
        return this.b;
    }

    public long getTrackId() {
        return this.a;
    }

    public void setStep(int i) {
        this.c = i;
    }

    public void setStepFreq(float f) {
        this.e = f;
    }

    public void setStepLength(float f) {
        this.d = f;
    }

    public void setTimestamp(long j) {
        this.b = j;
    }

    public void setTrackId(long j) {
        this.a = j;
    }

    public String toString() {
        return "GPSActiveStep{trackId=" + this.a + ", timestamp=" + this.b + ", step=" + this.c + ", stepLength=" + this.d + ", stepFreq=" + this.e + '}';
    }
}
