package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N n14, V v14);

    @CanIgnoreReturnValue
    V addSuccessor(N n14, V v14);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n14);

    Set<N> predecessors();

    void removePredecessor(N n14);

    @CanIgnoreReturnValue
    V removeSuccessor(N n14);

    Set<N> successors();

    V value(N n14);
}
