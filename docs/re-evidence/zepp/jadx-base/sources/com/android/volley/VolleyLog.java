package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class VolleyLog {
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    public static String TAG = "Volley";

    public static class a {
        public static final boolean c = VolleyLog.DEBUG;
        private static final long d = 0;
        private final List<C0112a> a = new ArrayList();
        private boolean b = false;

        /* JADX INFO: renamed from: com.android.volley.VolleyLog$a$a, reason: collision with other inner class name */
        public static class C0112a {
            public final String a;
            public final long b;
            public final long c;

            public C0112a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        private long c() {
            if (this.a.size() == 0) {
                return 0L;
            }
            long j = this.a.get(0).c;
            List<C0112a> list = this.a;
            return list.get(list.size() - 1).c - j;
        }

        public synchronized void a(String str, long j) {
            if (this.b) {
                VolleyLog.d("Marker added to finished log");
            }
            this.a.add(new C0112a(str, j, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j = this.a.get(0).c;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0112a c0112a : this.a) {
                long j2 = c0112a.c;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c0112a.b), c0112a.a);
                j = j2;
            }
        }

        public void finalize() throws Throwable {
            if (this.b) {
                return;
            }
            b("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr == null) {
            str2 = str;
        } else {
            try {
                str2 = String.format(Locale.US, str, objArr);
            } catch (Exception unused) {
                return str;
            }
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(VolleyLog.class)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str3 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str3, str2);
    }

    public static void d(String str, Object... objArr) {
        Log.d(TAG, a(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, a(str, objArr));
    }

    public static void setTag(String str) {
        d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            Log.v(TAG, a(str, objArr));
        }
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf(TAG, a(str, objArr));
    }

    public static void d(String str) {
        if (DEBUG) {
            Log.d(TAG, a(str, null));
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, a(str, objArr), th);
    }

    public static void wtf(Throwable th, String str, Object... objArr) {
        Log.wtf(TAG, a(str, objArr), th);
    }
}
