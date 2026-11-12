package ce;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f26882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f26883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f26884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f26885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f26886e;

    private a() {
    }

    public static void a(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            c.p(cause);
        }
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            if (f26883b == null) {
                f26882a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f26883b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f26883b.invoke(null, Long.valueOf(f26882a))).booleanValue();
        } catch (Exception e4) {
            a(e4);
            return false;
        }
    }

    public static void c(int i14, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(i14, d(str));
            return;
        }
        String strD = d(str);
        try {
            if (f26886e == null) {
                f26886e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f26886e.invoke(null, Long.valueOf(f26882a), strD, Integer.valueOf(i14));
        } catch (Exception e4) {
            a(e4);
        }
    }

    public static String d(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
