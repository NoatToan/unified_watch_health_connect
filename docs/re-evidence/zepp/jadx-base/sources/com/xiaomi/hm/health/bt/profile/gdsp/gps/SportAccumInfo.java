package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SportAccumInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public long F;
    public float a;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public long m;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public long t;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -20000.0f;
    public float f = -20000.0f;
    public long n = -1;
    public float u = -20000.0f;

    public long getActiveTime() {
        return this.l;
    }

    public float getAscendMeter() {
        return this.c;
    }

    public float getAvgAltitude() {
        return this.u;
    }

    public float getAvgCadence() {
        return this.A;
    }

    public float getAvgPace() {
        return this.x;
    }

    public float getAvgSpeed() {
        return this.w;
    }

    public float getAvgStride() {
        return this.D;
    }

    public float getClimbDistance() {
        return this.b;
    }

    public float getDescendMeter() {
        return this.d;
    }

    public float getDistance() {
        return this.a;
    }

    public float getDistanceHasStep() {
        return this.E;
    }

    public float getMaxAltitude() {
        return this.f;
    }

    public float getMaxCadence() {
        return this.y;
    }

    public int getMaxLatitude() {
        return this.h;
    }

    public int getMaxLongitude() {
        return this.j;
    }

    public float getMaxPace() {
        return this.r;
    }

    public float getMaxSpeed() {
        return this.p;
    }

    public float getMaxStride() {
        return this.B;
    }

    public float getMinAltitude() {
        return this.e;
    }

    public float getMinCadence() {
        return this.z;
    }

    public int getMinLatitude() {
        return this.g;
    }

    public int getMinLongitude() {
        return this.i;
    }

    public float getMinPace() {
        return this.q;
    }

    public float getMinSpeed() {
        return this.v;
    }

    public float getMinStride() {
        return this.C;
    }

    public long getPauseTime() {
        return this.n;
    }

    public long getRestTimeBetweenGroups() {
        return this.m;
    }

    public long getSecCountHasStep() {
        return this.t;
    }

    public float getSportCalories() {
        return this.o;
    }

    public long getStep() {
        return this.k;
    }

    public long getStepHasDistance() {
        return this.F;
    }

    public float getTotalStride() {
        return this.s;
    }

    public void setActiveTime(long activeTime) {
        this.l = activeTime;
    }

    public void setAscendMeter(float ascendMeter) {
        this.c = ascendMeter;
    }

    public void setAvgAltitude(float mAvgAltitude) {
        this.u = mAvgAltitude;
    }

    public void setAvgCadence(float mAvgCadence) {
        this.A = mAvgCadence;
    }

    public void setAvgPace(float mAvgPace) {
        this.x = mAvgPace;
    }

    public void setAvgSpeed(float mAvgSpeed) {
        this.w = mAvgSpeed;
    }

    public void setAvgStride(float mAvgStride) {
        this.D = mAvgStride;
    }

    public void setClimbDistance(float climbDistance) {
        this.b = climbDistance;
    }

    public void setDescendMeter(float descendMeter) {
        this.d = descendMeter;
    }

    public void setDistance(float distance) {
        this.a = distance;
    }

    public void setDistanceHasStep(float mDistanceHasStep) {
        this.E = mDistanceHasStep;
    }

    public void setMaxAltitude(float maxAltitude) {
        this.f = maxAltitude;
    }

    public void setMaxCadence(float mMaxCadence) {
        this.y = mMaxCadence;
    }

    public void setMaxLatitude(int maxLatitude) {
        this.h = maxLatitude;
    }

    public void setMaxLongitude(int maxLongitude) {
        this.j = maxLongitude;
    }

    public void setMaxPace(float maxPace) {
        this.r = maxPace;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.p = maxSpeed;
    }

    public void setMaxStride(float mMaxStride) {
        this.B = mMaxStride;
    }

    public void setMinAltitude(float minAltitude) {
        this.e = minAltitude;
    }

    public void setMinCadence(float mMinCadence) {
        this.z = mMinCadence;
    }

    public void setMinLatitude(int minLatitude) {
        this.g = minLatitude;
    }

    public void setMinLongitude(int minLongitude) {
        this.i = minLongitude;
    }

    public void setMinPace(float minPace) {
        this.q = minPace;
    }

    public void setMinSpeed(float mMinSpeed) {
        this.v = mMinSpeed;
    }

    public void setMinStride(float mMinStride) {
        this.C = mMinStride;
    }

    public void setPauseTime(long pauseTime) {
        this.n = pauseTime;
    }

    public void setRestTimeBetweenGroups(long restTimeBetweenGroups) {
        this.m = restTimeBetweenGroups;
    }

    public void setSecCountHasStep(long secCountHasStep) {
        this.t = secCountHasStep;
    }

    public void setSportCalories(float sportCalories) {
        this.o = sportCalories;
    }

    public void setStep(long step) {
        this.k = step;
    }

    public void setStepHasDistance(long mStepHasDistance) {
        this.F = mStepHasDistance;
    }

    public void setTotalStride(float totalStride) {
        this.s = totalStride;
    }

    public String toString() {
        return "SportAccumInfo{mDistance=" + this.a + ", mAscendMeter=" + this.c + ", mDescendMeter=" + this.d + ", mMinAltitude=" + this.e + ", mMaxAltitude=" + this.f + ", mMinLatitude=" + this.g + ", mMaxLatitude=" + this.h + ", mMinLongitude=" + this.i + ", mMaxLongitude=" + this.j + ", mStep=" + this.k + ", mActiveTime=" + this.l + ", mSportCalories=" + this.o + ", mMaxSpeed=" + this.p + ", mMinPace=" + this.q + ", mMaxPace=" + this.r + ", mTotalStride=" + this.s + ", mSecCountHasStep=" + this.t + ", mAvgAltitude=" + this.u + ", mMinSpeed=" + this.v + ", mAvgSpeed=" + this.w + ", mAvgPace=" + this.x + ", mMaxCadence=" + this.y + ", mMinCadence=" + this.z + ", mAvgCadence=" + this.A + ", mMaxStride=" + this.B + ", mMinStride=" + this.C + ", mAvgStride=" + this.D + ", mDistanceHasStep=" + this.E + ", mStepHasDistance=" + this.F + '}';
    }
}
