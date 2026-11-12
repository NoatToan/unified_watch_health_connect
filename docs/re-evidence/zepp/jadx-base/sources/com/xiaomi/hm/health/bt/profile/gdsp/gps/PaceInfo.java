package com.xiaomi.hm.health.bt.profile.gdsp.gps;

/* JADX INFO: loaded from: classes18.dex */
public class PaceInfo {
    public static final int TYPE_KM = 0;
    public static final int TYPE_MILE = 1;
    private int a;
    private int b;
    private int c;
    private GpsPoint d;
    private int e;

    public PaceInfo(int index, int pace, int type, GpsPoint point, int gpsIndex) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.a = index;
        this.b = pace;
        this.c = type;
        this.d = point;
        this.e = gpsIndex;
    }

    public int getGpsIndex() {
        return this.e;
    }

    public GpsPoint getGpsPoint() {
        return this.d;
    }

    public int getIndex() {
        return this.a;
    }

    public int getPace() {
        return this.b;
    }

    public boolean isKmPaceInfo() {
        return this.c == 0;
    }

    public void setGpsIndex(int gpsIndex) {
        this.e = gpsIndex;
    }

    public void setGpsPoint(GpsPoint gpsPoint) {
        this.d = gpsPoint;
    }

    public void setIndex(int index) {
        this.a = index;
    }

    public void setPace(int pace) {
        this.b = pace;
    }

    public String toString() {
        return "PaceInfo{index=" + this.a + ", pace=" + this.b + ", type=" + this.c + ", gpsPoint=" + this.d + ", gpsIndex=" + this.e + '}';
    }
}
