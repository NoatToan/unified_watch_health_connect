package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class LapInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private double A;
    private double B;
    private int a;
    private int b;
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private int q;
    private float r;
    private int s;
    private int t;
    private float u;
    private int v;
    private int w;
    private int x;
    private int y;
    private long z;

    public LapInfo(int index, int type, int timeUsage, int avgHr, int lapDistance, int lapCalorie, int lapClimbUp, int lapClimbDown) {
        this.a = -1;
        this.b = -1;
        this.c = 0L;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = -1;
        this.o = -1;
        this.p = -1.0f;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.u = 0.0f;
        this.v = 0;
        this.w = 0;
        this.y = -1;
        this.z = 0L;
        this.a = index;
        this.b = type;
        this.c = timeUsage;
        this.d = avgHr;
        this.e = lapDistance;
        this.f = lapCalorie;
        this.g = lapClimbUp;
        this.h = lapClimbDown;
    }

    public int getAscend() {
        return this.o;
    }

    public int getAvgHr() {
        return this.d;
    }

    public float getAvgPace() {
        return this.r;
    }

    public int getCadence() {
        return this.s;
    }

    public int getCount() {
        return this.v;
    }

    public float getFloorPerMinute() {
        return this.u;
    }

    public int getIndex() {
        return this.a;
    }

    public int getLapCalorie() {
        return this.f;
    }

    public int getLapClimbDown() {
        return this.h;
    }

    public int getLapClimbUp() {
        return this.g;
    }

    public int getLapDistance() {
        return this.e;
    }

    public int getLapSwolf() {
        return this.n;
    }

    public int getLapType() {
        return this.b;
    }

    public double getLat() {
        return this.B;
    }

    public double getLng() {
        return this.A;
    }

    public float getMaxPace() {
        return this.p;
    }

    public long getOffsetToStart() {
        return this.z;
    }

    public int getSkipCount() {
        return this.l;
    }

    public int getSportMode() {
        return this.q;
    }

    public int getStairFloor() {
        return this.t;
    }

    public int getStrengthTrainType() {
        return this.y;
    }

    public int getStrokeSpeed() {
        return this.i;
    }

    public int getStrokes() {
        return this.m;
    }

    public int getSwimStyle() {
        return this.k;
    }

    public long getTimeUsage() {
        return this.c;
    }

    public int getTrainType() {
        return this.j;
    }

    public int getUnit() {
        return this.x;
    }

    public int getWeight() {
        return this.w;
    }

    public void setAscend(int ascend) {
        this.o = ascend;
    }

    public void setAvgHr(int avgHr) {
        this.d = avgHr;
    }

    public void setAvgPace(float avgPace) {
        this.r = avgPace;
    }

    public void setCadence(int cadence) {
        this.s = cadence;
    }

    public void setCount(int count) {
        this.v = count;
    }

    public void setFloorPerMinute(float floorPerMinute) {
        this.u = floorPerMinute;
    }

    public void setIndex(int index) {
        this.a = index;
    }

    public void setLapCalorie(int lapCalorie) {
        this.f = lapCalorie;
    }

    public void setLapClimbDown(int lapClimbDown) {
        this.h = lapClimbDown;
    }

    public void setLapClimbUp(int lapClimbUp) {
        this.g = lapClimbUp;
    }

    public void setLapDistance(int lapDistance) {
        this.e = lapDistance;
    }

    public void setLapSwolf(int lapSwolf) {
        this.n = lapSwolf;
    }

    public void setLapType(int lapType) {
        this.b = lapType;
    }

    public void setLat(double lat) {
        this.B = lat;
    }

    public void setLng(double lng) {
        this.A = lng;
    }

    public void setMaxPace(float maxPace) {
        this.p = maxPace;
    }

    public void setOffsetToStart(long offsetToStart) {
        this.z = offsetToStart;
    }

    public void setSkipCount(int skipCount) {
        this.l = skipCount;
    }

    public void setSportMode(int sportMode) {
        this.q = sportMode;
    }

    public void setStairFloor(int stairFloor) {
        this.t = stairFloor;
    }

    public void setStrengthTrainType(int strengthTrainType) {
        this.y = strengthTrainType;
    }

    public void setStrokeSpeed(int strokeSpeed) {
        this.i = strokeSpeed;
    }

    public void setStrokes(int strokes) {
        this.m = strokes;
    }

    public void setSwimStyle(int swimStyle) {
        this.k = swimStyle;
    }

    public void setTimeUsage(long timeUsage) {
        this.c = timeUsage;
    }

    public void setTrainType(int trainType) {
        this.j = trainType;
    }

    public void setUnit(int unit) {
        this.x = unit;
    }

    public void setWeight(int weight) {
        this.w = weight;
    }

    public LapInfo(int type) {
        this.a = -1;
        this.b = -1;
        this.c = 0L;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = -1;
        this.o = -1;
        this.p = -1.0f;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.u = 0.0f;
        this.v = 0;
        this.w = 0;
        this.y = -1;
        this.z = 0L;
        this.b = type;
    }
}
