package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class akp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1149b;
    public static Method c;
    public static Method d;

    public static void a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            dkp.a(j(str), i);
        } else {
            b(j(str), i);
        }
    }

    public static void b(String str, int i) {
        try {
            if (c == null) {
                c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            c.invoke(null, Long.valueOf(f1148a), str, Integer.valueOf(i));
        } catch (Exception e) {
            g("asyncTraceBegin", e);
        }
    }

    public static void c(String str) {
        ckp.a(j(str));
    }

    public static void d(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            dkp.b(j(str), i);
        } else {
            e(j(str), i);
        }
    }

    public static void e(String str, int i) {
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(f1148a), str, Integer.valueOf(i));
        } catch (Exception e) {
            g("asyncTraceEnd", e);
        }
    }

    public static void f() {
        ckp.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? dkp.c() : i();
    }

    public static boolean i() {
        try {
            if (f1149b == null) {
                f1148a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1149b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1149b.invoke(null, Long.valueOf(f1148a))).booleanValue();
        } catch (Exception e) {
            g("isTagEnabled", e);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
