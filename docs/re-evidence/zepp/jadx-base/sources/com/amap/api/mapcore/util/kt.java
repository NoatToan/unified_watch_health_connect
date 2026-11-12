package com.amap.api.mapcore.util;

import com.autonavi.amap.mapcore.Inner_3dMap_location;

/* JADX INFO: loaded from: classes2.dex */
public final class kt {
    private static final String[] b = {"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"};
    private static final String[] c = {"com.amap.api.mapcore2d", "com.amap.api.maps2d"};
    private static final String[] d = {"com.amap.trace"};
    public static gt a = null;

    public static gt a() throws gi {
        Class<?> cls;
        Class<?> cls2;
        gt gtVarA;
        gt gtVar = a;
        if (gtVar != null) {
            return gtVar;
        }
        try {
            cls = Class.forName("com.amap.api.maps.MapsInitializer");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            if (cls != null) {
                String str = (String) kg.a(cls, "getVersion", (Object[]) null, (Class<?>[]) null);
                gtVarA = new gt.a("3dmap", str, "AMAP_SDK_Android_Map_".concat(String.valueOf(str))).a(b).a();
            } else {
                cls = Class.forName("com.amap.api.maps2d.MapsInitializer");
                String str2 = (String) kg.a(cls, "getVersion", (Object[]) null, (Class<?>[]) null);
                gtVarA = new gt.a("2dmap", str2, "AMAP_SDK_Android_2DMap_".concat(String.valueOf(str2))).a(c).a();
            }
            a = gtVarA;
        } catch (Throwable unused2) {
        }
        if (cls == null) {
            try {
                cls2 = Class.forName("com.amap.trace.AMapTraceClient");
            } catch (Throwable unused3) {
                cls2 = null;
            }
            if (cls2 != null) {
                try {
                    String str3 = (String) kg.a(cls2, "getVersion", (Object[]) null, (Class<?>[]) null);
                    a = new gt.a("trace", str3, "AMAP_TRACE_Android_".concat(String.valueOf(str3))).a(d).a();
                } catch (Throwable unused4) {
                }
            }
        }
        return a;
    }

    public static boolean a(kp kpVar) {
        if (kpVar == null || kpVar.d().equals("8") || kpVar.d().equals("5") || kpVar.d().equals("6")) {
            return false;
        }
        return a((Inner_3dMap_location) kpVar);
    }

    public static boolean a(Inner_3dMap_location inner_3dMap_location) {
        double longitude = inner_3dMap_location.getLongitude();
        double latitude = inner_3dMap_location.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }
}
