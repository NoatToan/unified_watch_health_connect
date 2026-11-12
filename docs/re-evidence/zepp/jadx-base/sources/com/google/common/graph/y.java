package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class y<N, V> implements s<N, V> {
    private final Map<N, V> a;

    private y(Map<N, V> map) {
        this.a = (Map) Preconditions.checkNotNull(map);
    }

    public static <N, V> y<N, V> i() {
        return new y<>(new HashMap(2, 1.0f));
    }

    public static <N, V> y<N, V> j(Map<N, V> map) {
        return new y<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.s
    public Set<N> a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // com.google.common.graph.s
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.s
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.s
    public void d(N n, V v) {
        h(n, v);
    }

    @Override // com.google.common.graph.s
    public V e(N n) {
        return this.a.get(n);
    }

    @Override // com.google.common.graph.s
    public V f(N n) {
        return this.a.remove(n);
    }

    @Override // com.google.common.graph.s
    public void g(N n) {
        f(n);
    }

    @Override // com.google.common.graph.s
    public V h(N n, V v) {
        return this.a.put(n, v);
    }
}
