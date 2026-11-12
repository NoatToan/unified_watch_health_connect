package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SwimInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float a;
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private float n;

    public float getAvgPace() {
        return this.d;
    }

    public float getAvgStrokeSpeed() {
        return this.b;
    }

    public int getAvgSwolf() {
        return this.f;
    }

    public float getDistancePerStroke() {
        return this.a;
    }

    public float getMaxStrokeSpeed() {
        return this.c;
    }

    public int getMaxSwolf() {
        return this.l;
    }

    public float getMinStrokeSpeed() {
        return this.j;
    }

    public int getMinSwolf() {
        return this.m;
    }

    public float getRealtimeDPS() {
        return this.n;
    }

    public float getRealtimeStrokeSpeed() {
        return this.i;
    }

    public int getRealtimeSwolf() {
        return this.k;
    }

    public int getStkStyle() {
        return this.g;
    }

    public int getStrokes() {
        return this.e;
    }

    public int getTrips() {
        return this.h;
    }

    public void setAvgPace(float avgPace) {
        this.d = avgPace;
    }

    public void setAvgStrokeSpeed(float avgStrokeSpeed) {
        this.b = avgStrokeSpeed;
    }

    public void setAvgSwolf(int avgSwolf) {
        this.f = avgSwolf;
    }

    public void setDistancePerStroke(float distancePerStroke) {
        this.a = distancePerStroke;
    }

    public void setMaxStrokeSpeed(float maxStrokeSpeed) {
        this.c = maxStrokeSpeed;
    }

    public void setMaxSwolf(int mMaxSwolf) {
        this.l = mMaxSwolf;
    }

    public void setMinStrokeSpeed(float mMinStrokeSpeed) {
        this.j = mMinStrokeSpeed;
    }

    public void setMinSwolf(int mMinSwolf) {
        this.m = mMinSwolf;
    }

    public void setRealtimeDPS(float mRealtimeDPS) {
        this.n = mRealtimeDPS;
    }

    public void setRealtimeStrokeSpeed(float mRealtimeStrokeSpeed) {
        this.i = mRealtimeStrokeSpeed;
    }

    public void setRealtimeSwolf(int mRealtimeSwolf) {
        this.k = mRealtimeSwolf;
    }

    public void setStkStyle(int stkStyle) {
        this.g = stkStyle;
    }

    public void setStrokes(int strokes) {
        this.e = strokes;
    }

    public void setTrips(int trips) {
        this.h = trips;
    }

    public String toString() {
        return "SwimInfo{distancePerStroke=" + this.a + ", avgStrokeSpeed=" + this.b + ", maxStrokeSpeed=" + this.c + ", avgPace=" + this.d + ", strokes=" + this.e + ", avgSwolf=" + this.f + ", stkStyle=" + this.g + ", trips=" + this.h + ", mRealtimeStrokeSpeed=" + this.i + ", mMinStrokeSpeed=" + this.j + ", mRealtimeSwolf=" + this.k + ", mMaxSwolf=" + this.l + ", mMinSwolf=" + this.m + ", mRealtimeDPS=" + this.n + '}';
    }
}
