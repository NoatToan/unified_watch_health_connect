package com.amap.api.trace;

/* JADX INFO: loaded from: classes21.dex */
public class TraceLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f3897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f3898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3899c;
    private float d;
    private long e;

    public TraceLocation(double d, double d2, float f, float f2, long j) {
        this.f3897a = a(d);
        this.f3898b = a(d2);
        this.f3899c = (int) ((f * 3600.0f) / 1000.0f);
        this.d = (int) f2;
        this.e = j;
    }

    public TraceLocation() {
    }

    public double getLatitude() {
        return this.f3897a;
    }

    public void setLatitude(double d) {
        this.f3897a = a(d);
    }

    public double getLongitude() {
        return this.f3898b;
    }

    public void setLongitude(double d) {
        this.f3898b = a(d);
    }

    public float getSpeed() {
        return this.f3899c;
    }

    public void setSpeed(float f) {
        this.f3899c = (int) ((f * 3600.0f) / 1000.0f);
    }

    public float getBearing() {
        return this.d;
    }

    public void setBearing(float f) {
        this.d = (int) f;
    }

    public long getTime() {
        return this.e;
    }

    public void setTime(long j) {
        this.e = j;
    }

    private static double a(double d) {
        return Math.round(d * 1000000.0d) / 1000000.0d;
    }

    public TraceLocation copy() {
        TraceLocation traceLocation = new TraceLocation();
        traceLocation.d = this.d;
        traceLocation.f3897a = this.f3897a;
        traceLocation.f3898b = this.f3898b;
        traceLocation.f3899c = this.f3899c;
        traceLocation.e = this.e;
        return traceLocation;
    }

    public String toString() {
        return this.f3897a + ",longtitude " + this.f3898b + ",speed " + this.f3899c + ",bearing " + this.d + ",time " + this.e;
    }
}
