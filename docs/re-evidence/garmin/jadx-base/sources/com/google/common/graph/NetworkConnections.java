package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    void addInEdge(E e4, N n14, boolean z14);

    void addOutEdge(E e4, N n14);

    N adjacentNode(E e4);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n14);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    N removeInEdge(E e4, boolean z14);

    @CanIgnoreReturnValue
    N removeOutEdge(E e4);

    Set<N> successors();
}
