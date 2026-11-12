package com.amap.api.col.p0003sl;

import com.amap.api.services.core.ServiceSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class ft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f2535a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static String a() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restsdk.amap.com/v3";
        }
        return "https://restsdk.amap.com/v3";
    }

    public static String b() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restsdk.amap.com/v4";
        }
        return "https://restsdk.amap.com/v4";
    }

    public static String c() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restsdk.amap.com/v5";
        }
        return "https://restsdk.amap.com/v5";
    }

    public static String d() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://yuntuapi.amap.com";
        }
        return "https://yuntuapi.amap.com";
    }

    public static String e() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restsdk.amap.com/rest/me/cpoint";
        }
        return "https://restsdk.amap.com/rest/me/cpoint";
    }

    public static String f() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://apistore.amap.com";
        }
        return "https://apistore.amap.com";
    }

    public static ix a(boolean z) {
        try {
            return new ix.a("sea", "9.7.4", "AMAP SDK Android Search 9.7.4").a(f2535a).a(z).a("9.7.4").a();
        } catch (ik e) {
            fu.a(e, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }

    public static String g() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://m5.amap.com/ws/mapapi/shortaddress/transform";
        }
        return "https://m5.amap.com/ws/mapapi/shortaddress/transform";
    }
}
