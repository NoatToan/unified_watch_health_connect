package defpackage;

import cn.hutool.core.map.CamelCaseLinkedMap;
import cn.hutool.core.map.CamelCaseMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class v4f {

    public static class a implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f36467a;

        public a(Map.Entry entry) {
            this.f36467a = entry;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f36467a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f36467a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Unsupported setValue method !");
        }
    }

    public static <T> Map<T, T> A(Map<T, T> map) {
        return g(map, new c38() { // from class: q4f
            @Override // defpackage.c38
            public final Object a(Object obj) {
                return v4f.w((Map.Entry) obj);
            }
        });
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> B(Map<K, V> map, boolean z) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Comparator<? super Map.Entry<K, V>> comparatorComparingByValue = Map.Entry.comparingByValue();
        if (z) {
            comparatorComparingByValue = comparatorComparingByValue.reversed();
        }
        map.entrySet().stream().sorted(comparatorComparingByValue).forEachOrdered(new Consumer() { // from class: r4f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                v4f.x(linkedHashMap, (Map.Entry) obj);
            }
        });
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> C(Map<K, V> map) {
        return map instanceof LinkedHashMap ? new CamelCaseLinkedMap(map) : new CamelCaseMap(map);
    }

    public static <K, V> Map<K, V> f(Class<?> cls) {
        return cls.isAssignableFrom(AbstractMap.class) ? new HashMap() : (Map) bbk.t(cls, new Object[0]);
    }

    public static <K, V> Map<K, V> g(Map<K, V> map, c38<Map.Entry<K, V>> c38Var) {
        if (map == null || c38Var == null) {
            return map;
        }
        Map<K, V> map2 = (Map) g4h.a(map);
        if (map2 == null) {
            map2 = new HashMap<>(map.size(), 1.0f);
        }
        if (o(map2)) {
            return map2;
        }
        try {
            map2.clear();
        } catch (UnsupportedOperationException unused) {
            map2 = new HashMap<>(map.size(), 1.0f);
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> entryA = c38Var.a(it.next());
            if (entryA != null) {
                map2.put(entryA.getKey(), entryA.getValue());
            }
        }
        return map2;
    }

    public static <K, V> Map<K, V> h(Map<K, V> map, final sm9<Map.Entry<K, V>> sm9Var) {
        return (map == null || sm9Var == null) ? map : g(map, new c38() { // from class: u4f
            @Override // defpackage.c38
            public final Object a(Object obj) {
                return v4f.t(sm9Var, (Map.Entry) obj);
            }
        });
    }

    public static <T> T i(Map<?, ?> map, Object obj, Class<T> cls) {
        return (T) j(map, obj, cls, null);
    }

    public static <T> T j(Map<?, ?> map, Object obj, Class<T> cls, T t) {
        return map == null ? t : (T) yj4.b(cls, map.get(obj), t);
    }

    public static <K, V> Map<K, V> k(Map<K, V> map, final K... kArr) {
        return h(map, new sm9() { // from class: t4f
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return v4f.u(kArr, (Map.Entry) obj);
            }
        });
    }

    public static Integer l(Map<?, ?> map, Object obj) {
        return (Integer) i(map, obj, Integer.class);
    }

    public static String m(Map<?, ?> map, Object obj) {
        return (String) i(map, obj, String.class);
    }

    public static <K, V> Map<V, K> n(Map<K, V> map) {
        final Map<V, K> mapF = f(map.getClass());
        map.forEach(new BiConsumer() { // from class: s4f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                mapF.put(obj2, obj);
            }
        });
        return mapF;
    }

    public static boolean o(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean p(Map<?, ?> map) {
        return (map == null || map.isEmpty()) ? false : true;
    }

    public static <K, V> String q(Map<K, V> map, String str, String str2, boolean z, String... strArr) {
        StringBuilder sbA0 = lio.A0();
        if (p(map)) {
            boolean z2 = true;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!z || (entry.getKey() != null && entry.getValue() != null)) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sbA0.append(str);
                    }
                    sbA0.append(yj4.w(entry.getKey()));
                    sbA0.append(str2);
                    sbA0.append(yj4.w(entry.getValue()));
                }
            }
        }
        if (qj1.E(strArr)) {
            for (String str3 : strArr) {
                sbA0.append(str3);
            }
        }
        return sbA0.toString();
    }

    public static <K, V> String r(Map<K, V> map, String str, String str2, String... strArr) {
        return q(map, str, str2, false, strArr);
    }

    public static <K, V> String s(Map<K, V> map, String str, String str2, String... strArr) {
        return q(map, str, str2, true, strArr);
    }

    public static /* synthetic */ Map.Entry t(sm9 sm9Var, Map.Entry entry) {
        if (sm9Var.accept(entry)) {
            return entry;
        }
        return null;
    }

    public static /* synthetic */ boolean u(Object[] objArr, Map.Entry entry) {
        return qj1.o(objArr, entry.getKey());
    }

    public static /* synthetic */ Map.Entry w(Map.Entry entry) {
        return new a(entry);
    }

    public static /* synthetic */ void x(Map map, Map.Entry entry) {
    }

    public static <K, V> HashMap<K, V> y(int i, boolean z) {
        int i2 = ((int) (i / 0.75f)) + 1;
        return z ? new LinkedHashMap(i2) : new HashMap<>(i2);
    }

    public static <K, V> HashMap<K, V> z(boolean z) {
        return y(16, z);
    }
}
