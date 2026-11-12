package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.b1;
import com.autonavi.aps.amapapi.trans.b;
import com.autonavi.aps.amapapi.utils.c;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1 f24811a;

    public l9s(Context context) {
        this.f24811a = null;
        try {
            k0t.a().c(context);
        } catch (Throwable unused) {
        }
        this.f24811a = b1.b();
    }

    public static Map<String, String> e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap map = new HashMap(16);
        map.put("key", e0t.k(context));
        if (!TextUtils.isEmpty(str)) {
            map.put("keywords", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("types", str2);
        }
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            map.put("location", str6 + "," + str5);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("city", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            map.put("offset", str4);
        }
        if (!TextUtils.isEmpty(str7)) {
            map.put("radius", str7);
        }
        return map;
    }

    public final String a(Context context, String str, String str2) {
        Map<String, String> mapE = e(context, str2, null, null, null, null, null, null);
        mapE.put("extensions", "all");
        mapE.put("subdistrict", "0");
        return d(context, str, mapE);
    }

    public final String b(Context context, String str, String str2, String str3, String str4, String str5) {
        Map<String, String> mapE = e(context, str2, str3, str4, str5, null, null, null);
        mapE.put("children", "1");
        mapE.put("page", "1");
        mapE.put("extensions", "base");
        return d(context, str, mapE);
    }

    public final String c(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Map<String, String> mapE = e(context, str2, str3, null, str4, str5, str6, str7);
        mapE.put("children", "1");
        mapE.put("page", "1");
        mapE.put("extensions", "base");
        return d(context, str, mapE);
    }

    public final String d(Context context, String str, Map<String, String> map) {
        try {
            HashMap map2 = new HashMap(16);
            b bVar = new b();
            map2.clear();
            map2.put("Content-Type", "application/x-www-form-urlencoded");
            map2.put(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            map2.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
            String strA = g0t.a();
            String strC = g0t.c(context, strA, p0t.q(map));
            map.put(DeviceTagInterface.TAG_DATA_START, strA);
            map.put("scode", strC);
            bVar.b(map);
            bVar.a(map2);
            bVar.a(str);
            bVar.setProxy(n0t.a(context));
            bVar.setConnectionTimeout(c.i);
            bVar.setSoTimeout(c.i);
            try {
                return new String(b1.d(bVar).f36513a, "utf-8");
            } catch (Throwable th) {
                c.a(th, "GeoFenceNetManager", "post");
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
