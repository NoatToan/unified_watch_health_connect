package com.huami.firstbeat.logproxy;

/* JADX INFO: loaded from: classes9.dex */
public class FbtLogger {
    private static IFbtLogger a;

    public static void d(String str, String str2) {
        IFbtLogger iFbtLogger = a;
        if (iFbtLogger != null) {
            iFbtLogger.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IFbtLogger iFbtLogger = a;
        if (iFbtLogger != null) {
            iFbtLogger.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        IFbtLogger iFbtLogger = a;
        if (iFbtLogger != null) {
            iFbtLogger.i(str, str2);
        }
    }

    public static void setLogger(IFbtLogger iFbtLogger) {
        a = iFbtLogger;
    }

    public static void w(String str, String str2) {
        IFbtLogger iFbtLogger = a;
        if (iFbtLogger != null) {
            iFbtLogger.w(str, str2);
        }
    }

    public static void w2f(String str, String str2) {
        IFbtLogger iFbtLogger = a;
        if (iFbtLogger != null) {
            iFbtLogger.w2f(str, str2);
        }
    }
}
