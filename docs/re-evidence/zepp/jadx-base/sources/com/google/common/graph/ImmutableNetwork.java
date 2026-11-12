package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"N", "E"})
@Beta
public final class ImmutableNetwork<N, E> extends i<N, E> {

    public static class a implements Function<E, N> {
        public final /* synthetic */ Network a;

        public a(Network network) {
            this.a = network;
        }

        @Override // com.google.common.base.Function
        public N apply(E e) {
            return this.a.incidentNodes(e).source();
        }
    }

    public static class b implements Function<E, N> {
        public final /* synthetic */ Network a;

        public b(Network network) {
            this.a = network;
        }

        @Override // com.google.common.base.Function
        public N apply(E e) {
            return this.a.incidentNodes(e).target();
        }
    }

    public static class c implements Function<E, N> {
        public final /* synthetic */ Network a;
        public final /* synthetic */ Object b;

        public c(Network network, Object obj) {
            this.a = network;
            this.b = obj;
        }

        @Override // com.google.common.base.Function
        public N apply(E e) {
            return this.a.incidentNodes(e).adjacentNode(this.b);
        }
    }

    private ImmutableNetwork(Network<N, E> network) {
        super(NetworkBuilder.from(network), f(network), e(network));
    }

    private static <N, E> Function<E, N> c(Network<N, E> network, N n) {
        return new c(network, n);
    }

    public static <N, E> ImmutableNetwork<N, E> copyOf(Network<N, E> network) {
        return network instanceof ImmutableNetwork ? (ImmutableNetwork) network : new ImmutableNetwork<>(network);
    }

    private static <N, E> x<N, E> d(Network<N, E> network, N n) {
        if (!network.isDirected()) {
            Map mapAsMap = Maps.asMap(network.incidentEdges(n), c(network, n));
            return network.allowsParallelEdges() ? z.q(mapAsMap) : a0.n(mapAsMap);
        }
        Map mapAsMap2 = Maps.asMap(network.inEdges(n), g(network));
        Map mapAsMap3 = Maps.asMap(network.outEdges(n), h(network));
        int size = network.edgesConnecting(n, n).size();
        return network.allowsParallelEdges() ? l.q(mapAsMap2, mapAsMap3, size) : m.o(mapAsMap2, mapAsMap3, size);
    }

    private static <N, E> Map<E, N> e(Network<N, E> network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (E e : network.edges()) {
            builder.put(e, network.incidentNodes(e).nodeU());
        }
        return builder.build();
    }

    private static <N, E> Map<N, x<N, E>> f(Network<N, E> network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n : network.nodes()) {
            builder.put(n, d(network, n));
        }
        return builder.build();
    }

    private static <N, E> Function<E, N> g(Network<N, E> network) {
        return new a(network);
    }

    private static <N, E> Function<E, N> h(Network<N, E> network) {
        return new b(network);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder edgeOrder() {
        return super.edgeOrder();
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edgesConnecting(Object obj, Object obj2) {
        return super.edgesConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set inEdges(Object obj) {
        return super.inEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ EndpointPair incidentNodes(Object obj) {
        return super.incidentNodes(obj);
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set outEdges(Object obj) {
        return super.outEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Deprecated
    public static <N, E> ImmutableNetwork<N, E> copyOf(ImmutableNetwork<N, E> immutableNetwork) {
        return (ImmutableNetwork) Preconditions.checkNotNull(immutableNetwork);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public ImmutableGraph<N> asGraph() {
        return new ImmutableGraph<>(super.asGraph());
    }
}
