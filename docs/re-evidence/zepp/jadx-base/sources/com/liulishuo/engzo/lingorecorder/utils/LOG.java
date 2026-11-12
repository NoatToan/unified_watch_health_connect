package com.liulishuo.engzo.lingorecorder.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes18.dex */
public class LOG {
    public static final String TAG = "LingoRecorder";
    public static boolean isEnable = false;

    public static void d(String str) {
        if (!isEnable || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d(TAG, str);
    }

    public static void e(Throwable th) {
        if (!isEnable || th == null) {
            return;
        }
        Log.e(TAG, Log.getStackTraceString(th));
    }

    public static void e(String str) {
        if (!isEnable || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e(TAG, str);
    }
}
