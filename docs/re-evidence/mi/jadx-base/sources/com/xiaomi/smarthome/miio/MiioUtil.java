package com.xiaomi.smarthome.miio;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MiioUtil {
    public static HashMap<String, Object> JsonToMap(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.put(next, JsonToMap((JSONObject) obj));
                } else if (obj instanceof Integer) {
                    map.put(next, obj);
                } else if (obj instanceof String) {
                    map.put(next, obj);
                } else if (obj instanceof Double) {
                    map.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return map;
    }
}
