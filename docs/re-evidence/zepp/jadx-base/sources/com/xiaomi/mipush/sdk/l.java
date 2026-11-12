package com.xiaomi.mipush.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public class l {
    private static int a = -1;

    public static y a(Context context) {
        return y.OTHER;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3483a(Context context) {
        return b(context, "com.google.android.gms.common.GoogleApiAvailability") || b(context, "com.google.android.gms.common.GoogleApiAvailabilityLight");
    }

    public static boolean b(Context context) {
        boolean zBooleanValue = false;
        Object objA = com.xiaomi.push.z.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (objA != null && (objA instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objA)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.b.c("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    private static boolean b(Context context, String str) {
        Object objA = com.xiaomi.push.z.a(com.xiaomi.push.z.a(str, "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objA2 = com.xiaomi.push.z.a("com.google.android.gms.common.ConnectionResult", com.alipay.sdk.m.f0.c.p);
        if (objA2 == null || !(objA2 instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            a = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objA2)).intValue();
        if (objA != null) {
            if (objA instanceof Integer) {
                a = ((Integer) Integer.class.cast(objA)).intValue() == iIntValue ? 1 : 0;
            } else {
                a = 0;
                com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(a > 0);
        com.xiaomi.channel.commonutils.logger.b.c(sb.toString());
        return a > 0;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue = false;
        Object objA = com.xiaomi.push.z.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (objA != null && (objA instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objA)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.b.c("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }
}
