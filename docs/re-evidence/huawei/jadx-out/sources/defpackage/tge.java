package defpackage;

import com.huawei.haf.application.BaseApplication;
import health.compact.a.ProcessUtil;

/* JADX INFO: loaded from: classes18.dex */
public class tge {
    public static final String e = BaseApplication.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f49093a = ProcessUtil.e("_PhoneService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f49095c = mjh.f41741a + "com.huawei.health.h5pro";
    public static final String d = ProcessUtil.e("_DaemonService");
    private static int f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f49094b = false;

    public static int b() {
        return f;
    }

    public static void b(int i) {
        f = i;
    }

    public static boolean e() {
        return f49094b;
    }

    public static void c(boolean z) {
        f49094b = z;
    }
}
