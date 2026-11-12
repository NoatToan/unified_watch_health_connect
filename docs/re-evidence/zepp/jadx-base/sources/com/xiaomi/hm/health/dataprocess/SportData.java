package com.xiaomi.hm.health.dataprocess;

import java.io.Serializable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes20.dex */
public class SportData implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private int activity;
    private int hr;
    private int mode;
    private int retain;
    private int sleepPostureAndProb;
    private int sleepProbDeep;
    private int sleepProbRem;
    private int step;
    private int timeIndex;

    public SportData(int i, int i2, int i3, int i4) {
        this.timeIndex = 0;
        this.hr = 254;
        this.timeIndex = i;
        this.mode = i2;
        this.activity = i3;
        this.step = i4;
    }

    public SportData copy() throws CloneNotSupportedException {
        return (SportData) clone();
    }

    public int getActivity() {
        return this.activity;
    }

    public int getHR() {
        return this.hr;
    }

    public int getRetain() {
        return this.retain;
    }

    public int getSleepPostureAndProb() {
        return this.sleepPostureAndProb;
    }

    public int getSleepProbDeep() {
        return this.sleepProbDeep;
    }

    public int getSleepProbRem() {
        return this.sleepProbRem;
    }

    public int getSportMode() {
        return this.mode;
    }

    public int getStep() {
        return this.step;
    }

    public int getTimeIndex() {
        return this.timeIndex;
    }

    public void setActivity(int i) {
        this.activity = i;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setRetain(int i) {
        this.retain = i;
    }

    public void setSleepPostureAndProb(int i) {
        this.sleepPostureAndProb = i;
    }

    public void setSleepProbDeep(int i) {
        this.sleepProbDeep = i;
    }

    public void setSleepProbRem(int i) {
        this.sleepProbRem = i;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public String toString() {
        return SearchCriteria.LT + this.timeIndex + ":" + this.mode + ":" + this.activity + ":" + this.step + ":" + this.hr + ":" + this.retain + ":" + this.sleepPostureAndProb + ":" + this.sleepProbDeep + ":" + this.sleepProbRem + SearchCriteria.GT;
    }

    public SportData(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4);
        this.hr = i5;
    }

    public SportData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(i, i2, i3, i4, i5);
        this.retain = i6;
        this.sleepPostureAndProb = i7;
        this.sleepProbDeep = i8;
        this.sleepProbRem = i9;
    }
}
