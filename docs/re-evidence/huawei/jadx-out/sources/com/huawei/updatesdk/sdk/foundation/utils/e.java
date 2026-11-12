package com.huawei.updatesdk.sdk.foundation.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.android.content.pm.ApplicationInfoEx;
import com.huawei.ohos.localability.BundleAdapter;
import com.huawei.ohos.localability.base.BundleInfo;
import com.huawei.ohos.localability.base.DeviceInfo;
import java.lang.reflect.Field;
import java.util.Optional;

/* JADX INFO: loaded from: classes20.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f29911a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f29912b = false;

    public static boolean d(String str) {
        if (!d() || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return BundleAdapter.isHarmonyApp(str);
        } catch (Throwable unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "get isHarmonyApp fail");
            return false;
        }
    }

    private static boolean d() {
        if (!f29912b) {
            f29911a = a(com.huawei.updatesdk.sdk.service.app.a.c().a(), com.huawei.updatesdk.sdk.service.app.a.c().a().getPackageName()) && c();
            f29912b = true;
        }
        return f29911a;
    }

    private static boolean c() {
        try {
            new BundleAdapter();
            return true;
        } catch (Throwable unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "not Integrate HarmonySdk ");
            return false;
        }
    }

    public static int c(String str) {
        try {
            if (!d()) {
                return 0;
            }
            Pair sdkVersionInfo = BundleAdapter.getSdkVersionInfo(str);
            if (sdkVersionInfo != null) {
                return ((Integer) sdkVersionInfo.second).intValue();
            }
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "pair is null getHarmonySdkVersionInfo fail");
            return 0;
        } catch (Throwable unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "getHarmonySdkVersionInfo fail");
            return 0;
        }
    }

    public static String b() {
        DeviceInfo deviceInfoA;
        return (d() && (deviceInfoA = a()) != null) ? deviceInfoA.getDeviceType() : "";
    }

    private static BundleInfo b(String str) {
        try {
            Optional bundleInfo = BundleAdapter.getBundleInfo(str, 0);
            if (bundleInfo.isPresent()) {
                return (BundleInfo) bundleInfo.get();
            }
            return null;
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "get BundleInfo exception, pkg:" + str + ", e:" + th.getMessage());
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("android.content.pm.AbsApplicationInfo");
            Field declaredField = cls.getDeclaredField("PARSE_IS_ZIDANE_APK");
            PackageInfo packageInfoA = com.huawei.updatesdk.service.util.b.a(str, context);
            ApplicationInfo applicationInfo = packageInfoA != null ? packageInfoA.applicationInfo : null;
            if (applicationInfo != null) {
                int hwFlags = new ApplicationInfoEx(applicationInfo).getHwFlags();
                int i = declaredField.getInt(cls);
                boolean z = (hwFlags & i) == i;
                com.huawei.updatesdk.sdk.foundation.a.b("HarmonyUtils", "isHarmonyByHwFlag: " + z + ", packageName: " + str);
                return z;
            }
            com.huawei.updatesdk.sdk.foundation.a.c("HarmonyUtils", "applicationInfo is null for pkg: " + str);
            return false;
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyUtils", "isHarmonyByHwFlag exception for pkg: " + str + ", throwable : " + th.getMessage());
        }
    }

    private static DeviceInfo a() {
        try {
            return BundleAdapter.getDeviceInfo();
        } catch (Throwable unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("HarmonyDeviceInfo", "get DeviceInfo fail");
            return null;
        }
    }

    private static BundleInfo a(String str) {
        if (d()) {
            return b(str);
        }
        return null;
    }

    public static PackageInfo a(PackageInfo packageInfo) {
        BundleInfo bundleInfoA;
        if (d() && (bundleInfoA = a(packageInfo.packageName)) != null) {
            packageInfo.versionName = bundleInfoA.getVersionName();
            packageInfo.versionCode = bundleInfoA.getVersionCode();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                applicationInfo.targetSdkVersion = c(packageInfo.packageName);
            }
            if (bundleInfoA.isMultiFrameworkBundle()) {
                packageInfo.baseRevisionCode = packageInfo.versionCode;
            }
        }
        return packageInfo;
    }
}
