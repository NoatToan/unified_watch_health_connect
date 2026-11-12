package com.amazon.alexa.avs.log;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class LogHelper {
    private static final boolean LOCAL_DEBUG = true;
    private static final String LOG_PREFIX = "Alexa.";
    private static final int LOG_PREFIX_LENGTH = 6;
    private static final int MAX_LOG_TAG_LENGTH = 100;

    public static void d(String str, Object... objArr) {
        Log.d(str, getStr(null, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e(str, getStr(null, objArr));
    }

    private static String getStr(Throwable th, Object... objArr) {
        if (th == null && objArr != null && objArr.length == 1) {
            return objArr[0].toString();
        }
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        if (th != null) {
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
        }
        return sb.toString();
    }

    public static void i(String str, Object... objArr) {
        Log.i(str, getStr(null, objArr));
    }

    public static String makeLogTag(String str) {
        int length = str.length();
        int i = LOG_PREFIX_LENGTH;
        if (length > 100 - i) {
            return LOG_PREFIX + str.substring(0, (100 - i) - 1);
        }
        return LOG_PREFIX + str;
    }

    public static void v(String str, Object... objArr) {
        Log.v(str, getStr(null, objArr));
    }

    public static void w(String str, Object... objArr) {
        Log.w(str, getStr(null, objArr));
    }

    public static void e(String str, Throwable th, Object... objArr) {
        Log.e(str, getStr(th, objArr));
    }

    public static void w(String str, Throwable th, Object... objArr) {
        Log.w(str, getStr(th, objArr));
    }

    public static String makeLogTag(Class cls) {
        return makeLogTag(cls.getSimpleName());
    }
}
