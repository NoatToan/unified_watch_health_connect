package defpackage;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class bdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Locale f4093a = Locale.getDefault();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f4094b = new DecimalFormatSymbols(f4093a).getZeroDigit();

    public static String a(int i, int i2) {
        int i3;
        StringBuilder sbAcquire = r3i.c().acquire();
        if (i2 < 0) {
            i2 = -i2;
            i--;
            sbAcquire.append('-');
        }
        if (i2 >= 10000) {
            String string = Integer.toString(i2);
            for (int length = string.length(); length < i; length++) {
                sbAcquire.append('0');
            }
            sbAcquire.append(string);
        } else {
            if (i2 >= 1000) {
                i3 = 4;
            } else if (i2 >= 100) {
                i3 = 3;
            } else {
                i3 = i2 >= 10 ? 2 : 1;
            }
            while (i3 < i) {
                sbAcquire.append('0');
                i3++;
            }
            sbAcquire.append(i2);
        }
        String string2 = sbAcquire.toString();
        r3i.c().release(sbAcquire);
        return string2;
    }

    public static String b(int i) {
        return c(-1, i);
    }

    public static String c(int i, int i2) {
        char cD = d(Locale.getDefault());
        String strA = a(i, i2);
        return cD != '0' ? e(cD, strA) : strA;
    }

    public static char d(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("locale == null");
        }
        if (!locale.equals(f4093a)) {
            f4094b = new DecimalFormatSymbols(locale).getZeroDigit();
            f4093a = locale;
        }
        return f4094b;
    }

    public static String e(char c, String str) {
        int length = str.length();
        int i = c - '0';
        StringBuilder sbAcquire = r3i.c().acquire();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                cCharAt = (char) (cCharAt + i);
            }
            sbAcquire.append(cCharAt);
        }
        String string = sbAcquire.toString();
        r3i.c().release(sbAcquire);
        return string;
    }
}
