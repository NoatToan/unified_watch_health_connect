package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class GpsPoint implements Serializable {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_PAUSE = 2;
    public static final int STATE_RESUME = 3;
    private static final long serialVersionUID = 1;
    private double a = 0.0d;
    private double b = 0.0d;
    private double c = 0.0d;
    private int d = 1;
    private long e;
    private int f;

    public double getAltitude() {
        return this.c;
    }

    public double getLatitude() {
        return this.a;
    }

    public double getLongitude() {
        return this.b;
    }

    public int getPace() {
        return this.f;
    }

    public int getState() {
        return this.d;
    }

    public long getTime() {
        return this.e;
    }

    public void setAltitude(double altitude) {
        this.c = altitude;
    }

    public void setLatitude(double latitude) {
        this.a = latitude;
    }

    public void setLongitude(double longitude) {
        this.b = longitude;
    }

    public void setPace(int pace) {
        this.f = pace;
    }

    public void setState(int state) {
        this.d = state;
    }

    public void setTime(long time) {
        this.e = time;
    }

    public String toString() {
        return "GpsPoint{latitude=" + this.a + ", longitude=" + this.b + ", altitude=" + this.c + ", state=" + this.d + ", time=" + this.e + ", pace=" + this.f + '}';
    }
}
