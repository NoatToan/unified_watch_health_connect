package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import com.huawei.watchface.videoedit.gles.Constant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, ef> f2417a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f2418b = "";

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            b();
            jc.a(eb.a()).a(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    private static void b() {
        try {
            f2417a.put("overlay", new eh());
            f2417a.put("normal", new eg());
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        a(0, "normal", f2418b, str, str2);
    }

    public static void b(String str, String str2) {
        a(1, "normal", f2418b, str, str2);
    }

    public static void c(String str, String str2) {
        a(0, "overlay", f2418b, str, str2);
    }

    private static void d(String str, String str2) {
        a(1, "overlay", f2418b, str, str2);
    }

    private static void a(int i, String str, String str2, String str3, String str4) {
        Map<String, ef> map;
        ef efVar;
        try {
            String str5 = str3 + str4;
            if (ed.f2415b) {
                a(i, str2, str5);
            }
            if (!ed.f2414a || (map = f2417a) == null || (efVar = map.get(str)) == null) {
                return;
            }
            efVar.a(i, str2, str5);
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zA = im.a(jSONObject.optString("able", ""), false);
            boolean zA2 = im.a(jSONObject.optString(JsNetwork.NetworkType.MOBILE, ""), false);
            boolean zA3 = im.a(jSONObject.optString("debugupload", ""), false);
            boolean zA4 = im.a(jSONObject.optString("debugwrite", ""), false);
            boolean zA5 = im.a(jSONObject.optString("forcedUpload", ""), false);
            ed.f2414a = zA;
            boolean zA6 = im.a(jSONObject.optString("di", ""), false);
            String strOptString = jSONObject.optString("dis", "");
            if (!zA6 || iy.e(strOptString)) {
                jc.a(eb.a()).a(zA, zA2, zA4, zA3, Arrays.asList(jSONObject.optString(Constant.FILTER, "").split("&")));
                if (zA5) {
                    jc.a(eb.a()).a(zA5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        try {
            if (ed.f2414a) {
                Iterator<Map.Entry<String, ef>> it = f2417a.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().a();
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
            d(str, str2 + " " + markerOptions.getPosition() + " " + markerOptions.getIcons());
            return;
        }
        d(str, str2);
    }

    public static void a(String str, String str2, List<MarkerOptions> list) {
        if (list != null) {
            Iterator<MarkerOptions> it = list.iterator();
            while (it.hasNext()) {
                a(str, str2, it.next());
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
            d(str, str2 + " " + sb.toString());
            return;
        }
        d(str, str2);
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
            d(str, str2 + " " + sb.toString());
            return;
        }
        d(str, str2);
    }
}
