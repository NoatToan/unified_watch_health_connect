package health.compact.a;

import com.huawei.haf.common.log.LogBuilder;
import com.huawei.haf.common.log.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class LogUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LogImpl f36611b;
    static Logger d;

    static {
        LogImpl logImpl = new LogImpl();
        f36611b = logImpl;
        d = logImpl;
        LogConfig.d(true, 2, false, true);
    }

    private LogUtil() {
    }

    public static void a(Logger logger, boolean z, int i, boolean z2, boolean z3) {
        if (logger != null) {
            d = logger;
            LogBuilder.c();
        } else {
            d = f36611b;
        }
        LogConfig.d(z, i, z2, z3);
    }

    public static void a(String str, Object... objArr) {
        d.v(str, LogConfig.e(0, str), objArr);
    }

    public static void c(String str, Object... objArr) {
        d.d(str, LogConfig.e(1, str), objArr);
    }

    public static void b(String str, Object... objArr) {
        d.i(str, LogConfig.e(2, str), objArr);
    }

    public static void e(String str, Object... objArr) {
        d.w(str, LogConfig.e(3, str), objArr);
    }

    public static void d(String str, Object... objArr) {
        d.e(str, LogConfig.e(4, str), objArr);
    }

    public static String c(Throwable th) {
        return d.toString(th);
    }

    public static boolean c() {
        return d.isReleaseVersion();
    }

    public static boolean b() {
        return d.isBetaVersion();
    }

    public static boolean d() {
        return d.isDebugVersion();
    }
}
