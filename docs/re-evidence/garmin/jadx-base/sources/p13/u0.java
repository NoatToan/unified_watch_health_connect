package p13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class u0 extends t0 {
    public static Object c(Object obj, Map map) {
        map.getClass();
        if (map instanceof r0) {
            return ((r0) map).j0();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        n23.j.s(org.apache.commons.lang3.e.f("Key ", " is missing in the map.", obj));
        return null;
    }

    public static <K, V> HashMap<K, V> d(o13.p<? extends K, ? extends V>... pVarArr) {
        HashMap<K, V> map = new HashMap<>(t0.a(pVarArr.length));
        k(map, pVarArr);
        return map;
    }

    public static <K, V> Map<K, V> e(o13.p<? extends K, ? extends V>... pVarArr) {
        pVarArr.getClass();
        if (pVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(pVarArr.length));
            k(linkedHashMap, pVarArr);
            return linkedHashMap;
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }

    public static LinkedHashMap f(o13.p... pVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(pVarArr.length));
        k(linkedHashMap, pVarArr);
        return linkedHashMap;
    }

    public static final Map g(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap h(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> i(Map<? extends K, ? extends V> map, o13.p<? extends K, ? extends V> pVar) {
        map.getClass();
        if (map.isEmpty()) {
            return t0.b(pVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        return linkedHashMap;
    }

    public static <K, V> void j(Map<? super K, ? super V> map, Iterable<? extends o13.p<? extends K, ? extends V>> iterable) {
        map.getClass();
        iterable.getClass();
        for (o13.p<? extends K, ? extends V> pVar : iterable) {
            map.put((Object) pVar.f128594a, (Object) pVar.f128595b);
        }
    }

    public static <K, V> void k(Map<? super K, ? super V> map, o13.p<? extends K, ? extends V>[] pVarArr) {
        map.getClass();
        pVarArr.getClass();
        for (o13.p<? extends K, ? extends V> pVar : pVarArr) {
            map.put((Object) pVar.f128594a, (Object) pVar.f128595b);
        }
    }

    public static <K, V> Map<K, V> l(Iterable<? extends o13.p<? extends K, ? extends V>> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            j(linkedHashMap, iterable);
            return g(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (size == 1) {
            return t0.b((o13.p) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(collection.size()));
        j(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap n(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
