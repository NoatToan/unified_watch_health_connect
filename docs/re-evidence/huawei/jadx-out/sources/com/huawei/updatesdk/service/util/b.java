package com.huawei.updatesdk.service.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.updatesdk.sdk.foundation.utils.e;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Integer f30012a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f30013b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f30014c = false;
    private static Field d;

    private static boolean j(Context context, String str) {
        Intent intent = new Intent(UpdateConstants.ACTION_NAME_HIAPP_SILENT_DOWNLOAD);
        intent.setPackage(str);
        try {
            return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "isSupportToHiApp: " + e.getMessage());
            return false;
        }
    }

    public static boolean i(Context context, String str) {
        return f(context, str) >= 70203000 && j(context, str);
    }

    public static boolean h(Context context, String str) {
        String str2;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "isMetaDataSupport invalid arguments.";
        } else {
            int iA = a(context, str, "appgallery_support_function");
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "UpdateSDK ag_support_function = " + iA);
            if (iA == -1) {
                iA = 0;
            }
            z = (iA & 2) == 2;
            str2 = "UpdateSDK isMetaDataSupport = " + z;
        }
        com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", str2);
        return z;
    }

    public static boolean g(Context context, String str) {
        return f(context, str) > 0;
    }

    public static int f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "pkgName: " + str + ", versionCode: " + packageInfo.versionCode + ", versionName: " + packageInfo.versionName);
            return packageInfo.versionCode;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("PackageUtils", "getVersioncode:" + e.getMessage());
            return 0;
        }
    }

    public static PackageInfo e(Context context, String str) {
        PackageInfo packageInfoA = a(str, context);
        if (packageInfoA == null) {
            packageInfoA = new PackageInfo();
            packageInfoA.packageName = str;
            packageInfoA.versionName = "1.0";
            packageInfoA.versionCode = 1;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.targetSdkVersion = 19;
            packageInfoA.applicationInfo = applicationInfo;
        }
        return e.a(packageInfoA);
    }

    public static PackageInfo d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 2097280);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Integer c() {
        String string;
        StringBuilder sb;
        String message;
        if (f30013b) {
            return f30012a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            f30012a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder("isDelApp error ClassNotFoundException:");
            message = e.getMessage();
            sb.append(message);
            string = sb.toString();
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", string);
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder("isDelApp error IllegalAccessException:");
            message = e2.getMessage();
            sb.append(message);
            string = sb.toString();
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", string);
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder("isDelApp error IllegalArgumentException:");
            message = e3.getMessage();
            sb.append(message);
            string = sb.toString();
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", string);
        } catch (NoSuchFieldException e4) {
            sb = new StringBuilder("isDelApp error NoSuchFieldException:");
            message = e4.getMessage();
            sb.append(message);
            string = sb.toString();
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", string);
        } catch (Exception e5) {
            string = e5.toString();
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", string);
        }
        f30013b = true;
        return f30012a;
    }

    public static int c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "getMetaDataServiceType invalid arguments.");
            return -1;
        }
        int iA = a(context, str, "ag_service_type");
        com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "UpdateSDK ag_service_type = " + iA);
        return iA;
    }

    public static Field b() {
        if (f30014c) {
            return d;
        }
        try {
            d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", "can not find hwFlags");
        }
        f30014c = true;
        return d;
    }

    public static String b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "getMetaDataDistRule invalid arguments.");
            return "";
        }
        Object objB = b(context, str, "ag_dist_rule");
        com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "UpdateSDK ag_dist_rule = " + objB);
        return objB instanceof String ? (String) objB : "";
    }

    private static Object b(Context context, String str, String str2) {
        try {
            PackageInfo packageInfoD = d(context, str);
            if (packageInfoD == null) {
                com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "getAppMetaData no packageInfo: " + str);
                return null;
            }
            ApplicationInfo applicationInfo = packageInfoD.applicationInfo;
            if (applicationInfo == null) {
                com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "getAppMetaData no applicationInfo: " + str);
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.containsKey(str2)) {
                return bundle.get(str2);
            }
            return null;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.a.a("PackageUtils", "getAppMetaData " + str2 + ": " + e.getMessage());
        }
    }

    public static int b(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageInfo packageInfo = com.huawei.updatesdk.sdk.service.app.a.c().a().getPackageManager().getPackageInfo(str, 128);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("com.huawei.maple.flag")) ? 0 : 1;
        } catch (Exception unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("PackageUtils", "getMapleStatus not found: " + str);
            return 0;
        }
    }

    public static boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        Uri uri = Uri.parse("content://" + str + ".commondata/item/7");
        if (!d.a(contextA, uri, str)) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = contextA.getContentResolver().query(uri, null, str, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                z = Boolean.parseBoolean(cursorQuery.getString(0));
            }
            return z;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.a.a("PackageUtils", "getAgreeProtocolStatus : " + e.getMessage());
            return false;
        } finally {
            d.a(cursorQuery);
        }
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        StringBuilder sb;
        String message;
        int i = applicationInfo.flags;
        Integer numC = c();
        if (numC != null && (i & numC.intValue()) != 0) {
            return true;
        }
        Field fieldB = b();
        if (fieldB == null) {
            return false;
        }
        try {
            return (fieldB.getInt(applicationInfo) & 33554432) != 0;
        } catch (IllegalAccessException e) {
            sb = new StringBuilder("can not get hwflags");
            message = e.getMessage();
            sb.append(message);
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", sb.toString());
            return false;
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder("can not get hwflags");
            message = e2.getMessage();
            sb.append(message);
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", sb.toString());
            return false;
        }
    }

    public static void a() {
        com.huawei.updatesdk.service.store.c.f30005a.execute(new RunnableC0295b());
    }

    public static String a(Context context, String str) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception unused) {
            com.huawei.updatesdk.sdk.foundation.a.b("PackageUtils", "can not find installer pkg." + str);
            installerPackageName = null;
        }
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("PackageUtils", "installer pkg: " + installerPackageName);
        return installerPackageName;
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.service.util.b$b, reason: collision with other inner class name */
    static class RunnableC0295b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageManagerRunnable", "PackageManagerRunnable run!!!!");
            com.huawei.updatesdk.sdk.foundation.utils.d.a(new File(com.huawei.updatesdk.service.download.d.b()));
        }

        private RunnableC0295b() {
        }
    }

    public static PackageInfo a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("PackageUtils", "not found: " + str);
            return null;
        }
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("PackageUtils", "getPreInstallType can not get ApplicationInfo");
            return 2;
        }
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return a(applicationInfo) ? 1 : 2;
    }

    private static int a(Context context, String str, String str2) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str2)) {
                return -1;
            }
            return bundle.getInt(str2);
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.a.a("PackageUtils", "getAgMetaData " + str2 + ": " + e.toString());
            return -1;
        }
    }
}
