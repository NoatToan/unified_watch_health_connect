package org.apache.commons.lang.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.StringUtils;

/* JADX INFO: loaded from: classes23.dex */
public class NumberUtils {
    public static final Long LONG_ZERO = new Long(0);
    public static final Long LONG_ONE = new Long(1);
    public static final Long LONG_MINUS_ONE = new Long(-1);
    public static final Integer INTEGER_ZERO = new Integer(0);
    public static final Integer INTEGER_ONE = new Integer(1);
    public static final Integer INTEGER_MINUS_ONE = new Integer(-1);
    public static final Short SHORT_ZERO = new Short((short) 0);
    public static final Short SHORT_ONE = new Short((short) 1);
    public static final Short SHORT_MINUS_ONE = new Short((short) -1);
    public static final Byte BYTE_ZERO = new Byte((byte) 0);
    public static final Byte BYTE_ONE = new Byte((byte) 1);
    public static final Byte BYTE_MINUS_ONE = new Byte((byte) -1);
    public static final Double DOUBLE_ZERO = new Double(0.0d);
    public static final Double DOUBLE_ONE = new Double(1.0d);
    public static final Double DOUBLE_MINUS_ONE = new Double(-1.0d);
    public static final Float FLOAT_ZERO = new Float(0.0f);
    public static final Float FLOAT_ONE = new Float(1.0f);
    public static final Float FLOAT_MINUS_ONE = new Float(-1.0f);

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
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        return new BigDecimal(str);
    }

    public static BigInteger createBigInteger(String str) {
        if (str == null) {
            return null;
        }
        return new BigInteger(str);
    }

    public static Double createDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Float createFloat(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Integer createInteger(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        if (str == null) {
            return null;
        }
        return Long.valueOf(str);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0146 A[Catch: NumberFormatException -> 0x0152, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0152, blocks: (B:80:0x013c, B:82:0x0146), top: B:138:0x013c }] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
    
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
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
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
                if (iIndexOf2 < iIndexOf || iIndexOf2 > str.length()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.append(" is not a valid number.");
                    throw new NumberFormatException(stringBuffer.toString());
                }
                strSubstring2 = str.substring(iIndexOf + 1, iIndexOf2);
            }
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (iIndexOf2 <= -1) {
                strSubstring = str;
            } else {
                if (iIndexOf2 > str.length()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append(" is not a valid number.");
                    throw new NumberFormatException(stringBuffer2.toString());
                }
                strSubstring = str.substring(0, iIndexOf2);
            }
            strSubstring2 = null;
        }
        if (Character.isDigit(cCharAt) || cCharAt == '.') {
            if (iIndexOf2 > -1 && iIndexOf2 < str.length() - 1) {
                strSubstring3 = str.substring(iIndexOf2 + 1, str.length());
            }
            if (strSubstring2 == null && strSubstring3 == null) {
                try {
                    try {
                        return createInteger(str);
                    } catch (NumberFormatException unused) {
                        return createLong(str);
                    }
                } catch (NumberFormatException unused2) {
                    return createBigInteger(str);
                }
            }
            boolean z = a(strSubstring) && a(strSubstring3);
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
        if (StringUtils.isEmpty(str)) {
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
                if (charArray[i] == '.') {
                    if (z5 || z4) {
                        return false;
                    }
                    return z3;
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

    public static byte max(byte b, byte b2, byte b3) {
        if (b2 > b) {
            b = b2;
        }
        return b3 > b ? b3 : b;
    }

    public static int max(int i, int i2, int i3) {
        if (i2 > i) {
            i = i2;
        }
        return i3 > i ? i3 : i;
    }

    public static long max(long j, long j2, long j3) {
        if (j2 > j) {
            j = j2;
        }
        return j3 > j ? j3 : j;
    }

    public static long max(long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (jArr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }

    public static short max(short s, short s2, short s3) {
        if (s2 > s) {
            s = s2;
        }
        return s3 > s ? s3 : s;
    }

    public static byte min(byte b, byte b2, byte b3) {
        if (b2 < b) {
            b = b2;
        }
        return b3 < b ? b3 : b;
    }

    public static int min(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    public static long min(long j, long j2, long j3) {
        if (j2 < j) {
            j = j2;
        }
        return j3 < j ? j3 : j;
    }

    public static long min(long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (jArr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] < j) {
                j = jArr[i];
            }
        }
        return j;
    }

    public static short min(short s, short s2, short s3) {
        if (s2 < s) {
            s = s2;
        }
        return s3 < s ? s3 : s;
    }

    public static int stringToInt(String str) {
        return toInt(str);
    }

    public static byte toByte(String str) {
        return toByte(str, (byte) 0);
    }

    public static double toDouble(String str) {
        return toDouble(str, 0.0d);
    }

    public static float toFloat(String str) {
        return toFloat(str, 0.0f);
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public static long toLong(String str) {
        return toLong(str, 0L);
    }

    public static short toShort(String str) {
        return toShort(str, (short) 0);
    }

    public static int stringToInt(String str, int i) {
        return toInt(str, i);
    }

    public static byte toByte(String str, byte b) {
        if (str == null) {
            return b;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static double toDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static float toFloat(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int toInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long toLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static short toShort(String str, short s) {
        if (str == null) {
            return s;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
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

    public static int max(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                int i = iArr[0];
                for (int i2 = 1; i2 < iArr.length; i2++) {
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                return i;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static int min(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                int i = iArr[0];
                for (int i2 = 1; i2 < iArr.length; i2++) {
                    if (iArr[i2] < i) {
                        i = iArr[i2];
                    }
                }
                return i;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static short max(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                short s = sArr[0];
                for (int i = 1; i < sArr.length; i++) {
                    if (sArr[i] > s) {
                        s = sArr[i];
                    }
                }
                return s;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static short min(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                short s = sArr[0];
                for (int i = 1; i < sArr.length; i++) {
                    if (sArr[i] < s) {
                        s = sArr[i];
                    }
                }
                return s;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static byte max(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                byte b = bArr[0];
                for (int i = 1; i < bArr.length; i++) {
                    if (bArr[i] > b) {
                        b = bArr[i];
                    }
                }
                return b;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static byte min(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                byte b = bArr[0];
                for (int i = 1; i < bArr.length; i++) {
                    if (bArr[i] < b) {
                        b = bArr[i];
                    }
                }
                return b;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double max(double[] dArr) {
        if (dArr != null) {
            if (dArr.length != 0) {
                double d = dArr[0];
                for (int i = 1; i < dArr.length; i++) {
                    if (Double.isNaN(dArr[i])) {
                        return Double.NaN;
                    }
                    if (dArr[i] > d) {
                        d = dArr[i];
                    }
                }
                return d;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double min(double[] dArr) {
        if (dArr != null) {
            if (dArr.length != 0) {
                double d = dArr[0];
                for (int i = 1; i < dArr.length; i++) {
                    if (Double.isNaN(dArr[i])) {
                        return Double.NaN;
                    }
                    if (dArr[i] < d) {
                        d = dArr[i];
                    }
                }
                return d;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static float max(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    if (Float.isNaN(fArr[i])) {
                        return Float.NaN;
                    }
                    if (fArr[i] > f) {
                        f = fArr[i];
                    }
                }
                return f;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static float min(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    if (Float.isNaN(fArr[i])) {
                        return Float.NaN;
                    }
                    if (fArr[i] < f) {
                        f = fArr[i];
                    }
                }
                return f;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double max(double d, double d2, double d3) {
        return Math.max(Math.max(d, d2), d3);
    }

    public static double min(double d, double d2, double d3) {
        return Math.min(Math.min(d, d2), d3);
    }

    public static float max(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public static float min(float f, float f2, float f3) {
        return Math.min(Math.min(f, f2), f3);
    }
}
