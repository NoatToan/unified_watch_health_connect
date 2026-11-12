package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SkiingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public float getAvgSlope() {
        return this.g;
    }

    public float getAvgSpeed() {
        return this.l;
    }

    public float getMaxSlope() {
        return this.f;
    }

    public float getMaxSpeed() {
        return this.m;
    }

    public float getMinSlope() {
        return this.o;
    }

    public float getMinSpeed() {
        return this.n;
    }

    public float getTotalTripsAcmDescendMeter() {
        return this.e;
    }

    public float getTotalTripsAcmDistance() {
        return this.j;
    }

    public float getTripAcmDescendMeter() {
        return this.d;
    }

    public float getTripAvgSpeed() {
        return this.b;
    }

    public float getTripDistance() {
        return this.a;
    }

    public float getTripMaxSpeed() {
        return this.c;
    }

    public float getTripMinSpeed() {
        return this.k;
    }

    public float getTripSlope() {
        return this.h;
    }

    public int getTrips() {
        return this.i;
    }

    public void setAvgSlope(float mAvgSlope) {
        this.g = mAvgSlope;
    }

    public void setAvgSpeed(float mAvgSpeed) {
        this.l = mAvgSpeed;
    }

    public void setMaxSlope(float mMaxSlope) {
        this.f = mMaxSlope;
    }

    public void setMaxSpeed(float mMaxSpeed) {
        this.m = mMaxSpeed;
    }

    public void setMinSlope(float mMinSlope) {
        this.o = mMinSlope;
    }

    public void setMinSpeed(float mMinSpeed) {
        this.n = mMinSpeed;
    }

    public void setTotalTripsAcmDescendMeter(float mTotalTripsAcmDescendMeter) {
        this.e = mTotalTripsAcmDescendMeter;
    }

    public void setTotalTripsAcmDistance(float mTotalTripsAcmDistance) {
        this.j = mTotalTripsAcmDistance;
    }

    public void setTripAcmDescendMeter(float mTripAcmDescendMeter) {
        this.d = mTripAcmDescendMeter;
    }

    public void setTripAvgSpeed(float mTripAvgSpeed) {
        this.b = mTripAvgSpeed;
    }

    public void setTripDistance(float mTripDistance) {
        this.a = mTripDistance;
    }

    public void setTripMaxSpeed(float mTripMaxSpeed) {
        this.c = mTripMaxSpeed;
    }

    public void setTripMinSpeed(float mTripMinSpeed) {
        this.k = mTripMinSpeed;
    }

    public void setTripSlope(float mTripSlope) {
        this.h = mTripSlope;
    }

    public void setTrips(int mTrips) {
        this.i = mTrips;
    }

    public String toString() {
        return "SkiingInfo{mTripDistance=" + this.a + ", mTripAvgSpeed=" + this.b + ", mTripMaxSpeed=" + this.c + ", mTripAcmDescendMeter=" + this.d + ", mTotalTripsAcmDescendMeter=" + this.e + ", mMaxSlope=" + this.f + ", mAvgSlope=" + this.g + ", mTripSlope=" + this.h + ", mTrips=" + this.i + ", mTotalTripsAcmDistance=" + this.j + ", mTripMinSpeed=" + this.k + ", mAvgSpeed=" + this.l + ", mMaxSpeed=" + this.m + ", mMinSpeed=" + this.n + ", mMinSlope=" + this.o + '}';
    }
}
