package defpackage;

import com.huawei.hms.framework.common.ExceptionCode;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes21.dex */
public final class xd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f52724c = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f52723b = String.valueOf(Long.MAX_VALUE);

    public static int b(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * ExceptionCode.CRASH_EXCEPTION;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static int b(String str) {
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

    public static long c(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) b(cArr, i, i3)) * 1000000000) + ((long) b(cArr, i + i3, 9));
    }

    public static long a(String str) {
        if (str.length() <= 9) {
            return b(str);
        }
        return Long.parseLong(str);
    }

    public static boolean d(char[] cArr, int i, int i2, boolean z) {
        String str = z ? f52724c : f52723b;
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

    public static boolean a(String str, boolean z) {
        String str2 = z ? f52724c : f52723b;
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

    public static int b(String str, int i) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i2 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                try {
                    char cCharAt2 = strTrim.charAt(i2);
                    if (cCharAt2 > '9' || cCharAt2 < '0') {
                        return (int) e(strTrim);
                    }
                    i2++;
                } catch (NumberFormatException unused) {
                }
            }
            return Integer.parseInt(strTrim);
        }
        return i;
    }

    public static long e(String str, long j) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i = 1;
            }
            while (i < length) {
                try {
                    char cCharAt2 = strTrim.charAt(i);
                    if (cCharAt2 > '9' || cCharAt2 < '0') {
                        return (long) e(strTrim);
                    }
                    i++;
                } catch (NumberFormatException unused) {
                }
            }
            return Long.parseLong(strTrim);
        }
        return j;
    }

    public static double a(String str, double d) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                try {
                    return e(strTrim);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d;
    }

    public static double e(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static BigDecimal d(String str) throws NumberFormatException {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw c(str);
        }
    }

    public static BigDecimal a(char[] cArr) throws NumberFormatException {
        return a(cArr, 0, cArr.length);
    }

    public static BigDecimal a(char[] cArr, int i, int i2) throws NumberFormatException {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw c(new String(cArr, i, i2));
        }
    }

    private static NumberFormatException c(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }
}
