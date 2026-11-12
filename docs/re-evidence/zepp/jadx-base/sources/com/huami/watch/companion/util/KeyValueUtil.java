package com.huami.watch.companion.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class KeyValueUtil {
    private static final String a = "Util-KeyValue";

    @NonNull
    public static <T> Map<String, T> filterNonStartWith(@NonNull Map<String, T> map, String str) {
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map2.putAll(map);
            return map2;
        }
        for (Map.Entry<String, T> entry : map.entrySet()) {
            if (!entry.getKey().startsWith(str)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        Log.d(a, "Filter Non-Start With : " + str + ", " + map2.size() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + map.size(), new Object[0]);
        return map2;
    }

    public static <T> Map<String, T> filterStartWith(Map<String, T> map, String str) {
        Log.v(a, "Filter Start With : " + str, new Object[0]);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map2.putAll(map);
            return map2;
        }
        for (Map.Entry<String, T> entry : map.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static String mergeJsonStr(String str, String str2) {
        HashMap map = new HashMap();
        Map<String, String> keyValues = toKeyValues(str);
        Map<String, String> keyValues2 = toKeyValues(str2);
        if (keyValues != null) {
            map.putAll(keyValues);
        }
        if (keyValues2 != null) {
            map.putAll(keyValues2);
        }
        return toJsonStr(map);
    }

    public static String toJsonStr(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyValues To Json : ");
        sb.append(map);
        sb.append(", ");
        sb.append(map != null ? map.size() : 0);
        Log.v(a, sb.toString(), new Object[0]);
        if (map == null || map.size() == 0) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        Log.d(a, "KeyValues To Json : " + jSONObject.length() + ", " + string, new Object[0]);
        return string;
    }

    public static String toJsonStrFilterNonStartWith(Map<String, String> map, String str) {
        return toJsonStr(filterNonStartWith(map, str));
    }

    public static String toJsonStrFilterStartWith(Map<String, String> map, String str) {
        return toJsonStr(filterStartWith(map, str));
    }

    @NonNull
    public static Map<String, String> toKeyValues(String str) {
        Log.v(a, "Json To KeyValues : " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.v(a, "Json To KeyValues Count : " + map.size(), new Object[0]);
        return map;
    }

    public static String toJsonStr(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return toJsonStr(map);
    }
}
