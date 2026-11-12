package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class c53 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return f < 0.5f ? new b53().getInterpolation(f * 2.0f) * 0.5f : (new d53().getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
    }
}
