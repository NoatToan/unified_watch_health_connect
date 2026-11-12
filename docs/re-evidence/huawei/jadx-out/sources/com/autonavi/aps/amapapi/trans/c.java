package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import com.amap.api.col.p0003sl.il;
import com.amap.api.col.p0003sl.io;
import com.amap.api.col.p0003sl.ir;
import com.amap.api.col.p0003sl.iw;
import com.amap.api.col.p0003sl.iy;
import com.amap.api.col.p0003sl.kt;
import com.amap.api.col.p0003sl.la;
import com.amap.api.col.p0003sl.lb;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.autonavi.aps.amapapi.utils.k;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f3986b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    kt f3987a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f3988c;
    private int d = com.autonavi.aps.amapapi.utils.c.i;
    private boolean e = false;
    private int f = 0;

    private c(Context context) {
        this.f3987a = null;
        this.f3988c = null;
        try {
            ir.a().a(context);
        } catch (Throwable unused) {
        }
        this.f3988c = context;
        this.f3987a = kt.a();
    }

    public static c a(Context context) {
        if (f3986b == null) {
            f3986b = new c(context);
        }
        return f3986b;
    }

    public final void a(long j, boolean z, int i) {
        try {
            this.e = z;
            this.d = Long.valueOf(j).intValue();
            this.f = i;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LocNetManager", "setOption");
        }
    }

    public final d a(Context context, byte[] bArr, String str, String str2, boolean z) {
        String str3;
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            try {
                map.put("Content-Type", FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);
                map.put(j2.v, Constants.GZIP);
                map.put("gzipped", "1");
                map.put("Connection", "Keep-Alive");
                map.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
                map.put("KEY", il.f(context));
                map.put("enginever", com.autonavi.aps.amapapi.utils.c.f3998a);
                String strA = io.a();
                String strA2 = io.a(context, strA, "key=" + il.f(context));
                map.put("ts", strA);
                map.put("scode", strA2);
                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.3d) {
                    map.put("aps_s_src", "openapi");
                }
                map.put("encr", "1");
                dVar.b(map);
                if (z) {
                    str3 = "loc";
                } else {
                    str3 = "locf";
                }
                dVar.b(true);
                dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.4.9", str3, 3));
                dVar.a(z);
                dVar.b(str);
                dVar.c(str2);
                dVar.c(k.a(bArr));
                dVar.setProxy(iw.a(context));
                HashMap map2 = new HashMap(16);
                map2.put("output", NavigationFileParser.BIN);
                map2.put("policy", AMap3DTileBuildType.AIRPORT_TERMINAL);
                int i = this.f;
                if (i == 0) {
                    map2.remove("custom");
                } else if (i == 1) {
                    map2.put("custom", "language:cn");
                } else if (i == 2) {
                    map2.put("custom", "language:en");
                } else {
                    map2.remove("custom");
                }
                dVar.a(map2);
                dVar.setConnectionTimeout(this.d);
                dVar.setSoTimeout(this.d);
                if (this.e) {
                    dVar.setHttpProtocol(la.c.HTTPS);
                }
                return dVar;
            } catch (Throwable unused) {
                return dVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final lb a(d dVar) throws Throwable {
        if (this.e) {
            dVar.setHttpProtocol(la.c.HTTPS);
        }
        return kt.a(dVar);
    }

    public final String a(Context context, double d, double d2) {
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            map.clear();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Connection", "Keep-Alive");
            map.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
            HashMap map2 = new HashMap(16);
            map2.put("custom", "26260A1F00020002");
            map2.put(MedalConstants.EVENT_KEY, il.f(context));
            int i = this.f;
            if (i == 0) {
                map2.remove("language");
            } else if (i == 1) {
                map2.put("language", "zh-CN");
            } else if (i == 2) {
                map2.put("language", "en");
            } else {
                map2.remove("language");
            }
            map2.put("curLocationType", k.m(this.f3988c) ? "coarseLoc" : "fineLoc");
            String strA = io.a();
            String strA2 = io.a(context, strA, iy.b(map2));
            map2.put("ts", strA);
            map2.put("scode", strA2);
            dVar.b(("output=json&radius=1000&extensions=all&location=" + d2 + "," + d).getBytes("UTF-8"));
            dVar.b(false);
            dVar.a(true);
            dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.4.9", "loc", 3));
            dVar.a(map2);
            dVar.b(map);
            dVar.setProxy(iw.a(context));
            dVar.setConnectionTimeout(com.autonavi.aps.amapapi.utils.c.i);
            dVar.setSoTimeout(com.autonavi.aps.amapapi.utils.c.i);
            try {
                dVar.c("http://dualstack-arestapi.amap.com/v3/geocode/regeo");
                dVar.b("http://restsdk.amap.com/v3/geocode/regeo");
                if (this.e) {
                    dVar.setHttpProtocol(la.c.HTTPS);
                }
                return new String(kt.a(dVar).f3037a, "utf-8");
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "LocNetManager", "post");
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
