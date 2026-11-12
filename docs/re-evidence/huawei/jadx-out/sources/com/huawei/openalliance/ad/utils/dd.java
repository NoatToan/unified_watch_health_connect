package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dd {
    public static String g(Context context) {
        if (context == null) {
            return "";
        }
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                return ai.h(externalCacheDir);
            }
            return null;
        } catch (Exception unused) {
            hw.c("StorageUtils", "getExternalFilesDir exception, use memory card folder.");
            return null;
        }
    }

    public static String f(Context context) {
        File cacheDir;
        return (context == null || (cacheDir = context.getCacheDir()) == null) ? "" : ai.h(cacheDir);
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                return ai.h(externalFilesDir);
            }
        } catch (Exception unused) {
            hw.c("StorageUtils", "getExternalFilesDir exception, use memory card folder.");
        }
        return null;
    }

    public static String d(Context context) {
        File filesDir;
        return (context == null || (filesDir = context.getFilesDir()) == null) ? "" : ai.h(filesDir);
    }

    public static String c(Context context) {
        String strG;
        return (!a() || Build.VERSION.SDK_INT > 27 || (strG = g(context)) == null) ? f(context) : strG;
    }

    protected static boolean b() {
        try {
            if (dk.a()) {
                return Environment.isExternalStorageRemovable();
            }
            return true;
        } catch (Throwable th) {
            hw.c("StorageUtils", "isExternalStorageRemovable, " + th.getClass().getSimpleName());
            return true;
        }
    }

    public static String b(Context context) {
        String strE;
        return (!a() || Build.VERSION.SDK_INT > 27 || (strE = e(context)) == null) ? d(context) : strE;
    }

    public static boolean a() {
        return TextUtils.equals("mounted", Environment.getExternalStorageState()) || !b();
    }

    public static String a(Context context) {
        String strE;
        return (!a() || (strE = e(context)) == null) ? d(context) : strE;
    }
}
