package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class RowingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private long b;
    private float c;
    private float d;
    private long e;
    private float f;
    private float g;
    private long h;
    private float i;
    private float j;
    private float k;

    public RowingInfo(long curGroupNum, long count, float rtCadence, float avgCadence, long groupCount, float groupTimer, float groupCalories, long groupAvgHeartRate, float groupAvgCadence, float avgPaddleTime, float avgReturnPaddleTime) {
        this.a = curGroupNum;
        this.b = count;
        this.c = rtCadence;
        this.d = avgCadence;
        this.e = groupCount;
        this.f = groupTimer;
        this.g = groupCalories;
        this.h = groupAvgHeartRate;
        this.i = groupAvgCadence;
        this.j = avgPaddleTime;
        this.k = avgReturnPaddleTime;
    }

    public float getAvgCadence() {
        return this.d;
    }

    public float getAvgPaddleTime() {
        return this.j;
    }

    public float getAvgReturnPaddleTime() {
        return this.k;
    }

    public long getCount() {
        return this.b;
    }

    public long getCurGroupNum() {
        return this.a;
    }

    public float getGroupAvgCadence() {
        return this.i;
    }

    public long getGroupAvgHeartRate() {
        return this.h;
    }

    public float getGroupCalories() {
        return this.g;
    }

    public long getGroupCount() {
        return this.e;
    }

    public float getGroupTimer() {
        return this.f;
    }

    public float getRtCadence() {
        return this.c;
    }

    public void setAvgCadence(float avgCadence) {
        this.d = avgCadence;
    }

    public void setAvgPaddleTime(float avgPaddleTime) {
        this.j = avgPaddleTime;
    }

    public void setAvgReturnPaddleTime(float avgReturnPaddleTime) {
        this.k = avgReturnPaddleTime;
    }

    public void setCount(long count) {
        this.b = count;
    }

    public void setCurGroupNum(long curGroupNum) {
        this.a = curGroupNum;
    }

    public void setGroupAvgCadence(float groupAvgCadence) {
        this.i = groupAvgCadence;
    }

    public void setGroupAvgHeartRate(long groupAvgHeartRate) {
        this.h = groupAvgHeartRate;
    }

    public void setGroupCalories(float groupCalories) {
        this.g = groupCalories;
    }

    public void setGroupCount(long groupCount) {
        this.e = groupCount;
    }

    public void setGroupTimer(float groupTimer) {
        this.f = groupTimer;
    }

    public void setRtCadence(float rtCadence) {
        this.c = rtCadence;
    }

    @NonNull
    public String toString() {
        return "RowingInfo{curGroupNum=" + this.a + ", count=" + this.b + ", rtCadence=" + this.c + ", avgCadence=" + this.d + ", groupCount=" + this.e + ", groupCount=" + this.e + ", groupTimer=" + this.f + ", groupCalories=" + this.g + ", groupAvgHeartRate=" + this.h + ", groupAvgCadence=" + this.i + ", avgPaddleTime=" + this.j + ", avgReturnPaddleTime=" + this.k + '}';
    }
}
