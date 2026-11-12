package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n14);

    @CanIgnoreReturnValue
    V putEdgeValue(EndpointPair<N> endpointPair, V v14);

    @CanIgnoreReturnValue
    V putEdgeValue(N n14, N n15, V v14);

    @CanIgnoreReturnValue
    V removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    V removeEdge(N n14, N n15);

    @CanIgnoreReturnValue
    boolean removeNode(N n14);
}
