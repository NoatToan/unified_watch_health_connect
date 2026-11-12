package com.google.common.collect;

import defpackage.xyl;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i<K, V> extends g<K, V> implements xyl {
    private static final long serialVersionUID = 430848587173315748L;

    public i(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.d, defpackage.nag
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b
    public abstract SortedSet<V> createCollection();

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b
    public Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return collection instanceof NavigableSet ? new b.m(k2, (NavigableSet) collection, null) : new b.o(k2, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return collection instanceof NavigableSet ? i0.i((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b
    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return (SortedSet<V>) unmodifiableCollectionSubclass((Collection) createCollection());
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public SortedSet<V> get(K k2) {
        return (SortedSet) super.get((Object) k2);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d
    public SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
