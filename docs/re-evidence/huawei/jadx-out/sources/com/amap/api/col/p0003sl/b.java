package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.services.district.DistrictSearchQuery;
import com.autonavi.aps.amapapi.utils.c;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    kt f2237a;

    public b(Context context) {
        this.f2237a = null;
        try {
            ir.a().a(context);
        } catch (Throwable unused) {
        }
        this.f2237a = kt.a();
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5) {
        Map<String, String> mapB = b(context, str2, str3, str4, str5, null, null, null);
        mapB.put("children", "1");
        mapB.put("page", "1");
        mapB.put("extensions", "base");
        return a(context, str, mapB);
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Map<String, String> mapB = b(context, str2, str3, null, str4, str5, str6, str7);
        mapB.put("children", "1");
        mapB.put("page", "1");
        mapB.put("extensions", "base");
        return a(context, str, mapB);
    }

    public final String a(Context context, String str, String str2) {
        Map<String, String> mapB = b(context, str2, null, null, null, null, null, null);
        mapB.put("extensions", "all");
        mapB.put("subdistrict", "0");
        return a(context, str, mapB);
    }

    private String a(Context context, String str, Map<String, String> map) {
        try {
            HashMap map2 = new HashMap(16);
            com.autonavi.aps.amapapi.trans.b bVar = new com.autonavi.aps.amapapi.trans.b();
            map2.clear();
            map2.put("Content-Type", "application/x-www-form-urlencoded");
            map2.put("Connection", "Keep-Alive");
            map2.put("User-Agent", "AMAP_Location_SDK_Android 6.4.9");
            String strA = io.a();
            String strA2 = io.a(context, strA, iy.b(map));
            map.put("ts", strA);
            map.put("scode", strA2);
            bVar.b(map);
            bVar.a(map2);
            bVar.a(str);
            bVar.setProxy(iw.a(context));
            bVar.setConnectionTimeout(c.i);
            bVar.setSoTimeout(c.i);
            try {
                return new String(kt.a(bVar).f3037a, "utf-8");
            } catch (Throwable th) {
                c.a(th, "GeoFenceNetManager", "post");
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Map<String, String> b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap map = new HashMap(16);
        map.put(MedalConstants.EVENT_KEY, il.f(context));
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
            map.put(DistrictSearchQuery.KEYWORDS_CITY, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            map.put(TypedValues.CycleType.S_WAVE_OFFSET, str4);
        }
        if (!TextUtils.isEmpty(str7)) {
            map.put("radius", str7);
        }
        return map;
    }
}
