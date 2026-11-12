package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class s2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f33208a = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    public static BigDecimal A(Number number) {
        if (number == null) {
            return BigDecimal.ZERO;
        }
        if (number instanceof BigDecimal) {
            return (BigDecimal) number;
        }
        if (number instanceof Long) {
            return new BigDecimal(((Long) number).longValue());
        }
        if (number instanceof Integer) {
            return new BigDecimal(((Integer) number).intValue());
        }
        return number instanceof BigInteger ? new BigDecimal((BigInteger) number) : B(number.toString());
    }

    public static BigDecimal B(String str) {
        try {
            str = z(str).toString();
        } catch (Exception unused) {
        }
        return tt3.F(str) ? BigDecimal.ZERO : new BigDecimal(str);
    }

    public static BigInteger C(String str) {
        return tt3.F(str) ? BigInteger.ZERO : new BigInteger(str);
    }

    public static int a(byte b2, byte b3) {
        return Byte.compare(b2, b3);
    }

    public static int b(double d, double d2) {
        return Double.compare(d, d2);
    }

    public static int c(int i, int i2) {
        return Integer.compare(i, i2);
    }

    public static int d(long j, long j2) {
        return Long.compare(j, j2);
    }

    public static int e(short s, short s2) {
        return Short.compare(s, s2);
    }

    public static double f(float f, float f2) {
        return g(f, f2, 10);
    }

    public static double g(float f, float f2, int i) {
        return h(f, f2, i, RoundingMode.HALF_UP);
    }

    public static double h(float f, float f2, int i, RoundingMode roundingMode) {
        return i(Float.toString(f), Float.toString(f2), i, roundingMode).doubleValue();
    }

    public static BigDecimal i(String str, String str2, int i, RoundingMode roundingMode) {
        return j(B(str), B(str2), i, roundingMode);
    }

    public static BigDecimal j(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, RoundingMode roundingMode) {
        qk1.u(bigDecimal2, "Divisor must be not null !", new Object[0]);
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (i < 0) {
            i = -i;
        }
        return bigDecimal.divide(bigDecimal2, i, roundingMode);
    }

    public static boolean k(char c, char c2, boolean z) {
        return yt3.b(c, c2, z);
    }

    public static boolean l(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public static boolean m(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == bigDecimal2) {
            return true;
        }
        return (bigDecimal == null || bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) != 0) ? false : true;
    }

    public static long n(long j) {
        if (j < 0 || j > 20) {
            throw new IllegalArgumentException(tt3.y("Factorial must have n >= 0 and n <= 20 for n!, but got n = {}", Long.valueOf(j)));
        }
        return f33208a[(int) j];
    }

    public static long o(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new IllegalArgumentException(tt3.y("Factorial start and end both must be >= 0, but got start={}, end={}", Long.valueOf(j), Long.valueOf(j2)));
        }
        if (0 == j || j == j2) {
            return 1L;
        }
        if (j < j2) {
            return 0L;
        }
        return p(j, o(j - 1, j2));
    }

    public static long p(long j, long j2) {
        if (j <= Long.MAX_VALUE / j2) {
            return j * j2;
        }
        throw new IllegalArgumentException(tt3.y("Overflow in multiplication: {} * {}", Long.valueOf(j), Long.valueOf(j2)));
    }

    public static boolean q(CharSequence charSequence) {
        char c;
        if (tt3.F(charSequence)) {
            return false;
        }
        char[] charArray = charSequence.toString().toCharArray();
        int length = charArray.length;
        char c2 = charArray[0];
        boolean z = true;
        int i = (c2 == '-' || c2 == '+') ? 1 : 0;
        int i2 = i + 1;
        if (length > i2 && charArray[i] == '0' && ((c = charArray[i2]) == 'x' || c == 'X')) {
            int i3 = i + 2;
            if (i3 == length) {
                return false;
            }
            while (i3 < charArray.length) {
                char c3 = charArray[i3];
                if ((c3 < '0' || c3 > '9') && ((c3 < 'a' || c3 > 'f') && (c3 < 'A' || c3 > 'F'))) {
                    return false;
                }
                i3++;
            }
            return true;
        }
        int i4 = length - 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            if (i >= i4 && (i >= length || !z2 || z3)) {
                if (i >= charArray.length) {
                    if (z2 || !z3) {
                        return false;
                    }
                    return z;
                }
                char c4 = charArray[i];
                if (c4 >= '0' && c4 <= '9') {
                    return z;
                }
                if (c4 == 'e' || c4 == 'E') {
                    return false;
                }
                if (c4 == '.') {
                    if (z5 || z4) {
                        return false;
                    }
                    return z3;
                }
                if (!z2 && (c4 == 'd' || c4 == 'D' || c4 == 'f' || c4 == 'F')) {
                    return z3;
                }
                if ((c4 == 'l' || c4 == 'L') && z3 && !z4) {
                    return z;
                }
                return false;
            }
            char c5 = charArray[i];
            if (c5 >= '0' && c5 <= '9') {
                z2 = false;
                z3 = true;
            } else if (c5 == '.') {
                if (z5 || z4) {
                    break;
                }
                z5 = true;
            } else if (c5 == 'e' || c5 == 'E') {
                if (z4 || !z3) {
                    return false;
                }
                z2 = true;
                z4 = true;
            } else {
                if ((c5 != '+' && c5 != '-') || !z2) {
                    return false;
                }
                z2 = false;
                z3 = false;
            }
            i++;
            z = true;
        }
        return false;
    }

    public static double r(double d, float f) {
        return t(Double.toString(d), Float.toString(f)).doubleValue();
    }

    public static BigDecimal s(Number number, Number number2) {
        return u(number, number2);
    }

    public static BigDecimal t(String str, String str2) {
        return s(new BigDecimal(str), new BigDecimal(str2));
    }

    public static BigDecimal u(Number... numberArr) {
        if (qj1.D(numberArr) || qj1.x(numberArr)) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = new BigDecimal(numberArr[0].toString());
        for (int i = 1; i < numberArr.length; i++) {
            bigDecimal = bigDecimal.multiply(new BigDecimal(numberArr[i].toString()));
        }
        return bigDecimal;
    }

    public static double v(String str) {
        if (tt3.F(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return z(str).doubleValue();
        }
    }

    public static float w(String str) {
        if (tt3.F(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return z(str).floatValue();
        }
    }

    public static int x(String str) throws NumberFormatException {
        if (tt3.F(str)) {
            return 0;
        }
        if (tt3.i0(str, "0x")) {
            return Integer.parseInt(str.substring(2), 16);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return z(str).intValue();
        }
    }

    public static long y(String str) {
        if (tt3.F(str)) {
            return 0L;
        }
        if (str.startsWith("0x")) {
            return Long.parseLong(str.substring(2), 16);
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return z(str).longValue();
        }
    }

    public static Number z(String str) throws NumberFormatException {
        try {
            return NumberFormat.getInstance().parse(str);
        } catch (ParseException e) {
            NumberFormatException numberFormatException = new NumberFormatException(e.getMessage());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }
}
