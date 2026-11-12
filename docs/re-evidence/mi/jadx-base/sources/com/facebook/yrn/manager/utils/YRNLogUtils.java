package com.facebook.yrn.manager.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class YRNLogUtils {
    public static boolean ENABLE_LOG = false;
    public static boolean ENABLE_TIME = false;

    public static int d(String str, String str2) {
        if (!ENABLE_LOG) {
            return 0;
        }
        if (!ENABLE_TIME) {
            return Log.d(str, str2);
        }
        return Log.d(str, str2 + ",time is " + System.currentTimeMillis());
    }

    public static int e(String str, String str2) {
        if (!ENABLE_LOG) {
            return 0;
        }
        if (!ENABLE_TIME) {
            return Log.e(str, str2);
        }
        return Log.e(str, str2 + ",time is " + System.currentTimeMillis());
    }

    public static void setEnableLog(boolean z) {
        ENABLE_LOG = z;
    }

    public static void setEnableLog(boolean z, boolean z2) {
        ENABLE_LOG = z;
        ENABLE_TIME = z2;
    }
}
