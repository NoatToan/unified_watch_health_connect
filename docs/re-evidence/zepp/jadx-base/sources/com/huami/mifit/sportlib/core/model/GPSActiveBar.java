package com.huami.mifit.sportlib.core.model;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveBar {
    private long a;
    private long b;
    private float c;

    public GPSActiveBar(long j, long j2, float f) {
        this.a = -1L;
        this.b = -1L;
        this.c = -1.0f;
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public float getBar() {
        return this.c;
    }

    public long getTimestamp() {
        return this.b;
    }

    public long getTrackId() {
        return this.a;
    }

    public void setBar(float f) {
        this.c = f;
    }

    public void setTimestamp(long j) {
        this.b = j;
    }

    public void setTrackId(long j) {
        this.a = j;
    }

    public String toString() {
        return "GPSActiveBar{trackId=" + this.a + ", timestamp=" + this.b + ", bar=" + this.c + i.d;
    }
}
