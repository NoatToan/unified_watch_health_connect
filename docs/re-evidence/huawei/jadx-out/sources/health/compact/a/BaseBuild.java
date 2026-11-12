package health.compact.a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class BaseBuild {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f36514c = d();
    private static final int d = g();
    private static final boolean e = h();

    public static boolean b() {
        return "HONOR".equals(Build.MANUFACTURER);
    }

    protected static boolean e() {
        return f36514c != null;
    }

    protected static int a() {
        return d;
    }

    protected static boolean c() {
        return e;
    }

    private static int g() {
        if (!b() && e()) {
            return SystemProperties.c("ro.build.hw_emui_api_level", 0);
        }
        return 0;
    }

    private static Class d() {
        try {
            return ReflectionUtils.e("com.huawei.android.os.BuildEx");
        } catch (ClassNotFoundException e2) {
            LogUtil.d("HAF_SystemBuild", "getEmuiBuildEx ex=", LogUtil.c(e2));
            return null;
        }
    }

    private static boolean h() {
        String str;
        if (b()) {
            return false;
        }
        try {
            Object objE = ReflectionUtils.e(ReflectionUtils.e("com.huawei.system.BuildEx"), "getOsBrand");
            if (objE instanceof String) {
                str = (String) objE;
            } else {
                str = "";
            }
        } catch (ClassNotFoundException e2) {
            LogUtil.d("HAF_SystemBuild", "isHarmonySystemImpl ex=", LogUtil.c(e2));
        } catch (Exception e3) {
            LogUtil.d("HAF_SystemBuild", "isHarmonySystemImpl ex=", LogUtil.c(e3));
        }
        return "harmony".equals(str);
    }
}
