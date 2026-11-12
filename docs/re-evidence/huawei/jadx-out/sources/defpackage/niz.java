package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes.dex */
public class niz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43075b = "AnalyticsUtils";

    public static boolean c() {
        String str = f43075b;
        LogUtil.d(str, "enter getAnalyticsStatus");
        boolean zEquals = String.valueOf(true).equals(b());
        boolean zEquals2 = String.valueOf(false).equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "key_wether_to_auth"));
        LogUtil.d(str, "getAnalyticsStatus() isShareStatus = ", Boolean.valueOf(zEquals), ", isWhetherToAuth = ", Boolean.valueOf(!zEquals2));
        return zEquals && !zEquals2;
    }

    public static void c(boolean z) {
        LogUtil.a(f43075b, "setShareStatus() isShareStatus = ", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1005), "analytics_status", String.valueOf(z), new StorageParams());
        KeyValDbManager.d(BaseApplication.getContext()).b("key_user_experience_plan_check_box", String.valueOf(z));
    }

    public static String b() {
        if (EnvironmentUtils.d()) {
            return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1005), "analytics_status");
        }
        return KeyValDbManager.d(BaseApplication.getContext()).c("key_user_experience_plan_check_box");
    }

    public static void d() {
        LogUtil.a(f43075b, "enter clearShareStatus");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1005), "analytics_status", "", new StorageParams());
        KeyValDbManager.d(BaseApplication.getContext()).b("key_user_experience_plan_check_box", "");
    }
}
