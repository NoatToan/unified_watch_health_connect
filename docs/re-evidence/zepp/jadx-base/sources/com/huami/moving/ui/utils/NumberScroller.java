package com.huami.moving.ui.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class NumberScroller {
    private float a;
    private float b;
    private long c;
    private boolean d;
    private float e;
    private float f;

    public boolean computeOffset() {
        if (this.d) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
        System.out.println("passTime::" + jUptimeMillis);
        float f = (float) jUptimeMillis;
        float f2 = this.f;
        if (f < f2) {
            this.e = this.a + ((this.b * f) / f2);
        } else {
            this.e = this.a + this.b;
            this.d = true;
        }
        return true;
    }

    public float getCurr() {
        return this.e;
    }

    public void setCurr(float f) {
        this.e = f;
    }

    public void setDuration(long j) {
        this.f = j;
    }

    public void startScroll(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = SystemClock.uptimeMillis();
        this.d = false;
    }
}
