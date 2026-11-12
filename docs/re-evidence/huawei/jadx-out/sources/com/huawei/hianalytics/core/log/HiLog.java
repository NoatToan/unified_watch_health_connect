package com.huawei.hianalytics.core.log;

/* JADX INFO: loaded from: classes3.dex */
public class HiLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LogAdapter f11473a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f11474b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f11475c = 6;
    public static String d = "";

    /* JADX INFO: loaded from: classes33.dex */
    public interface ErrorCode {
        public static final String NE002 = "NE-002";
        public static final String NE003 = "NE-003";
        public static final String NE004 = "NE-004";
        public static final String NE005 = "NE-005";
        public static final String NE006 = "NE-006";
    }

    public static void d(String str, String str2) {
        if (!isDebugEnable() || str == null || str2 == null) {
            return;
        }
        f11473a.println(3, str, str2);
    }

    public static void e(String str, String str2) {
        LogAdapter logAdapter = f11473a;
        if (logAdapter == null || str == null || str2 == null) {
            return;
        }
        logAdapter.println(6, str, str2);
    }

    public static void i(String str, String str2) {
        LogAdapter logAdapter = f11473a;
        if (logAdapter == null || !logAdapter.isLoggable(4) || str == null || str2 == null) {
            return;
        }
        f11473a.println(4, str, str2);
    }

    public static void init(int i, String str) {
        f11474b = true;
        f11475c = i;
        d = str;
        LogAdapter logAdapter = f11473a;
        if (logAdapter != null) {
            logAdapter.init(i, str);
        }
    }

    public static boolean isDebugEnable() {
        LogAdapter logAdapter = f11473a;
        if (logAdapter != null) {
            return logAdapter.isLoggable(3);
        }
        return false;
    }

    public static void setLogAdapter(LogAdapter logAdapter) {
        if (f11473a == null) {
            f11473a = logAdapter;
        }
        if (f11474b) {
            init(f11475c, d);
        }
    }

    public static void si(String str, String str2) {
        LogAdapter logAdapter = f11473a;
        if (logAdapter == null || str == null || str2 == null) {
            return;
        }
        if (f11474b && (logAdapter == null || !logAdapter.isLoggable(6))) {
            return;
        }
        f11473a.println(4, str, str2);
    }

    public static void sw(String str, String str2) {
        LogAdapter logAdapter = f11473a;
        if (logAdapter == null || str == null || str2 == null) {
            return;
        }
        if (f11474b && (logAdapter == null || !logAdapter.isLoggable(7))) {
            return;
        }
        f11473a.println(5, str, str2);
    }

    public static void w(String str, String str2) {
        LogAdapter logAdapter = f11473a;
        if (logAdapter == null || !logAdapter.isLoggable(5) || str == null || str2 == null) {
            return;
        }
        f11473a.println(5, str, str2);
    }
}
