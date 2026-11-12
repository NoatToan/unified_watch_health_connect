package com.huawei.watchface;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.detect.SecurityDetect;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30546a = "q0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30547b;

    public static String a() {
        return "1.0.33.132";
    }

    public static int b() {
        return TextUtils.equals("com.hihonor.android.thememanager", Environment.b()) ? 2 : 1;
    }

    public static String c() {
        if (TextUtils.isEmpty(f30547b)) {
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                return "1.0.0.0";
            }
            f30547b = strK;
        }
        return f30547b;
    }

    public static int d() {
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (TextUtils.equals(str, "HUAWEI") && TextUtils.equals(str2, "HUAWEI")) {
            return 1;
        }
        if (TextUtils.equals(str, "HONOR") && TextUtils.equals(str2, "HUAWEI")) {
            return 3;
        }
        return (TextUtils.equals(str, "HONOR") && TextUtils.equals(str2, "HONOR")) ? 2 : 99;
    }

    public static String e() {
        String strD = e4.d("cache_device_id", "");
        if (TextUtils.isEmpty(strD)) {
            strD = l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdentify());
            e4.f("cache_device_id", strD);
        }
        return (strD == null || strD.length() <= 256) ? strD : SafeString.substring(strD, 0, 255);
    }

    public static String f() {
        return l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdentifyByCapability());
    }

    public static String g() {
        String str = !HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSportGTModel() ? "AP" : "GT";
        HwLog.d(f30546a, "getDeviceNameId model:".concat(str));
        return e4.d("cache_device_id", "") + str;
    }

    public static String h() {
        return "file:///data/data/" + Environment.b() + "/";
    }

    public static String i() {
        return Build.MANUFACTURER;
    }

    public static String j() {
        return l() ? "com.hihonor.android.thememanager" : "com.huawei.android.thememanager";
    }

    public static String k() {
        Application applicationContext = Environment.getApplicationContext();
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            HwLog.w(f30546a, "getVersionName() Exception = " + HwLog.printException((Exception) e));
            return null;
        } catch (RuntimeException e2) {
            HwLog.e(f30546a, "getVersionName() runtimeException " + HwLog.printException((Exception) e2));
            return null;
        }
    }

    public static boolean l() {
        return 2 == b();
    }

    public static void a(Activity activity) {
        if (activity != null && SecurityDetect.irpj()) {
            HwLog.i(f30546a, "SecurityDetect irpj");
            activity.finish();
        }
    }
}
