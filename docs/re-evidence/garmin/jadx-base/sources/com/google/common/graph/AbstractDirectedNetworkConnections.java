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
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i14) {
        this.inEdgeMap = (Map) Preconditions.checkNotNull(map);
        this.outEdgeMap = (Map) Preconditions.checkNotNull(map2);
        this.selfLoopCount = Graphs.checkNonNegative(i14);
        Preconditions.checkState(i14 <= map.size() && i14 <= map2.size());
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e4, N n14, boolean z14) {
        Preconditions.checkNotNull(e4);
        Preconditions.checkNotNull(n14);
        if (z14) {
            int i14 = this.selfLoopCount + 1;
            this.selfLoopCount = i14;
            Graphs.checkPositive(i14);
        }
        Preconditions.checkState(this.inEdgeMap.put(e4, n14) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e4, N n14) {
        Preconditions.checkNotNull(e4);
        Preconditions.checkNotNull(n14);
        Preconditions.checkState(this.outEdgeMap.put(e4, n14) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e4) {
        N n14 = this.outEdgeMap.get(e4);
        Objects.requireNonNull(n14);
        return n14;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) || AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                int i14 = AbstractDirectedNetworkConnections.this.selfLoopCount;
                AbstractDirectedNetworkConnections abstractDirectedNetworkConnections = AbstractDirectedNetworkConnections.this;
                return Iterators.unmodifiableIterator((i14 == 0 ? Iterables.concat(abstractDirectedNetworkConnections.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet()) : Sets.union(abstractDirectedNetworkConnections.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet())).iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.inEdgeMap.size(), AbstractDirectedNetworkConnections.this.outEdgeMap.size() - AbstractDirectedNetworkConnections.this.selfLoopCount);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e4, boolean z14) {
        if (z14) {
            int i14 = this.selfLoopCount - 1;
            this.selfLoopCount = i14;
            Graphs.checkNonNegative(i14);
        }
        N nRemove = this.inEdgeMap.remove(e4);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e4) {
        N nRemove = this.outEdgeMap.remove(e4);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }
}
