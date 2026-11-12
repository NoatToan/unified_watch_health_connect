package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class NearbyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3601c;
    private int d;
    private int e;

    public void setUserID(String str) {
        this.f3599a = str;
    }

    public String getUserID() {
        return this.f3599a;
    }

    public LatLonPoint getPoint() {
        return this.f3600b;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f3600b = latLonPoint;
    }

    public void setTimeStamp(long j) {
        this.f3601c = j;
    }

    public long getTimeStamp() {
        return this.f3601c;
    }

    public void setDistance(int i) {
        this.d = i;
    }

    public int getDistance() {
        return this.d;
    }

    public void setDrivingDistance(int i) {
        this.e = i;
    }

    public int getDrivingDistance() {
        return this.e;
    }
}
