package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class ch {
    private static String a(Context context, int i) {
        return null;
    }

    public static String a(Context context, int i, int i2) {
        PackageManager packageManager;
        String nameForUid = "";
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return "";
        }
        try {
            nameForUid = packageManager.getNameForUid(i);
            if (!TextUtils.isEmpty(nameForUid) && nameForUid.contains(":")) {
                hw.b("PackageNameUtil", "pkg=" + nameForUid);
                nameForUid = a(context, i2);
            }
            if (TextUtils.isEmpty(nameForUid)) {
                String[] packagesForUid = packageManager.getPackagesForUid(i);
                if (!bm.a(packagesForUid)) {
                    return packagesForUid[0];
                }
            }
            return nameForUid;
        } catch (Throwable unused) {
            hw.c("PackageNameUtil", "get name for uid error");
            return nameForUid;
        }
    }

    public static String a(Context context) {
        if (context.getPackageManager() != null) {
            return a(context, Binder.getCallingUid(), Binder.getCallingPid());
        }
        hw.c("PackageNameUtil", "pm is null");
        return "";
    }
}
