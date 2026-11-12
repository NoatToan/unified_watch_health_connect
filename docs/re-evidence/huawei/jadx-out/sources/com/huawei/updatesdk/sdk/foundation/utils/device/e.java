package com.huawei.updatesdk.sdk.foundation.utils.device;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f29910a = "";

    public static boolean a() {
        if ("KidWatch".equals(f29910a)) {
            return true;
        }
        String strA = c.a("ro.vendor.market.type", "");
        f29910a = strA;
        com.huawei.updatesdk.sdk.foundation.a.b("WearDeviceUtil", "Children watch property value is " + strA);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return "KidWatch".equals(strA);
    }
}
