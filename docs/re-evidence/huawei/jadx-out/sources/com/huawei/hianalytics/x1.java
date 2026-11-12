package com.huawei.hianalytics;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 {
    public static int a(Context context, String str, int i, int i2) {
        if (context == null || context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        String packageName = context.getPackageName();
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        return (appOpsManager != null && appOpsManager.noteProxyOpNoThrow(strPermissionToOp, packageName) == 0) ? 0 : -2;
    }
}
