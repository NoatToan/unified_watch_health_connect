package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class i1<K, V> extends ImmutableCollection<V> {

    @Weak
    private final ImmutableMap<K, V> b;

    public class a extends UnmodifiableIterator<V> {
        public final UnmodifiableIterator<Map.Entry<K, V>> a;

        public a() {
            this.a = i1.this.b.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.a.next().getValue();
        }
    }

    public class b extends ImmutableList<V> {
        public final /* synthetic */ ImmutableList c;

        public b(ImmutableList immutableList) {
            this.c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) ((Map.Entry) this.c.get(i)).getValue();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c.size();
        }
    }

    @GwtIncompatible
    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<?, V> a;

        public c(ImmutableMap<?, V> immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.values();
        }
    }

    public i1(ImmutableMap<K, V> immutableMap) {
        this.b = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        return new b(this.b.entrySet().asList());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.b.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new c(this.b);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<V> iterator() {
        return new a();
    }
}
