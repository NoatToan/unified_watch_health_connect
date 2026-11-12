package com.miui.tsmclient.util;

/* JADX INFO: loaded from: classes6.dex */
public class LogUtils {
    public static final String TAG = "TSMClient";
    public static final String TAG_STAGING = "TSMClientStaging";
    private static ILogger sLogger;

    private LogUtils() {
    }

    public static void d(String str) {
        sendLog("TSMClient.d." + str);
    }

    public static void e(String str) {
        sendLog("TSMClient.e." + str);
    }

    public static void i(String str) {
        sendLog("TSMClient.i." + str);
    }

    private static void sendLog(String str) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.sendLog(str);
        }
    }

    public static void setLogger(ILogger iLogger) {
        sLogger = iLogger;
    }

    public static void t(String str) {
        EnvironmentConfig.isStaging();
    }

    public static void v(String str) {
        sendLog("TSMClient.v." + str);
    }

    public static void w(String str) {
        sendLog("TSMClient.w." + str);
    }

    public static void d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("TSMClient.");
        sb.append(str);
        sendLog("TSMClient.d." + str + "." + str2);
    }

    public static void e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("TSMClient.");
        sb.append(str);
        sendLog("TSMClient.e." + str + "." + str2);
    }

    public static void i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("TSMClient.");
        sb.append(str);
        sendLog("TSMClient.i." + str + "." + str2);
    }

    public static void t(String str, String str2) {
        if (EnvironmentConfig.isStaging()) {
            StringBuilder sb = new StringBuilder();
            sb.append("TSMClient.");
            sb.append(str);
            sendLog("TSMClient.v." + str + "." + str2);
        }
    }

    public static void w(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("TSMClient.");
        sb.append(str);
        sendLog("TSMClient.w." + str + "." + str2);
    }

    public static void e(String str, Throwable th) {
        e("TSMClient", str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        sendLog(str + ".e." + str2);
    }
}
