package com.amap.api.services.route;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class ChargeStationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6647b;
    private LatLonPoint c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6648k;
    private int l;

    public int getAmperage() {
        return this.l;
    }

    public String getBrandName() {
        return this.f;
    }

    public int getChargePercent() {
        return this.h;
    }

    public int getChargeTime() {
        return this.i;
    }

    public int getMaxPower() {
        return this.g;
    }

    public String getName() {
        return this.e;
    }

    public String getPoiId() {
        return this.d;
    }

    public LatLonPoint getProjectivePoint() {
        return this.c;
    }

    public int getRemainingCapacity() {
        return this.j;
    }

    public LatLonPoint getShowPoint() {
        return this.f6647b;
    }

    public int getStepIndex() {
        return this.f6646a;
    }

    public int getVoltage() {
        return this.f6648k;
    }

    public void setAmperage(int i) {
        this.l = i;
    }

    public void setBrandName(String str) {
        this.f = str;
    }

    public void setChargePercent(int i) {
        this.h = i;
    }

    public void setChargeTime(int i) {
        this.i = i;
    }

    public void setMaxPower(int i) {
        this.g = i;
    }

    public void setName(String str) {
        this.e = str;
    }

    public void setPoiId(String str) {
        this.d = str;
    }

    public void setProjectivePoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setRemainingCapacity(int i) {
        this.j = i;
    }

    public void setShowPoint(LatLonPoint latLonPoint) {
        this.f6647b = latLonPoint;
    }

    public void setStepIndex(int i) {
        this.f6646a = i;
    }

    public void setVoltage(int i) {
        this.f6648k = i;
    }
}
