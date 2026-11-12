package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public class fl9 {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(int i, int i2, int i3) {
        if (i2 >= i3) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i4 = (i3 - i2) + 1;
        int i5 = i - i2;
        if (i5 >= 0) {
            return (i5 % i4) + i2;
        }
        int i6 = (-i5) % i4;
        return i6 == 0 ? i2 : (i4 - i6) + i2;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return b(i + i2, i3, i4);
    }

    public static int d(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + i + " + " + i2);
    }

    public static long e(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    public static long f(long j, long j2) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return j / j2;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " / " + j2);
    }

    public static long g(long j, long j2, RoundingMode roundingMode) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return new BigDecimal(j).divide(new BigDecimal(j2), roundingMode).longValue();
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " / " + j2);
    }

    public static int h(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i + " * " + i2);
    }

    public static long i(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j;
        }
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
    }

    public static long j(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    public static int k(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long l(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " - " + j2);
    }

    public static int m(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j);
    }

    public static void n(gq5 gq5Var, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(gq5Var.getType(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void o(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
