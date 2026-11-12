package org.greenrobot.greendao;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class DaoLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String a = "greenDAO";

    public static int d(String str) {
        return Log.d(a, str);
    }

    public static int e(String str) {
        return Log.w(a, str);
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static int i(String str) {
        return Log.i(a, str);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(a, i);
    }

    public static int println(int i, String str) {
        return Log.println(i, a, str);
    }

    public static int v(String str) {
        return Log.v(a, str);
    }

    public static int w(String str) {
        return Log.w(a, str);
    }

    public static int d(String str, Throwable th) {
        return Log.d(a, str, th);
    }

    public static int e(String str, Throwable th) {
        return Log.e(a, str, th);
    }

    public static int i(String str, Throwable th) {
        return Log.i(a, str, th);
    }

    public static int v(String str, Throwable th) {
        return Log.v(a, str, th);
    }

    public static int w(String str, Throwable th) {
        return Log.w(a, str, th);
    }

    public static int w(Throwable th) {
        return Log.w(a, th);
    }
}
