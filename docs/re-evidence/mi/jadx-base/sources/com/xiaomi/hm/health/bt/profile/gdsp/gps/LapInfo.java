package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class LapInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int ascend;
    private int avgHr;
    private float avgPace;
    private int cadence;
    private int count;
    private float floorPerMinute;
    private int index;
    private int lapCalorie;
    private int lapClimbDown;
    private int lapClimbUp;
    private int lapDistance;
    private int lapSwolf;
    private int lapType;
    private double lat;
    private double lng;
    private float maxPace;
    private long offsetToStart;
    private int skipCount;
    private int sportMode;
    private int stairFloor;
    private int strengthTrainType;
    private int strokeSpeed;
    private int strokes;
    private int swimStyle;
    private long timeUsage;
    private int trainType;
    private int unit;
    private int weight;

    public LapInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.strokeSpeed = -1;
        this.trainType = -1;
        this.swimStyle = -1;
        this.skipCount = 0;
        this.strokes = 0;
        this.lapSwolf = -1;
        this.ascend = -1;
        this.maxPace = -1.0f;
        this.sportMode = 0;
        this.avgPace = 0.0f;
        this.cadence = -1;
        this.floorPerMinute = 0.0f;
        this.count = 0;
        this.weight = 0;
        this.strengthTrainType = -1;
        this.offsetToStart = 0L;
        this.index = i;
        this.lapType = i2;
        this.timeUsage = i3;
        this.avgHr = i4;
        this.lapDistance = i5;
        this.lapCalorie = i6;
        this.lapClimbUp = i7;
        this.lapClimbDown = i8;
    }

    public int getAscend() {
        return this.ascend;
    }

    public int getAvgHr() {
        return this.avgHr;
    }

    public float getAvgPace() {
        return this.avgPace;
    }

    public int getCadence() {
        return this.cadence;
    }

    public int getCount() {
        return this.count;
    }

    public float getFloorPerMinute() {
        return this.floorPerMinute;
    }

    public int getIndex() {
        return this.index;
    }

    public int getLapCalorie() {
        return this.lapCalorie;
    }

    public int getLapClimbDown() {
        return this.lapClimbDown;
    }

    public int getLapClimbUp() {
        return this.lapClimbUp;
    }

    public int getLapDistance() {
        return this.lapDistance;
    }

    public int getLapSwolf() {
        return this.lapSwolf;
    }

    public int getLapType() {
        return this.lapType;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public float getMaxPace() {
        return this.maxPace;
    }

    public long getOffsetToStart() {
        return this.offsetToStart;
    }

    public int getSkipCount() {
        return this.skipCount;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public int getStairFloor() {
        return this.stairFloor;
    }

    public int getStrengthTrainType() {
        return this.strengthTrainType;
    }

    public int getStrokeSpeed() {
        return this.strokeSpeed;
    }

    public int getStrokes() {
        return this.strokes;
    }

    public int getSwimStyle() {
        return this.swimStyle;
    }

    public long getTimeUsage() {
        return this.timeUsage;
    }

    public int getTrainType() {
        return this.trainType;
    }

    public int getUnit() {
        return this.unit;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setAscend(int i) {
        this.ascend = i;
    }

    public void setAvgHr(int i) {
        this.avgHr = i;
    }

    public void setAvgPace(float f) {
        this.avgPace = f;
    }

    public void setCadence(int i) {
        this.cadence = i;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setFloorPerMinute(float f) {
        this.floorPerMinute = f;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLapCalorie(int i) {
        this.lapCalorie = i;
    }

    public void setLapClimbDown(int i) {
        this.lapClimbDown = i;
    }

    public void setLapClimbUp(int i) {
        this.lapClimbUp = i;
    }

    public void setLapDistance(int i) {
        this.lapDistance = i;
    }

    public void setLapSwolf(int i) {
        this.lapSwolf = i;
    }

    public void setLapType(int i) {
        this.lapType = i;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLng(double d) {
        this.lng = d;
    }

    public void setMaxPace(float f) {
        this.maxPace = f;
    }

    public void setOffsetToStart(long j) {
        this.offsetToStart = j;
    }

    public void setSkipCount(int i) {
        this.skipCount = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setStairFloor(int i) {
        this.stairFloor = i;
    }

    public void setStrengthTrainType(int i) {
        this.strengthTrainType = i;
    }

    public void setStrokeSpeed(int i) {
        this.strokeSpeed = i;
    }

    public void setStrokes(int i) {
        this.strokes = i;
    }

    public void setSwimStyle(int i) {
        this.swimStyle = i;
    }

    public void setTimeUsage(long j) {
        this.timeUsage = j;
    }

    public void setTrainType(int i) {
        this.trainType = i;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    public LapInfo(int i) {
        this.index = -1;
        this.timeUsage = 0L;
        this.avgHr = -1;
        this.lapDistance = 0;
        this.lapCalorie = 0;
        this.lapClimbUp = -1;
        this.lapClimbDown = -1;
        this.strokeSpeed = -1;
        this.trainType = -1;
        this.swimStyle = -1;
        this.skipCount = 0;
        this.strokes = 0;
        this.lapSwolf = -1;
        this.ascend = -1;
        this.maxPace = -1.0f;
        this.sportMode = 0;
        this.avgPace = 0.0f;
        this.cadence = -1;
        this.floorPerMinute = 0.0f;
        this.count = 0;
        this.weight = 0;
        this.strengthTrainType = -1;
        this.offsetToStart = 0L;
        this.lapType = i;
    }
}
