package com.xiaomi.smarthome.core.server.internal.util;

import com.xiaomi.smarthome.core.server.internal.util.JsonUtils;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import defpackage.oud;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JsonUtils {

    public interface CallbackJSONArray<T> {
        T addItem(JSONArray jSONArray, int i);
    }

    public interface CallbackJSONObject<T> extends Callback<T, JSONObject> {
    }

    public static int castInt(Object obj, int i) {
        return NumberUtils.valueOf(obj, i);
    }

    public static JSONArray castJSONArray(Object obj) {
        try {
            return (JSONArray) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject castJSONObject(Object obj) {
        try {
            return (JSONObject) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String castString(Object obj, String str) {
        return obj == null ? str : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$putStringJson$0(Map map, JSONObject jSONObject, String str) {
        return map.get(str);
    }

    public static JSONObject mergeJson(JSONObject jSONObject, JSONObject jSONObject2) {
        return new DefMerger().mergeJsonObject(jSONObject, jSONObject2);
    }

    public static String[] optStringArray(JSONObject jSONObject, String str, boolean z) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        return parseStringArray(jSONArrayOptJSONArray, z, new oud());
    }

    public static void parseIntArray(JSONArray jSONArray, List<Integer> list) {
        parseJsonArray(jSONArray, list, new CallbackJSONArray() { // from class: rud
            @Override // com.xiaomi.smarthome.core.server.internal.util.JsonUtils.CallbackJSONArray
            public final Object addItem(JSONArray jSONArray2, int i) {
                return Integer.valueOf(jSONArray2.optInt(i));
            }
        });
    }

    public static <T> ArrayList<T> parseJsonArray(JSONArray jSONArray, CallbackJSONArray<T> callbackJSONArray) {
        ArrayList<T> arrayList = new ArrayList<>();
        parseJsonArray(jSONArray, arrayList, callbackJSONArray);
        return arrayList;
    }

    public static <T> void parseMap(JSONObject jSONObject, Map<String, T> map, CallbackJSONObject<T> callbackJSONObject) {
        if (map != null) {
            map.clear();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            T item = callbackJSONObject.getItem(jSONObject, next);
            if (map != null) {
                map.put(next, item);
            }
        }
    }

    public static String[] parseStringArray(JSONArray jSONArray, boolean z, CallbackJSONArray<String> callbackJSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = callbackJSONArray.addItem(jSONArray, i);
        }
        if (z) {
            Arrays.sort(strArr);
        }
        return strArr;
    }

    public static <T> void parseStringMap(JSONObject jSONObject, Map<String, String> map) {
        parseMap(jSONObject, map, new CallbackJSONObject() { // from class: pud
            @Override // com.xiaomi.smarthome.core.server.internal.util.Callback
            public final Object getItem(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str);
            }
        });
    }

    public static <T> JSONArray putJson(List<T> list, CallbackJSONArray<Void> callbackJSONArray) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        putJson(list, jSONArray, callbackJSONArray);
        return jSONArray;
    }

    public static JSONArray putStringJson(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static <T> void parseJsonArray(JSONArray jSONArray, Collection<T> collection, CallbackJSONArray<T> callbackJSONArray) {
        if (collection != null) {
            collection.clear();
        }
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            T tAddItem = callbackJSONArray.addItem(jSONArray, i);
            if (collection != null) {
                collection.add(tAddItem);
            }
        }
    }

    public static <T> void putJson(List<T> list, JSONArray jSONArray, CallbackJSONArray<Void> callbackJSONArray) {
        for (int i = 0; i < list.size(); i++) {
            callbackJSONArray.addItem(jSONArray, i);
        }
    }

    public static JSONArray putStringJson(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static <V> void putJson(Map<String, V> map, JSONObject jSONObject, CallbackJSONObject<Object> callbackJSONObject) {
        if (map == null || jSONObject == null) {
            return;
        }
        for (Map.Entry<String, V> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), callbackJSONObject.getItem(jSONObject, entry.getKey()));
            } catch (JSONException unused) {
            }
        }
    }

    public static void parseStringArray(JSONArray jSONArray, Collection<String> collection) {
        parseJsonArray(jSONArray, collection, new oud());
    }

    public static void putStringJson(Collection<String> collection, JSONArray jSONArray) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
    }

    public static JSONObject putStringJson(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        putStringJson(map, jSONObject);
        return jSONObject;
    }

    public static void putStringJson(final Map<String, String> map, JSONObject jSONObject) {
        putJson(map, jSONObject, (CallbackJSONObject<Object>) new CallbackJSONObject() { // from class: qud
            @Override // com.xiaomi.smarthome.core.server.internal.util.Callback
            public final Object getItem(JSONObject jSONObject2, String str) {
                return JsonUtils.lambda$putStringJson$0(map, jSONObject2, str);
            }
        });
    }
}
