package com.huawei.health.device.wifi.entity.utils;

import android.text.TextUtils;
import defpackage.dyg;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JsonParser {

    public enum JsonType {
        JSON_TYPE_OBJECT,
        JSON_TYPE_ARRAY,
        JSON_TYPE_ERROR
    }

    public static Map<String, Object> a(String str) {
        HashMap map = new HashMap(16);
        String strC = c(str);
        if (!TextUtils.isEmpty(strC) && e(strC) == JsonType.JSON_TYPE_OBJECT) {
            try {
                JSONObject jSONObject = new JSONObject(strC.trim());
                JSONArray jSONArrayNames = jSONObject.names();
                if (jSONArrayNames != null && jSONArrayNames.length() > 0) {
                    for (int i = 0; i < jSONArrayNames.length(); i++) {
                        map.put(jSONArrayNames.getString(i), d(jSONObject.get(jSONArrayNames.getString(i))));
                    }
                }
            } catch (JSONException e) {
                dyg.c(true, "JsonParser", "Error Json Parse: ", e.getMessage());
            }
        }
        return map;
    }

    private static Object d(Object obj) {
        Object obj2 = new Object();
        if (obj != null) {
            if (obj instanceof JSONObject) {
                return a(obj.toString());
            }
            return obj instanceof JSONArray ? d(obj.toString()) : obj;
        }
        dyg.c(false, "JsonParser", "fromJson json is null.");
        return obj2;
    }

    private static List<Object> d(String str) {
        String strC;
        ArrayList arrayList = new ArrayList(16);
        if (!TextUtils.isEmpty(str) && (strC = c(str)) != null && e(strC) == JsonType.JSON_TYPE_ARRAY) {
            try {
                JSONArray jSONArray = new JSONArray(strC.trim());
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(d(jSONArray.get(i)));
                }
            } catch (JSONException e) {
                dyg.c(true, "JsonParser", "Error Json Parse: ", e.getMessage());
            }
        }
        return arrayList;
    }

    public static JsonType e(String str) {
        String strC = c(str);
        dyg.e(true, "JsonParser", "getJsonType jsonStr: ", strC);
        if (TextUtils.isEmpty(strC)) {
            return JsonType.JSON_TYPE_ERROR;
        }
        try {
            new JSONObject(strC);
            return JsonType.JSON_TYPE_OBJECT;
        } catch (JSONException e) {
            dyg.c(true, "JsonParser", "Not is JsonObject Type: ", e.getMessage());
            try {
                new JSONArray(strC);
                return JsonType.JSON_TYPE_ARRAY;
            } catch (JSONException e2) {
                dyg.c(true, "JsonParser", "Not is JsonArray Type: ", e2.getMessage());
                return JsonType.JSON_TYPE_ERROR;
            }
        }
    }

    private static String c(String str) {
        if (str == null) {
            dyg.e(false, "JsonParser", " json == null !!!");
            return null;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        if (strNormalize.contains("{") && strNormalize.contains("[")) {
            if (strNormalize.indexOf("{") > strNormalize.indexOf("[")) {
                return strNormalize.substring(strNormalize.indexOf("["), strNormalize.lastIndexOf("]") + 1);
            }
            return strNormalize.substring(strNormalize.indexOf("{"), strNormalize.lastIndexOf("}") + 1);
        }
        if (!strNormalize.contains("{") && strNormalize.contains("[")) {
            return strNormalize.substring(strNormalize.indexOf("["), strNormalize.lastIndexOf("]") + 1);
        }
        if (strNormalize.contains("[") || !strNormalize.contains("{")) {
            return null;
        }
        return strNormalize.substring(strNormalize.indexOf("{"), strNormalize.lastIndexOf("}") + 1);
    }

    public static JSONObject a(Map<?, ?> map) {
        Object objE;
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            dyg.c(true, "JsonParser", "toJsonObject jsonMap is null.");
            return jSONObject;
        }
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (map.containsKey(entry.getKey()) && (objE = e(entry.getValue())) != null) {
                    jSONObject.put(entry.getKey().toString(), objE);
                }
            }
        } catch (JSONException e) {
            dyg.c(true, "JsonParser", "Error Map Package Into Json: ", e.getMessage());
        }
        return jSONObject;
    }

    private static JSONArray b(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            dyg.c(true, "JsonParser", "toJsonArray jsonList is null.");
            return jSONArray;
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                Object objE = e(list.get(i));
                if (objE != null) {
                    jSONArray.put(i, objE);
                }
            } catch (JSONException e) {
                dyg.c(true, "JsonParser", "Error List Package Into Json: ", e.getMessage());
            }
        }
        return jSONArray;
    }

    private static Object e(Object obj) {
        if (obj instanceof Map) {
            return a((Map<?, ?>) obj);
        }
        return obj instanceof List ? b((List) obj) : obj;
    }
}
