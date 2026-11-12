package com.chipsea.healthscale;

/* JADX INFO: loaded from: classes2.dex */
public class CsAlgoBuilderEx {
    private int a;
    private byte b;
    private int c;
    private float d;
    private float e;
    private float f;
    private float g;

    public int getMA() {
        float f;
        float f2;
        if (this.b > 0) {
            f = (this.a * (-0.7471f)) + (this.d * 0.9161f) + (this.c * 0.4184f) + (this.e * 0.0517f);
            f2 = 54.2267f;
        } else {
            f = (this.a * (-1.1165f)) + (this.d * 1.5784f) + (this.c * 0.4615f) + (this.e * 0.0415f);
            f2 = 83.2548f;
        }
        float f3 = f + f2;
        if (f3 < 15.0f) {
            f3 = 15.0f;
        } else if (f3 > 80.0f) {
            f3 = 80.0f;
        }
        return (int) f3;
    }

    public float getPMR() {
        float f = ((this.f / this.d) * 100.0f) - this.g;
        if (f > 32.0f) {
            return 32.0f;
        }
        if (f < 5.0f) {
            return 5.0f;
        }
        return f;
    }

    public float getSBW() {
        float f;
        float f2;
        if (this.b > 0) {
            f = this.a - 80.0f;
            f2 = 0.7f;
        } else {
            f = this.a - 70.0f;
            f2 = 0.6f;
        }
        return f * f2;
    }

    public void setBodyBaseInfo(int i, byte b, int i2, float f, float f2) {
        this.a = i;
        this.b = b;
        this.c = i2;
        this.d = f;
        this.e = f2;
    }

    public void setBodyComposition(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f = f2;
        this.g = f4;
    }
}
