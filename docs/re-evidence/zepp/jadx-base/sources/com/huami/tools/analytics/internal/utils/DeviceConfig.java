package com.huami.tools.analytics.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresPermission;
import com.huami.tools.analytics.BuildConfig;
import com.sensetime.senseid.sdk.liveness.silent.common.util.NetworkUtil;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class DeviceConfig {
    private static boolean a(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.checkSelfPermission(str) == 0;
        }
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getApplicationId(Context context) {
        return context.getPackageName();
    }

    public static String getCountry() {
        return Locale.getDefault().getCountry();
    }

    public static String getDeviceBrand() {
        return Build.BRAND;
    }

    public static String getDeviceModelName() {
        return Build.MODEL;
    }

    public static synchronized String getInstallationId(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
        string = sharedPreferences.getString("InstallationId", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("InstallationId", string).apply();
        }
        return string;
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static String getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (!a(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return "wifi";
        }
        if (type != 0) {
            return "";
        }
        int subtype = activeNetworkInfo.getSubtype();
        String subtypeName = activeNetworkInfo.getSubtypeName();
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return NetworkUtil.NETWORK_CLASS_2_G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NetworkUtil.NETWORK_CLASS_3_G;
            case 13:
                return NetworkUtil.NETWORK_CLASS_4_G;
            default:
                return ("TD-SCDMA".equalsIgnoreCase(subtypeName) || "WCDMA".equalsIgnoreCase(subtypeName) || "CDMA2000".equalsIgnoreCase(subtypeName)) ? NetworkUtil.NETWORK_CLASS_3_G : subtypeName;
        }
    }

    public static int getOsVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getOsVersionName() {
        return Build.VERSION.RELEASE;
    }

    public static String getScreenResolution(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return a(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected();
    }
}
