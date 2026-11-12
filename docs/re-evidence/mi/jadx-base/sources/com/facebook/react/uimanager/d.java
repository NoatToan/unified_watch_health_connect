package com.facebook.react.uimanager;

import defpackage.e4f;
import defpackage.edj;
import defpackage.pyo;
import defpackage.r7q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static Map<String, Object> a(UIManagerModule.f fVar) {
        Map<String, Object> mapB = r7q.b();
        if (!edj.f16532a) {
            mapB.put("ViewManagerNames", fVar.a());
        }
        mapB.put("LazyViewManagersEnabled", Boolean.TRUE);
        return mapB;
    }

    public static Map<String, Object> b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> mapB = r7q.b();
        Map<? extends String, ? extends Object> mapA = r7q.a();
        Map<? extends String, ? extends Object> mapC = r7q.c();
        if (map != null) {
            map.putAll(mapA);
        }
        if (map2 != null) {
            map2.putAll(mapC);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            pyo.a(0L, "UIManagerModuleConstantsHelper.createConstants").b("ViewManager", name).b("Lazy", Boolean.FALSE).c();
            try {
                Map<String, Object> mapC2 = c(viewManager, null, null, map, map2);
                if (!mapC2.isEmpty()) {
                    mapB.put(name, mapC2);
                }
                pyo.b(0L);
            } catch (Throwable th) {
                pyo.b(0L);
                throw th;
            }
        }
        mapB.put("genericBubblingEventTypes", mapA);
        mapB.put("genericDirectEventTypes", mapC);
        return mapB;
    }

    public static Map<String, Object> c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap mapB = e4f.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            e(map3, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, map);
            mapB.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            mapB.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            e(map4, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, map2);
            mapB.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            mapB.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            mapB.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            mapB.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            mapB.put("NativeProps", nativeProps);
        }
        return mapB;
    }

    public static Map<String, Object> d() {
        return e4f.e("bubblingEventTypes", r7q.a(), "directEventTypes", r7q.c());
    }

    public static void e(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                e((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
