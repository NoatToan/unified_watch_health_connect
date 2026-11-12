package com.huami.moving.ui.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class LatLngScroller {
    private double a;
    private double b;
    private double c;
    private double d;
    private long e;
    private boolean f;
    private double g;
    private double h;
    private float i;

    public boolean computeOffset() {
        if (this.f) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.e;
        System.out.println("passTime::" + jUptimeMillis);
        float f = (float) jUptimeMillis;
        float f2 = this.i;
        if (f < f2) {
            double d = jUptimeMillis;
            this.g = this.a + ((this.c * d) / ((double) f2));
            this.h = this.b + ((this.d * d) / ((double) f2));
        } else {
            this.g = this.a + this.c;
            this.h = this.b + this.d;
            this.f = true;
        }
        return true;
    }

    public double getCurrLatitude() {
        return this.g;
    }

    public double getCurrLongitude() {
        return this.h;
    }

    public void setCurrLatitude(long j) {
        this.g = j;
    }

    public void setCurrLongitude(long j) {
        this.h = j;
    }

    public void setDuration(long j) {
        this.i = j;
    }

    public void startScroll(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = SystemClock.uptimeMillis();
        this.f = false;
    }
}
