package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f14953a = Math.log(10.0d);

    public static void a(Appendable appendable, int i, int i2) throws IOException {
        int iLog;
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
            return;
        }
        if (i < 1000) {
            iLog = 3;
        } else {
            iLog = i < 10000 ? 4 : ((int) (Math.log(i) / f14953a)) + 1;
        }
        while (i2 > iLog) {
            appendable.append('0');
            i2--;
        }
        appendable.append(Integer.toString(i));
    }

    public static void b(StringBuffer stringBuffer, int i, int i2) {
        try {
            a(stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void c(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        }
    }

    public static void d(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (i == j) {
            c(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    public static void e(StringBuffer stringBuffer, int i) {
        try {
            c(stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    public static void f(StringBuffer stringBuffer, long j) {
        try {
            d(stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public static int g(long j) {
        if (j < 0) {
            if (j != Long.MIN_VALUE) {
                return g(-j) + 1;
            }
            return 20;
        }
        if (j < 10) {
            return 1;
        }
        if (j < 100) {
            return 2;
        }
        if (j < 1000) {
            return 3;
        }
        if (j < 10000) {
            return 4;
        }
        return 1 + ((int) (Math.log(j) / f14953a));
    }

    public static String h(String str, int i) {
        String strConcat = str.length() <= i + 35 ? str : str.substring(0, i + 32).concat("...");
        if (i <= 0) {
            return "Invalid format: \"" + strConcat + '\"';
        }
        if (i >= str.length()) {
            return "Invalid format: \"" + strConcat + "\" is too short";
        }
        return "Invalid format: \"" + strConcat + "\" is malformed at \"" + strConcat.substring(i) + '\"';
    }

    public static int i(CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }
}
