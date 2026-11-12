package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int a = 0;
    private static boolean b = true;

    private Log() {
    }

    @Pure
    private static String a(String message, @Nullable Throwable throwable) {
        String throwableString = getThrowableString(throwable);
        if (TextUtils.isEmpty(throwableString)) {
            return message;
        }
        String strValueOf = String.valueOf(message);
        String strReplace = throwableString.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + String.valueOf(strReplace).length());
        sb.append(strValueOf);
        sb.append("\n  ");
        sb.append(strReplace);
        sb.append('\n');
        return sb.toString();
    }

    @Pure
    private static boolean b(@Nullable Throwable throwable) {
        while (throwable != null) {
            if (throwable instanceof UnknownHostException) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }

    @Pure
    public static void d(String tag, String message) {
        if (a == 0) {
            android.util.Log.d(tag, message);
        }
    }

    @Pure
    public static void e(String tag, String message) {
        if (a <= 3) {
            android.util.Log.e(tag, message);
        }
    }

    @Pure
    public static int getLogLevel() {
        return a;
    }

    @Nullable
    @Pure
    public static String getThrowableString(@Nullable Throwable throwable) {
        if (throwable == null) {
            return null;
        }
        if (b(throwable)) {
            return "UnknownHostException (no network)";
        }
        return !b ? throwable.getMessage() : android.util.Log.getStackTraceString(throwable).trim().replace(HTTP.TAB, "    ");
    }

    @Pure
    public static void i(String tag, String message) {
        if (a <= 1) {
            android.util.Log.i(tag, message);
        }
    }

    public static void setLogLevel(int logLevel) {
        a = logLevel;
    }

    public static void setLogStackTraces(boolean logStackTraces) {
        b = logStackTraces;
    }

    @Pure
    public static void w(String tag, String message) {
        if (a <= 2) {
            android.util.Log.w(tag, message);
        }
    }

    @Pure
    public static void d(String tag, String message, @Nullable Throwable throwable) {
        d(tag, a(message, throwable));
    }

    @Pure
    public static void e(String tag, String message, @Nullable Throwable throwable) {
        e(tag, a(message, throwable));
    }

    @Pure
    public static void i(String tag, String message, @Nullable Throwable throwable) {
        i(tag, a(message, throwable));
    }

    @Pure
    public static void w(String tag, String message, @Nullable Throwable throwable) {
        w(tag, a(message, throwable));
    }
}
