package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class h1<K, V> extends n1<K> {

    @Weak
    private final ImmutableMap<K, V> f;

    @GwtIncompatible
    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, ?> a;

        public a(ImmutableMap<K, ?> immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.keySet();
        }
    }

    public h1(ImmutableMap<K, V> immutableMap) {
        this.f = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return true;
    }

    @Override // com.google.common.collect.n1
    public K get(int i) {
        return this.f.entrySet().asList().get(i).getKey();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new a(this.f);
    }

    @Override // com.google.common.collect.n1, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<K> iterator() {
        return this.f.k();
    }
}
