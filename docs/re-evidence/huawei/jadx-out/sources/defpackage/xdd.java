package defpackage;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes20.dex */
public class xdd {
    public static Interpolator b() {
        return PathInterpolatorCompat.create(0.2f, 0.0f, 0.2f, 1.0f);
    }

    public static Interpolator d() {
        return PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
    }
}
