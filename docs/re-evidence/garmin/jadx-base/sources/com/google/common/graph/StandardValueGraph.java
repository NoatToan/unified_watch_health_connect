package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final MapIteratorCache<N, GraphConnections<N, V>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder, Map<N, GraphConnections<N, V>> map, long j8) {
        this.isDirected = abstractGraphBuilder.directed;
        this.allowsSelfLoops = abstractGraphBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) abstractGraphBuilder.nodeOrder.cast();
        this.nodeConnections = map instanceof TreeMap ? new MapRetrievalCache<>(map) : new MapIteratorCache<>(map);
        this.edgeCount = Graphs.checkNonNegative(j8);
    }

    private final GraphConnections<N, V> checkedConnections(N n14) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n14);
        if (graphConnections != null) {
            return graphConnections;
        }
        Preconditions.checkNotNull(n14);
        vb.h.s(org.apache.commons.lang3.e.f("Node ", " is not an element of this graph.", n14));
        return null;
    }

    private final V edgeValueOrDefaultInternal(N n14, N n15, V v14) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n14);
        V vValue = graphConnections == null ? null : graphConnections.value(n15);
        return vValue == null ? v14 : vValue;
    }

    private final boolean hasEdgeConnectingInternal(N n14, N n15) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n14);
        return graphConnections != null && graphConnections.successors().contains(n15);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).adjacentNodes(), n14);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final boolean containsNode(N n14) {
        return this.nodeConnections.containsKey(n14);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    public long edgeCount() {
        return this.edgeCount;
    }

    public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v14) {
        validateEndpoints(endpointPair);
        return edgeValueOrDefaultInternal(endpointPair.nodeU(), endpointPair.nodeV(), v14);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        return isOrderingCompatible(endpointPair) && hasEdgeConnectingInternal(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n14) {
        final GraphConnections<N, V> graphConnectionsCheckedConnections = checkedConnections(n14);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new IncidentEdgeSet<N>(this, this, n14) { // from class: com.google.common.graph.StandardValueGraph.1
            final /* synthetic */ StandardValueGraph this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return graphConnectionsCheckedConnections.incidentEdgeIterator(this.node);
            }
        }, n14);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).predecessors(), n14);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).successors(), n14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V edgeValueOrDefault(N n14, N n15, V v14) {
        return (V) edgeValueOrDefaultInternal(Preconditions.checkNotNull(n14), Preconditions.checkNotNull(n15), v14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n14, N n15) {
        return hasEdgeConnectingInternal(Preconditions.checkNotNull(n14), Preconditions.checkNotNull(n15));
    }

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this(abstractGraphBuilder, abstractGraphBuilder.nodeOrder.createMap(abstractGraphBuilder.expectedNodeCount.or(10).intValue()), 0L);
    }
}
