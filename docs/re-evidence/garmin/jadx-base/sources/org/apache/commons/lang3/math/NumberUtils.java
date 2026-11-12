package org.apache.commons.lang3.math;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class NumberUtils {
    public static final Long LONG_ZERO = 0L;
    public static final Long LONG_ONE = 1L;
    public static final Long LONG_MINUS_ONE = -1L;
    public static final Integer INTEGER_ZERO = 0;
    public static final Integer INTEGER_ONE = 1;
    public static final Integer INTEGER_TWO = 2;
    public static final Integer INTEGER_MINUS_ONE = -1;
    public static final Short SHORT_ZERO = 0;
    public static final Short SHORT_ONE = 1;
    public static final Short SHORT_MINUS_ONE = -1;
    public static final Byte BYTE_ZERO = (byte) 0;
    public static final Byte BYTE_ONE = (byte) 1;
    public static final Byte BYTE_MINUS_ONE = (byte) -1;
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);
    public static final Long LONG_INT_MAX_VALUE = 2147483647L;
    public static final Long LONG_INT_MIN_VALUE = -2147483648L;

    public static int compare(long j8, long j14) {
        if (j8 == j14) {
            return 0;
        }
        return j8 < j14 ? -1 : 1;
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

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public static BigInteger createBigInteger(String str) {
        int i14;
        if (str == null) {
            return null;
        }
        boolean zStartsWith = str.startsWith("-");
        int i15 = 16;
        if (str.startsWith("0x", zStartsWith ? 1 : 0) || str.startsWith("0X", zStartsWith ? 1 : 0)) {
            i14 = (zStartsWith ? 1 : 0) + 2;
        } else if (str.startsWith("#", zStartsWith ? 1 : 0)) {
            i14 = (zStartsWith ? 1 : 0) + 1;
        } else if (str.startsWith("0", zStartsWith ? 1 : 0)) {
            int length = str.length();
            int i16 = (zStartsWith ? 1 : 0) + 1;
            if (length > i16) {
                i15 = 8;
                i14 = i16;
            } else {
                i15 = 10;
                i14 = zStartsWith ? 1 : 0;
            }
        } else {
            i15 = 10;
            i14 = zStartsWith ? 1 : 0;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i14), i15);
        return zStartsWith ? bigInteger.negate() : bigInteger;
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
        return Long.decode(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0163 A[Catch: NumberFormatException -> 0x016e, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x016e, blocks: (B:104:0x0159, B:106:0x0163), top: B:165:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010c, code lost:
    
        if (r5 == 'l') goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Number createNumber(String str) {
        int length;
        String mantissa;
        String mantissa2;
        String strSubstring;
        Double dCreateDouble;
        Float fCreateFloat;
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        String[] strArr = {"0x", "0X", "-0x", "-0X", "#", "-#"};
        int length2 = str.length();
        char cCharAt = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= 6) {
                length = 0;
                break;
            }
            String str2 = strArr[i14];
            if (str.startsWith(str2)) {
                length = str2.length();
                break;
            }
            i14++;
        }
        if (length > 0) {
            int i15 = length;
            while (length < length2) {
                cCharAt = str.charAt(length);
                if (cCharAt != '0') {
                    break;
                }
                i15++;
                length++;
            }
            int i16 = length2 - i15;
            if (i16 > 16 || (i16 == 16 && cCharAt > '7')) {
                return createBigInteger(str);
            }
            return (i16 > 8 || (i16 == 8 && cCharAt > '7')) ? createLong(str) : createInteger(str);
        }
        int i17 = length2 - 1;
        char cCharAt2 = str.charAt(i17);
        int iIndexOf = str.indexOf(46);
        int iIndexOf2 = str.indexOf(69) + str.indexOf(101);
        int i18 = iIndexOf2 + 1;
        if (iIndexOf > -1) {
            if (i18 <= -1) {
                strSubstring = str.substring(iIndexOf + 1);
            } else {
                if (i18 < iIndexOf || i18 > length2) {
                    throw new NumberFormatException(str.concat(" is not a valid number."));
                }
                strSubstring = str.substring(iIndexOf + 1, i18);
            }
            mantissa2 = getMantissa(str, iIndexOf);
        } else {
            if (i18 <= -1) {
                mantissa = getMantissa(str);
            } else {
                if (i18 > length2) {
                    throw new NumberFormatException(str.concat(" is not a valid number."));
                }
                mantissa = getMantissa(str, i18);
            }
            mantissa2 = mantissa;
            strSubstring = null;
        }
        if (Character.isDigit(cCharAt2) || cCharAt2 == '.') {
            String strSubstring2 = (i18 <= -1 || i18 >= i17) ? null : str.substring(iIndexOf2 + 2);
            if (strSubstring == null && strSubstring2 == null) {
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
            if (isAllZeros(mantissa2) && isAllZeros(strSubstring2)) {
                cCharAt = 1;
            }
            try {
                Float fCreateFloat2 = createFloat(str);
                Double dCreateDouble2 = createDouble(str);
                if (!fCreateFloat2.isInfinite() && ((fCreateFloat2.floatValue() != 0.0f || cCharAt != 0) && fCreateFloat2.toString().equals(dCreateDouble2.toString()))) {
                    return fCreateFloat2;
                }
                if (!dCreateDouble2.isInfinite() && (dCreateDouble2.doubleValue() != 0.0d || cCharAt != 0)) {
                    BigDecimal bigDecimalCreateBigDecimal = createBigDecimal(str);
                    return bigDecimalCreateBigDecimal.compareTo(BigDecimal.valueOf(dCreateDouble2.doubleValue())) == 0 ? dCreateDouble2 : bigDecimalCreateBigDecimal;
                }
            } catch (NumberFormatException unused3) {
            }
            return createBigDecimal(str);
        }
        String strSubstring3 = (i18 <= -1 || i18 >= i17) ? null : str.substring(iIndexOf2 + 2, i17);
        String strSubstring4 = str.substring(0, i17);
        boolean z14 = isAllZeros(mantissa2) && isAllZeros(strSubstring3);
        if (cCharAt2 != 'D') {
            if (cCharAt2 == 'F') {
                try {
                    fCreateFloat = createFloat(str);
                    if (!fCreateFloat.isInfinite() && (fCreateFloat.floatValue() != 0.0f || z14)) {
                        return fCreateFloat;
                    }
                } catch (NumberFormatException unused4) {
                }
                dCreateDouble = createDouble(str);
                if (!dCreateDouble.isInfinite()) {
                    return dCreateDouble;
                }
                return createBigDecimal(strSubstring4);
            }
            if (cCharAt2 != 'L') {
                if (cCharAt2 == 'd') {
                    dCreateDouble = createDouble(str);
                    if (!dCreateDouble.isInfinite()) {
                        return dCreateDouble;
                    }
                    return createBigDecimal(strSubstring4);
                }
                if (cCharAt2 == 'f') {
                    fCreateFloat = createFloat(str);
                    if (!fCreateFloat.isInfinite()) {
                        return fCreateFloat;
                    }
                    dCreateDouble = createDouble(str);
                    if (!dCreateDouble.isInfinite()) {
                        return dCreateDouble;
                    }
                    return createBigDecimal(strSubstring4);
                }
            }
            if (strSubstring != null || strSubstring3 != null || ((strSubstring4.isEmpty() || strSubstring4.charAt(0) != '-' || !isDigits(strSubstring4.substring(1))) && !isDigits(strSubstring4))) {
                throw new NumberFormatException(str.concat(" is not a valid number."));
            }
            try {
                return createLong(strSubstring4);
            } catch (NumberFormatException unused5) {
                return createBigInteger(strSubstring4);
            }
        }
        try {
            dCreateDouble = createDouble(str);
            if (!dCreateDouble.isInfinite() && (dCreateDouble.doubleValue() != 0.0d || z14)) {
                return dCreateDouble;
            }
        } catch (NumberFormatException unused6) {
        }
        try {
            return createBigDecimal(strSubstring4);
        } catch (NumberFormatException unused7) {
        }
        throw new NumberFormatException(str.concat(" is not a valid number."));
    }

    private static String getMantissa(String str, int i14) {
        char cCharAt = str.charAt(0);
        return (cCharAt == '-' || cCharAt == '+') ? str.substring(1, i14) : str.substring(0, i14);
    }

    private static boolean isAllZeros(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return !str.isEmpty();
    }

    public static boolean isCreatable(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c14 = charArray[0];
        boolean z14 = true;
        int i14 = (c14 == '-' || c14 == '+') ? 1 : 0;
        int i15 = i14 + 1;
        char c15 = 'F';
        if (length > i15 && charArray[i14] == '0' && !StringUtils.contains(str, 46)) {
            char c16 = charArray[i15];
            if (c16 == 'x' || c16 == 'X') {
                int i16 = i14 + 2;
                if (i16 == length) {
                    return false;
                }
                while (i16 < charArray.length) {
                    char c17 = charArray[i16];
                    if ((c17 < '0' || c17 > '9') && ((c17 < 'a' || c17 > 'f') && (c17 < 'A' || c17 > 'F'))) {
                        return false;
                    }
                    i16++;
                }
                return true;
            }
            if (Character.isDigit(c16)) {
                while (i15 < charArray.length) {
                    char c18 = charArray[i15];
                    if (c18 < '0' || c18 > '7') {
                        return false;
                    }
                    i15++;
                }
                return true;
            }
        }
        int i17 = length - 1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (true) {
            boolean z19 = z14;
            if (i14 >= i17 && (i14 >= length || !z15 || z16)) {
                if (i14 >= charArray.length) {
                    if (z15 || !z16) {
                        return false;
                    }
                    return z19;
                }
                char c19 = charArray[i14];
                if (c19 >= '0' && c19 <= '9') {
                    return z19;
                }
                if (c19 != 'e' && c19 != 'E') {
                    if (c19 == '.') {
                        if (z18 || z17) {
                            return false;
                        }
                    } else if (z15 || (c19 != 'd' && c19 != 'D' && c19 != 'f' && c19 != c15)) {
                        if ((c19 == 'l' || c19 == 'L') && z16 && !z17 && !z18) {
                            return z19;
                        }
                    }
                    return z16;
                }
                return false;
            }
            char c23 = charArray[i14];
            if (c23 >= '0' && c23 <= '9') {
                z15 = false;
                z16 = z19;
            } else if (c23 == '.') {
                if (z18 || z17) {
                    break;
                }
                z18 = z19;
            } else if (c23 == 'e' || c23 == 'E') {
                if (z17 || !z16) {
                    return false;
                }
                z15 = z19;
                z17 = z15;
            } else {
                if ((c23 != '+' && c23 != '-') || !z15) {
                    return false;
                }
                z15 = false;
                z16 = false;
            }
            i14++;
            z14 = z19;
            c15 = 'F';
        }
        return false;
    }

    public static boolean isDigits(String str) {
        return StringUtils.isNumeric(str);
    }

    @Deprecated
    public static boolean isNumber(String str) {
        return isCreatable(str);
    }

    public static boolean isParsable(String str) {
        if (StringUtils.isEmpty(str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) != '-') {
            return withDecimalsParsing(str, 0);
        }
        if (str.length() == 1) {
            return false;
        }
        return withDecimalsParsing(str, 1);
    }

    public static double max(double... dArr) {
        validateArray(dArr);
        double d14 = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            if (Double.isNaN(dArr[i14])) {
                return Double.NaN;
            }
            double d15 = dArr[i14];
            if (d15 > d14) {
                d14 = d15;
            }
        }
        return d14;
    }

    public static double min(double... dArr) {
        validateArray(dArr);
        double d14 = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            if (Double.isNaN(dArr[i14])) {
                return Double.NaN;
            }
            double d15 = dArr[i14];
            if (d15 < d14) {
                d14 = d15;
            }
        }
        return d14;
    }

    public static byte toByte(String str, byte b14) {
        if (str == null) {
            return b14;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b14;
        }
    }

    public static double toDouble(String str, double d14) {
        if (str == null) {
            return d14;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d14;
        }
    }

    public static float toFloat(String str, float f14) {
        if (str == null) {
            return f14;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f14;
        }
    }

    public static int toInt(String str, int i14) {
        if (str == null) {
            return i14;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i14;
        }
    }

    public static long toLong(String str, long j8) {
        if (str == null) {
            return j8;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    public static BigDecimal toScaledBigDecimal(Float f14, int i14, RoundingMode roundingMode) {
        return f14 == null ? BigDecimal.ZERO : toScaledBigDecimal(BigDecimal.valueOf(f14.floatValue()), i14, roundingMode);
    }

    public static short toShort(String str, short s8) {
        if (str == null) {
            return s8;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s8;
        }
    }

    private static void validateArray(Object obj) {
        Validate.notNull(obj, "array", new Object[0]);
        Validate.isTrue(Array.getLength(obj) != 0, "Array cannot be empty.", new Object[0]);
    }

    private static boolean withDecimalsParsing(String str, int i14) {
        int i15 = 0;
        while (i14 < str.length()) {
            boolean z14 = str.charAt(i14) == '.';
            if (z14) {
                i15++;
            }
            if (i15 > 1) {
                return false;
            }
            if (!z14 && !Character.isDigit(str.charAt(i14))) {
                return false;
            }
            i14++;
        }
        return true;
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

    public static double toDouble(BigDecimal bigDecimal) {
        return toDouble(bigDecimal, 0.0d);
    }

    public static double toDouble(BigDecimal bigDecimal, double d14) {
        return bigDecimal == null ? d14 : bigDecimal.doubleValue();
    }

    public static int compare(int i14, int i15) {
        if (i14 == i15) {
            return 0;
        }
        return i14 < i15 ? -1 : 1;
    }

    public static int compare(byte b14, byte b15) {
        return b14 - b15;
    }

    public static int compare(short s8, short s14) {
        if (s8 == s14) {
            return 0;
        }
        return s8 < s14 ? -1 : 1;
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal, int i14, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return bigDecimal.setScale(i14, roundingMode);
    }

    public static BigDecimal toScaledBigDecimal(Float f14) {
        return toScaledBigDecimal(f14, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal) {
        return toScaledBigDecimal(bigDecimal, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(Double d14) {
        return toScaledBigDecimal(d14, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(Double d14, int i14, RoundingMode roundingMode) {
        if (d14 == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(BigDecimal.valueOf(d14.doubleValue()), i14, roundingMode);
    }

    private static String getMantissa(String str) {
        return getMantissa(str, str.length());
    }

    public static BigDecimal toScaledBigDecimal(String str) {
        return toScaledBigDecimal(str, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(String str, int i14, RoundingMode roundingMode) {
        if (str == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(createBigDecimal(str), i14, roundingMode);
    }

    public static int max(int i14, int i15, int i16) {
        if (i15 > i14) {
            i14 = i15;
        }
        return i16 > i14 ? i16 : i14;
    }

    public static int min(int i14, int i15, int i16) {
        if (i15 < i14) {
            i14 = i15;
        }
        return i16 < i14 ? i16 : i14;
    }

    public static long max(long j8, long j14, long j15) {
        if (j14 > j8) {
            j8 = j14;
        }
        return j15 > j8 ? j15 : j8;
    }

    public static long min(long j8, long j14, long j15) {
        if (j14 < j8) {
            j8 = j14;
        }
        return j15 < j8 ? j15 : j8;
    }

    public static short max(short s8, short s14, short s15) {
        if (s14 > s8) {
            s8 = s14;
        }
        return s15 > s8 ? s15 : s8;
    }

    public static short min(short s8, short s14, short s15) {
        if (s14 < s8) {
            s8 = s14;
        }
        return s15 < s8 ? s15 : s8;
    }

    public static long max(long... jArr) {
        validateArray(jArr);
        long j8 = jArr[0];
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long j14 = jArr[i14];
            if (j14 > j8) {
                j8 = j14;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        validateArray(jArr);
        long j8 = jArr[0];
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long j14 = jArr[i14];
            if (j14 < j8) {
                j8 = j14;
            }
        }
        return j8;
    }

    public static int max(int... iArr) {
        validateArray(iArr);
        int i14 = iArr[0];
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 > i14) {
                i14 = i16;
            }
        }
        return i14;
    }

    public static int min(int... iArr) {
        validateArray(iArr);
        int i14 = iArr[0];
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 < i14) {
                i14 = i16;
            }
        }
        return i14;
    }

    public static short max(short... sArr) {
        validateArray(sArr);
        short s8 = sArr[0];
        for (int i14 = 1; i14 < sArr.length; i14++) {
            short s14 = sArr[i14];
            if (s14 > s8) {
                s8 = s14;
            }
        }
        return s8;
    }

    public static short min(short... sArr) {
        validateArray(sArr);
        short s8 = sArr[0];
        for (int i14 = 1; i14 < sArr.length; i14++) {
            short s14 = sArr[i14];
            if (s14 < s8) {
                s8 = s14;
            }
        }
        return s8;
    }

    public static byte max(byte... bArr) {
        validateArray(bArr);
        byte b14 = bArr[0];
        for (int i14 = 1; i14 < bArr.length; i14++) {
            byte b15 = bArr[i14];
            if (b15 > b14) {
                b14 = b15;
            }
        }
        return b14;
    }

    public static byte min(byte... bArr) {
        validateArray(bArr);
        byte b14 = bArr[0];
        for (int i14 = 1; i14 < bArr.length; i14++) {
            byte b15 = bArr[i14];
            if (b15 < b14) {
                b14 = b15;
            }
        }
        return b14;
    }

    public static byte max(byte b14, byte b15, byte b16) {
        if (b15 > b14) {
            b14 = b15;
        }
        return b16 > b14 ? b16 : b14;
    }

    public static byte min(byte b14, byte b15, byte b16) {
        if (b15 < b14) {
            b14 = b15;
        }
        return b16 < b14 ? b16 : b14;
    }

    public static float max(float... fArr) {
        validateArray(fArr);
        float f14 = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            if (Float.isNaN(fArr[i14])) {
                return Float.NaN;
            }
            float f15 = fArr[i14];
            if (f15 > f14) {
                f14 = f15;
            }
        }
        return f14;
    }

    public static float min(float... fArr) {
        validateArray(fArr);
        float f14 = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            if (Float.isNaN(fArr[i14])) {
                return Float.NaN;
            }
            float f15 = fArr[i14];
            if (f15 < f14) {
                f14 = f15;
            }
        }
        return f14;
    }

    public static double max(double d14, double d15, double d16) {
        return Math.max(Math.max(d14, d15), d16);
    }

    public static double min(double d14, double d15, double d16) {
        return Math.min(Math.min(d14, d15), d16);
    }

    public static float max(float f14, float f15, float f16) {
        return Math.max(Math.max(f14, f15), f16);
    }

    public static float min(float f14, float f15, float f16) {
        return Math.min(Math.min(f14, f15), f16);
    }
}
