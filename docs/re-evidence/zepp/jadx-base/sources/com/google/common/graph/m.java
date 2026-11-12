package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class m<N, E> extends b<N, E> {
    public m(Map<E, N> map, Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    public static <N, E> m<N, E> n() {
        return new m<>(HashBiMap.create(2), HashBiMap.create(2), 0);
    }

    public static <N, E> m<N, E> o(Map<E, N> map, Map<E, N> map2, int i) {
        return new m<>(ImmutableBiMap.copyOf((Map) map), ImmutableBiMap.copyOf((Map) map2), i);
    }

    @Override // com.google.common.graph.x
    public Set<N> b() {
        return Collections.unmodifiableSet(((BiMap) this.b).values());
    }

    @Override // com.google.common.graph.x
    public Set<N> c() {
        return Collections.unmodifiableSet(((BiMap) this.a).values());
    }

    @Override // com.google.common.graph.x
    public Set<E> l(N n) {
        return new n(((BiMap) this.b).inverse(), n);
    }
}
