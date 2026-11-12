package defpackage;

import java.math.BigDecimal;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class n2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f27479a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27480b = String.valueOf(Long.MAX_VALUE);

    public static NumberFormatException a(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    public static boolean b(String str, boolean z) {
        String str2 = z ? f27479a : f27480b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int iCharAt = str.charAt(i) - str2.charAt(i);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean c(char[] cArr, int i, int i2, boolean z) {
        String str = z ? f27479a : f27480b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int iCharAt = cArr[i + i3] - str.charAt(i3);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int d(String str, int i) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i;
        }
        int i2 = 0;
        if (length > 0) {
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i2 = 1;
            }
        }
        while (i2 < length) {
            char cCharAt2 = strTrim.charAt(i2);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) i(strTrim);
                } catch (NumberFormatException unused) {
                    return i;
                }
            }
            i2++;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused2) {
            return i;
        }
    }

    public static long e(String str, long j) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j;
        }
        int i = 0;
        if (length > 0) {
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i = 1;
            }
        }
        while (i < length) {
            char cCharAt2 = strTrim.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) i(strTrim);
                } catch (NumberFormatException unused) {
                    return j;
                }
            }
            i++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return j;
        }
    }

    public static BigDecimal f(String str) throws NumberFormatException {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw a(str);
        }
    }

    public static BigDecimal g(char[] cArr) throws NumberFormatException {
        return h(cArr, 0, cArr.length);
    }

    public static BigDecimal h(char[] cArr, int i, int i2) throws NumberFormatException {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw a(new String(cArr, i, i2));
        }
    }

    public static double i(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int j(String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i = 1;
        boolean z = cCharAt == '-';
        if (z) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (cCharAt > '9' || cCharAt < '0') {
            return Integer.parseInt(str);
        }
        int i2 = cCharAt - '0';
        if (i < length) {
            int i3 = i + 1;
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return Integer.parseInt(str);
            }
            i2 = (i2 * 10) + (cCharAt2 - '0');
            if (i3 < length) {
                int i4 = i + 2;
                char cCharAt3 = str.charAt(i3);
                if (cCharAt3 > '9' || cCharAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i2 = (i2 * 10) + (cCharAt3 - '0');
                if (i4 < length) {
                    while (true) {
                        int i5 = i4 + 1;
                        char cCharAt4 = str.charAt(i4);
                        if (cCharAt4 > '9' || cCharAt4 < '0') {
                            break;
                        }
                        i2 = (i2 * 10) + (cCharAt4 - '0');
                        if (i5 < length) {
                            i4 = i5;
                        }
                    }
                    return Integer.parseInt(str);
                }
            }
        }
        return z ? -i2 : i2;
    }

    public static int k(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - '0';
        if (i2 > 4) {
            int i4 = i + 4;
            i3 = (((((((i3 * 10) + (cArr[i + 1] - '0')) * 10) + (cArr[i + 2] - '0')) * 10) + (cArr[i + 3] - '0')) * 10) + (cArr[i4] - '0');
            i2 -= 4;
            if (i2 > 4) {
                return (((((((i3 * 10) + (cArr[i + 5] - '0')) * 10) + (cArr[i + 6] - '0')) * 10) + (cArr[i + 7] - '0')) * 10) + (cArr[i + 8] - '0');
            }
            i = i4;
        }
        if (i2 <= 1) {
            return i3;
        }
        int i5 = (i3 * 10) + (cArr[i + 1] - '0');
        if (i2 <= 2) {
            return i5;
        }
        int i6 = (i5 * 10) + (cArr[i + 2] - '0');
        return i2 > 3 ? (i6 * 10) + (cArr[i + 3] - '0') : i6;
    }

    public static long l(String str) {
        return str.length() <= 9 ? j(str) : Long.parseLong(str);
    }

    public static long m(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) k(cArr, i, i3)) * FolmeCore.NANOS_TO_S) + ((long) k(cArr, i + i3, 9));
    }
}
