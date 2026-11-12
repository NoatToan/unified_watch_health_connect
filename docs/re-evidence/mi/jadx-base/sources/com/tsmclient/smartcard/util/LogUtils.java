package com.tsmclient.smartcard.util;

/* JADX INFO: loaded from: classes6.dex */
public class LogUtils {
    public static final String TAG = "TSMClient";
    private static ILogger sLogger;

    private LogUtils() {
    }

    public static void d(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.d(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
    }

    public static void e(String str, String str2, Throwable th) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.e(str, str2, th);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
    }

    public static void setLogger(ILogger iLogger) {
        sLogger = iLogger;
    }
}
