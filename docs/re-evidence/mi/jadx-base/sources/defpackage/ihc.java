package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ihc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f21142a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21143b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long b(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append("]");
                toe.c("HttpUtil", sb.toString());
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f21142a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) rk1.e(matcher.group(2))) - Long.parseLong((String) rk1.e(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append("]");
            toe.h("HttpUtil", sb2.toString());
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append("]");
            toe.c("HttpUtil", sb3.toString());
            return j;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f21143b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) rk1.e(matcher.group(1)));
        }
        return -1L;
    }
}
