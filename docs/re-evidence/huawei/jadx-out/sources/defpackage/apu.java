package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f669c;
    private static final Map<Class<?>, Class<?>> d;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        d = Collections.unmodifiableMap(linkedHashMap);
        f669c = Collections.unmodifiableMap(linkedHashMap2);
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> b() {
        return f669c.keySet();
    }

    public static <T> Class<T> a(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) d.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static <T> Class<T> c(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) f669c.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
