package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class Graphs {

    public enum a {
        PENDING,
        COMPLETE
    }

    public static class b<N> extends p<N> {
        private final Graph<N> a;

        public b(Graph<N> graph) {
            this.a = graph;
        }

        @Override // com.google.common.graph.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Graph<N> delegate() {
            return this.a;
        }

        @Override // com.google.common.graph.p, com.google.common.graph.AbstractGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(N n, N n2) {
            return delegate().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.p, com.google.common.graph.AbstractGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public int inDegree(N n) {
            return delegate().outDegree(n);
        }

        @Override // com.google.common.graph.p, com.google.common.graph.AbstractGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public int outDegree(N n) {
            return delegate().inDegree(n);
        }

        @Override // com.google.common.graph.p, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n) {
            return delegate().successors((Object) n);
        }

        @Override // com.google.common.graph.p, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n) {
            return delegate().predecessors((Object) n);
        }
    }

    public static class c<N, E> extends q<N, E> {
        private final Network<N, E> a;

        public c(Network<N, E> network) {
            this.a = network;
        }

        @Override // com.google.common.graph.q
        public Network<N, E> c() {
            return this.a;
        }

        @Override // com.google.common.graph.q, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(N n, N n2) {
            return c().edgeConnectingOrNull(n2, n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(N n, N n2) {
            return c().edgesConnecting(n2, n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N n, N n2) {
            return c().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N n) {
            return c().outDegree(n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.Network
        public Set<E> inEdges(N n) {
            return c().outEdges(n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.Network
        public EndpointPair<N> incidentNodes(E e) {
            EndpointPair<N> endpointPairIncidentNodes = c().incidentNodes(e);
            return EndpointPair.b(this.a, endpointPairIncidentNodes.nodeV(), endpointPairIncidentNodes.nodeU());
        }

        @Override // com.google.common.graph.q, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N n) {
            return c().inDegree(n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.Network
        public Set<E> outEdges(N n) {
            return c().inEdges(n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n) {
            return c().successors((Object) n);
        }

        @Override // com.google.common.graph.q, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n) {
            return c().predecessors((Object) n);
        }
    }

    public static class d<N, V> extends r<N, V> {
        private final ValueGraph<N, V> a;

        public d(ValueGraph<N, V> valueGraph) {
            this.a = valueGraph;
        }

        @Override // com.google.common.graph.r
        public ValueGraph<N, V> b() {
            return this.a;
        }

        @Override // com.google.common.graph.r, com.google.common.graph.ValueGraph
        @NullableDecl
        public V edgeValueOrDefault(N n, N n2, @NullableDecl V v) {
            return b().edgeValueOrDefault(n2, n, v);
        }

        @Override // com.google.common.graph.r, com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(N n, N n2) {
            return b().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.r, com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public int inDegree(N n) {
            return b().outDegree(n);
        }

        @Override // com.google.common.graph.r, com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
        public int outDegree(N n) {
            return b().inDegree(n);
        }

        @Override // com.google.common.graph.r, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n) {
            return b().successors((Object) n);
        }

        @Override // com.google.common.graph.r, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n) {
            return b().predecessors((Object) n);
        }
    }

    private Graphs() {
    }

    private static boolean a(Graph<?> graph, Object obj, @NullableDecl Object obj2) {
        return graph.isDirected() || !Objects.equal(obj2, obj);
    }

    @CanIgnoreReturnValue
    public static int b(int i) {
        Preconditions.checkArgument(i >= 0, "Not true that %s is non-negative.", i);
        return i;
    }

    @CanIgnoreReturnValue
    public static long c(long j) {
        Preconditions.checkArgument(j >= 0, "Not true that %s is non-negative.", j);
        return j;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        Iterator<N> it2 = graph.nodes().iterator();
        while (it2.hasNext()) {
            mutableGraph.addNode(it2.next());
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    @CanIgnoreReturnValue
    public static int d(int i) {
        Preconditions.checkArgument(i > 0, "Not true that %s is positive.", i);
        return i;
    }

    @CanIgnoreReturnValue
    public static long e(long j) {
        Preconditions.checkArgument(j > 0, "Not true that %s is positive.", j);
        return j;
    }

    private static <N> boolean f(Graph<N> graph, Map<Object, a> map, N n, @NullableDecl N n2) {
        a aVar = map.get(n);
        if (aVar == a.COMPLETE) {
            return false;
        }
        a aVar2 = a.PENDING;
        if (aVar == aVar2) {
            return true;
        }
        map.put(n, aVar2);
        for (N n3 : graph.successors((Object) n)) {
            if (a(graph, n3, n2) && f(graph, map, n3, n)) {
                return true;
            }
        }
        map.put(n, a.COMPLETE);
        return false;
    }

    public static <N> boolean hasCycle(Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(graph.nodes().size());
        Iterator<N> it2 = graph.nodes().iterator();
        while (it2.hasNext()) {
            if (f(graph, mapNewHashMapWithExpectedSize, it2.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        f fVar = iterable instanceof Collection ? (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build() : (MutableGraph<N>) GraphBuilder.from(graph).build();
        Iterator<? extends N> it2 = iterable.iterator();
        while (it2.hasNext()) {
            fVar.addNode(it2.next());
        }
        for (N n : fVar.nodes()) {
            for (N n2 : graph.successors((Object) n)) {
                if (fVar.nodes().contains(n2)) {
                    fVar.putEdge(n, n2);
                }
            }
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> Set<N> reachableNodes(Graph<N> graph, N n) {
        Preconditions.checkArgument(graph.nodes().contains(n), t.f, n);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        linkedHashSet.add(n);
        arrayDeque.add(n);
        while (!arrayDeque.isEmpty()) {
            for (Object obj : graph.successors(arrayDeque.remove())) {
                if (linkedHashSet.add(obj)) {
                    arrayDeque.add(obj);
                }
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> Graph<N> transitiveClosure(Graph<N> graph) {
        f fVarBuild = GraphBuilder.from(graph).allowsSelfLoops(true).build();
        if (graph.isDirected()) {
            for (N n : graph.nodes()) {
                Iterator it2 = reachableNodes(graph, n).iterator();
                while (it2.hasNext()) {
                    fVarBuild.putEdge(n, it2.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n2 : graph.nodes()) {
                if (!hashSet.contains(n2)) {
                    Set setReachableNodes = reachableNodes(graph, n2);
                    hashSet.addAll(setReachableNodes);
                    int i = 1;
                    for (Object obj : setReachableNodes) {
                        int i2 = i + 1;
                        Iterator it3 = Iterables.limit(setReachableNodes, i).iterator();
                        while (it3.hasNext()) {
                            fVarBuild.putEdge(obj, it3.next());
                        }
                        i = i2;
                    }
                }
            }
        }
        return fVarBuild;
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        if (graph.isDirected()) {
            return graph instanceof b ? ((b) graph).a : new b(graph);
        }
        return graph;
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (!valueGraph.isDirected()) {
            return valueGraph;
        }
        if (valueGraph instanceof d) {
            return ((d) valueGraph).a;
        }
        return new d(valueGraph);
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        Iterator<N> it2 = valueGraph.nodes().iterator();
        while (it2.hasNext()) {
            mutableValueGraph.addNode(it2.next());
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            mutableValueGraph.putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null));
        }
        return mutableValueGraph;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (network instanceof c) {
            return ((c) network).a;
        }
        return new c(network);
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        h hVar;
        if (iterable instanceof Collection) {
            hVar = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            hVar = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).build();
        }
        Iterator<? extends N> it2 = iterable.iterator();
        while (it2.hasNext()) {
            hVar.addNode(it2.next());
        }
        for (N n : hVar.nodes()) {
            for (N n2 : valueGraph.successors((Object) n)) {
                if (hVar.nodes().contains(n2)) {
                    hVar.putEdgeValue(n, n2, valueGraph.edgeValueOrDefault(n, n2, null));
                }
            }
        }
        return hVar;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        Iterator<N> it2 = network.nodes().iterator();
        while (it2.hasNext()) {
            mutableNetwork.addNode(it2.next());
        }
        for (E e : network.edges()) {
            EndpointPair<N> endpointPairIncidentNodes = network.incidentNodes(e);
            mutableNetwork.addEdge(endpointPairIncidentNodes.nodeU(), endpointPairIncidentNodes.nodeV(), e);
        }
        return mutableNetwork;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        g gVar;
        if (iterable instanceof Collection) {
            gVar = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            gVar = (MutableNetwork<N, E>) NetworkBuilder.from(network).build();
        }
        Iterator<? extends N> it2 = iterable.iterator();
        while (it2.hasNext()) {
            gVar.addNode(it2.next());
        }
        for (E e : gVar.nodes()) {
            for (E e2 : network.outEdges(e)) {
                N nAdjacentNode = network.incidentNodes(e2).adjacentNode(e);
                if (gVar.nodes().contains(nAdjacentNode)) {
                    gVar.addEdge(e, nAdjacentNode, e2);
                }
            }
        }
        return gVar;
    }
}
