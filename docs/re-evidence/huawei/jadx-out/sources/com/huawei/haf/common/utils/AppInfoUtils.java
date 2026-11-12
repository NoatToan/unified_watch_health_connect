package com.huawei.haf.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class AppInfoUtils {
    private AppInfoUtils() {
    }

    public static File b(String str) {
        File dataDir = BaseApplication.b().getDataDir();
        return TextUtils.isEmpty(str) ? dataDir : new File(dataDir, str);
    }

    public static File g(String str) {
        File filesDir = BaseApplication.b().getFilesDir();
        return TextUtils.isEmpty(str) ? filesDir : new File(filesDir, str);
    }

    public static File d(String str) {
        File cacheDir = BaseApplication.b().getCacheDir();
        return TextUtils.isEmpty(str) ? cacheDir : new File(cacheDir, str);
    }

    public static File c(String str) {
        File externalCacheDir;
        File parentFile = (!"mounted".equals(Environment.getExternalStorageState()) || (externalCacheDir = BaseApplication.b().getExternalCacheDir()) == null) ? null : externalCacheDir.getParentFile();
        if (TextUtils.isEmpty(str)) {
            return parentFile;
        }
        if (parentFile != null) {
            return new File(parentFile, str);
        }
        return null;
    }

    public static File e(String str) {
        File externalFilesDir = "mounted".equals(Environment.getExternalStorageState()) ? BaseApplication.b().getExternalFilesDir(null) : null;
        if (TextUtils.isEmpty(str)) {
            return externalFilesDir;
        }
        if (externalFilesDir != null) {
            return new File(externalFilesDir, str);
        }
        return null;
    }

    public static File a(String str) {
        File externalCacheDir = "mounted".equals(Environment.getExternalStorageState()) ? BaseApplication.b().getExternalCacheDir() : null;
        if (TextUtils.isEmpty(str)) {
            return externalCacheDir;
        }
        if (externalCacheDir != null) {
            return new File(externalCacheDir, str);
        }
        return null;
    }

    public static String e() {
        return BaseApplication.d();
    }

    public static String i() {
        return BaseApplication.i();
    }

    public static int d() {
        return BaseApplication.c();
    }

    public static String a() {
        Context contextB = BaseApplication.b();
        return contextB.getApplicationInfo().loadLabel(contextB.getPackageManager()).toString();
    }

    public static long c() {
        PackageInfo packageInfoA = a(0);
        if (packageInfoA != null) {
            return packageInfoA.firstInstallTime;
        }
        return 0L;
    }

    public static long b() {
        PackageInfo packageInfoA = a(0);
        if (packageInfoA != null) {
            return packageInfoA.lastUpdateTime;
        }
        return 0L;
    }

    private static PackageInfo a(int i) {
        try {
            Context contextB = BaseApplication.b();
            return contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), i);
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("HAF_AppInfoUtils", "getPackageInfo fail, ex=", LogUtil.c(e));
            return null;
        }
    }
}
