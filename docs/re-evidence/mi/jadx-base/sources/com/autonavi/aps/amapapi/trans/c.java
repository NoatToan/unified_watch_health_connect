package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import com.amap.api.col.p0003sl.b1;
import com.amap.api.col.p0003sl.la;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.autonavi.aps.amapapi.utils.k;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.k0t;
import defpackage.n0t;
import defpackage.p0t;
import defpackage.v5t;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f6891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b1 f6892a;
    private Context c;
    private int d = com.autonavi.aps.amapapi.utils.c.i;
    private boolean e = false;
    private int f = 0;

    private c(Context context) {
        this.f6892a = null;
        this.c = null;
        try {
            k0t.a().c(context);
        } catch (Throwable unused) {
        }
        this.c = context;
        this.f6892a = b1.b();
    }

    public static c a(Context context) {
        if (f6891b == null) {
            f6891b = new c(context);
        }
        return f6891b;
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
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            try {
                map.put("Content-Type", "application/octet-stream");
                map.put("Accept-Encoding", "gzip");
                map.put("gzipped", "1");
                map.put(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                map.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
                map.put("KEY", e0t.k(context));
                map.put("enginever", com.autonavi.aps.amapapi.utils.c.f6905a);
                String strA = g0t.a();
                String strC = g0t.c(context, strA, "key=" + e0t.k(context));
                map.put(DeviceTagInterface.TAG_DATA_START, strA);
                map.put("scode", strC);
                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                    map.put("aps_s_src", "openapi");
                }
                map.put("encr", "1");
                dVar.b(map);
                String str3 = "loc";
                if (!z) {
                    str3 = "locf";
                }
                dVar.b(true);
                dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.4.9", str3, 3));
                dVar.a(z);
                dVar.b(str);
                dVar.c(str2);
                dVar.c(k.a(bArr));
                dVar.setProxy(n0t.a(context));
                HashMap map2 = new HashMap(16);
                map2.put("output", TSMAuthContants.PARAM_CARD_BIN);
                map2.put("policy", AMap3DTileBuildType.AIRPORT_TERMINAL);
                int i = this.f;
                if (i == 0) {
                    map2.remove("custom");
                } else if (i == 1) {
                    map2.put("custom", "language:cn");
                } else if (i != 2) {
                    map2.remove("custom");
                } else {
                    map2.put("custom", "language:en");
                }
                dVar.a(map2);
                dVar.setConnectionTimeout(this.d);
                dVar.setSoTimeout(this.d);
                if (!this.e) {
                    return dVar;
                }
                dVar.setHttpProtocol(la.c.HTTPS);
                return dVar;
            } catch (Throwable unused) {
                return dVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final v5t a(d dVar) throws Throwable {
        if (this.e) {
            dVar.setHttpProtocol(la.c.HTTPS);
        }
        return b1.d(dVar);
    }

    public final String a(Context context, double d, double d2) {
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            map.clear();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            map.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
            HashMap map2 = new HashMap(16);
            map2.put("custom", "26260A1F00020002");
            map2.put("key", e0t.k(context));
            int i = this.f;
            if (i == 0) {
                map2.remove("language");
            } else if (i == 1) {
                map2.put("language", "zh-CN");
            } else if (i != 2) {
                map2.remove("language");
            } else {
                map2.put("language", "en");
            }
            map2.put("curLocationType", k.m(this.c) ? "coarseLoc" : "fineLoc");
            String strA = g0t.a();
            String strC = g0t.c(context, strA, p0t.q(map2));
            map2.put(DeviceTagInterface.TAG_DATA_START, strA);
            map2.put("scode", strC);
            dVar.b(("output=json&radius=1000&extensions=all&location=" + d2 + "," + d).getBytes("UTF-8"));
            dVar.b(false);
            dVar.a(true);
            dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.4.9", "loc", 3));
            dVar.a(map2);
            dVar.b(map);
            dVar.setProxy(n0t.a(context));
            dVar.setConnectionTimeout(com.autonavi.aps.amapapi.utils.c.i);
            dVar.setSoTimeout(com.autonavi.aps.amapapi.utils.c.i);
            try {
                dVar.c("http://dualstack-arestapi.amap.com/v3/geocode/regeo");
                dVar.b("http://restsdk.amap.com/v3/geocode/regeo");
                if (this.e) {
                    dVar.setHttpProtocol(la.c.HTTPS);
                }
                return new String(b1.d(dVar).f36513a, "utf-8");
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "LocNetManager", "post");
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
