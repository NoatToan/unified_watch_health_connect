package kotlin.math;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class c extends b {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float A(float f) {
        return (float) Math.expm1(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double A0(double d, int i) {
        return Math.copySign(d, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double B(double d) {
        return Math.floor(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float B0(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float C(float f) {
        return (float) Math.floor(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float C0(float f, int i) {
        return Math.copySign(f, i);
    }

    private static final double D(double d) {
        return Math.abs(d);
    }

    private static final float E(float f) {
        return Math.abs(f);
    }

    private static final int F(int i) {
        return Math.abs(i);
    }

    private static final long G(long j) {
        return Math.abs(j);
    }

    private static final double H(double d) {
        return Math.signum(d);
    }

    private static final float I(float f) {
        return Math.signum(f);
    }

    private static final double J(double d) {
        return Math.ulp(d);
    }

    private static final float K(float f) {
        return Math.ulp(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double L(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float M(float f, float f2) {
        return (float) Math.hypot(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double N(double d) {
        return Math.log(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float O(float f) {
        return (float) Math.log(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double P(double d) {
        return Math.log1p(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float Q(float f) {
        return (float) Math.log1p(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double R(double d) {
        return Math.log10(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float S(float f) {
        return (float) Math.log10(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double T(double d, double d2) {
        return Math.max(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float U(float f, float f2) {
        return Math.max(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int V(int i, int i2) {
        return Math.max(i, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long W(long j, long j2) {
        return Math.max(j, j2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double X(double d, double d2) {
        return Math.min(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float Y(float f, float f2) {
        return Math.min(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int Z(int i, int i2) {
        return Math.min(i, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double a(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long a0(long j, long j2) {
        return Math.min(j, j2);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > a.f) {
            return Math.log(d) + a.b;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= a.e) {
            return Math.log(d + Math.sqrt((d * d) - d2));
        }
        double dSqrt = Math.sqrt(d3);
        if (dSqrt >= a.d) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d) {
        double d2 = a.e;
        if (d < d2) {
            if (d <= (-d2)) {
                return -asinh(-d);
            }
            return Math.abs(d) >= a.d ? d - (((d * d) * d) / ((double) 6)) : d;
        }
        if (d <= a.g) {
            return Math.log(d + Math.sqrt((d * d) + ((double) 1)));
        }
        if (d > a.f) {
            return Math.log(d) + a.b;
        }
        double d3 = d * ((double) 2);
        return Math.log(d3 + (((double) 1) / d3));
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d) {
        if (Math.abs(d) < a.e) {
            return Math.abs(d) > a.d ? d + (((d * d) * d) / ((double) 3)) : d;
        }
        double d2 = 1;
        return Math.log((d2 + d) / (d2 - d)) / ((double) 2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float b(float f, float f2) {
        return (float) Math.IEEEremainder(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double b0(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double c(double d) {
        return Math.abs(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float c0(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float d(float f) {
        return Math.abs(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double d0(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int e(int i) {
        return Math.abs(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float e0(float f, float f2) {
        return Math.nextAfter(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long f(long j) {
        return Math.abs(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double f0(double d) {
        return Math.nextUp(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double g(double d) {
        return Math.acos(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float g0(float f) {
        return Math.nextUp(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j) {
    }

    public static int getSign(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static int getSign(long j) {
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float h(float f) {
        return (float) Math.acos(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double h0(double d, double d2) {
        return Math.pow(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float i(float f) {
        return (float) acosh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double i0(double d, int i) {
        return Math.pow(d, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double j(double d) {
        return Math.asin(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float j0(float f, float f2) {
        return (float) Math.pow(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float k(float f) {
        return (float) Math.asin(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float k0(float f, int i) {
        return (float) Math.pow(f, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float l(float f) {
        return (float) asinh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double l0(double d) {
        return Math.rint(d);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d, double d2) {
        if (d2 <= 0.0d) {
            return Double.NaN;
        }
        if (d2 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d) / Math.log(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d) {
        return Math.log(d) / a.b;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double m(double d) {
        return Math.atan(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float m0(float f) {
        return (float) Math.rint(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float n(float f) {
        return (float) Math.atan(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double n0(double d) {
        return Math.signum(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double o(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float o0(float f) {
        return Math.signum(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float p(float f, float f2) {
        return (float) Math.atan2(f, f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double p0(double d) {
        return Math.sin(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float q(float f) {
        return (float) atanh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float q0(float f) {
        return (float) Math.sin(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double r(double d) {
        return Math.ceil(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double r0(double d) {
        return Math.sinh(d);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float s(float f) {
        return (float) Math.ceil(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float s0(float f) {
        return (float) Math.sinh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double t(double d) {
        return Math.cos(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double t0(double d) {
        return Math.sqrt(d);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return d;
        }
        return d > 0.0d ? Math.floor(d) : Math.ceil(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float u(float f) {
        return (float) Math.cos(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float u0(float f) {
        return (float) Math.sqrt(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double v(double d) {
        return Math.cosh(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double v0(double d) {
        return Math.tan(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float w(float f) {
        return (float) Math.cosh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float w0(float f) {
        return (float) Math.tan(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double x(double d) {
        return Math.exp(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double x0(double d) {
        return Math.tanh(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float y(float f) {
        return (float) Math.exp(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float y0(float f) {
        return (float) Math.tanh(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double z(double d) {
        return Math.expm1(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double z0(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @SinceKotlin(version = "1.2")
    public static float log(float f, float f2) {
        if (f2 <= 0.0f) {
            return Float.NaN;
        }
        if (f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f) / Math.log(f2));
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f) {
        return (float) (Math.log(f) / a.b);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(float f) {
        return roundToLong(f);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f) {
        double dCeil;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            dCeil = Math.floor(f);
        } else {
            dCeil = Math.ceil(f);
        }
        return (float) dCeil;
    }
}
