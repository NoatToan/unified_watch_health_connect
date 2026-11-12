package com.xmlywind.volley;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class t {
    public static String a = "Sigmob-Volley";
    public static boolean b = false;
    private static final String c = "com.xmlywind.volley.t";

    public static class a {
        public static final boolean a = t.b;
        private final List<C1077a> b = new ArrayList();
        private boolean c = false;

        /* JADX INFO: renamed from: com.xmlywind.volley.t$a$a, reason: collision with other inner class name */
        public static class C1077a {
            public final String a;
            public final long b;
            public final long c;

            public C1077a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        private long a() {
            if (this.b.size() == 0) {
                return 0L;
            }
            long j = this.b.get(0).c;
            List<C1077a> list = this.b;
            return list.get(list.size() - 1).c - j;
        }

        public void a(String str) {
            synchronized (this) {
                this.c = true;
                long jA = a();
                if (jA > 0) {
                    long j = this.b.get(0).c;
                    t.b("(%-4d ms) %s", Long.valueOf(jA), str);
                    for (C1077a c1077a : this.b) {
                        long j2 = c1077a.c;
                        t.b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c1077a.b), c1077a.a);
                        j = j2;
                    }
                }
            }
        }

        public void a(String str, long j) {
            synchronized (this) {
                if (this.c) {
                    throw new IllegalStateException("Marker added to finished log");
                }
                this.b.add(new C1077a(str, j, SystemClock.elapsedRealtime()));
            }
        }

        public void finalize() {
            if (this.c) {
                return;
            }
            a("Request on the loose");
            t.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static void a(String str, Object... objArr) {
        if (b) {
            Log.v(a, d(str, objArr));
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            Log.d(a, d(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(c)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
