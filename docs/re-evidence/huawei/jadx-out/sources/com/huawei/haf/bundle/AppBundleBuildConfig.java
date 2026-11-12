package com.huawei.haf.bundle;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.base.BuildConfigReader;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.common.utils.CommonConstant;
import health.compact.a.ReflectionUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AppBundleBuildConfig extends BuildConfigReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Class f5795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Set<String> f5796c;
    private static String e;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AppBundleBuildConfig f5794a = new AppBundleBuildConfig();

    static {
        k();
    }

    private AppBundleBuildConfig() {
    }

    public static Context a() {
        return BaseApplication.b();
    }

    public static long c() {
        return AppInfoUtils.b();
    }

    public static boolean l() {
        return f5795b != null;
    }

    public static boolean o() {
        if (l()) {
            return f5794a.getBoolean("ASSEMBLE_MODE", false);
        }
        return false;
    }

    public static String m() {
        String strI = e;
        if (strI == null) {
            strI = BaseApplication.i();
            int iIndexOf = strI.indexOf(45);
            if (iIndexOf >= 0) {
                strI = strI.substring(0, iIndexOf);
            }
            e = strI;
        }
        return strI;
    }

    public static String i() {
        return l() ? f5794a.get("MAIN_MODULE", "unknown") : "unknown";
    }

    public static Set<String> b() {
        if (f5796c == null) {
            String[] values = l() ? f5794a.getValues("DYNAMIC_FEATURES") : CommonConstant.e;
            if (values.length > 0) {
                HashSet hashSet = new HashSet(values.length);
                hashSet.addAll(Arrays.asList(values));
                f5796c = Collections.unmodifiableSet(hashSet);
            } else {
                f5796c = Collections.EMPTY_SET;
            }
        }
        return f5796c;
    }

    public static String d() {
        return f5794a.get("APP_BUNDLE_ID", "unknown");
    }

    public static int f() {
        return f5794a.getInt("APK_LOAD_MODE", 0);
    }

    public static boolean n() {
        return f5794a.getBoolean("APK_VERIFY_SIGNATURE", false);
    }

    public static String[] g() {
        return f5794a.getValues("APK_VERIFY_SIGNATURE_LIST");
    }

    public static String[] j() {
        return f5794a.getValues("MODULE_WORK_PROCESSES");
    }

    public static String[] h() {
        return f5794a.getValues("FORBIDDEN_WORK_PROCESSES");
    }

    public static String e() {
        return f5794a.get("DEFAULT_MODULE_INFO_VERSION", "1.0.0");
    }

    @Override // com.huawei.haf.common.base.BuildConfigReader
    public Class getBuildConfigClass() {
        if (f5795b == null) {
            k();
        }
        return f5795b;
    }

    private static void k() {
        if (f5795b != null) {
            return;
        }
        synchronized (d) {
            if (f5795b != null) {
                return;
            }
            Class clsC = c(BaseApplication.d());
            if (clsC == null) {
                clsC = c(a().getClass().getPackage().getName());
            }
            f5795b = clsC;
        }
    }

    private static Class c(String str) {
        return ReflectionUtils.b(str + ".AppBundleBuildConfig");
    }
}
