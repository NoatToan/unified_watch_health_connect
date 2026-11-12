package com.huawei.maps.offlinedata.logpush.utils;

import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static boolean a() {
        boolean zEqualsIgnoreCase = "CN".equalsIgnoreCase(a("ro.product.locale.region", ""));
        g.c("ROMUtil", "isChineseRom is " + zEqualsIgnoreCase);
        return zEqualsIgnoreCase;
    }

    public static boolean b() {
        return a.b(com.huawei.maps.offlinedata.utils.a.b());
    }

    public static String a(String str, String str2) {
        return SystemPropUtils.getProperty("get", str, "android.os.SystemProperties", str2);
    }
}
