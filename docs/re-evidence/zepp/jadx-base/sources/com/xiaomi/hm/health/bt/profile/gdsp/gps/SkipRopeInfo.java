package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SkipRopeInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private long b;
    private float c;
    private float d;
    private float e;
    private long f;
    private float g;
    private float h;
    private long i;

    public SkipRopeInfo(long curGroupNum, long count, float rtSpeed, float avgSpeed, float maxSpeed, long groupCount, float groupTimer, float groupCalories, long groupAvgHeartRate) {
        this.a = curGroupNum;
        this.b = count;
        this.c = rtSpeed;
        this.d = avgSpeed;
        this.e = maxSpeed;
        this.f = groupCount;
        this.g = groupTimer;
        this.h = groupCalories;
        this.i = groupAvgHeartRate;
    }

    public float getAvgSpeed() {
        return this.d;
    }

    public long getCount() {
        return this.b;
    }

    public long getCurGroupNum() {
        return this.a;
    }

    public long getGroupAvgHeartRate() {
        return this.i;
    }

    public float getGroupCalories() {
        return this.h;
    }

    public long getGroupCount() {
        return this.f;
    }

    public float getGroupTimer() {
        return this.g;
    }

    public float getMaxSpeed() {
        return this.e;
    }

    public float getRtSpeed() {
        return this.c;
    }

    public void setAvgSpeed(float avgSpeed) {
        this.d = avgSpeed;
    }

    public void setCount(long count) {
        this.b = count;
    }

    public void setCurGroupNum(long curGroupNum) {
        this.a = curGroupNum;
    }

    public void setGroupAvgHeartRate(long groupAvgHeartRate) {
        this.i = groupAvgHeartRate;
    }

    public void setGroupCalories(float groupCalories) {
        this.h = groupCalories;
    }

    public void setGroupCount(long groupCount) {
        this.f = groupCount;
    }

    public void setGroupTimer(float groupTimer) {
        this.g = groupTimer;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.e = maxSpeed;
    }

    public void setRtSpeed(float rtSpeed) {
        this.c = rtSpeed;
    }

    @NonNull
    public String toString() {
        return "SkipRopeInfo{curGroupNum=" + this.a + ", count=" + this.b + ", rtSpeed=" + this.c + ", avgSpeed=" + this.d + ", maxSpeed=" + this.e + ", groupCount=" + this.f + ", groupTimer=" + this.g + ", groupCalories=" + this.h + ", groupAvgHeartRate=" + this.i + '}';
    }
}
