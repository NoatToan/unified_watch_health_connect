package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes7.dex */
public class ScaleXY {
    private float scaleX;
    private float scaleY;

    public ScaleXY(float f14, float f15) {
        this.scaleX = f14;
        this.scaleY = f15;
    }

    public boolean equals(float f14, float f15) {
        return this.scaleX == f14 && this.scaleY == f15;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void set(float f14, float f15) {
        this.scaleX = f14;
        this.scaleY = f15;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
