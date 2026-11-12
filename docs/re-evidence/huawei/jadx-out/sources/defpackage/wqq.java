package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wqq {
    private static Map<String, Object> d;

    public static <T> void d(String str, T t) {
        if (d == null) {
            d = new HashMap();
        }
        d.put(str, t);
    }

    public static <T> T a(String str, Class<T> cls) {
        Map<String, Object> map = d;
        if (map == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public static void b() {
        Map<String, Object> map = d;
        if (map != null) {
            map.clear();
            d = null;
        }
    }
}
