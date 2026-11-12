package health.compact.a;

import com.huawei.haf.application.BuildConfigProperties$MainBuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class BuildConfigProperties {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BuildConfigProperties$MainBuildConfig f36519c = new BuildConfigProperties$MainBuildConfig();

    private BuildConfigProperties() {
    }

    public static void a(String str) {
        f36519c.e(str);
    }

    public static String d() {
        return f36519c.get("BUILD_TYPE", "release");
    }

    public static String d(String str) {
        return f36519c.get(str, "");
    }

    public static String a(String str, String str2) {
        return f36519c.get(str, str2);
    }

    public static boolean a(String str, boolean z) {
        return f36519c.getBoolean(str, z);
    }
}
