package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private NetworkConnections<N, E> addNodeInternal(N n14) {
        NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n14, networkConnectionsNewConnections) == null);
        return networkConnectionsNewConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            return allowsParallelEdges() ? DirectedMultiNetworkConnections.of() : DirectedNetworkConnections.of();
        }
        return allowsParallelEdges() ? UndirectedMultiNetworkConnections.of() : UndirectedNetworkConnections.of();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n14, N n15, E e4) {
        Preconditions.checkNotNull(n14, "nodeU");
        Preconditions.checkNotNull(n15, "nodeV");
        Preconditions.checkNotNull(e4, "edge");
        if (containsEdge(e4)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e4);
            EndpointPair endpointPairOf = EndpointPair.of(this, n14, n15);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairOf), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e4, endpointPairIncidentNodes, endpointPairOf);
            return false;
        }
        NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(n14);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(n15), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n14, n15);
        }
        boolean zEquals = n14.equals(n15);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n14);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(n14);
        }
        networkConnectionsAddNodeInternal.addOutEdge(e4, n15);
        NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(n15);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(n15);
        }
        networkConnectionsAddNodeInternal2.addInEdge(e4, n14, zEquals);
        this.edgeToReferenceNode.put(e4, n14);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n14) {
        Preconditions.checkNotNull(n14, "node");
        if (containsNode(n14)) {
            return false;
        }
        addNodeInternal(n14);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e4) {
        Preconditions.checkNotNull(e4, "edge");
        N n14 = this.edgeToReferenceNode.get(e4);
        boolean z14 = false;
        if (n14 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n14);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N nAdjacentNode = networkConnections2.adjacentNode(e4);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(nAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e4);
        if (allowsSelfLoops() && n14.equals(nAdjacentNode)) {
            z14 = true;
        }
        networkConnections4.removeInEdge(e4, z14);
        this.edgeToReferenceNode.remove(e4);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n14) {
        Preconditions.checkNotNull(n14, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n14);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n14);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e4) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e4);
    }
}
