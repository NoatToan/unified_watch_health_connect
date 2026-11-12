package com.chenenyu.router.util;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class RLog {
    private static final String a = "Router";
    private static boolean b = false;

    public static void e(String str) {
        if (!b || str == null) {
            return;
        }
        Log.e(a, str);
    }

    public static void i(String str) {
        if (!b || str == null) {
            return;
        }
        Log.i(a, str);
    }

    public static void showLog(boolean z) {
        b = z;
    }

    public static void w(String str) {
        if (!b || str == null) {
            return;
        }
        Log.w(a, str);
    }

    public static void e(String str, Throwable th) {
        if (b) {
            Log.e(a, str, th);
        }
    }

    public static void i(String str, String str2) {
        if (!b || str2 == null) {
            return;
        }
        Log.i(str, str2);
    }
}
