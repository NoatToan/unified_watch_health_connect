package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public final class ReleaseLogUtil {
    private ReleaseLogUtil() {
    }

    public static void c(String str, Object... objArr) {
        LogUtil.d.i(str, true, objArr);
    }

    public static void d(String str, Object... objArr) {
        LogUtil.d.w(str, true, objArr);
    }

    public static void b(String str, Object... objArr) {
        LogUtil.d.e(str, true, objArr);
    }
}
