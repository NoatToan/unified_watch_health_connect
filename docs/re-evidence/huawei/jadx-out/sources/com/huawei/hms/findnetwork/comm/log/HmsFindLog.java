package com.huawei.hms.findnetwork.comm.log;

/* JADX INFO: loaded from: classes33.dex */
public class HmsFindLog {
    private static final ApkLogImpl APK_LOG_IMPL = new ApkLogImpl();

    public static void e(String str, String str2) {
        APK_LOG_IMPL.e(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        APK_LOG_IMPL.e(str, str2, th);
    }

    public static void w(String str, String str2) {
        APK_LOG_IMPL.w(str, str2);
    }

    public static void setCommonTag(String str) {
        APK_LOG_IMPL.init(str);
    }

    public static void i(String str, String str2) {
        APK_LOG_IMPL.i(str, str2);
    }

    public static void d(String str, String str2) {
        APK_LOG_IMPL.d(str, str2);
    }

    private HmsFindLog() {
    }
}
