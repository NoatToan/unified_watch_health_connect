package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes4.dex */
public class exh {
    public static float a(float f) {
        return f / iz6.f().density;
    }

    public static float b(double d) {
        return c((float) d);
    }

    public static float c(float f) {
        return TypedValue.applyDimension(1, f, iz6.f());
    }

    public static float d(float f) {
        return e(f, Float.NaN);
    }

    public static float e(float f, float f2) {
        DisplayMetrics displayMetricsF = iz6.f();
        float f3 = displayMetricsF.scaledDensity;
        float f4 = displayMetricsF.density;
        float f5 = f3 / f4;
        if (f2 >= 1.0f && f2 < f5) {
            f3 = f4 * f2;
        }
        return f * f3;
    }

    public static float f(float f) {
        return f / iz6.e().scaledDensity;
    }
}
