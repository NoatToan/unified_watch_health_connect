package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSRunPosture {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 2;

    public int getFirstStep() {
        return this.a;
    }

    public int getFirstTouchTime() {
        return this.b;
    }

    public int getLastStep() {
        return this.c;
    }

    public int getLeftRight() {
        return this.f;
    }

    public int getTotalFlyTime() {
        return this.e;
    }

    public int getTotalTouchTime() {
        return this.d;
    }

    public void setFirstStep(int i) {
        this.a = i;
    }

    public void setFirstTouchTime(int i) {
        this.b = i;
    }

    public void setLastStep(int i) {
        this.c = i;
    }

    public void setLeftRight(int i) {
        this.f = i;
    }

    public void setTotalFlyTime(int i) {
        this.e = i;
    }

    public void setTotalTouchTime(int i) {
        this.d = i;
    }
}
