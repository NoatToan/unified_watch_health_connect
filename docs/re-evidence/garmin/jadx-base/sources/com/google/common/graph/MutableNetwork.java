package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableNetwork<N, E> extends Network<N, E> {
    @CanIgnoreReturnValue
    boolean addEdge(EndpointPair<N> endpointPair, E e4);

    @CanIgnoreReturnValue
    boolean addEdge(N n14, N n15, E e4);

    @CanIgnoreReturnValue
    boolean addNode(N n14);

    @CanIgnoreReturnValue
    boolean removeEdge(E e4);

    @CanIgnoreReturnValue
    boolean removeNode(N n14);
}
