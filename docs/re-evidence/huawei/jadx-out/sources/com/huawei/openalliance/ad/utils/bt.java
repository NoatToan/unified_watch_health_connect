package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class bt {
    private static Object b(Context context, String str, String str2) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData.get(str2);
        } catch (Throwable th) {
            hw.c("MetaDataUtils", "getMetaData %d err: %s", str2, th.getClass().getSimpleName());
            return null;
        }
    }

    public static Integer a(Context context, String str, String str2) {
        try {
            Object objB = b(context, str, str2);
            if (objB != null) {
                return dg.j(objB.toString());
            }
            return null;
        } catch (Throwable th) {
            hw.c("MetaDataUtils", "getIntegerMetaData %s err: %s", str2, th.getClass().getSimpleName());
            return null;
        }
    }
}
