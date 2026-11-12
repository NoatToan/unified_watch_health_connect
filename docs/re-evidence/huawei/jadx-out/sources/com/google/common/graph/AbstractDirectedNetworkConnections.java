package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.amn;
import defpackage.apn;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i) {
        this.inEdgeMap = (Map) Preconditions.checkNotNull(map);
        this.outEdgeMap = (Map) Preconditions.checkNotNull(map2);
        this.selfLoopCount = Graphs.d(i);
        Preconditions.checkState(i <= map.size() && i <= map2.size());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.a(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<E> iterator() {
                Iterable iterableA;
                if (AbstractDirectedNetworkConnections.this.selfLoopCount == 0) {
                    iterableA = amn.c(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                } else {
                    iterableA = Sets.a(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                }
                return Iterators.i(iterableA.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return apn.b(AbstractDirectedNetworkConnections.this.inEdgeMap.size(), AbstractDirectedNetworkConnections.this.outEdgeMap.size() - AbstractDirectedNetworkConnections.this.selfLoopCount);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) || AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        return (N) Objects.requireNonNull(this.outEdgeMap.get(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (z) {
            int i = this.selfLoopCount - 1;
            this.selfLoopCount = i;
            Graphs.d(i);
        }
        return (N) Objects.requireNonNull(this.inEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        return (N) Objects.requireNonNull(this.outEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(n);
        if (z) {
            int i = this.selfLoopCount + 1;
            this.selfLoopCount = i;
            Graphs.b(i);
        }
        Preconditions.checkState(this.inEdgeMap.put(e, n) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(n);
        Preconditions.checkState(this.outEdgeMap.put(e, n) == null);
    }
}
