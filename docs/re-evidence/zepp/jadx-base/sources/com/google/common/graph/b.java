package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
abstract class b<N, E> implements x<N, E> {
    public final Map<E, N> a;
    public final Map<E, N> b;
    private int c;

    public class a extends AbstractSet<E> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<E> iterator() {
            return Iterators.unmodifiableIterator((b.this.c == 0 ? Iterables.concat(b.this.a.keySet(), b.this.b.keySet()) : Sets.union(b.this.a.keySet(), b.this.b.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return b.this.a.containsKey(obj) || b.this.b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.saturatedAdd(b.this.a.size(), b.this.b.size() - b.this.c);
        }
    }

    public b(Map<E, N> map, Map<E, N> map2, int i) {
        this.a = (Map) Preconditions.checkNotNull(map);
        this.b = (Map) Preconditions.checkNotNull(map2);
        this.c = Graphs.b(i);
        Preconditions.checkState(i <= map.size() && i <= map2.size());
    }

    @Override // com.google.common.graph.x
    public Set<N> a() {
        return Sets.union(c(), b());
    }

    @Override // com.google.common.graph.x
    public N d(E e) {
        return (N) Preconditions.checkNotNull(this.b.get(e));
    }

    @Override // com.google.common.graph.x
    public Set<E> e() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // com.google.common.graph.x
    public N f(E e) {
        return (N) Preconditions.checkNotNull(this.b.remove(e));
    }

    @Override // com.google.common.graph.x
    public Set<E> g() {
        return Collections.unmodifiableSet(this.b.keySet());
    }

    @Override // com.google.common.graph.x
    public N h(E e, boolean z) {
        if (z) {
            int i = this.c - 1;
            this.c = i;
            Graphs.b(i);
        }
        return (N) Preconditions.checkNotNull(this.a.remove(e));
    }

    @Override // com.google.common.graph.x
    public void i(E e, N n) {
        Preconditions.checkState(this.b.put(e, n) == null);
    }

    @Override // com.google.common.graph.x
    public void j(E e, N n, boolean z) {
        if (z) {
            int i = this.c + 1;
            this.c = i;
            Graphs.d(i);
        }
        Preconditions.checkState(this.a.put(e, n) == null);
    }

    @Override // com.google.common.graph.x
    public Set<E> k() {
        return new a();
    }
}
