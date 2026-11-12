package com.alipay.sdk.util;

import com.xiaomi.ai.android.utils.NetworkUtils;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    WIFI(0, NetworkUtils.NETWORK_TYPE_WIFI),
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
    NETWORK_TYPE_20(20, NetworkUtils.NETWORK_TYPE_5G),
    NONE(-1, "none");

    private int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f5881r;

    d(int i, String str) {
        this.q = i;
        this.f5881r = str;
    }

    public final int a() {
        return this.q;
    }

    public final String b() {
        return this.f5881r;
    }

    public static d a(int i) {
        for (d dVar : values()) {
            if (dVar.a() == i) {
                return dVar;
            }
        }
        return NONE;
    }
}
