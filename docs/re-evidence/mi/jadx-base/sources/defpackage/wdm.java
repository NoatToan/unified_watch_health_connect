package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class wdm implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) Math.sin(((double) f) * 1.5707963267948966d);
    }
}
