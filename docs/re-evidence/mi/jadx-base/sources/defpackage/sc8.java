package defpackage;

import com.google.common.base.Optional;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class sc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f33502a = new WeakHashMap();

    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> mapC;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f33502a;
        synchronized (map) {
            try {
                mapC = map.get(cls);
                if (mapC == null) {
                    mapC = c(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapC;
    }

    public static <T extends Enum<T>> Optional<T> b(Class<T> cls, String str) {
        c6i.o(cls);
        c6i.o(str);
        return c0i.b(cls, str);
    }

    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> c(Class<T> cls) {
        HashMap map = new HashMap();
        for (Enum r2 : EnumSet.allOf(cls)) {
            map.put(r2.name(), new WeakReference(r2));
        }
        f33502a.put(cls, map);
        return map;
    }
}
