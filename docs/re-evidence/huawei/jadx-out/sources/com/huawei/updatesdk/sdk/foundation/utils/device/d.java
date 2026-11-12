package com.huawei.updatesdk.sdk.foundation.utils.device;

import com.huawei.hms.mlsdk.asr.MLAsrConstants;

/* JADX INFO: loaded from: classes20.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f29909a = -1;

    public static int a() {
        if (f29909a == -1) {
            f29909a = (MLAsrConstants.LAN_ZH.equals(c.a("ro.product.locale.language", "")) && "CN".equals(c.a("ro.product.locale.region", ""))) ? 0 : 1;
        }
        return f29909a;
    }
}
