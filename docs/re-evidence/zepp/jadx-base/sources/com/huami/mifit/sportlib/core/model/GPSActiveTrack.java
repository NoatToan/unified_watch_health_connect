package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveTrack {
    private long a;
    private float b;
    private float c;
    private long d;
    private float e;
    private int f;
    private float g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private String n;
    private int m = 1;
    private float o = -1.0f;

    public GPSActiveTrack(long j) {
        this.a = j;
    }

    public int getAccuracy() {
        return this.f;
    }

    public float getAltitude() {
        return this.e;
    }

    public float getBarometerAltitude() {
        return this.o;
    }

    public float getDistance() {
        return this.g;
    }

    public String getExtra() {
        return this.n;
    }

    public int getHr() {
        return this.h;
    }

    public float getLatitude() {
        return this.b;
    }

    public float getLongitude() {
        return this.c;
    }

    public float getPace() {
        return this.k;
    }

    public float getSpeed() {
        return this.l;
    }

    public int getState() {
        return this.m;
    }

    public float getStepl() {
        return this.j;
    }

    public int getSteps() {
        return this.i;
    }

    public long getTimestamp() {
        return this.d;
    }

    public long getTrackid() {
        return this.a;
    }

    public void setAccuracy(int i) {
        this.f = i;
    }

    public void setAltitude(float f) {
        this.e = f;
    }

    public void setBarometerAltitude(float f) {
        this.o = f;
    }

    public void setDistance(float f) {
        this.g = f;
    }

    public void setExtra(String str) {
        this.n = str;
    }

    public void setHr(int i) {
        this.h = i;
    }

    public void setLatitude(float f) {
        this.b = f;
    }

    public void setLongitude(float f) {
        this.c = f;
    }

    public void setPace(float f) {
        this.k = f;
    }

    public void setSpeed(float f) {
        this.l = f;
    }

    public void setState(int i) {
        this.m = i;
    }

    public void setStepl(float f) {
        this.j = f;
    }

    public void setSteps(int i) {
        this.i = i;
    }

    public void setTimestamp(long j) {
        this.d = j;
    }

    public void setTrackid(long j) {
        this.a = j;
    }

    public String toString() {
        return "GPSActiveTrack{trackid=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", timestamp=" + this.d + ", altitude=" + this.e + ", accuracy=" + this.f + ", distance=" + this.g + ", steps=" + this.i + ", stepl=" + this.j + ", pace=" + this.k + ", state=" + this.m + ", hr=" + this.h + ", barometerAltitude=" + this.o + ", extra='" + this.n + "'}";
    }
}
