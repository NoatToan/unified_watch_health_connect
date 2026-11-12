package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ekp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f16747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f16748b;
    public static Method c;
    public static Method d;
    public static Method e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f16747a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f16748b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
