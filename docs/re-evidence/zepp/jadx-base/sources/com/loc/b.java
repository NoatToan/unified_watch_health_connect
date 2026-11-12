package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    public aq a;

    public b(Context context) {
        this.a = null;
        try {
            p.a().a(context);
        } catch (Throwable unused) {
        }
        this.a = aq.a();
    }

    private static String a(Context context, String str, Map<String, String> map) {
        byte[] bArrB;
        try {
            HashMap map2 = new HashMap(16);
            ec ecVar = new ec();
            map2.clear();
            map2.put("Content-Type", "application/x-www-form-urlencoded");
            map2.put("Connection", "Keep-Alive");
            map2.put("User-Agent", "AMAP_Location_SDK_Android 5.0.0");
            String strA = m.a();
            String strA2 = m.a(context, strA, u.b(map));
            map.put(AuthHandler.d, strA);
            map.put("scode", strA2);
            ecVar.b(map);
            ecVar.a(map2);
            ecVar.a(str);
            ecVar.a(s.a(context));
            ecVar.a(ei.g);
            ecVar.b(ei.g);
            try {
                if (eo.k(context)) {
                    ecVar.a(str.replace("http:", "https:"));
                    bArrB = aq.a(ecVar);
                } else {
                    bArrB = aq.b(ecVar);
                }
                return new String(bArrB, "utf-8");
            } catch (Throwable th) {
                ei.a(th, "GeoFenceNetManager", DataItem.HTTP_METHOD_POST);
                return null;
            }
        } catch (Throwable unused) {
        }
    }

    private static Map<String, String> b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap map = new HashMap(16);
        map.put("key", k.f(context));
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
        Map<String, String> mapB = b(context, str2, null, null, null, null, null, null);
        mapB.put(GPXTrackPoint.XML.TAG_EXTENSIONS, "all");
        return a(context, str, mapB);
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5) {
        Map<String, String> mapB = b(context, str2, str3, str4, str5, null, null, null);
        mapB.put("children", "1");
        mapB.put(DTransferConstants.PAGE, "1");
        mapB.put(GPXTrackPoint.XML.TAG_EXTENSIONS, com.google.android.exoplayer2.text.ttml.b.X);
        return a(context, str, mapB);
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Map<String, String> mapB = b(context, str2, str3, null, str4, str5, str6, str7);
        mapB.put("children", "1");
        mapB.put(DTransferConstants.PAGE, "1");
        mapB.put(GPXTrackPoint.XML.TAG_EXTENSIONS, com.google.android.exoplayer2.text.ttml.b.X);
        return a(context, str, mapB);
    }
}
