package com.amap.apis.utils.core.api;

import com.amap.api.col.p0003sl.ip;

/* JADX INFO: loaded from: classes4.dex */
public class AMapUtilCoreApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static NetProxy f3903a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f3904b = true;

    public static void setNetProxy(NetProxy netProxy) {
        f3903a = netProxy;
    }

    public static NetProxy getNetProxy() {
        return f3903a;
    }

    public static void setCollectInfoEnable(boolean z) {
        ip.a(z);
    }

    public static void setCollectIPEnable(boolean z) {
        f3904b = z;
    }

    public static boolean getCollectIPEnable() {
        return f3904b;
    }
}
