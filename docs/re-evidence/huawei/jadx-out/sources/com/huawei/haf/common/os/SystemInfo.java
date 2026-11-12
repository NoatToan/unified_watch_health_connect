package com.huawei.haf.common.os;

import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.MagicBuild;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SystemProperties;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SystemInfo {
    private static final boolean d;

    static {
        f();
        d = (SystemProperties.d("ro.config.hw_fold_disp", "").isEmpty() && SystemProperties.d("persist.sys.fold.disp.size", "").isEmpty()) ? false : true;
    }

    private static void f() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("initSystemInfo:");
        d(sb);
        ReleaseLogUtil.c("HAF_SystemInfo", sb.toString());
    }

    public static void d(StringBuilder sb) {
        if (EmuiBuild.f36544b) {
            sb.append("sysName=");
            sb.append("EMUI");
            sb.append(", sysVer=");
            sb.append(EmuiBuild.f36543a);
            sb.append(", apiVer=");
            sb.append(EmuiBuild.e);
        } else if (HarmonyBuild.e) {
            sb.append("sysName=");
            sb.append("HarmonyOS");
            sb.append(", sysVer=");
            sb.append(HarmonyBuild.f36561a);
            sb.append(", apiVer=");
            sb.append(HarmonyBuild.d);
        } else if (MagicBuild.f36615a) {
            sb.append("sysName=");
            sb.append("MagicOS");
            sb.append(", sysVer=");
            sb.append(MagicBuild.e);
            sb.append(", apiVer=");
            sb.append(MagicBuild.f36616b);
        } else {
            sb.append("sysName=");
            sb.append(Agent.OS_NAME);
            sb.append(", sysVer=");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", brand=");
        sb.append(Build.BRAND);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", locale=");
        sb.append(Locale.getDefault());
        sb.append(", sdkVer=");
        sb.append(Build.VERSION.SDK_INT);
    }

    public static boolean e() {
        return HarmonyBuild.e;
    }

    public static boolean c() {
        return "HONOR".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean j() {
        return EmuiBuild.b();
    }

    public static boolean d() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean a() {
        return d;
    }

    public static boolean e(boolean z) {
        if ("tablet".equals(SystemProperties.d("ro.build.characteristics", ""))) {
            return true;
        }
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        if (packageManager.hasSystemFeature("com.huawei.software.features.pad")) {
            return true;
        }
        return z && packageManager.hasSystemFeature("com.hihonor.software.features.pad");
    }

    public static String b() {
        return SystemProperties.d("ro.vendor.hiaiversion");
    }
}
