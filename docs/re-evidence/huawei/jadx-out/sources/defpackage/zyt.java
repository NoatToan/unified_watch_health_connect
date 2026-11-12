package defpackage;

import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes20.dex */
public class zyt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f54790b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String e(String str, boolean z) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt == ' ' && z) || "=:#!\\".indexOf(cCharAt) >= 0) {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb.append(cCharAt);
            } else {
                int iIndexOf = "\t\n\r\f".indexOf(cCharAt);
                if (iIndexOf >= 0) {
                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    sb.append("tnrf".charAt(iIndexOf));
                } else if (cCharAt < ' ' || cCharAt >= 128) {
                    c(cCharAt, sb);
                } else {
                    sb.append(cCharAt);
                }
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        int i;
        char cCharAt;
        if (str == null) {
            return "#";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 1);
        sb.append("# ");
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < length) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == '\r' && (i = i2 + 1) < length && (cCharAt = str.charAt(i)) == '\n') {
                i2 = i;
                cCharAt2 = cCharAt;
            }
            if (cCharAt2 == '\n' || cCharAt2 == '\r' || (i3 > 64 && Character.isWhitespace(cCharAt2))) {
                sb.append(zzp.c());
                i3 = 0;
                z = true;
            } else {
                if (z) {
                    if (cCharAt2 != '#' && cCharAt2 != '!') {
                        sb.append('#');
                        sb.append(' ');
                    }
                    z = false;
                }
                if (cCharAt2 < ' ' || cCharAt2 >= 128) {
                    i3 += 6;
                    c(cCharAt2, sb);
                } else {
                    i3++;
                    sb.append(cCharAt2);
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public static void c(char c2, StringBuilder sb) {
        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
        sb.append('u');
        char[] cArr = f54790b;
        sb.append(cArr[(c2 >> '\f') & 15]);
        sb.append(cArr[(c2 >> '\b') & 15]);
        sb.append(cArr[(c2 >> 4) & 15]);
        sb.append(cArr[c2 & 15]);
    }
}
