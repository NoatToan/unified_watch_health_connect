package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class RowingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float avgCadence;
    private float avgPaddleTime;
    private float avgReturnPaddleTime;
    private long count;
    private long curGroupNum;
    private float groupAvgCadence;
    private long groupAvgHeartRate;
    private float groupCalories;
    private long groupCount;
    private float groupTimer;
    private float maxCadence;
    private float minCadence;
    private float rtCadence;

    public RowingInfo(long j, long j2, float f, float f2, long j3, float f3, float f4, long j4, float f5, float f6, float f7) {
        this.curGroupNum = j;
        this.count = j2;
        this.rtCadence = f;
        this.avgCadence = f2;
        this.groupCount = j3;
        this.groupTimer = f3;
        this.groupCalories = f4;
        this.groupAvgHeartRate = j4;
        this.groupAvgCadence = f5;
        this.avgPaddleTime = f6;
        this.avgReturnPaddleTime = f7;
    }

    public float getAvgCadence() {
        return this.avgCadence;
    }

    public float getAvgPaddleTime() {
        return this.avgPaddleTime;
    }

    public float getAvgReturnPaddleTime() {
        return this.avgReturnPaddleTime;
    }

    public long getCount() {
        return this.count;
    }

    public long getCurGroupNum() {
        return this.curGroupNum;
    }

    public float getGroupAvgCadence() {
        return this.groupAvgCadence;
    }

    public long getGroupAvgHeartRate() {
        return this.groupAvgHeartRate;
    }

    public float getGroupCalories() {
        return this.groupCalories;
    }

    public long getGroupCount() {
        return this.groupCount;
    }

    public float getGroupTimer() {
        return this.groupTimer;
    }

    public float getMaxCadence() {
        return this.maxCadence;
    }

    public float getMinCadence() {
        return this.minCadence;
    }

    public float getRtCadence() {
        return this.rtCadence;
    }

    public void setAvgCadence(float f) {
        this.avgCadence = f;
    }

    public void setAvgPaddleTime(float f) {
        this.avgPaddleTime = f;
    }

    public void setAvgReturnPaddleTime(float f) {
        this.avgReturnPaddleTime = f;
    }

    public void setCount(long j) {
        this.count = j;
    }

    public void setCurGroupNum(long j) {
        this.curGroupNum = j;
    }

    public void setGroupAvgCadence(float f) {
        this.groupAvgCadence = f;
    }

    public void setGroupAvgHeartRate(long j) {
        this.groupAvgHeartRate = j;
    }

    public void setGroupCalories(float f) {
        this.groupCalories = f;
    }

    public void setGroupCount(long j) {
        this.groupCount = j;
    }

    public void setGroupTimer(float f) {
        this.groupTimer = f;
    }

    public void setMaxCadence(float f) {
        this.maxCadence = f;
    }

    public void setMinCadence(float f) {
        this.minCadence = f;
    }

    public void setRtCadence(float f) {
        this.rtCadence = f;
    }

    public String toString() {
        return "RowingInfo{curGroupNum=" + this.curGroupNum + ", count=" + this.count + ", rtCadence=" + this.rtCadence + ", avgCadence=" + this.avgCadence + ", groupCount=" + this.groupCount + ", groupCount=" + this.groupCount + ", groupTimer=" + this.groupTimer + ", groupCalories=" + this.groupCalories + ", groupAvgHeartRate=" + this.groupAvgHeartRate + ", groupAvgCadence=" + this.groupAvgCadence + ", avgPaddleTime=" + this.avgPaddleTime + ", avgReturnPaddleTime=" + this.avgReturnPaddleTime + AbstractJsonLexerKt.END_OBJ;
    }
}
