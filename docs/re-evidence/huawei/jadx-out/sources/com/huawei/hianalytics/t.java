package com.huawei.hianalytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Binder;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static boolean a(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return x1.a(context, str, Binder.getCallingPid(), Binder.getCallingUid()) == 0;
        } catch (Throwable unused) {
            HiLog.e("DeviceUtil", "check permission error");
            return false;
        }
    }

    public static boolean b(Context context) {
        NetworkCapabilities networkCapabilities;
        if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            HiLog.sw("DeviceUtil", "no network permission!");
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(7) || networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(16);
            }
        } catch (Throwable unused) {
            HiLog.e("DeviceUtil", "cannot get network state, ensure permission in the manifest");
        }
        return false;
    }

    public static boolean c() {
        l0 l0VarA = k.b().a();
        if (TextUtils.isEmpty(l0VarA.z)) {
            l0VarA.z = a("hw_sc.build.platform.version");
        }
        if (!TextUtils.isEmpty(l0VarA.z)) {
            return true;
        }
        l0 l0VarA2 = k.b().a();
        if (TextUtils.isEmpty(l0VarA2.f11573a)) {
            l0VarA2.f11573a = a("ro.build.version.emui");
        }
        return !TextUtils.isEmpty(l0VarA2.f11573a);
    }

    public static boolean d() {
        String strA = a("ro.build.characteristics");
        return "default".equals(strA) || "tablet".equals(strA);
    }

    public static String a(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable unused) {
            HiLog.e("DeviceUtil", "get app version error");
            str = "";
        }
        return str == null ? "" : str;
    }

    public static boolean c(Context context) {
        PowerManager powerManager;
        if (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return true;
        }
        try {
            return powerManager.isInteractive();
        } catch (Exception unused) {
            HiLog.w("DeviceUtil", "isScreenInteractive has exception");
            return true;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a("android.os.SystemProperties", str);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (b()) {
            return a("com.hihonor.android.os.SystemPropertiesEx", str);
        }
        return a("com.huawei.android.os.SystemPropertiesEx", str);
    }

    public static String a(String str, String str2) {
        Object objInvoke = null;
        try {
            objInvoke = Class.forName(str).getMethod("get", String.class, String.class).invoke(null, str2, "");
        } catch (Throwable unused) {
            HiLog.e("DeviceUtil", "invokeStaticFun fail");
        }
        return objInvoke != null ? (String) objInvoke : "";
    }

    public static boolean b() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("HONOR") && Build.VERSION.SDK_INT >= 31 && com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33;
        } catch (Throwable th) {
            HiLog.e("DeviceUtil", "isHonor6UpPhone error:" + th.getClass());
            return false;
        }
    }

    public static boolean a() {
        String strA = a("com.huawei.android.os.SystemPropertiesEx", "ro.product.locale.region");
        if (!TextUtils.isEmpty(strA)) {
            return "cn".equalsIgnoreCase(strA);
        }
        String strA2 = a("com.huawei.android.os.SystemPropertiesEx", SystemPropertyValues.PROP_LOCALE_KEY);
        if (!TextUtils.isEmpty(strA2)) {
            return strA2.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            return false;
        }
        return "cn".equalsIgnoreCase(country);
    }
}
