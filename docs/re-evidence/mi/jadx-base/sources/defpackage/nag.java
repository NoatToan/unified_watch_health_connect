package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface nag<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k2);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k2, V v);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();

    Collection<V> values();
}
