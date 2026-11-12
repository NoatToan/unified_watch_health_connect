package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes11.dex */
public class WorkoutRealTimeInfo {
    private long calorieInfo;
    private long climeInfo;
    private long distanceInfo;
    private int heartRateInfo;
    private float speedInfo;
    private int sportType;
    private long timeInfo;

    public int getSportType() {
        return ((Integer) lst.d(Integer.valueOf(this.sportType))).intValue();
    }

    public void setSportType(int i) {
        this.sportType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public float getSpeedInfo() {
        return ((Float) lst.d(Float.valueOf(this.speedInfo))).floatValue();
    }

    public void setSpeedInfo(float f) {
        this.speedInfo = ((Float) lst.d(Float.valueOf(f))).floatValue();
    }

    public int getHeartRateInfo() {
        return ((Integer) lst.d(Integer.valueOf(this.heartRateInfo))).intValue();
    }

    public void setHeartRateInfo(int i) {
        this.heartRateInfo = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getTimeInfo() {
        return ((Long) lst.d(Long.valueOf(this.timeInfo))).longValue();
    }

    public void setTimeInfo(int i) {
        this.timeInfo = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getCalorieInfo() {
        return ((Long) lst.d(Long.valueOf(this.calorieInfo))).longValue();
    }

    public void setCalorieInfo(long j) {
        this.calorieInfo = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getDistanceInfo() {
        return ((Long) lst.d(Long.valueOf(this.distanceInfo))).longValue();
    }

    public void setDistanceInfo(long j) {
        this.distanceInfo = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getClimeInfo() {
        return ((Long) lst.d(Long.valueOf(this.climeInfo))).longValue();
    }

    public void setClimeInfo(long j) {
        this.climeInfo = ((Long) lst.d(Long.valueOf(j))).longValue();
    }
}
