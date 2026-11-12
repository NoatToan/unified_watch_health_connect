package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class b53 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - new d53().getInterpolation(1.0f - f);
    }
}
