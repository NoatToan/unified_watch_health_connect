package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@DoNotMock("Use GraphBuilder to create a real instance")
@Beta
@ElementTypesAreNonnullByDefault
public interface Graph<N> extends BaseGraph<N> {
    Set<N> adjacentNodes(N n14);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N n14);

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> edges();

    boolean equals(Object obj);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N n14, N n15);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N n14);

    @Override // com.google.common.graph.BaseGraph
    ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> incidentEdges(N n14);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N n14);

    @Override // 
    Set<N> predecessors(N n14);

    @Override // 
    Set<N> successors(N n14);
}
