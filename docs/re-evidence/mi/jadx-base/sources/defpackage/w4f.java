package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w4f {
    public static String a(List<String> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static JSONObject b(Map<String, List<String>> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            String strA = a(entry.getValue(), ";");
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(strA)) {
                jSONObject.put(key, strA);
            }
        }
        return jSONObject;
    }

    public static String c(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                if (z) {
                    z = false;
                } else {
                    sb.append(gv5.CONNECT_STR);
                }
                sb.append(key);
                sb.append("=");
                sb.append(value);
            }
        }
        return sb.toString();
    }

    public static Map<String, String> d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.getString(next));
        }
        return map;
    }
}
