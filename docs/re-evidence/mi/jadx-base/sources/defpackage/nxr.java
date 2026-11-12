package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/* JADX INFO: loaded from: classes2.dex */
public class nxr {
    public static JsonElement a(JsonElement jsonElement, String[] strArr) {
        if (jsonElement == null || strArr == null || strArr.length == 0) {
            return jsonElement;
        }
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (int i = 0; i < strArr.length - 1; i++) {
            if (asJsonObject != null) {
                JsonElement jsonElement2 = asJsonObject.get(strArr[i]);
                if (jsonElement2 != null && jsonElement2.isJsonObject()) {
                    try {
                        asJsonObject = jsonElement2.getAsJsonObject();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
        }
        if (asJsonObject != null) {
            return asJsonObject.get(strArr[strArr.length - 1]);
        }
        return null;
    }

    public static JsonElement b(String str) {
        try {
            return new JsonParser().parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T c(JsonElement jsonElement, String[] strArr, Class<T> cls) {
        JsonElement jsonElementA = a(jsonElement, strArr);
        if (jsonElementA == null) {
            return null;
        }
        try {
            return (T) new Gson().fromJson(jsonElementA, (Class) cls);
        } catch (Error e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static <T> T d(String str, Class<T> cls) {
        return (T) e(str, null, cls);
    }

    public static <T> T e(String str, String[] strArr, Class<T> cls) {
        return (T) c(b(str), strArr, cls);
    }

    public static <T> String f(T t) {
        try {
            return new Gson().toJsonTree(t).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
