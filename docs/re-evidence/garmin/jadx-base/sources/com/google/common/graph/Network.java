package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@DoNotMock("Use NetworkBuilder to create a real instance")
@Beta
@ElementTypesAreNonnullByDefault
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set<E> adjacentEdges(E e4);

    Set<N> adjacentNodes(N n14);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    Graph<N> asGraph();

    int degree(N n14);

    E edgeConnectingOrNull(EndpointPair<N> endpointPair);

    E edgeConnectingOrNull(N n14, N n15);

    ElementOrder<E> edgeOrder();

    Set<E> edges();

    Set<E> edgesConnecting(EndpointPair<N> endpointPair);

    Set<E> edgesConnecting(N n14, N n15);

    boolean equals(Object obj);

    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    boolean hasEdgeConnecting(N n14, N n15);

    int hashCode();

    int inDegree(N n14);

    Set<E> inEdges(N n14);

    Set<E> incidentEdges(N n14);

    EndpointPair<N> incidentNodes(E e4);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N n14);

    Set<E> outEdges(N n14);

    @Override // com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    Set<N> predecessors(N n14);

    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    Set<N> successors(N n14);
}
