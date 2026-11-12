package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2400a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2401b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2402c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static HashMap<String, Boolean> k = new HashMap<>();
    private static ConcurrentHashMap<Integer, Integer> l = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer, Integer> m = new ConcurrentHashMap<>();

    public static void a(Context context, boolean z) {
        try {
            String strA = a(z);
            li liVar = new li(context, "3dmap", "10.1.300", "O001");
            liVar.a(strA);
            lj.a(liVar, context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String a(boolean z) {
        try {
            return "{\"Quest\":" + z + "}";
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, long j2) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_rendertime", Long.valueOf(j2));
            map.put("amap_3dmap_render_background", 0L);
            a(context, "O005", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, boolean z) {
        if (f2400a) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_stylemap", Integer.valueOf(z ? 1 : 0));
            a(context, "O006", a(map));
            f2400a = true;
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, boolean z) {
        if (f2401b) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_indoormap", Integer.valueOf(z ? 1 : 0));
            a(context, "O007", a(map));
            f2401b = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str) {
        synchronized (dy.class) {
            try {
                if (k != null && !TextUtils.isEmpty(str)) {
                    if (k.containsKey(str) && k.get(str).booleanValue()) {
                        return;
                    }
                    HashMap map = new HashMap();
                    map.put("amap_3dmap_coordinate", str);
                    a(context, "O008", a(map));
                    if (!k.containsKey(str)) {
                        k.put(str, Boolean.TRUE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context) {
        if (f2402c) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_heatmap", 1);
            a(context, "O009", a(map));
            f2402c = true;
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (d) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_offlinemap", 1);
            a(context, "O010", a(map));
            d = true;
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context) {
        if (e) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_particleoverlay", 1);
            a(context, "O011", a(map));
            e = true;
        } catch (Throwable unused) {
        }
    }

    public static void d(Context context) {
        if (g) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_bzmapreview", 1);
            a(context, "O012", a(map));
            g = true;
        } catch (Throwable unused) {
        }
    }

    public static void e(Context context) {
        if (h) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_wxmapreview", 1);
            a(context, "O013", a(map));
            h = true;
        } catch (Throwable unused) {
        }
    }

    public static void f(Context context) {
        if (i) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_dxmapreview", 1);
            a(context, "0016", a(map));
            i = true;
        } catch (Throwable unused) {
        }
    }

    public static void g(Context context) {
        if (f) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_renderfps", 1);
            a(context, "O014", a(map));
            f = true;
        } catch (Throwable unused) {
        }
    }

    public static void h(Context context) {
        if (j) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_buildingoverlay", 1);
            a(context, "O015", a(map));
            j = true;
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_engine_init_fail", str);
            a(context, "O021", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String str) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_res_load_fail", str);
            a(context, "O022", a(map));
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_draw_fail", Integer.valueOf(i2));
            a(context, "O023", a(map));
        } catch (Throwable unused) {
        }
    }

    private static <T> String a(Map<String, T> map) {
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

    private static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            li liVar = new li(context, "3dmap", "10.1.300", str);
            liVar.a(str2);
            lj.a(liVar, context);
        } catch (Throwable unused) {
        }
    }
}
