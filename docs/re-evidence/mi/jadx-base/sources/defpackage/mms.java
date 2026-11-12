package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class mms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f27014a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f27015b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap<String, Boolean> f27016k = new HashMap<>();
    public static ConcurrentHashMap<Integer, Integer> l = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Integer, Integer> m = new ConcurrentHashMap<>();

    public static <T> String a(Map<String, T> map) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (Map.Entry<String, T> entry : map.entrySet()) {
                sb.append("\"" + entry.getKey() + "\":");
                sb.append(entry.getValue());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(boolean z) {
        try {
            return "{\"Quest\":" + z + "}";
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void c(Context context) {
        if (c) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_heatmap", 1);
            g(context, "O009", a(map));
            c = true;
        } catch (Throwable unused) {
        }
    }

    public static void d(Context context, int i2) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_draw_fail", Integer.valueOf(i2));
            g(context, "O023", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void e(Context context, long j2) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_rendertime", Long.valueOf(j2));
            map.put("amap_3dmap_render_background", 0L);
            g(context, "O005", a(map));
        } catch (Throwable unused) {
        }
    }

    public static synchronized void f(Context context, String str) {
        try {
            if (f27016k != null && !TextUtils.isEmpty(str)) {
                if (f27016k.containsKey(str) && f27016k.get(str).booleanValue()) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("amap_3dmap_coordinate", str);
                g(context, "O008", a(map));
                if (!f27016k.containsKey(str)) {
                    f27016k.put(str, Boolean.TRUE);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void g(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            f6t f6tVar = new f6t(context, "3dmap", "10.1.300", str);
            f6tVar.a(str2);
            g6t.e(f6tVar, context);
        } catch (Throwable unused) {
        }
    }

    public static void h(Context context, boolean z) {
        try {
            String strB = b(z);
            f6t f6tVar = new f6t(context, "3dmap", "10.1.300", "O001");
            f6tVar.a(strB);
            g6t.e(f6tVar, context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void i(Context context) {
        if (d) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_offlinemap", 1);
            g(context, "O010", a(map));
            d = true;
        } catch (Throwable unused) {
        }
    }

    public static void j(Context context, String str) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_engine_init_fail", str);
            g(context, "O021", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void k(Context context, boolean z) {
        if (f27014a) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_stylemap", Integer.valueOf(z ? 1 : 0));
            g(context, "O006", a(map));
            f27014a = true;
        } catch (Throwable unused) {
        }
    }

    public static void l(Context context) {
        if (e) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_particleoverlay", 1);
            g(context, "O011", a(map));
            e = true;
        } catch (Throwable unused) {
        }
    }

    public static void m(Context context, String str) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_res_load_fail", str);
            g(context, "O022", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void n(Context context, boolean z) {
        if (f27015b) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_indoormap", Integer.valueOf(z ? 1 : 0));
            g(context, "O007", a(map));
            f27015b = true;
        } catch (Throwable unused) {
        }
    }

    public static void o(Context context) {
        if (g) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_bzmapreview", 1);
            g(context, "O012", a(map));
            g = true;
        } catch (Throwable unused) {
        }
    }

    public static void p(Context context) {
        if (h) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_wxmapreview", 1);
            g(context, "O013", a(map));
            h = true;
        } catch (Throwable unused) {
        }
    }

    public static void q(Context context) {
        if (i) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_dxmapreview", 1);
            g(context, "0016", a(map));
            i = true;
        } catch (Throwable unused) {
        }
    }

    public static void r(Context context) {
        if (f) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_renderfps", 1);
            g(context, "O014", a(map));
            f = true;
        } catch (Throwable unused) {
        }
    }

    public static void s(Context context) {
        if (j) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_buildingoverlay", 1);
            g(context, "O015", a(map));
            j = true;
        } catch (Throwable unused) {
        }
    }
}
