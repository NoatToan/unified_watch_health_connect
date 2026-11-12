package com.xiaomi.mitv.airkan.sdk.util;

import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class Logger {
    private static String a = "Logger";
    private static boolean b = new File("_airkan_log").exists();
    private static int c;
    private static boolean d;

    static {
        c = Log.isLoggable(a, 2) ? 2 : 3;
        d = true;
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            try {
                str = String.format(Locale.US, str, objArr);
            } catch (Exception unused) {
                str = str + Arrays.toString(objArr);
            }
        }
        if (!d) {
            return String.format(Locale.US, "[%s] %s", a, str);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            try {
                if (!stackTrace[i].getClass().equals(Logger.class)) {
                    String className = stackTrace[i].getClassName();
                    String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                    return String.format(Locale.US, "[%d] [%s] %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
                }
            } catch (Exception unused2) {
            }
        }
        str2 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        return String.format(Locale.US, "[%d] [%s] %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void d(String str, Object... objArr) {
        if (c > 3 || !b) {
            return;
        }
        Log.d(a, a(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        if (c <= 6) {
            Log.e(a, a(str, objArr));
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        if (c <= 6) {
            Log.e(a, a(str, objArr), th);
        }
    }

    public static void enableTrace(boolean z) {
        d = z;
    }

    public static void i(String str, Object... objArr) {
        if (c <= 4) {
            Log.i(a, a(str, objArr));
        }
    }

    public static void setLogLevel(int i) {
        c = i;
    }

    public static void setTag(String str) {
        d("Changing log tag to %s", str);
        a = str;
    }

    public static void v(String str, Object... objArr) {
        if (c > 2 || !b) {
            return;
        }
        Log.v(a, a(str, objArr));
    }

    public static void w(String str, Object... objArr) {
        if (c <= 5) {
            Log.w(a, a(str, objArr));
        }
    }

    public static void w(Throwable th, String str, Object... objArr) {
        if (c <= 5) {
            Log.w(a, a(str, objArr), th);
        }
    }

    public static void wtf(String str, Object... objArr) {
        if (c <= 5) {
            Log.wtf(a, a(str, objArr));
        }
    }

    public static void wtf(Throwable th, String str, Object... objArr) {
        if (c <= 5) {
            Log.wtf(a, a(str, objArr), th);
        }
    }
}
