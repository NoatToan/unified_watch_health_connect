package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.exoplayer2.v;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes14.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    private Log() {
    }

    private static String appendThrowableString(String str, Throwable th3) {
        String throwableString = getThrowableString(th3);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace = throwableString.replace("\n", "\n  ");
        StringBuilder sb3 = new StringBuilder(v.a(strValueOf.length() + 4, strReplace));
        sb3.append(strValueOf);
        sb3.append("\n  ");
        sb3.append(strReplace);
        sb3.append('\n');
        return sb3.toString();
    }

    public static void d(String str, String str2, Throwable th3) {
        d(str, appendThrowableString(str2, th3));
    }

    public static void e(String str, String str2, Throwable th3) {
        e(str, appendThrowableString(str2, th3));
    }

    public static int getLogLevel() {
        return logLevel;
    }

    public static String getThrowableString(Throwable th3) {
        if (th3 == null) {
            return null;
        }
        if (isCausedByUnknownHostException(th3)) {
            return "UnknownHostException (no network)";
        }
        return !logStackTraces ? th3.getMessage() : android.util.Log.getStackTraceString(th3).trim().replace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "    ");
    }

    public static void i(String str, String str2, Throwable th3) {
        i(str, appendThrowableString(str2, th3));
    }

    private static boolean isCausedByUnknownHostException(Throwable th3) {
        while (th3 != null) {
            if (th3 instanceof UnknownHostException) {
                return true;
            }
            th3 = th3.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i14) {
        logLevel = i14;
    }

    public static void setLogStackTraces(boolean z14) {
        logStackTraces = z14;
    }

    public static void w(String str, String str2, Throwable th3) {
        w(str, appendThrowableString(str2, th3));
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }
}
