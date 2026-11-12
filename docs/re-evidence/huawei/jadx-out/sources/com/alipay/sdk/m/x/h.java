package com.alipay.sdk.m.x;

import ohos.ace.plugin.wifimanager.WifiDeviceUtils;

/* JADX INFO: loaded from: classes4.dex */
public enum h {
    WIFI(0, WifiDeviceUtils.NETWORKINFO_TYPE_NAME),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2139b;

    h(int i, String str) {
        this.f2138a = i;
        this.f2139b = str;
    }

    public final int a() {
        return this.f2138a;
    }

    public final String b() {
        return this.f2139b;
    }

    public static h a(int i) {
        for (h hVar : values()) {
            if (hVar.a() == i) {
                return hVar;
            }
        }
        return NONE;
    }
}
