package defpackage;

import com.google.gson.Gson;
import health.compact.a.CommonUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ies {
    public static <T> T b(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            str = "{}";
        }
        return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
    }

    public static <T> List<T> c(String str, Class<T[]> cls) {
        if (str == null || str.trim().isEmpty()) {
            str = "[]";
        }
        return Arrays.asList((Object[]) new Gson().fromJson(CommonUtil.ac(str), (Class) cls));
    }

    public static String c(Object obj) {
        return new Gson().toJson(obj);
    }
}
