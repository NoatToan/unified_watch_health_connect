package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXY {
    private float a;
    private float b;

    public ScaleXY(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean equals(float f, float f2) {
        return this.a == f && this.b == f2;
    }

    public float getScaleX() {
        return this.a;
    }

    public float getScaleY() {
        return this.b;
    }

    public void set(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
