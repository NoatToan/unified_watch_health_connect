package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class z<N, E> extends d<N, E> {

    @LazyInit
    private transient Reference<Multiset<N>> b;

    public class a extends w<E> {
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.c = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.n().count(this.c);
        }
    }

    private z(Map<E, N> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset<N> n() {
        Multiset<N> multiset = (Multiset) o(this.b);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.a.values());
        this.b = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @NullableDecl
    private static <T> T o(@NullableDecl Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> z<N, E> p() {
        return new z<>(new HashMap(2, 1.0f));
    }

    public static <N, E> z<N, E> q(Map<E, N> map) {
        return new z<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.x
    public Set<N> a() {
        return Collections.unmodifiableSet(n().elementSet());
    }

    @Override // com.google.common.graph.d, com.google.common.graph.x
    public N f(E e) {
        N n = (N) super.f(e);
        Multiset multiset = (Multiset) o(this.b);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.d, com.google.common.graph.x
    public N h(E e, boolean z) {
        if (z) {
            return null;
        }
        return f(e);
    }

    @Override // com.google.common.graph.d, com.google.common.graph.x
    public void i(E e, N n) {
        super.i(e, n);
        Multiset multiset = (Multiset) o(this.b);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.d, com.google.common.graph.x
    public void j(E e, N n, boolean z) {
        if (z) {
            return;
        }
        i(e, n);
    }

    @Override // com.google.common.graph.x
    public Set<E> l(N n) {
        return new a(this.a, n, n);
    }
}
