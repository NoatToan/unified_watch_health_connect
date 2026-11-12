package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class FreqParam {
    public static final int ACTION_ACK = 2;
    public static final int ACTION_SYNC = 1;
    public static final int ACTION_UNCHANGED = 0;
    private int actionFlag = 0;
    private int circles;
    private int initFreq;
    private int interval;
    private int stepHeight;
    private int stepNums;
    private int stepWidth;

    public void setStepWidth(int i) {
        this.stepWidth = i;
    }

    public void setStepNums(int i) {
        this.stepNums = i;
    }

    public void setStepHeight(int i) {
        this.stepHeight = i;
    }

    public void setInterval(int i) {
        this.interval = i;
    }

    public void setInitFreq(int i) {
        this.initFreq = i;
    }

    public void setCircles(int i) {
        this.circles = i;
    }

    public void setActionFlag(int i) {
        this.actionFlag = i;
    }

    public int getStepWidth() {
        return this.stepWidth;
    }

    public int getStepNums() {
        return this.stepNums;
    }

    public int getStepHeight() {
        return this.stepHeight;
    }

    public int getInterval() {
        return this.interval;
    }

    public int getInitFreq() {
        return this.initFreq;
    }

    public int getCircles() {
        return this.circles;
    }

    public int getActionFlag() {
        return this.actionFlag;
    }

    public FreqParam(int i, int i2, int i3, int i4, int i5, int i6) {
        this.initFreq = i;
        this.stepHeight = i2;
        this.stepWidth = i3;
        this.stepNums = i4;
        this.interval = i5;
        this.circles = i6;
    }
}
