package defpackage;

import com.amap.api.col.p0003sl.ik;
import com.amap.api.services.core.ServiceSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class wts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f38349a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static o0t a(boolean z) {
        try {
            return new o0t.a("sea", "9.7.4", "AMAP SDK Android Search 9.7.4").c(f38349a).b(z).a("9.7.4").d();
        } catch (ik e) {
            xts.i(e, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }

    public static String b() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v3" : "https://restsdk.amap.com/v3";
    }

    public static String c() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v4" : "https://restsdk.amap.com/v4";
    }

    public static String d() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v5" : "https://restsdk.amap.com/v5";
    }

    public static String e() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://yuntuapi.amap.com" : "https://yuntuapi.amap.com";
    }

    public static String f() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/rest/me/cpoint" : "https://restsdk.amap.com/rest/me/cpoint";
    }

    public static String g() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://apistore.amap.com" : "https://apistore.amap.com";
    }

    public static String h() {
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://m5.amap.com/ws/mapapi/shortaddress/transform" : "https://m5.amap.com/ws/mapapi/shortaddress/transform";
    }
}
