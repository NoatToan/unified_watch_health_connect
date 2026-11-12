package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class h4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Gson f19676a;

    public static void a() {
        if (f19676a == null) {
            f19676a = new GsonBuilder().create();
        }
    }

    public static String b(Map<String, ? extends Object> map) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jsonObject.addProperty(key, (String) value);
            } else if (value instanceof Number) {
                jsonObject.addProperty(key, (Number) value);
            } else if (value instanceof Boolean) {
                jsonObject.addProperty(key, (Boolean) value);
            } else if (value instanceof Character) {
                jsonObject.addProperty(key, (Character) value);
            }
        }
        return c(jsonObject);
    }

    public static <T> String c(T t) {
        a();
        return f19676a.toJson(t);
    }

    @JvmStatic
    public static <T> T d(String str, Class<T> cls) {
        a();
        return (T) f19676a.fromJson(str, (Class) cls);
    }

    public static <T> T e(String str, Type type) {
        a();
        return (T) f19676a.fromJson(str, type);
    }
}
