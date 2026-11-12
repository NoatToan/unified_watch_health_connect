package com.sensetime.senseid.sdk.liveness.silent.common.type;

/* JADX INFO: loaded from: classes18.dex */
public class Size {
    private int a;
    private int b;

    public Size(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public String toString() {
        return "Size[Width: " + this.a + ", Height: " + this.b + "]";
    }
}
