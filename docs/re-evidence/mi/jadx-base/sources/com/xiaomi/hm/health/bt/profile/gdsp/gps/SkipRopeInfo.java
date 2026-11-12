package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SkipRopeInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float avgSpeed;
    private long count;
    private long curGroupNum;
    private long groupAvgHeartRate;
    private float groupCalories;
    private long groupCount;
    private float groupTimer;
    private float maxSpeed;
    private float rtSpeed;

    public SkipRopeInfo(long j, long j2, float f, float f2, float f3, long j3, float f4, float f5, long j4) {
        this.curGroupNum = j;
        this.count = j2;
        this.rtSpeed = f;
        this.avgSpeed = f2;
        this.maxSpeed = f3;
        this.groupCount = j3;
        this.groupTimer = f4;
        this.groupCalories = f5;
        this.groupAvgHeartRate = j4;
    }

    public float getAvgSpeed() {
        return this.avgSpeed;
    }

    public long getCount() {
        return this.count;
    }

    public long getCurGroupNum() {
        return this.curGroupNum;
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

    public float getMaxSpeed() {
        return this.maxSpeed;
    }

    public float getRtSpeed() {
        return this.rtSpeed;
    }

    public void setAvgSpeed(float f) {
        this.avgSpeed = f;
    }

    public void setCount(long j) {
        this.count = j;
    }

    public void setCurGroupNum(long j) {
        this.curGroupNum = j;
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

    public void setMaxSpeed(float f) {
        this.maxSpeed = f;
    }

    public void setRtSpeed(float f) {
        this.rtSpeed = f;
    }

    public String toString() {
        return "SkipRopeInfo{curGroupNum=" + this.curGroupNum + ", count=" + this.count + ", rtSpeed=" + this.rtSpeed + ", avgSpeed=" + this.avgSpeed + ", maxSpeed=" + this.maxSpeed + ", groupCount=" + this.groupCount + ", groupTimer=" + this.groupTimer + ", groupCalories=" + this.groupCalories + ", groupAvgHeartRate=" + this.groupAvgHeartRate + AbstractJsonLexerKt.END_OBJ;
    }
}
