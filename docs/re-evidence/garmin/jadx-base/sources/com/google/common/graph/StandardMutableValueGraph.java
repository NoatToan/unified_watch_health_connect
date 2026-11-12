package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends StandardValueGraph<N, V> implements MutableValueGraph<N, V> {
    private final ElementOrder<N> incidentEdgeOrder;

    public StandardMutableValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    @CanIgnoreReturnValue
    private GraphConnections<N, V> addNodeInternal(N n14) {
        GraphConnections<N, V> graphConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n14, graphConnectionsNewConnections) == null);
        return graphConnectionsNewConnections;
    }

    private GraphConnections<N, V> newConnections() {
        boolean zIsDirected = isDirected();
        ElementOrder<N> elementOrder = this.incidentEdgeOrder;
        return zIsDirected ? DirectedGraphConnections.of(elementOrder) : UndirectedGraphConnections.of(elementOrder);
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean addNode(N n14) {
        Preconditions.checkNotNull(n14, "node");
        if (containsNode(n14)) {
            return false;
        }
        addNodeInternal(n14);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(N n14, N n15, V v14) {
        Preconditions.checkNotNull(n14, "nodeU");
        Preconditions.checkNotNull(n15, "nodeV");
        Preconditions.checkNotNull(v14, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n14.equals(n15), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n14);
        }
        GraphConnections<N, V> graphConnectionsAddNodeInternal = this.nodeConnections.get(n14);
        if (graphConnectionsAddNodeInternal == null) {
            graphConnectionsAddNodeInternal = addNodeInternal(n14);
        }
        V vAddSuccessor = graphConnectionsAddNodeInternal.addSuccessor(n15, v14);
        GraphConnections<N, V> graphConnectionsAddNodeInternal2 = this.nodeConnections.get(n15);
        if (graphConnectionsAddNodeInternal2 == null) {
            graphConnectionsAddNodeInternal2 = addNodeInternal(n15);
        }
        graphConnectionsAddNodeInternal2.addPredecessor(n14, v14);
        if (vAddSuccessor == null) {
            long j8 = this.edgeCount + 1;
            this.edgeCount = j8;
            Graphs.checkPositive(j8);
        }
        return vAddSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(N n14, N n15) {
        Preconditions.checkNotNull(n14, "nodeU");
        Preconditions.checkNotNull(n15, "nodeV");
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n14);
        GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n15);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V vRemoveSuccessor = graphConnections.removeSuccessor(n15);
        if (vRemoveSuccessor != null) {
            graphConnections2.removePredecessor(n14);
            long j8 = this.edgeCount - 1;
            this.edgeCount = j8;
            Graphs.checkNonNegative(j8);
        }
        return vRemoveSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean removeNode(N n14) {
        Preconditions.checkNotNull(n14, "node");
        GraphConnections graphConnections = (GraphConnections<N, V>) this.nodeConnections.get(n14);
        if (graphConnections == null) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n14) != null) {
            graphConnections.removePredecessor(n14);
            this.edgeCount--;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) graphConnections.successors()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            GraphConnections<N, V> withoutCaching = this.nodeConnections.getWithoutCaching(next);
            Objects.requireNonNull(withoutCaching);
            withoutCaching.removePredecessor(n14);
            Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.edgeCount--;
        }
        if (isDirected()) {
            UnmodifiableIterator it3 = ImmutableList.copyOf((Collection) graphConnections.predecessors()).iterator();
            while (it3.hasNext()) {
                E next2 = it3.next();
                GraphConnections<N, V> withoutCaching2 = this.nodeConnections.getWithoutCaching(next2);
                Objects.requireNonNull(withoutCaching2);
                Preconditions.checkState(withoutCaching2.removeSuccessor(n14) != null);
                graphConnections.removePredecessor(next2);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n14);
        Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(EndpointPair<N> endpointPair, V v14) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v14);
    }
}
