package com.xiaomi.hm.health.sensorhub;

import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class Step {
    private int a;
    private long b;
    private long c;
    private final int d;
    private int e;

    public Step(int id, long beginTime, long endTime, int mode, int steps) {
        this.a = id;
        this.b = beginTime;
        this.c = endTime;
        this.e = steps;
        this.d = mode;
    }

    public long getBeginTime() {
        return this.b;
    }

    public long getEndTime() {
        return this.c;
    }

    public int getId() {
        return this.a;
    }

    public int getMode() {
        return this.d;
    }

    public int getSteps() {
        return this.e;
    }

    public void setBeginTime(long beginTime) {
        this.b = beginTime;
    }

    public void setEndTime(long endTime) {
        this.c = endTime;
    }

    public void setId(int id) {
        this.a = id;
    }

    public void setSteps(int beginSteps) {
        this.e = beginSteps;
    }

    public String toString() {
        return "\nthis.id:" + this.a + "\nthis.mBeginTime:" + new Date(this.b).toString() + "\nthis.mEndTime:" + new Date(this.c).toString() + "\nthis.mMode:" + this.d + "\nthis.mSteps:" + this.e;
    }

    public Step(Step s) {
        this.a = s.getId();
        this.b = s.getBeginTime();
        this.c = s.getEndTime();
        this.e = s.getSteps();
        this.d = s.getMode();
    }
}
