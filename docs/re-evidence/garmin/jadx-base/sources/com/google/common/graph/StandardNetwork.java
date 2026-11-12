package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final ElementOrder<E> edgeOrder;
    final MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final MapIteratorCache<N, NetworkConnections<N, E>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, NetworkConnections<N, E>> map, Map<E, N> map2) {
        this.isDirected = networkBuilder.directed;
        this.allowsParallelEdges = networkBuilder.allowsParallelEdges;
        this.allowsSelfLoops = networkBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) networkBuilder.nodeOrder.cast();
        this.edgeOrder = (ElementOrder<E>) networkBuilder.edgeOrder.cast();
        this.nodeConnections = map instanceof TreeMap ? new MapRetrievalCache<>(map) : new MapIteratorCache<>(map);
        this.edgeToReferenceNode = new MapIteratorCache<>(map2);
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).adjacentNodes(), n14);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.allowsParallelEdges;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final NetworkConnections<N, E> checkedConnections(N n14) {
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n14);
        if (networkConnections != null) {
            return networkConnections;
        }
        Preconditions.checkNotNull(n14);
        org.apache.commons.lang3.e.s("Node %s is not an element of this graph.", new Object[]{n14});
        return null;
    }

    public final N checkedReferenceNode(E e4) {
        N n14 = this.edgeToReferenceNode.get(e4);
        if (n14 != null) {
            return n14;
        }
        Preconditions.checkNotNull(e4);
        org.apache.commons.lang3.e.s("Edge %s is not an element of this graph.", new Object[]{e4});
        return null;
    }

    public final boolean containsEdge(E e4) {
        return this.edgeToReferenceNode.containsKey(e4);
    }

    public final boolean containsNode(N n14) {
        return this.nodeConnections.containsKey(n14);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return this.edgeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return this.edgeToReferenceNode.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n14, N n15) {
        NetworkConnections<N, E> networkConnectionsCheckedConnections = checkedConnections(n14);
        if (!this.allowsSelfLoops && n14 == n15) {
            return ImmutableSet.of();
        }
        Preconditions.checkArgument(containsNode(n15), "Node %s is not an element of this graph.", n15);
        return (Set<E>) nodePairInvalidatableSet(networkConnectionsCheckedConnections.edgesConnecting(n15), n14, n15);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n14) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n14).inEdges(), n14);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n14) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n14).incidentEdges(), n14);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e4) {
        N nCheckedReferenceNode = checkedReferenceNode(e4);
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(nCheckedReferenceNode);
        Objects.requireNonNull(networkConnections);
        return EndpointPair.of(this, nCheckedReferenceNode, networkConnections.adjacentNode(e4));
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n14) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n14).outEdges(), n14);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).predecessors(), n14);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n14) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n14).successors(), n14);
    }

    public StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        this(networkBuilder, networkBuilder.nodeOrder.createMap(networkBuilder.expectedNodeCount.or(10).intValue()), networkBuilder.edgeOrder.createMap(networkBuilder.expectedEdgeCount.or(20).intValue()));
    }
}
