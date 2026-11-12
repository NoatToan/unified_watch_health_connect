package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ep {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static HashMap<String, Boolean> j = new HashMap<>();
    private static ConcurrentHashMap<Integer, Integer> k = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer, Integer> l = new ConcurrentHashMap<>();

    public static void a(Context context, boolean z) {
        try {
            String strA = a(z);
            iz izVar = new iz(context, "3dmap", "7.9.1", "O001");
            izVar.a(strA);
            ja.a(izVar, context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Context context, boolean z) {
        if (a) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_stylemap", Integer.valueOf(z ? 1 : 0));
            a(context, "O006", a(map));
            a = true;
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, boolean z) {
        if (b) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_indoormap", Integer.valueOf(z ? 1 : 0));
            a(context, "O007", a(map));
            b = true;
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

    public static void g(Context context) {
        if (i) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_buildingoverlay", 1);
            a(context, "O015", a(map));
            i = true;
        } catch (Throwable unused) {
        }
    }

    private static String a(boolean z) {
        try {
            return "{\"Quest\":" + z + com.alipay.sdk.m.u.i.d;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
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

    public static void a(Context context, long j2) {
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_rendertime", Long.valueOf(j2));
            map.put("amap_3dmap_render_background", 0L);
            a(context, "O005", a(map));
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

    public static synchronized void a(Context context, String str) {
        try {
            if (j != null && !TextUtils.isEmpty(str)) {
                if (j.containsKey(str) && j.get(str).booleanValue()) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("amap_3dmap_coordinate", str);
                a(context, "O008", a(map));
                if (!j.containsKey(str)) {
                    j.put(str, Boolean.TRUE);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        if (c) {
            return;
        }
        try {
            HashMap map = new HashMap();
            map.put("amap_3dmap_heatmap", 1);
            a(context, "O009", a(map));
            c = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2, int i3, String str) {
        if (context == null) {
            return;
        }
        try {
            synchronized (k) {
                if (!k.containsKey(Integer.valueOf(i2)) || k.get(Integer.valueOf(i2)).intValue() < 2) {
                    HashMap map = new HashMap();
                    map.put("amap_3dmap_map_request_type", String.valueOf(i3));
                    map.put("amap_3dmap_map_request_info", str);
                    a(context, "O019", a(map));
                    if (!k.containsKey(Integer.valueOf(i2))) {
                        k.put(Integer.valueOf(i2), 0);
                    } else {
                        k.put(Integer.valueOf(i2), Integer.valueOf(k.get(Integer.valueOf(i2)).intValue() + 1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2, long j2, long j3) {
        try {
            synchronized (l) {
                if (!l.containsKey(Integer.valueOf(i2)) || l.get(Integer.valueOf(i2)).intValue() < 2) {
                    HashMap map = new HashMap();
                    map.put("amap_3dmap_map_request_rendertime", Long.valueOf(j2));
                    map.put("amap_3dmap_map_request_size", Long.valueOf(j3));
                    a(context, "O020", a(map));
                    if (!l.containsKey(Integer.valueOf(i2))) {
                        l.put(Integer.valueOf(i2), 0);
                    } else {
                        l.put(Integer.valueOf(i2), Integer.valueOf(l.get(Integer.valueOf(i2)).intValue() + 1));
                    }
                }
            }
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
            sb.append(com.alipay.sdk.m.u.i.d);
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
            iz izVar = new iz(context, "3dmap", "7.9.1", str);
            izVar.a(str2);
            ja.a(izVar, context);
        } catch (Throwable unused) {
        }
    }
}
