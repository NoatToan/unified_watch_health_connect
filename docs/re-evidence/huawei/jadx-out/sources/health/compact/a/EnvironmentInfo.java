package health.compact.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.os.SystemInfo;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentInfo extends SystemInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f36545a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f36546b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f36547c = false;
    private static boolean d = false;
    private static Boolean e;
    private static Boolean h;

    private EnvironmentInfo() {
    }

    static String d(String str) {
        return SystemProperties.d(str, "");
    }

    public static String b(String str, String str2) {
        return SystemProperties.d(str, str2);
    }

    public static boolean e(String str, boolean z) {
        return SystemProperties.e(str, z);
    }

    public static String h() {
        return SystemProperties.d("hbc.country", "");
    }

    public static boolean d(Context context) {
        if (e == null) {
            e = Boolean.valueOf(!CommonUtil.u(context));
        }
        return !e.booleanValue();
    }

    public static boolean t() {
        String strH = h();
        if (TextUtils.isEmpty(strH)) {
            com.huawei.hwlogsmodel.LogUtil.a("EnvironmentInfo", "isTaiwanRom country is empty");
            return false;
        }
        if ("tw".equalsIgnoreCase(strH)) {
            com.huawei.hwlogsmodel.LogUtil.a("EnvironmentInfo", "isTaiwanRom country is tw");
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.a("EnvironmentInfo", "isTaiwanRom country is not tw");
        return false;
    }

    public static boolean k() {
        String strD = SystemProperties.d("gsm.sim.operator.numeric", "");
        return !TextUtils.isEmpty(strD) && strD.split(",").length > 0;
    }

    public static boolean m() {
        if (!f36547c) {
            f36547c = true;
            d = "1".equals(SystemProperties.d("ro.kernel.evox"));
        }
        return d;
    }

    public static boolean n() {
        return SystemProperties.e("hw_mc.systemui.live_notification_enabled", false);
    }

    public static boolean l() {
        if (h == null) {
            String strD = SystemProperties.d("hw_sc.build.platform.version");
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 29 && CommonUtil.bg() && CommonUtils.j(strD.split("\\.")[0]) >= 3) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            h = boolValueOf;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("EnvironmentInfo", "sIsSystemSupportFreezing = ", boolValueOf);
        }
        return h.booleanValue();
    }

    public static boolean g() {
        if (f36545a == null) {
            String strD = SystemProperties.d("hw_sc.build.platform.version");
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 30 && CommonUtil.bg() && CommonUtils.j(strD.split("\\.")[0]) >= 4) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            f36545a = boolValueOf;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("EnvironmentInfo", "isHarmony4OrLater = ", boolValueOf);
        }
        return f36545a.booleanValue();
    }

    public static boolean i() {
        if (f36546b == null) {
            String strD = SystemProperties.d("hw_sc.build.platform.version");
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 29 && CommonUtil.bg() && CommonUtils.j(strD.split("\\.")[0]) >= 4) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            f36546b = boolValueOf;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("EnvironmentInfo", "isHarmony4OrLater = ", boolValueOf);
        }
        return f36546b.booleanValue();
    }

    public static boolean f() {
        String strD = SystemProperties.d("hw_sc.build.platform.version");
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && CommonUtil.bg() && CommonUtils.j(strD.split("\\.")[0]) == 3) {
            z = true;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("EnvironmentInfo", "isHarmonyOs3 = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean o() {
        String strD = SystemProperties.d("hw_sc.build.platform.version");
        boolean z = false;
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        String[] strArrSplit = strD.split("\\.");
        if (strArrSplit.length < 2) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && CommonUtil.bg() && CommonUtils.j(strArrSplit[0]) == 3 && CommonUtils.j(strArrSplit[1]) == 1) {
            z = true;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("EnvironmentInfo", "isHarmonyOs31 = ", Boolean.valueOf(z));
        return z;
    }
}
