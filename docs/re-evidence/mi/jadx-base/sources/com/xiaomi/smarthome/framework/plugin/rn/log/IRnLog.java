package com.xiaomi.smarthome.framework.plugin.rn.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    int d(String str, String str2);

    int d(String str, String str2, Throwable th);

    int e(String str, String str2);

    int e(String str, String str2, Throwable th);

    int i(String str, String str2);

    int i(String str, String str2, Throwable th);

    int v(String str, String str2);

    int v(String str, String str2, Throwable th);

    int w(String str, String str2);

    int w(String str, String str2, Throwable th);

    int w(String str, Throwable th);

    int writeLog(int i, String str, String str2);
}
