package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/*  JADX ERROR: ConcurrentModificationException in pass: FixAccessModifiers
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.fixaccessmodifiers.FixAccessModifiers.fixClassVisibility(FixAccessModifiers.java:75)
    	at jadx.core.dex.visitors.fixaccessmodifiers.FixAccessModifiers.visit(FixAccessModifiers.java:45)
    */
/* JADX INFO: loaded from: classes23.dex */
public class r extends q {
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> Map<K, V> A(Map<K, ? extends V> map) {
        return map == 0 ? emptyMap() : map;
    }

    @InlineOnly
    private static final <K, V> void B(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        putAll(map, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> void C(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        map.putAll(map2);
    }

    @InlineOnly
    private static final <K, V> void D(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        map.put(pair.getFirst(), pair.getSecond());
    }

    @InlineOnly
    private static final <K, V> void E(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        putAll(map, sequence);
    }

    @InlineOnly
    private static final <K, V> void F(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        putAll(map, pairArr);
    }

    @InlineOnly
    private static final <K, V> V G(Map<? extends K, V> map, K k) {
        return map.remove(k);
    }

    @InlineOnly
    private static final <K, V> void H(Map<K, V> map, K k, V v) {
        map.put(k, v);
    }

    @InlineOnly
    private static final <K, V> Pair<K, V> I(Map.Entry<? extends K, ? extends V> entry) {
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <K, V> Map<K, V> e(int i, @BuilderInference Function1<? super Map<K, V>, Unit> function1) {
        Map mapCreateMapBuilder = q.createMapBuilder(i);
        function1.invoke(mapCreateMapBuilder);
        return q.build(mapCreateMapBuilder);
    }

    @NotNull
    public static <K, V> Map<K, V> emptyMap() {
        return k.a;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <K, V> Map<K, V> f(@BuilderInference Function1<? super Map<K, V>, Unit> function1) {
        Map mapCreateMapBuilder = q.createMapBuilder();
        function1.invoke(mapCreateMapBuilder);
        return q.build(mapCreateMapBuilder);
    }

    @NotNull
    public static final <K, V> Map<K, V> filter(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterKeys(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super K, Boolean> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterNot(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!function1.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!function1.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> filterValues(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super V, Boolean> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (function1.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> K g(Map.Entry<? extends K, ? extends V> entry) {
        return entry.getKey();
    }

    public static final <K, V> V getOrElseNullable(@NotNull Map<K, ? extends V> map, K k, @NotNull Function0<? extends V> function0) {
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : function0.invoke();
    }

    public static final <K, V> V getOrPut(@NotNull Map<K, V> map, K k, @NotNull Function0<? extends V> function0) {
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = function0.invoke();
        map.put(k, vInvoke);
        return vInvoke;
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> V getValue(@NotNull Map<K, ? extends V> map, K k) {
        return (V) p.getOrImplicitDefaultNullable(map, k);
    }

    @InlineOnly
    private static final <K, V> V h(Map.Entry<? extends K, ? extends V> entry) {
        return entry.getValue();
    }

    @NotNull
    public static <K, V> HashMap<K, V> hashMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(q.mapCapacity(pairArr.length));
        putAll(map, pairArr);
        return map;
    }

    @InlineOnly
    private static final <K, V> boolean i(Map<? extends K, ? extends V> map, K k) {
        return map.containsKey(k);
    }

    @InlineOnly
    private static final <K> boolean j(Map<? extends K, ?> map, K k) {
        return map.containsKey(k);
    }

    @InlineOnly
    private static final <K, V> boolean k(Map<K, ? extends V> map, V v) {
        return map.containsValue(v);
    }

    @InlineOnly
    private static final <K, V> V l(Map<? extends K, ? extends V> map, K k) {
        return map.get(k);
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return (LinkedHashMap) toMap(pairArr, new LinkedHashMap(q.mapCapacity(pairArr.length)));
    }

    @InlineOnly
    private static final <K, V> V m(Map<K, ? extends V> map, K k, Function0<? extends V> function0) {
        V v = map.get(k);
        return v == null ? function0.invoke() : v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<R, V> mapKeys(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Object) it2.next();
            linkedHashMap.put(function1.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Object) it2.next();
            m.put(function1.invoke(entry), entry.getValue());
        }
        return m;
    }

    @NotNull
    public static <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return pairArr.length > 0 ? toMap(pairArr, new LinkedHashMap(q.mapCapacity(pairArr.length))) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R> Map<K, R> mapValues(@NotNull Map<? extends K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Object) it2.next();
            linkedHashMap.put(entry.getKey(), function1.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@NotNull Map<? extends K, ? extends V> map, @NotNull M m, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Object) it2.next();
            m.put(entry.getKey(), function1.invoke(entry));
        }
        return m;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> map, K k) {
        Map mutableMap = toMutableMap(map);
        mutableMap.remove(k);
        return optimizeReadOnlyMap(mutableMap);
    }

    @NotNull
    public static <K, V> Map<K, V> mutableMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(pairArr.length));
        putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> HashMap<K, V> n() {
        return new HashMap<>();
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object o(Map map, Function0 function0) {
        return map.isEmpty() ? function0.invoke() : map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(@NotNull Map<K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : q.toSingletonMap(map);
        }
        return emptyMap();
    }

    @InlineOnly
    private static final <K, V> boolean p(Map<? extends K, ? extends V> map) {
        return !map.isEmpty();
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V> pair) {
        if (map.isEmpty()) {
            return q.mapOf(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static <K, V> void putAll(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<? extends K, ? extends V> pair = pairArr[i];
            i++;
            map.put(pair.component1(), pair.component2());
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <K, V> boolean q(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> r(Map<? extends K, ? extends V> map) {
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> LinkedHashMap<K, V> s() {
        return new LinkedHashMap<>();
    }

    @InlineOnly
    private static final <K, V> Map<K, V> t() {
        return emptyMap();
    }

    @NotNull
    public static <K, V> Map<K, V> toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMap(iterable, new LinkedHashMap(q.mapCapacity(collection.size())));
        }
        return q.mapOf(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> toMutableMap(@NotNull Map<? extends K, ? extends V> map) {
        return new LinkedHashMap(map);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void u(Map<K, V> map, Iterable<? extends K> iterable) {
        h.removeAll(map.keySet(), iterable);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void v(Map<K, V> map, K k) {
        map.remove(k);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void w(Map<K, V> map, Sequence<? extends K> sequence) {
        h.removeAll(map.keySet(), sequence);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void x(Map<K, V> map, K[] kArr) {
        h.removeAll(map.keySet(), kArr);
    }

    @InlineOnly
    @JvmName(name = "mutableIterator")
    private static final <K, V> Iterator<Map.Entry<K, V>> y(Map<K, V> map) {
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> Map<K, V> z() {
        return new LinkedHashMap();
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> iterable) {
        Map mutableMap = toMutableMap(map);
        h.removeAll(mutableMap.keySet(), iterable);
        return optimizeReadOnlyMap(mutableMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        if (map.isEmpty()) {
            return toMap(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> map, @NotNull K[] kArr) {
        Map mutableMap = toMutableMap(map);
        h.removeAll(mutableMap.keySet(), kArr);
        return optimizeReadOnlyMap(mutableMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        if (map.isEmpty()) {
            return toMap(pairArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <K, V> void putAll(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> map, @NotNull Sequence<? extends K> sequence) {
        Map mutableMap = toMutableMap(map);
        h.removeAll(mutableMap.keySet(), sequence);
        return optimizeReadOnlyMap(mutableMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> map, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, sequence);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    @NotNull
    public static <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> void putAll(@NotNull Map<? super K, ? super V> map, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        for (Pair<? extends K, ? extends V> pair : sequence) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m) {
        putAll(m, iterable);
        return m;
    }

    @NotNull
    public static <K, V> Map<K, V> toMap(@NotNull Pair<? extends K, ? extends V>[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return emptyMap();
        }
        if (length != 1) {
            return toMap(pairArr, new LinkedHashMap(q.mapCapacity(pairArr.length)));
        }
        return q.mapOf(pairArr[0]);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Pair<? extends K, ? extends V>[] pairArr, @NotNull M m) {
        putAll(m, pairArr);
        return m;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        return optimizeReadOnlyMap(toMap(sequence, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence, @NotNull M m) {
        putAll(m, sequence);
        return m;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <K, V> Map<K, V> toMap(@NotNull Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMutableMap(map);
        }
        return q.toSingletonMap(map);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Map<? extends K, ? extends V> map, @NotNull M m) {
        m.putAll(map);
        return m;
    }
}
