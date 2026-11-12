package com.mapbox.maps.extension.style.light;

import com.mapbox.bindgen.Value;
import com.mapbox.common.ValueUtilsKt;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.light.generated.AmbientLight;
import com.mapbox.maps.extension.style.light.generated.DirectionalLight;
import com.mapbox.maps.extension.style.light.generated.FlatLight;
import com.mapbox.maps.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a4\u0010\u0005\u001a\u00020\u00062*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bj\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`\nH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0018\u0010\u0019\u001a\u00020\u0016*\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u001c"}, d2 = {"LIGHT_PROPERTIES", "", "TAG", "getTAG$annotations", "()V", "convertPropertyMapToValue", "Lcom/mapbox/bindgen/Value;", "property", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "Lkotlin/collections/HashMap;", "dynamicLight", "Lcom/mapbox/maps/extension/style/light/DynamicLight;", "ambientLight", "Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "directionalLight", "Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "getLight", "Lcom/mapbox/maps/extension/style/light/Light;", "Lcom/mapbox/maps/MapboxStyleManager;", "lightId", "setLight", "", "flatLight", "Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "setLights", "lights", "", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LightUtils {
    public static final String LIGHT_PROPERTIES = "properties";
    public static final String TAG = "Mbgl-LightUtils";

    private static final Value convertPropertyMapToValue(HashMap<String, PropertyValue<?>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, PropertyValue<?>> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().getValue());
        }
        return ValueUtilsKt.toValue((HashMap<String, Value>) map2);
    }

    public static final DynamicLight dynamicLight(AmbientLight ambientLight, DirectionalLight directionalLight) {
        ambientLight.getClass();
        directionalLight.getClass();
        return new DynamicLight(ambientLight, directionalLight);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0074, please report this as an issue */
    public static final Light getLight(MapboxStyleManager mapboxStyleManager, String str) {
        Object next;
        Light directionalLight;
        mapboxStyleManager.getClass();
        str.getClass();
        Iterator<T> it = mapboxStyleManager.getStyleLights().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((StyleObjectInfo) next).getId(), str));
        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) next;
        String type = styleObjectInfo != null ? styleObjectInfo.getType() : null;
        if (type == null) {
            MapboxLogger.logE(TAG, "Light type: " + type + " unknown.");
            directionalLight = null;
        } else {
            int iHashCode = type.hashCode();
            if (iHashCode != -1631834134) {
                if (iHashCode != -892145000) {
                    if (iHashCode == 3145593 && type.equals("flat")) {
                        directionalLight = new FlatLight(str);
                    } else {
                        MapboxLogger.logE(TAG, "Light type: " + type + " unknown.");
                        directionalLight = null;
                    }
                } else if (type.equals("ambient")) {
                    directionalLight = new AmbientLight(str);
                } else {
                    MapboxLogger.logE(TAG, "Light type: " + type + " unknown.");
                    directionalLight = null;
                }
            } else if (type.equals("directional")) {
                directionalLight = new DirectionalLight(str);
            } else {
                MapboxLogger.logE(TAG, "Light type: " + type + " unknown.");
                directionalLight = null;
            }
        }
        if (directionalLight == null) {
            return null;
        }
        directionalLight.setDelegate$extension_style_release(mapboxStyleManager);
        return directionalLight;
    }

    public static /* synthetic */ void getTAG$annotations() {
    }

    public static final void setLight(MapboxStyleManager mapboxStyleManager, AmbientLight ambientLight, DirectionalLight directionalLight) {
        mapboxStyleManager.getClass();
        ambientLight.getClass();
        directionalLight.getClass();
        HashMap map = new HashMap();
        map.put("properties", convertPropertyMapToValue(ambientLight.getLightProperties$extension_style_release()));
        map.putAll(ambientLight.getInternalLightProperties$extension_style_release());
        HashMap map2 = new HashMap();
        map2.put("properties", convertPropertyMapToValue(directionalLight.getLightProperties$extension_style_release()));
        map2.putAll(directionalLight.getInternalLightProperties$extension_style_release());
        ambientLight.setDelegate$extension_style_release(mapboxStyleManager);
        directionalLight.setDelegate$extension_style_release(mapboxStyleManager);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Value((HashMap<String, Value>) map));
        arrayList.add(new Value((HashMap<String, Value>) map2));
        String error = mapboxStyleManager.setStyleLights(new Value((List<Value>) arrayList)).getError();
        if (error == null) {
            return;
        }
        p.n("Set dynamic light failed with error: ".concat(error));
    }

    public static final void setLights(MapboxStyleManager mapboxStyleManager, List<? extends Light> list) {
        mapboxStyleManager.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Light light : list) {
            HashMap map = new HashMap();
            map.put("properties", convertPropertyMapToValue(light.getLightProperties$extension_style_release()));
            map.putAll(light.getInternalLightProperties$extension_style_release());
            Value value = ValueUtilsKt.toValue((HashMap<String, Value>) map);
            light.setDelegate$extension_style_release(mapboxStyleManager);
            arrayList.add(value);
        }
        String error = mapboxStyleManager.setStyleLights(new Value((List<Value>) arrayList)).getError();
        if (error == null) {
            return;
        }
        p.n("setStyleLights failed with error: ".concat(error));
    }

    public static final void setLight(MapboxStyleManager mapboxStyleManager, FlatLight flatLight) {
        mapboxStyleManager.getClass();
        flatLight.getClass();
        HashMap map = new HashMap();
        map.put("properties", convertPropertyMapToValue(flatLight.getLightProperties$extension_style_release()));
        map.putAll(flatLight.getInternalLightProperties$extension_style_release());
        flatLight.setDelegate$extension_style_release(mapboxStyleManager);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Value((HashMap<String, Value>) map));
        String error = mapboxStyleManager.setStyleLights(new Value((List<Value>) arrayList)).getError();
        if (error == null) {
            return;
        }
        p.n("Set flat light failed with error: ".concat(error));
    }
}
