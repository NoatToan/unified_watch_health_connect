package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> incidentEdgeMap;

    public AbstractUndirectedNetworkConnections(Map<E, N> map) {
        this.incidentEdgeMap = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e4, N n14, boolean z14) {
        if (z14) {
            return;
        }
        addOutEdge(e4, n14);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e4, N n14) {
        Preconditions.checkState(this.incidentEdgeMap.put(e4, n14) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e4) {
        N n14 = this.incidentEdgeMap.get(e4);
        Objects.requireNonNull(n14);
        return n14;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e4, boolean z14) {
        if (z14) {
            return null;
        }
        return removeOutEdge(e4);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e4) {
        N nRemove = this.incidentEdgeMap.remove(e4);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
