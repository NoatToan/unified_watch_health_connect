package com.xiaomi.hm.health.bt.profile.ftms;

/* JADX INFO: loaded from: classes12.dex */
public class TreadmillData {
    public static final short FLAG_AVERAGE_PACE = 64;
    public static final short FLAG_AVERAGE_SPEED = 2;
    public static final short FLAG_ELAPSED_TIME = 1024;
    public static final short FLAG_ELEVATION_GAIN = 16;
    public static final short FLAG_EXPENDED_ENERGY = 128;
    public static final short FLAG_FORCE_BELT_POWER = 4096;
    public static final short FLAG_HEART_RATE = 256;
    public static final short FLAG_INCLINATION_RAMP_ANGLE_SETTING = 8;
    public static final short FLAG_INSTANTANEOUS_PACE = 32;
    public static final short FLAG_INSTANTANEOUS_SPEED = 1;
    public static final short FLAG_METABOLIC_EQUIVALENT = 512;
    public static final short FLAG_REMAINING_TIME = 2048;
    public static final short FLAG_TOTAL_DISTANCE = 4;
    private float a;
    private float b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private float h;
    private float i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public float getAveragePace() {
        return this.i;
    }

    public float getAverageSpeed() {
        return this.b;
    }

    public int getElapsedTime() {
        return this.o;
    }

    public int getEnergyPerHour() {
        return this.k;
    }

    public int getEnergyPerMinute() {
        return this.l;
    }

    public int getExpendedEnergy() {
        return this.j;
    }

    public int getForceOnBelt() {
        return this.q;
    }

    public int getHeartRate() {
        return this.m;
    }

    public float getInclination() {
        return this.d;
    }

    public float getInstantaneousPace() {
        return this.h;
    }

    public float getInstantaneousSpeed() {
        return this.a;
    }

    public int getMetabolicEquivalent() {
        return this.n;
    }

    public int getNegativeElevationGain() {
        return this.g;
    }

    public int getPositiveElevationGain() {
        return this.f;
    }

    public int getPowerOutput() {
        return this.r;
    }

    public float getRampAngle() {
        return this.e;
    }

    public int getRemainingTime() {
        return this.p;
    }

    public int getTotalDistance() {
        return this.c;
    }

    public void setAveragePace(float averagePace) {
        this.i = averagePace;
    }

    public void setAverageSpeed(float averageSpeed) {
        this.b = averageSpeed;
    }

    public void setElapsedTime(int elapsedTime) {
        this.o = elapsedTime;
    }

    public void setEnergyPerHour(int energyPerHour) {
        this.k = energyPerHour;
    }

    public void setEnergyPerMinute(int energyPerMinute) {
        this.l = energyPerMinute;
    }

    public void setExpendedEnergy(int expendedEnergy) {
        this.j = expendedEnergy;
    }

    public void setForceOnBelt(int forceOnBelt) {
        this.q = forceOnBelt;
    }

    public void setHeartRate(int heartRate) {
        this.m = heartRate;
    }

    public void setInclination(float inclination) {
        this.d = inclination;
    }

    public void setInstantaneousPace(float instantaneousPace) {
        this.h = instantaneousPace;
    }

    public void setInstantaneousSpeed(float instantaneousSpeed) {
        this.a = instantaneousSpeed;
    }

    public void setMetabolicEquivalent(int metabolicEquivalent) {
        this.n = metabolicEquivalent;
    }

    public void setNegativeElevationGain(int negativeElevationGain) {
        this.g = negativeElevationGain;
    }

    public void setPositiveElevationGain(int positiveElevationGain) {
        this.f = positiveElevationGain;
    }

    public void setPowerOutput(int powerOutput) {
        this.r = powerOutput;
    }

    public void setRampAngle(float rampAngle) {
        this.e = rampAngle;
    }

    public void setRemainingTime(int remainingTime) {
        this.p = remainingTime;
    }

    public void setTotalDistance(int totalDistance) {
        this.c = totalDistance;
    }

    public String toString() {
        return "TreadmillData{instantaneousSpeed=" + this.a + ", averageSpeed=" + this.b + ", totalDistance=" + this.c + ", inclination=" + this.d + ", rampAngle=" + this.e + ", positiveElevationGain=" + this.f + ", negativeElevationGain=" + this.g + ", instantaneousPace=" + this.h + ", averagePace=" + this.i + ", expendedEnergy=" + this.j + ", energyPerHour=" + this.k + ", energyPerMinute=" + this.l + ", heartRate=" + this.m + ", metabolicEquivalent=" + this.n + ", elapsedTime=" + this.o + ", remainingTime=" + this.p + ", forceOnBelt=" + this.q + ", powerOutput=" + this.r + '}';
    }
}
