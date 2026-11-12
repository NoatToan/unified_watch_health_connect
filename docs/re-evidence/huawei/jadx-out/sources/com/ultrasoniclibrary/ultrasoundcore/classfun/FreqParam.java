package com.ultrasoniclibrary.ultrasoundcore.classfun;

/* JADX INFO: loaded from: classes46.dex */
public class FreqParam {
    private int actionFlag;
    private int circles;
    private int initFreq;
    private int interval;
    private int stepHeight;
    private int stepNums;
    private int stepWidth;

    public FreqParam() {
        this.initFreq = 14000;
        this.stepHeight = 4;
        this.stepWidth = 50;
        this.stepNums = 1000;
        this.interval = 550;
        this.circles = 30;
        this.actionFlag = 0;
    }

    public FreqParam(FreqParam freqParam) {
        this(freqParam.getInitFreq(), freqParam.getStepHeight(), freqParam.getStepWidth(), freqParam.getStepNums(), freqParam.getInterval(), freqParam.getCircles(), freqParam.getActionFlag());
    }

    public FreqParam(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.initFreq = i;
        this.stepHeight = i2;
        this.stepWidth = i3;
        this.stepNums = i4;
        this.interval = i5;
        this.circles = i6;
        this.actionFlag = i7;
    }

    public int getInitFreq() {
        return this.initFreq;
    }

    public void setInitFreq(int i) {
        this.initFreq = i;
    }

    public int getStepHeight() {
        return this.stepHeight;
    }

    public void setStepHeight(int i) {
        this.stepHeight = i;
    }

    public int getStepWidth() {
        return this.stepWidth;
    }

    public void setStepWidth(int i) {
        this.stepWidth = i;
    }

    public int getStepNums() {
        return this.stepNums;
    }

    public void setStepNums(int i) {
        this.stepNums = i;
    }

    public int getInterval() {
        return this.interval;
    }

    public void setInterval(int i) {
        this.interval = i;
    }

    public int getCircles() {
        return this.circles;
    }

    public void setCircles(int i) {
        this.circles = i;
    }

    public int getActionFlag() {
        return this.actionFlag;
    }

    public void setActionFlag(int i) {
        this.actionFlag = i;
    }

    public String toString() {
        return "initFreq: " + this.initFreq + "actionFlag: " + this.actionFlag;
    }
}
