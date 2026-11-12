package defpackage;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class apq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f665b = Math.log(2.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final double[] f664a = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double d(double d, RoundingMode roundingMode) {
        if (!app.e(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass2.f666a[roundingMode.ordinal()]) {
            case 1:
                apr.e(c(d));
                return d;
            case 2:
                return (d >= 0.0d || c(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || c(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (c(d)) {
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

    /* JADX INFO: renamed from: apq$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f666a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f666a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f666a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f666a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f666a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f666a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f666a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f666a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f666a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long e(double d, RoundingMode roundingMode) {
        double d2 = d(d, roundingMode);
        apr.c(((-9.223372036854776E18d) - d2 < 1.0d) & (d2 < 9.223372036854776E18d), d, roundingMode);
        return (long) d2;
    }

    public static boolean c(double d) {
        if (app.e(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(app.c(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
