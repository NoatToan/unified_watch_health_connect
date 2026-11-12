package com.xiaomi.smarthome.core.server.internal.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DefMerger implements Merger {
    private static final String TAG = "DefMerger";

    private Object mergeJsonArray(JSONArray jSONArray, JSONArray jSONArray2) {
        return jSONArray.length() > jSONArray2.length() ? jSONArray : jSONArray2;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.util.Merger
    public Object merge(Object obj, Object obj2) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return mergeJsonObject((JSONObject) obj, (JSONObject) obj2);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return mergeJsonArray((JSONArray) obj, (JSONArray) obj2);
        }
        if ((obj instanceof Map) && (obj2 instanceof Map)) {
            return mergeMap((Map) obj, (Map) obj2);
        }
        return ((obj instanceof Collection) && (obj2 instanceof Collection)) ? mergeCollection((Collection) obj, (Collection) obj2) : obj2;
    }

    public Collection<?> mergeCollection(Collection<?> collection, Collection<?> collection2) {
        return collection;
    }

    public JSONObject mergeJsonObject(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        if (jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2.length() == 0) {
            return jSONObject;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, merge(jSONObject.opt(next), jSONObject2.opt(next)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public Map mergeMap(Map map, Map map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            map3.put(key, merge(map.get(key), entry.getValue()));
        }
        return map3;
    }
}
