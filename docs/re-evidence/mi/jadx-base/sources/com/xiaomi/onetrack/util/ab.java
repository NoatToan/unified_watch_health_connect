package com.xiaomi.onetrack.util;

/* JADX INFO: loaded from: classes11.dex */
public class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13916a = "SystemProperties";

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            p.a(f13916a);
            StringBuilder sb = new StringBuilder();
            sb.append("get e");
            sb.append(th.getMessage());
            return str2;
        }
    }

    public static String a(String str) {
        return a(str, "");
    }

    public static long a(String str, Long l) {
        try {
            return ((Long) Class.forName("android.os.SystemProperties").getMethod("getLong", String.class, Long.TYPE).invoke(null, str, l)).longValue();
        } catch (Throwable th) {
            p.a(f13916a);
            StringBuilder sb = new StringBuilder();
            sb.append("getLong e");
            sb.append(th.getMessage());
            return l.longValue();
        }
    }
}
