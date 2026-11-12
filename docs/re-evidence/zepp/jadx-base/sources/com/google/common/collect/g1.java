package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class g1<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, V> a;

        public a(ImmutableMap<K, V> immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.entrySet();
        }
    }

    public static final class b<K, V> extends g1<K, V> {

        @Weak
        private final transient ImmutableMap<K, V> f;
        private final transient ImmutableList<Map.Entry<K, V>> g;

        public b(ImmutableMap<K, V> immutableMap, Map.Entry<K, V>[] entryArr) {
            this(immutableMap, ImmutableList.g(entryArr));
        }

        @Override // com.google.common.collect.ImmutableCollection
        @GwtIncompatible("not used in GWT")
        public int a(Object[] objArr, int i) {
            return this.g.a(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> k() {
            return this.g;
        }

        @Override // com.google.common.collect.g1
        public ImmutableMap<K, V> o() {
            return this.f;
        }

        public b(ImmutableMap<K, V> immutableMap, ImmutableList<Map.Entry<K, V>> immutableList) {
            this.f = immutableMap;
            this.g = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.g.iterator();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = o().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return o().j();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return o().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet
    @GwtIncompatible
    public boolean m() {
        return o().i();
    }

    public abstract ImmutableMap<K, V> o();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return o().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new a(o());
    }
}
