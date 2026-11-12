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
final class l<N, E> extends b<N, E> {

    @LazyInit
    private transient Reference<Multiset<N>> d;

    @LazyInit
    private transient Reference<Multiset<N>> e;

    public class a extends w<E> {
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.c = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.s().count(this.c);
        }
    }

    private l(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    @NullableDecl
    private static <T> T o(@NullableDecl Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> l<N, E> p() {
        return new l<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    public static <N, E> l<N, E> q(Map<E, N> map, Map<E, N> map2, int i) {
        return new l<>(ImmutableMap.copyOf((Map) map), ImmutableMap.copyOf((Map) map2), i);
    }

    private Multiset<N> r() {
        Multiset<N> multiset = (Multiset) o(this.d);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.a.values());
        this.d = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset<N> s() {
        Multiset<N> multiset = (Multiset) o(this.e);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.b.values());
        this.e = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.x
    public Set<N> b() {
        return Collections.unmodifiableSet(s().elementSet());
    }

    @Override // com.google.common.graph.x
    public Set<N> c() {
        return Collections.unmodifiableSet(r().elementSet());
    }

    @Override // com.google.common.graph.b, com.google.common.graph.x
    public N f(E e) {
        N n = (N) super.f(e);
        Multiset multiset = (Multiset) o(this.e);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.b, com.google.common.graph.x
    public N h(E e, boolean z) {
        N n = (N) super.h(e, z);
        Multiset multiset = (Multiset) o(this.d);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.b, com.google.common.graph.x
    public void i(E e, N n) {
        super.i(e, n);
        Multiset multiset = (Multiset) o(this.e);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.b, com.google.common.graph.x
    public void j(E e, N n, boolean z) {
        super.j(e, n, z);
        Multiset multiset = (Multiset) o(this.d);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.x
    public Set<E> l(N n) {
        return new a(this.b, n, n);
    }
}
