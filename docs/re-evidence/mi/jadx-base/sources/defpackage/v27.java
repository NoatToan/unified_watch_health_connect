package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public final class v27 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f36407a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[] f36408b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36409a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f36409a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36409a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36409a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36409a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36409a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36409a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36409a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36409a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d) {
        return y27.c(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(y27.b(d)) <= Math.getExponent(d));
    }

    public static double b(double d, RoundingMode roundingMode) {
        if (!y27.c(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f36409a[roundingMode.ordinal()]) {
            case 1:
                o8f.d(a(d));
                return d;
            case 2:
                return (d >= 0.0d || a(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || a(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (a(d)) {
                    return d;
                }
                return ((long) d) + ((long) (d > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d);
            case 7:
                double dRint = Math.rint(d);
                return Math.abs(d - dRint) == 0.5d ? d + Math.copySign(0.5d, d) : dRint;
            case 8:
                double dRint2 = Math.rint(d);
                return Math.abs(d - dRint2) == 0.5d ? d : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long c(double d, RoundingMode roundingMode) {
        double dB = b(d, roundingMode);
        o8f.a(((-9.223372036854776E18d) - dB < 1.0d) & (dB < 9.223372036854776E18d), d, roundingMode);
        return (long) dB;
    }
}
