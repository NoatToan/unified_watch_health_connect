package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class qfi implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (-f) * (f - 2.0f);
    }
}
