package com.miui.tsmclient.util;

import com.miui.tsmclient.database.JSONSerializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectUtils {
    public static boolean isCollectionEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static String joinMap(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (i > 0) {
                sb.append(str);
            }
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append("=");
            sb.append(value);
            i++;
        }
        return sb.toString();
    }

    public static Map<String, String> listToMap(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && value.size() > 0) {
                    map2.put(key, value.get(0));
                }
            }
        }
        return map2;
    }

    public static JSONArray serialize(List<? extends JSONSerializable> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends JSONSerializable> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().serialize());
        }
        return jSONArray;
    }

    public static boolean isCollectionEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}
