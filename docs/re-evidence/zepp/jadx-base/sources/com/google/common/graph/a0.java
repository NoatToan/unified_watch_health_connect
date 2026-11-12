package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class a0<N, E> extends d<N, E> {
    public a0(Map<E, N> map) {
        super(map);
    }

    public static <N, E> a0<N, E> m() {
        return new a0<>(HashBiMap.create(2));
    }

    public static <N, E> a0<N, E> n(Map<E, N> map) {
        return new a0<>(ImmutableBiMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.x
    public Set<N> a() {
        return Collections.unmodifiableSet(((BiMap) this.a).values());
    }

    @Override // com.google.common.graph.x
    public Set<E> l(N n) {
        return new n(((BiMap) this.a).inverse(), n);
    }
}
