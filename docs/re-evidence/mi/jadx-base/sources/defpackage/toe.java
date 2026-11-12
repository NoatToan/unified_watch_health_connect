package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public final class toe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34892a = true;

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace = strE.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + String.valueOf(strReplace).length());
        sb.append(strValueOf);
        sb.append("\n  ");
        sb.append(strReplace);
        sb.append('\n');
        return sb.toString();
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (g(th)) {
            return "UnknownHostException (no network)";
        }
        return !f34892a ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void f(String str, String str2) {
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
    }

    public static void i(String str, String str2, Throwable th) {
        h(str, a(str2, th));
    }
}
