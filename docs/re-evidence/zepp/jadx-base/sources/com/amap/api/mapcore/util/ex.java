package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ex {
    private static Map<String, ey> a = new ConcurrentHashMap();
    private static String b = "";

    public static void a(String str, String str2) {
        a(0, "normal", b, str, str2);
    }

    public static void b(String str, String str2) {
        a(1, "normal", b, str, str2);
    }

    public static void c(String str, String str2) {
        a(1, "overlay", b, str, str2);
    }

    private static void a(int i, String str, String str2, String str3, String str4) {
        Map<String, ey> map;
        ey eyVar;
        try {
            String str5 = str3 + str4;
            if (ew.b) {
                a(i, str2, str5);
            }
            if (!ew.a || (map = a) == null || (eyVar = map.get(str)) == null) {
                return;
            }
            eyVar.a(i, str2, str5);
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zA = gk.a(jSONObject.optString("able", ""), false);
            boolean zA2 = gk.a(jSONObject.optString("mobile", ""), false);
            boolean zA3 = gk.a(jSONObject.optString("debugupload", ""), false);
            boolean zA4 = gk.a(jSONObject.optString("debugwrite", ""), false);
            boolean zA5 = gk.a(jSONObject.optString("forcedUpload", ""), false);
            ew.a = zA;
            boolean zA6 = gk.a(jSONObject.optString("di", ""), false);
            String strOptString = jSONObject.optString("dis", "");
            if (!zA6 || gu.f(strOptString)) {
                hf.a(er.f()).a(zA, zA2, zA4, zA3, Arrays.asList(jSONObject.optString("filter", "").split(com.alipay.sdk.m.s.a.l)));
                if (zA5) {
                    hf.a(er.f()).a(zA5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        try {
            if (ew.a) {
                Iterator<Map.Entry<String, ey>> it2 = a.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }

    public static void a(String str, String str2, MarkerOptions markerOptions) {
        if (markerOptions != null) {
            c(str, str2 + " " + markerOptions.getPosition() + " " + markerOptions.getIcons());
            return;
        }
        c(str, str2);
    }

    public static void a(String str, String str2, List<MarkerOptions> list) {
        if (list != null) {
            Iterator<MarkerOptions> it2 = list.iterator();
            while (it2.hasNext()) {
                a(str, str2, it2.next());
            }
        }
    }

    public static void a(String str, String str2, PolylineOptions polylineOptions) {
        if (polylineOptions != null) {
            StringBuilder sb = new StringBuilder();
            List<LatLng> points = polylineOptions.getPoints();
            if (points != null) {
                sb.append("points size =");
                sb.append(points.size());
            }
            sb.append(";width=");
            sb.append(polylineOptions.getWidth());
            sb.append(";color=");
            sb.append(polylineOptions.getColor());
            sb.append(";visible=");
            sb.append(polylineOptions.isVisible());
            c(str, str2 + " " + sb.toString());
            return;
        }
        c(str, str2);
    }

    public static void a(String str, String str2, PolygonOptions polygonOptions) {
        if (polygonOptions != null) {
            StringBuilder sb = new StringBuilder();
            List<LatLng> points = polygonOptions.getPoints();
            if (points != null) {
                sb.append("points size =");
                sb.append(points.size());
            }
            sb.append(";width=");
            sb.append(polygonOptions.getStrokeWidth());
            sb.append(";fillColor=");
            sb.append(polygonOptions.getFillColor());
            sb.append(";strokeColor=");
            sb.append(polygonOptions.getStrokeColor());
            sb.append(";visible=");
            sb.append(polygonOptions.isVisible());
            c(str, str2 + " " + sb.toString());
            return;
        }
        c(str, str2);
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            a.put("overlay", new fa());
            a.put("normal", new ez());
        } catch (Throwable unused) {
        }
        try {
            hf.a(er.f()).a(context.getApplicationContext());
        } catch (Throwable unused2) {
        }
    }
}
