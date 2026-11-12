package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Environment;
import defpackage.trh;

/* JADX INFO: loaded from: classes2.dex */
public class PackageUtils {
    public static boolean checkPermissions(Context context, String str) {
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            return trh.a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), context.getPackageName()) == 0;
        }
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean isPackageInstalled(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 16384);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isSDCardBusy() {
        return !Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isValid(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
