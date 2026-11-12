package com.google.common.collect;

import defpackage.xyl;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g<K, V> extends b<K, V> implements xyl<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public g(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.b
    public abstract Set<V> createCollection();

    @Override // com.google.common.collect.d
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public boolean put(K k2, V v) {
        return super.put(k2, v);
    }

    @Override // com.google.common.collect.b
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.b
    public Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return new b.n(k2, (Set) collection);
    }

    @Override // com.google.common.collect.b
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public Set<V> get(K k2) {
        return (Set) super.get((Object) k2);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d
    public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
