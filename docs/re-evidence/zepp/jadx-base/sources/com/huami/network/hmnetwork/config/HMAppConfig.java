package com.huami.network.hmnetwork.config;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class HMAppConfig {

    @SerializedName("appId")
    public static long APP_ID = 0;
    public static final transient String VALUE_SYS_VERSION = "2.0";
    private static final transient String a = "hm_channel";
    private static final transient String b = "hm_device_type";
    private static final String c = "android_phone";
    private static final String d = "inner";
    private static transient String e = null;
    private static transient String f = null;
    private static transient int g = 0;
    private static transient String h = null;
    private static transient String i = null;
    public static transient boolean isDebug = false;
    private static transient String j;

    private static void a(Context context) {
        Bundle bundle;
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
            h = packageInfo.versionName;
            g = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageInfo.packageName, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                e = bundle.getString(a);
                f = bundle.getString("hm_device_type");
            }
        } catch (Exception unused) {
            h = "";
            g = 0;
        }
        if (h == null) {
            h = "";
        }
        if (TextUtils.isEmpty(e)) {
            e = "inner";
        }
        if (TextUtils.isEmpty(f)) {
            f = "android_phone";
        }
    }

    public static String getChannel() {
        return e;
    }

    public static String getDeviceType() {
        return f;
    }

    public static String getPackageName() {
        return i;
    }

    public static String getSocial() {
        return j;
    }

    public static int getVersionCode() {
        return g;
    }

    public static String getVersionName() {
        return h;
    }

    public static void init(Context context, long j2) {
        init(context, j2, context.getPackageName(), null);
    }

    public static void setSocial(String str) {
        j = str;
    }

    public static void init(Context context, long j2, String str) {
        init(context, j2, str, null);
    }

    public static void init(Context context, long j2, String str, String str2) {
        APP_ID = j2;
        i = str;
        j = str2;
        a(context);
    }
}
