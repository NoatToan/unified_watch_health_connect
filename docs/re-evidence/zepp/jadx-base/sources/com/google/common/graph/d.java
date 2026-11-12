package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class d<N, E> implements x<N, E> {
    public final Map<E, N> a;

    public d(Map<E, N> map) {
        this.a = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.x
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.x
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.x
    public N d(E e) {
        return (N) Preconditions.checkNotNull(this.a.get(e));
    }

    @Override // com.google.common.graph.x
    public Set<E> e() {
        return k();
    }

    @Override // com.google.common.graph.x
    public N f(E e) {
        return (N) Preconditions.checkNotNull(this.a.remove(e));
    }

    @Override // com.google.common.graph.x
    public Set<E> g() {
        return k();
    }

    @Override // com.google.common.graph.x
    public N h(E e, boolean z) {
        if (z) {
            return null;
        }
        return f(e);
    }

    @Override // com.google.common.graph.x
    public void i(E e, N n) {
        Preconditions.checkState(this.a.put(e, n) == null);
    }

    @Override // com.google.common.graph.x
    public void j(E e, N n, boolean z) {
        if (z) {
            return;
        }
        i(e, n);
    }

    @Override // com.google.common.graph.x
    public Set<E> k() {
        return Collections.unmodifiableSet(this.a.keySet());
    }
}
