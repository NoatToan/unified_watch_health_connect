package q9;

import android.view.animation.Interpolator;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f143458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f143459b;

    public d(float[] fArr) {
        this.f143458a = fArr;
        this.f143459b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f14) {
        if (f14 >= 1.0f) {
            return 1.0f;
        }
        if (f14 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f143458a;
        int iMin = Math.min((int) ((fArr.length - 1) * f14), fArr.length - 2);
        float f15 = this.f143459b;
        float fC = hb.a.c(iMin, f15, f14, f15);
        float f16 = fArr[iMin];
        return x.a(fArr[iMin + 1], f16, fC, f16);
    }
}
