package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class o0<K, V> extends p0<K, V> implements ListMultimap<K, V> {
    public o0(ListMultimap<K, V> listMultimap, Predicate<? super K> predicate) {
        super(listMultimap, predicate);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ListMultimap<K, V> a() {
        return (ListMultimap) super.a();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(K k) {
        return (List) super.get((Object) k);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> removeAll(@NullableDecl Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k, (Iterable) iterable);
    }
}
