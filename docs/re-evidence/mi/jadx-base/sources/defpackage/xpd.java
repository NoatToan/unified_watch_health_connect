package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes6.dex */
public class xpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Gson f39332a;

    public static String a(Object obj) {
        return new Gson().toJson(obj);
    }

    public static JsonObject b(Object obj) {
        JsonElement jsonTree = new Gson().toJsonTree(obj);
        return jsonTree.isJsonObject() ? (JsonObject) jsonTree : new JsonObject();
    }

    public static <T> String c(List<T> list) {
        if (f39332a == null) {
            f39332a = new Gson();
        }
        return f39332a.toJson(list);
    }

    public static <T> List<T> d(String str, Class<T> cls) {
        try {
            if (f39332a == null) {
                f39332a = new Gson();
            }
            return (List) f39332a.fromJson(str, TypeToken.getParameterized(List.class, cls).getType());
        } catch (Exception e) {
            Logger.i("JSONUtil", e.getMessage());
            return null;
        }
    }

    public static Map<String, String> e(String str) throws JSONException {
        HashMap map = new HashMap();
        if (str != null && !str.equals("")) {
            JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        }
        return map;
    }

    public static <T> T f(String str, Class<T> cls) {
        if (str != null && cls != null) {
            if (f39332a == null) {
                f39332a = new Gson();
            }
            try {
                return (T) f39332a.fromJson(str, (Class) cls);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static <T> List<T> g(String str, Class<T> cls) {
        if (str != null && cls != null) {
            ArrayList arrayList = new ArrayList();
            try {
                if (f39332a == null) {
                    f39332a = new Gson();
                }
                JsonArray asJsonArray = new JsonParser().parse(str).getAsJsonArray();
                Gson gson = new Gson();
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(gson.fromJson(it.next(), (Class) cls));
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String h(Map<String, String> map) {
        if (map == null) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(entry.getKey());
            sb.append("\":\"");
            sb.append(entry.getValue());
            sb.append("\"");
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
