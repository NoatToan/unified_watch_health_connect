package com.baidu.idl.util;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class StuLogEx {
    public static final String TAG = "IDL";
    private static final boolean a = Log.isLoggable("stu", 3);

    public static void d(String str, String str2) {
        if (a) {
            Log.d(TAG, str + str2);
        }
    }

    public static void e(String str, String str2) {
        Log.e(TAG, str + str2);
    }

    public static void i(String str, String str2) {
        if (a) {
            Log.i(TAG, str + str2);
        }
    }

    public static void v(String str, String str2) {
        if (a) {
            Log.v(TAG, str + str2);
        }
    }

    public static void w(String str, String str2) {
        if (a) {
            Log.w(TAG, str + str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(TAG, str + str2, th);
    }
}
