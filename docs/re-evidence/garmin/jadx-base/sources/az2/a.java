package az2;

import f23.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laz2/a;", "K", "V", "", "<init>", "()V", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<K, V> implements Map<K, V>, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap<K, V> f13782a = new ConcurrentHashMap<>();

    @Override // java.util.Map
    public final void clear() {
        this.f13782a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f13782a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f13782a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> setEntrySet = this.f13782a.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f13782a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13782a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Set<K> setKeySet = this.f13782a.keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        return this.f13782a.put(k14, v14);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        this.f13782a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return this.f13782a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13782a.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        Collection<V> collectionValues = this.f13782a.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
