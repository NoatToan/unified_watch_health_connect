package com.huawei.watchface;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes45.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30508a = "com.huawei.watchface.o";

    public static boolean a(String str) {
        ApplicationInfo applicationInfo;
        if (TextUtils.isEmpty(str)) {
            HwLog.i(f30508a, "isAppExist pkgName is null");
            return false;
        }
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i(f30508a, "isAppExist applicationContext is null");
            return false;
        }
        try {
            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            HwLog.e(f30508a, "isAppExist NameNotFoundException or RuntimeException: " + HwLog.printException(e));
            applicationInfo = null;
        }
        return applicationInfo != null;
    }
}
