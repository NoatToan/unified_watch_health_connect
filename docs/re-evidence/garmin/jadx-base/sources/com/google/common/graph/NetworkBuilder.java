package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class NetworkBuilder<N, E> extends AbstractGraphBuilder<N> {
    boolean allowsParallelEdges;
    ElementOrder<? super E> edgeOrder;
    Optional<Integer> expectedEdgeCount;

    private NetworkBuilder(boolean z14) {
        super(z14);
        this.allowsParallelEdges = false;
        this.edgeOrder = ElementOrder.insertion();
        this.expectedEdgeCount = Optional.absent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> NetworkBuilder<N1, E1> cast() {
        return this;
    }

    public static NetworkBuilder<Object, Object> directed() {
        return new NetworkBuilder<>(true);
    }

    public static <N, E> NetworkBuilder<N, E> from(Network<N, E> network) {
        return new NetworkBuilder(network.isDirected()).allowsParallelEdges(network.allowsParallelEdges()).allowsSelfLoops(network.allowsSelfLoops()).nodeOrder(network.nodeOrder()).edgeOrder(network.edgeOrder());
    }

    public static NetworkBuilder<Object, Object> undirected() {
        return new NetworkBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsParallelEdges(boolean z14) {
        this.allowsParallelEdges = z14;
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsSelfLoops(boolean z14) {
        this.allowsSelfLoops = z14;
        return this;
    }

    public <N1 extends N, E1 extends E> MutableNetwork<N1, E1> build() {
        return new StandardMutableNetwork(this);
    }

    public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> elementOrder) {
        NetworkBuilder<N, E1> networkBuilder = (NetworkBuilder<N, E1>) cast();
        networkBuilder.edgeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return networkBuilder;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedEdgeCount(int i14) {
        this.expectedEdgeCount = Optional.of(Integer.valueOf(Graphs.checkNonNegative(i14)));
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedNodeCount(int i14) {
        this.expectedNodeCount = Optional.of(Integer.valueOf(Graphs.checkNonNegative(i14)));
        return this;
    }

    public <N1 extends N, E1 extends E> ImmutableNetwork.Builder<N1, E1> immutable() {
        return new ImmutableNetwork.Builder<>(cast());
    }

    public <N1 extends N> NetworkBuilder<N1, E> nodeOrder(ElementOrder<N1> elementOrder) {
        NetworkBuilder<N1, E> networkBuilder = (NetworkBuilder<N1, E>) cast();
        networkBuilder.nodeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return networkBuilder;
    }
}
