package defpackage;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;

/* JADX INFO: loaded from: classes20.dex */
public class xep {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f52789b = false;
    private static long d = 0;
    private static boolean e = false;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f52790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f52791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f52792c;
        private boolean d = true;
        private float e;
        private float j;

        public float a() {
            return this.f52791b;
        }

        public float b() {
            return this.f52790a;
        }

        public float d() {
            return this.f52792c;
        }

        public void d(boolean z) {
            this.d = z;
        }

        public float e() {
            return this.j;
        }

        public boolean h() {
            return this.d;
        }

        public void a(float f) {
            this.f52790a = f;
        }

        public void b(float f) {
            this.f52792c = f;
        }

        public float c() {
            return this.e;
        }

        public void c(float f) {
            this.f52791b = f;
        }

        public void d(float f) {
            this.j = f;
        }

        public void e(float f) {
            this.e = f;
        }
    }

    public static TimeInterpolator a() {
        return new HwCubicBezierInterpolator(1.0f, 0.0f, 1.0f, 1.0f);
    }

    public static TimeInterpolator c() {
        return new HwCubicBezierInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    }

    public static TimeInterpolator d() {
        return new HwCubicBezierInterpolator(0.37f, 0.16f, 0.57f, 0.88f);
    }

    public static Pair<Float, Float> d(TimeInterpolator timeInterpolator, float f, int i, float f2, float f3) {
        return new Pair<>(Float.valueOf(f2 + ((0.225f - (Math.min(i, 10) * 0.0125f)) * Math.abs(f) * f2)), Float.valueOf((((1.0f - timeInterpolator.getInterpolation(f)) * 0.19999999f) + 0.8f) * f3));
    }

    public static TimeInterpolator e() {
        return new HwCubicBezierInterpolator(0.1f, 0.2f, 0.48f, 1.0f);
    }

    public static TimeInterpolator f() {
        return new HwCubicBezierInterpolator(0.65f, -0.04f, 0.57f, 2.0f);
    }

    public static TimeInterpolator g() {
        return new HwCubicBezierInterpolator(0.37f, 0.16f, 0.0f, 1.03f);
    }

    public static TimeInterpolator h() {
        return new HwCubicBezierInterpolator(0.7f, 0.12f, 0.78f, 0.27f);
    }

    public static TimeInterpolator i() {
        return new HwCubicBezierInterpolator(0.2f, 0.05f, 0.45f, 1.13f);
    }

    public static TimeInterpolator j() {
        return new HwCubicBezierInterpolator(0.97f, 0.0f, 0.96f, 0.51f);
    }

    public static boolean l() {
        return e;
    }

    public static boolean m() {
        return f52789b;
    }

    public static boolean d(c cVar, float f, boolean z, boolean z2, boolean z3) {
        float fC = f - cVar.c();
        if (Math.abs(fC) < cVar.b()) {
            return false;
        }
        return ((fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) > 0 && z3 && !z) || ((fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) < 0 && z2 && !z) || ((fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) < 0 && z3 && z) || ((fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) > 0 && z2 && z);
    }

    public static int e(int i, float f) {
        return (int) (f * (((0.225f - (Math.min(i, 10) * 0.0125f)) * 2.0f) + 1.0f));
    }

    public static float d(float f, float f2) {
        float f3 = f + (f2 * 0.05f);
        if (Float.compare(f3, 1.0f) >= 0) {
            return 0.95f;
        }
        return f3;
    }

    public static float b(TimeInterpolator timeInterpolator, TimeInterpolator timeInterpolator2) {
        float f = 0.0f;
        if (timeInterpolator != null && timeInterpolator2 != null) {
            float f2 = 0.0f;
            for (int i = 0; i < 100; i += 5) {
                float f3 = i / 100.0f;
                float fAbs = Math.abs(timeInterpolator.getInterpolation(f3) - timeInterpolator2.getInterpolation(f3));
                if (fAbs > f2) {
                    f = f3;
                    f2 = fAbs;
                }
            }
        }
        return f;
    }

    public static TimeInterpolator b() {
        return new HwCubicBezierInterpolator(0.2f, 0.0f, 1.0f, 1.0f);
    }

    public static boolean a(c cVar, float f, boolean z, boolean z2, boolean z3) {
        float fC = f - cVar.c();
        return (!z && z3 && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) > 0) || (z && z3 && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) < 0) || (!z && z2 && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) < 0) || (z && z2 && (fC > 0.0f ? 1 : (fC == 0.0f ? 0 : -1)) > 0);
    }

    public static boolean a(xeo xeoVar, boolean z, float f, float f2) {
        float fS = xeoVar.s();
        float fT = xeoVar.t();
        float fP = xeoVar.p();
        float fQ = xeoVar.q();
        if (z) {
            return f >= fP && f < fS && f2 >= fT && f2 < fQ;
        }
        return f >= fS && f < fP && f2 >= fT && f2 < fQ;
    }

    public static int e(xeo xeoVar, float f, float f2, float f3, float f4) {
        float[] fArrJ = xeoVar.j();
        if (fArrJ == null) {
            return -1;
        }
        int length = fArrJ.length;
        for (int i = 0; i < length; i++) {
            float fSqrt = (float) Math.sqrt(Math.pow(fArrJ[i] - f3, 2.0d) + Math.pow(xeoVar.f() - f4, 2.0d));
            if ((xeoVar.c() == i && Float.compare(fSqrt, f) <= 0) || Float.compare(fSqrt, f2) <= 0) {
                return i;
            }
        }
        return -1;
    }

    public static void b(boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = d;
        if (j == 0) {
            d = jUptimeMillis;
            return;
        }
        if (!z) {
            f52789b = false;
            e = false;
            return;
        }
        long j2 = jUptimeMillis - j;
        if (j2 < 200) {
            e = true;
        } else {
            e = false;
        }
        if (j2 < 100) {
            f52789b = true;
        } else {
            f52789b = false;
        }
        d = jUptimeMillis;
    }

    public static Pair<Integer, Integer> a(int i, int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            i3 = size;
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            i4 = Math.min(size2, i4);
        } else if (mode == 1073741824) {
            i4 = size2;
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
