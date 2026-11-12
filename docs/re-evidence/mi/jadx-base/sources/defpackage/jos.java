package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.x0;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, nos> f22986a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f22987b = "";

    public static void a() {
        try {
            if (gos.f19196a) {
                Iterator<Map.Entry<String, nos>> it = f22986a.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(int i, String str, String str2) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
    }

    public static void c(int i, String str, String str2, String str3, String str4) {
        Map<String, nos> map;
        nos nosVar;
        try {
            String str5 = str3 + str4;
            if (gos.f19197b) {
                b(i, str2, str5);
            }
            if (!gos.f19196a || (map = f22986a) == null || (nosVar = map.get(str)) == null) {
                return;
            }
            nosVar.a(i, str2, str5);
        } catch (Throwable unused) {
        }
    }

    public static void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            k();
            i1t.d(zns.t()).g(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2) {
        c(0, "normal", f22987b, str, str2);
    }

    public static void f(String str, String str2, MarkerOptions markerOptions) {
        if (markerOptions == null) {
            n(str, str2);
            return;
        }
        n(str, str2 + " " + markerOptions.getPosition() + " " + markerOptions.getIcons());
    }

    public static void g(String str, String str2, PolygonOptions polygonOptions) {
        if (polygonOptions == null) {
            n(str, str2);
            return;
        }
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
        n(str, str2 + " " + sb.toString());
    }

    public static void h(String str, String str2, PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            n(str, str2);
            return;
        }
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
        n(str, str2 + " " + sb.toString());
    }

    public static void i(String str, String str2, List<MarkerOptions> list) {
        if (list != null) {
            Iterator<MarkerOptions> it = list.iterator();
            while (it.hasNext()) {
                f(str, str2, it.next());
            }
        }
    }

    public static void j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zX = x0.x(jSONObject.optString("able", ""), false);
            boolean zX2 = x0.x(jSONObject.optString("mobile", ""), false);
            boolean zX3 = x0.x(jSONObject.optString("debugupload", ""), false);
            boolean zX4 = x0.x(jSONObject.optString("debugwrite", ""), false);
            boolean zX5 = x0.x(jSONObject.optString("forcedUpload", ""), false);
            gos.f19196a = zX;
            boolean zX6 = x0.x(jSONObject.optString("di", ""), false);
            String strOptString = jSONObject.optString(StepsInfo.KEY_DISTANCE, "");
            if (!zX6 || p0t.A(strOptString)) {
                i1t.d(zns.t()).k(zX, zX2, zX4, zX3, Arrays.asList(jSONObject.optString("filter", "").split(gv5.CONNECT_STR)));
                if (zX5) {
                    i1t.d(zns.t()).j(zX5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void k() {
        try {
            f22986a.put("overlay", new uos());
            f22986a.put("normal", new ros());
        } catch (Throwable unused) {
        }
    }

    public static void l(String str, String str2) {
        c(1, "normal", f22987b, str, str2);
    }

    public static void m(String str, String str2) {
        c(0, "overlay", f22987b, str, str2);
    }

    public static void n(String str, String str2) {
        c(1, "overlay", f22987b, str, str2);
    }
}
