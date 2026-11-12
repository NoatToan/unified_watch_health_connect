package com.xiaomi.hm.health.databases.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes20.dex */
@Keep
public class FbtThaResult {
    private int currentStatus;
    private int fitnessClass;
    private int fitnessLevelIncrease;
    private Long id;
    private int source;
    private int syncState;
    private long timeStamp;
    private int trainingLoadTrend;
    private int vo2maxTrend;
    private int vo2maxTrendType;
    private int wtl;
    private int wtlSum;
    private int wtlSumOptimalMax;
    private int wtlSumOptimalMin;
    private int wtlSumOverreaching;

    public FbtThaResult(Long l, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j, int i12, int i13) {
        this.id = l;
        this.currentStatus = i;
        this.vo2maxTrend = i2;
        this.vo2maxTrendType = i3;
        this.trainingLoadTrend = i4;
        this.wtl = i5;
        this.wtlSum = i6;
        this.wtlSumOptimalMin = i7;
        this.wtlSumOptimalMax = i8;
        this.wtlSumOverreaching = i9;
        this.fitnessClass = i10;
        this.fitnessLevelIncrease = i11;
        this.timeStamp = j;
        this.source = i12;
        this.syncState = i13;
    }

    public int getCurrentStatus() {
        return this.currentStatus;
    }

    public int getFitnessClass() {
        return this.fitnessClass;
    }

    public int getFitnessLevelIncrease() {
        return this.fitnessLevelIncrease;
    }

    public Long getId() {
        return this.id;
    }

    public int getSource() {
        return this.source;
    }

    public int getSyncState() {
        return this.syncState;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getTrainingLoadTrend() {
        return this.trainingLoadTrend;
    }

    public int getVo2maxTrend() {
        return this.vo2maxTrend;
    }

    public int getVo2maxTrendType() {
        return this.vo2maxTrendType;
    }

    public int getWtl() {
        return this.wtl;
    }

    public int getWtlSum() {
        return this.wtlSum;
    }

    public int getWtlSumOptimalMax() {
        return this.wtlSumOptimalMax;
    }

    public int getWtlSumOptimalMin() {
        return this.wtlSumOptimalMin;
    }

    public int getWtlSumOverreaching() {
        return this.wtlSumOverreaching;
    }

    public void setCurrentStatus(int i) {
        this.currentStatus = i;
    }

    public void setFitnessClass(int i) {
        this.fitnessClass = i;
    }

    public void setFitnessLevelIncrease(int i) {
        this.fitnessLevelIncrease = i;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSyncState(int i) {
        this.syncState = i;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTrainingLoadTrend(int i) {
        this.trainingLoadTrend = i;
    }

    public void setVo2maxTrend(int i) {
        this.vo2maxTrend = i;
    }

    public void setVo2maxTrendType(int i) {
        this.vo2maxTrendType = i;
    }

    public void setWtl(int i) {
        this.wtl = i;
    }

    public void setWtlSum(int i) {
        this.wtlSum = i;
    }

    public void setWtlSumOptimalMax(int i) {
        this.wtlSumOptimalMax = i;
    }

    public void setWtlSumOptimalMin(int i) {
        this.wtlSumOptimalMin = i;
    }

    public void setWtlSumOverreaching(int i) {
        this.wtlSumOverreaching = i;
    }

    public FbtThaResult() {
    }
}
