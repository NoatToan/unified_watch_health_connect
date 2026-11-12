package com.huami.chart.util;

/* JADX INFO: loaded from: classes6.dex */
public class HMColor {
    private int a;
    private int b;

    public HMColor(int i) {
        this.a = -7829368;
        this.b = -1;
        this.a = i;
    }

    public int getHightlightColor() {
        return this.b;
    }

    public int getRawColor() {
        return this.a;
    }

    public void setHightlightColor(int i) {
        this.b = i;
    }

    public void setRawColor(int i) {
        this.a = i;
    }

    public String toString() {
        return "raw: " + this.a + " highlight: " + this.b;
    }

    public HMColor(int i, int i2) {
        this.a = -7829368;
        this.b = -1;
        this.a = i;
        this.b = i2;
    }
}
