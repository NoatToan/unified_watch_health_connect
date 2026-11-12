package org.apache.commons.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes23.dex */
public final class NumberUtils {
    private static boolean a(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return str.length() > 0;
    }

    public static int compare(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(d2);
        if (jDoubleToLongBits == jDoubleToLongBits2) {
            return 0;
        }
        return jDoubleToLongBits < jDoubleToLongBits2 ? -1 : 1;
    }

    public static BigDecimal createBigDecimal(String str) {
        return new BigDecimal(str);
    }

    public static BigInteger createBigInteger(String str) {
        return new BigInteger(str);
    }

    public static Double createDouble(String str) {
        return Double.valueOf(str);
    }

    public static Float createFloat(String str) {
        return Float.valueOf(str);
    }

    public static Integer createInteger(String str) {
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        return Long.valueOf(str);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0149 A[Catch: NumberFormatException -> 0x0155, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0155, blocks: (B:80:0x013f, B:82:0x0149), top: B:133:0x013f }] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
    
        if (r1 == 'l') goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Number createNumber(String str) throws NumberFormatException {
        String strSubstring;
        String strSubstring2;
        Double dCreateDouble;
        Float fCreateFloat;
        String strSubstring3 = null;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            throw new NumberFormatException("\"\" is not a valid number.");
        }
        boolean z = false;
        if (str.length() == 1 && !Character.isDigit(str.charAt(0))) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(" is not a valid number.");
            throw new NumberFormatException(stringBuffer.toString());
        }
        if (str.startsWith("--")) {
            return null;
        }
        if (str.startsWith("0x") || str.startsWith("-0x")) {
            return createInteger(str);
        }
        char cCharAt = str.charAt(str.length() - 1);
        int iIndexOf = str.indexOf(46);
        int iIndexOf2 = str.indexOf(101) + str.indexOf(69) + 1;
        if (iIndexOf > -1) {
            if (iIndexOf2 <= -1) {
                strSubstring2 = str.substring(iIndexOf + 1);
            } else {
                if (iIndexOf2 < iIndexOf) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append(" is not a valid number.");
                    throw new NumberFormatException(stringBuffer2.toString());
                }
                strSubstring2 = str.substring(iIndexOf + 1, iIndexOf2);
            }
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = iIndexOf2 > -1 ? str.substring(0, iIndexOf2) : str;
            strSubstring2 = null;
        }
        if (Character.isDigit(cCharAt)) {
            if (iIndexOf2 > -1 && iIndexOf2 < str.length() - 1) {
                strSubstring3 = str.substring(iIndexOf2 + 1, str.length());
            }
            if (strSubstring2 == null && strSubstring3 == null) {
                try {
                    try {
                        return createInteger(str);
                    } catch (NumberFormatException unused) {
                        return createBigInteger(str);
                    }
                } catch (NumberFormatException unused2) {
                    return createLong(str);
                }
            }
            if (a(strSubstring) && a(strSubstring3)) {
                z = true;
            }
            try {
                Float fCreateFloat2 = createFloat(str);
                if (!fCreateFloat2.isInfinite() && (fCreateFloat2.floatValue() != 0.0f || z)) {
                    return fCreateFloat2;
                }
            } catch (NumberFormatException unused3) {
            }
            try {
                Double dCreateDouble2 = createDouble(str);
                if (!dCreateDouble2.isInfinite() && (dCreateDouble2.doubleValue() != 0.0d || z)) {
                    return dCreateDouble2;
                }
            } catch (NumberFormatException unused4) {
            }
            return createBigDecimal(str);
        }
        if (iIndexOf2 > -1 && iIndexOf2 < str.length() - 1) {
            strSubstring3 = str.substring(iIndexOf2 + 1, str.length() - 1);
        }
        String strSubstring4 = str.substring(0, str.length() - 1);
        boolean z2 = a(strSubstring) && a(strSubstring3);
        if (cCharAt != 'D') {
            if (cCharAt == 'F') {
                try {
                    fCreateFloat = createFloat(strSubstring4);
                    if (!fCreateFloat.isInfinite() && (fCreateFloat.floatValue() != 0.0f || z2)) {
                        return fCreateFloat;
                    }
                } catch (NumberFormatException unused5) {
                }
                dCreateDouble = createDouble(strSubstring4);
                if (!dCreateDouble.isInfinite()) {
                    return dCreateDouble;
                }
                return createBigDecimal(strSubstring4);
            }
            if (cCharAt != 'L') {
                if (cCharAt == 'd') {
                    dCreateDouble = createDouble(strSubstring4);
                    if (!dCreateDouble.isInfinite()) {
                        return dCreateDouble;
                    }
                    return createBigDecimal(strSubstring4);
                }
                if (cCharAt == 'f') {
                    fCreateFloat = createFloat(strSubstring4);
                    if (!fCreateFloat.isInfinite()) {
                        return fCreateFloat;
                    }
                    dCreateDouble = createDouble(strSubstring4);
                    if (!dCreateDouble.isInfinite()) {
                        return dCreateDouble;
                    }
                    return createBigDecimal(strSubstring4);
                }
            }
            if (strSubstring2 == null && strSubstring3 == null && ((strSubstring4.charAt(0) == '-' && isDigits(strSubstring4.substring(1))) || isDigits(strSubstring4))) {
                try {
                    return createLong(strSubstring4);
                } catch (NumberFormatException unused6) {
                    return createBigInteger(strSubstring4);
                }
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(str);
            stringBuffer3.append(" is not a valid number.");
            throw new NumberFormatException(stringBuffer3.toString());
        }
        try {
            dCreateDouble = createDouble(strSubstring4);
            if (!dCreateDouble.isInfinite() && (dCreateDouble.floatValue() != 0.0d || z2)) {
                return dCreateDouble;
            }
        } catch (NumberFormatException unused7) {
        }
        try {
            return createBigDecimal(strSubstring4);
        } catch (NumberFormatException unused8) {
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(str);
        stringBuffer4.append(" is not a valid number.");
        throw new NumberFormatException(stringBuffer4.toString());
    }

    public static boolean isDigits(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        boolean z = true;
        int i = charArray[0] == '-' ? 1 : 0;
        int i2 = i + 1;
        if (length > i2 && charArray[i] == '0' && charArray[i2] == 'x') {
            int i3 = i + 2;
            if (i3 == length) {
                return false;
            }
            while (i3 < charArray.length) {
                if ((charArray[i3] < '0' || charArray[i3] > '9') && ((charArray[i3] < 'a' || charArray[i3] > 'f') && (charArray[i3] < 'A' || charArray[i3] > 'F'))) {
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
            if (i >= i4 && (i >= i4 + 1 || !z2 || z3)) {
                if (i >= charArray.length) {
                    return !z2 && z3;
                }
                if (charArray[i] >= '0' && charArray[i] <= '9') {
                    return z;
                }
                if (charArray[i] == 'e' || charArray[i] == 'E') {
                    return false;
                }
                if (z2 || !(charArray[i] == 'd' || charArray[i] == 'D' || charArray[i] == 'f' || charArray[i] == 'F')) {
                    return (charArray[i] == 'l' || charArray[i] == 'L') && z3 && !z4;
                }
                return z3;
            }
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                z2 = false;
                z3 = true;
            } else if (charArray[i] == '.') {
                if (z5 || z4) {
                    break;
                }
                z5 = true;
            } else if (charArray[i] != 'e' && charArray[i] != 'E') {
                if (charArray[i] != '+' && charArray[i] != '-') {
                    return false;
                }
                if (!z2) {
                    return false;
                }
                z2 = false;
                z3 = false;
            } else {
                if (z4 || !z3) {
                    return false;
                }
                z2 = true;
                z4 = true;
            }
            i++;
            z = true;
        }
        return false;
    }

    public static int maximum(int i, int i2, int i3) {
        if (i2 > i) {
            i = i2;
        }
        return i3 > i ? i3 : i;
    }

    public static long maximum(long j, long j2, long j3) {
        if (j2 > j) {
            j = j2;
        }
        return j3 > j ? j3 : j;
    }

    public static int minimum(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    public static long minimum(long j, long j2, long j3) {
        if (j2 < j) {
            j = j2;
        }
        return j3 < j ? j3 : j;
    }

    public static int stringToInt(String str) {
        return stringToInt(str, 0);
    }

    public static int stringToInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int compare(float f, float f2) {
        if (f < f2) {
            return -1;
        }
        if (f > f2) {
            return 1;
        }
        int iFloatToIntBits = Float.floatToIntBits(f);
        int iFloatToIntBits2 = Float.floatToIntBits(f2);
        if (iFloatToIntBits == iFloatToIntBits2) {
            return 0;
        }
        return iFloatToIntBits < iFloatToIntBits2 ? -1 : 1;
    }
}
