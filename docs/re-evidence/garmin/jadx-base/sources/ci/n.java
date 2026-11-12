package ci;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001¢\u0006\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lci/n;", "", "", "", Action.KEY_ATTRIBUTE, "fields", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "mutationId", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/UUID;)V", "", "date", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/UUID;Ljava/util/Map;)V", "a", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class n implements Map<String, Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f27617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f27618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Long> f27619d;

    static {
        new a(null);
    }

    public n(String str, Map<String, ? extends Object> map, UUID uuid) {
        str.getClass();
        map.getClass();
        this.f27616a = str;
        this.f27617b = map;
        this.f27618c = uuid;
    }

    public final Set<String> a() {
        Set<String> setKeySet = this.f27617b.keySet();
        ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f27616a + '.' + ((String) it.next()));
        }
        return h0.g1(arrayList);
    }

    public final p<n, Set<String>> b(n nVar, Long l14) {
        nVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, Object> map = this.f27617b;
        LinkedHashMap linkedHashMapN = u0.n(map);
        Map<String, Long> map2 = this.f27619d;
        LinkedHashMap linkedHashMap = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it = nVar.f27617b.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.f27616a;
            if (!zHasNext) {
                return new p<>(new n(str, linkedHashMapN, nVar.f27618c, linkedHashMap), linkedHashSet);
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            boolean zContainsKey = map.containsKey(key);
            Object obj = map.get(key);
            if (!zContainsKey || !s.g(obj, value)) {
                linkedHashMapN.put(key, value);
                linkedHashSet.add(str + '.' + key);
            }
            if (l14 != null) {
                linkedHashMap.put(key, l14);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f27617b.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f27617b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.f27617b.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f27617b.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f27617b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f27617b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27617b.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.f27617b.values();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/n$a;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ n(String str, Map map, UUID uuid, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, map, (i14 & 4) != 0 ? null : uuid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, Map<String, ? extends Object> map, UUID uuid, Map<String, Long> map2) {
        this(str, map, uuid);
        str.getClass();
        map.getClass();
        map2.getClass();
        this.f27619d = map2;
    }
}
