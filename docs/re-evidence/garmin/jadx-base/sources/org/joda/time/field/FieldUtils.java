package org.joda.time.field;

import ds.e0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.commons.lang3.e;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i14, int i15, int i16) {
        if (i15 >= i16) {
            h.s("MIN > MAX");
            return 0;
        }
        int i17 = (i16 - i15) + 1;
        int i18 = i14 - i15;
        if (i18 >= 0) {
            return (i18 % i17) + i15;
        }
        int i19 = (-i18) % i17;
        return i19 == 0 ? i15 : (i17 - i19) + i15;
    }

    public static long safeAdd(long j8, long j14) {
        long j15 = j8 + j14;
        if ((j8 ^ j15) >= 0 || (j8 ^ j14) < 0) {
            return j15;
        }
        StringBuilder sbK = e0.k(j8, "The calculation caused an overflow: ", " + ");
        sbK.append(j14);
        throw new ArithmeticException(sbK.toString());
    }

    public static long safeDivide(long j8, long j14, RoundingMode roundingMode) {
        if (j8 != Long.MIN_VALUE || j14 != -1) {
            return new BigDecimal(j8).divide(new BigDecimal(j14), roundingMode).longValue();
        }
        StringBuilder sbK = e0.k(j8, "Multiplication overflows a long: ", " / ");
        sbK.append(j14);
        throw new ArithmeticException(sbK.toString());
    }

    public static long safeMultiply(long j8, int i14) {
        if (i14 == -1) {
            if (j8 != Long.MIN_VALUE) {
                return -j8;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j8 + " * " + i14);
        }
        if (i14 == 0) {
            return 0L;
        }
        if (i14 == 1) {
            return j8;
        }
        long j14 = i14;
        long j15 = j8 * j14;
        if (j15 / j14 == j8) {
            return j15;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j8 + " * " + i14);
    }

    public static int safeMultiplyToInt(long j8, long j14) {
        return safeToInt(safeMultiply(j8, j14));
    }

    public static int safeNegate(int i14) {
        if (i14 != Integer.MIN_VALUE) {
            return -i14;
        }
        e.u("Integer.MIN_VALUE cannot be negated");
        return 0;
    }

    public static long safeSubtract(long j8, long j14) {
        long j15 = j8 - j14;
        if ((j8 ^ j15) >= 0 || (j8 ^ j14) >= 0) {
            return j15;
        }
        StringBuilder sbK = e0.k(j8, "The calculation caused an overflow: ", " - ");
        sbK.append(j14);
        throw new ArithmeticException(sbK.toString());
    }

    public static int safeToInt(long j8) {
        if (-2147483648L <= j8 && j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u(e.e(j8, "Value cannot fit in an int: "));
        return 0;
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i14, int i15, int i16) {
        if (i14 < i15 || i14 > i16) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
        }
    }

    public static int getWrappedValue(int i14, int i15, int i16, int i17) {
        return getWrappedValue(i14 + i15, i16, i17);
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i14, int i15, int i16) {
        if (i14 < i15 || i14 > i16) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
        }
    }

    public static void verifyValueBounds(String str, int i14, int i15, int i16) {
        if (i14 < i15 || i14 > i16) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
        }
    }

    public static int safeAdd(int i14, int i15) {
        int i16 = i14 + i15;
        if ((i14 ^ i16) >= 0 || (i14 ^ i15) < 0) {
            return i16;
        }
        e.u(k.e(i14, i15, "The calculation caused an overflow: ", " + "));
        return 0;
    }

    public static long safeDivide(long j8, long j14) {
        if (j8 == Long.MIN_VALUE && j14 == -1) {
            StringBuilder sbK = e0.k(j8, "Multiplication overflows a long: ", " / ");
            sbK.append(j14);
            throw new ArithmeticException(sbK.toString());
        }
        return j8 / j14;
    }

    public static int safeMultiply(int i14, int i15) {
        long j8 = ((long) i14) * ((long) i15);
        if (j8 >= -2147483648L && j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u(k.e(i14, i15, "Multiplication overflows an int: ", " * "));
        return 0;
    }

    public static long safeMultiply(long j8, long j14) {
        if (j14 == 1) {
            return j8;
        }
        if (j8 == 1) {
            return j14;
        }
        if (j8 == 0 || j14 == 0) {
            return 0L;
        }
        long j15 = j8 * j14;
        if (j15 / j14 == j8 && ((j8 != Long.MIN_VALUE || j14 != -1) && (j14 != Long.MIN_VALUE || j8 != -1))) {
            return j15;
        }
        StringBuilder sbK = e0.k(j8, "Multiplication overflows a long: ", " * ");
        sbK.append(j14);
        throw new ArithmeticException(sbK.toString());
    }
}
