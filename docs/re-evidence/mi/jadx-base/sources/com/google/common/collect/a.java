package com.google.common.collect;

import defpackage.wge;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<K, V> extends b<K, V> implements wge<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public a(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.b
    public abstract List<V> createCollection();

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
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.b
    public Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return wrapList(k2, (List) collection, null);
    }

    @Override // com.google.common.collect.b
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public List<V> get(K k2) {
        return (List) super.get((Object) k2);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d
    public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
