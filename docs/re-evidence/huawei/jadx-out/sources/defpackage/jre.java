package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes10.dex */
public class jre implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38907c;
    private final float d;

    private float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public jre(float f, float f2, float f3, float f4) {
        this.f38906b = f;
        this.f38905a = f2;
        this.d = f3;
        this.f38907c = f4;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return a(d(f));
    }

    private float c(float f) {
        return c(f, this.f38906b, this.d);
    }

    private float a(float f) {
        return c(f, this.f38905a, this.f38907c);
    }

    private float c(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float fA = a(0.0f, f2, f);
        float fA2 = a(f2, f3, f);
        return a(a(fA, fA2, f), a(fA2, a(f3, 1.0f, f), f), f);
    }

    private float d(float f) {
        float f2 = 0.0f;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        float f3 = f;
        float f4 = 1.0f;
        float fC = 0.0f;
        for (int i = 0; i < 8; i++) {
            fC = c(f3);
            double dC = (c(f3 + 1.0E-6f) - fC) / 1.0E-6f;
            float f5 = fC - f;
            if (Math.abs(f5) < 1.0E-6f) {
                return f3;
            }
            if (Math.abs(dC) < 9.999999974752427E-7d) {
                break;
            }
            if (fC < f) {
                f2 = f3;
            } else {
                f4 = f3;
            }
            f3 = (float) (((double) f3) - (((double) f5) / dC));
        }
        for (int i2 = 0; Math.abs(fC - f) > 1.0E-6f && i2 < 8; i2++) {
            if (fC < f) {
                float f6 = f3;
                f3 = (f3 + f4) / 2.0f;
                f2 = f6;
            } else {
                f4 = f3;
                f3 = (f3 + f2) / 2.0f;
            }
            fC = c(f3);
        }
        return f3;
    }
}
