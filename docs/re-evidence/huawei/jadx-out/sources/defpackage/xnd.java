package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class xnd {
    public static void c(String str, String str2, boolean z) {
        xni.d(str, str2, z);
    }

    private static String b(String str, String str2, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("    ");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z) {
                sb.append(xni.e(str2));
            } else {
                sb.append(str2);
            }
        }
        if (th != null) {
            sb.append("    ");
            sb.append(xni.e(th));
        }
        return sb.toString();
    }

    public static void b(String str, String str2, boolean z) {
        xni.b(b("OverSea", str2, null, z));
        xni.e(str, str2, z);
    }

    public static void c(String str, String str2) {
        e(str, str2, false);
    }

    public static void e(String str, String str2, boolean z) {
        xni.b(b("OverSea", str2, null, z));
        xni.c(str, str2, null, z);
    }

    public static void d(String str, String str2, boolean z) {
        xni.b(b("OverSea", str2, null, z));
        xni.c(str, str2, null, z);
    }

    public static void a(String str, String str2, Throwable th, boolean z) {
        xni.b(b("OverSea", str2, th, z));
        xni.c(str, str2, th, z);
    }

    public static void e(String str, String str2) {
        c(str, str2, false);
    }

    public static void d(String str, String str2) {
        b(str, str2, false);
    }

    public static void a(String str, String str2) {
        d(str, str2, false);
    }
}
