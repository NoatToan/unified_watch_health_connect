package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableGraph<N> extends Graph<N> {
    @CanIgnoreReturnValue
    boolean addNode(N n14);

    @CanIgnoreReturnValue
    boolean putEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    boolean putEdge(N n14, N n15);

    @CanIgnoreReturnValue
    boolean removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    boolean removeEdge(N n14, N n15);

    @CanIgnoreReturnValue
    boolean removeNode(N n14);
}
