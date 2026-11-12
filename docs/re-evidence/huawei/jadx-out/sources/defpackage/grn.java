package defpackage;

import com.huawei.health.pluginlocation.logger.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class grn {
    private static Logger e;

    public static void a(Logger logger) {
        if (e == null) {
            e = logger;
        }
    }

    public static void a(String str, Object... objArr) {
        Logger logger = e;
        if (logger != null) {
            logger.d(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Logger logger = e;
        if (logger != null) {
            logger.i(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Logger logger = e;
        if (logger != null) {
            logger.w(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Logger logger = e;
        if (logger != null) {
            logger.e(str, objArr);
        }
    }
}
