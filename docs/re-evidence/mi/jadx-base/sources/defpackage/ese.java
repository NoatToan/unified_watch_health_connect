package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ese implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f17019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17020b;

    public ese(float[] fArr) {
        this.f17019a = fArr;
        this.f17020b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f17019a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f17020b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f17019a;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
