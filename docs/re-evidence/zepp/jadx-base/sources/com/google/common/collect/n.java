package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class n<K, V> extends k<K, V> implements SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public n(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d
    public Collection<V> D(K k, Collection<V> collection) {
        return collection instanceof NavigableSet ? new d.m(k, (NavigableSet) collection, null) : new d.o(k, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d
    /* JADX INFO: renamed from: H */
    public abstract SortedSet<V> t();

    @Override // com.google.common.collect.k, com.google.common.collect.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> x() {
        return (SortedSet<V>) C(t());
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> C(Collection<E> collection) {
        return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet<V> get(@NullableDecl K k) {
        return (SortedSet) super.get((Object) k);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public SortedSet<V> removeAll(@NullableDecl Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public SortedSet<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k, (Iterable) iterable);
    }
}
