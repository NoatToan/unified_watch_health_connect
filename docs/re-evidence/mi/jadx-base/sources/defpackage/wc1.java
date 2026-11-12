package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class wc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f37826a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f37827b = new ha9();
    public static final TimeInterpolator c = new ga9();
    public static final TimeInterpolator d = new pge();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float b(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
