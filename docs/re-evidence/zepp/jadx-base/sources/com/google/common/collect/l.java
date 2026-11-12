package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class l<K, V> extends n<K, V> {
    public l(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> s() {
        return (SortedMap) super.s();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g
    public Set<K> f() {
        return w();
    }

    @Override // com.google.common.collect.n, com.google.common.collect.k, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
