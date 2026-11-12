package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonyBuild extends BaseBuild {
    public static final boolean e = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36561a = h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f36562c = f();
    public static final int d = d();

    private HarmonyBuild() {
    }

    private static String h() {
        if (!c()) {
            return "";
        }
        return SystemProperties.d("hw_sc.build.platform.version");
    }

    private static boolean f() {
        if (c()) {
            return SystemProperties.e(com.huawei.openalliance.ad.constant.SystemProperties.HW_SC_BUILD_OS_ENABLE, false);
        }
        return false;
    }

    private static int d() {
        if (c()) {
            return SystemProperties.c(com.huawei.openalliance.ad.constant.SystemProperties.HW_SC_BUILD_OS_API_VERSION, 0);
        }
        return 0;
    }
}
