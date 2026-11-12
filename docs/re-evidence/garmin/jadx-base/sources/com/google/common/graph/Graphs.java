package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class Graphs extends GraphsBridgeMethods {

    public static final class NodeAndRemainingSuccessors<N> {
        final N node;
        Queue<N> remainingSuccessors;

        public NodeAndRemainingSuccessors(N n14) {
            this.node = n14;
        }
    }

    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    private Graphs() {
    }

    private static boolean canTraverseWithoutReusingEdge(Graph<?> graph, Object obj, Object obj2) {
        return graph.isDirected() || !Objects.equal(obj2, obj);
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(long j8) {
        Preconditions.checkArgument(j8 >= 0, "Not true that %s is non-negative.", j8);
        return j8;
    }

    @CanIgnoreReturnValue
    public static long checkPositive(long j8) {
        Preconditions.checkArgument(j8 > 0, "Not true that %s is positive.", j8);
        return j8;
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        Iterator<N> it = valueGraph.nodes().iterator();
        while (it.hasNext()) {
            mutableValueGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            N nNodeU = endpointPair.nodeU();
            N nNodeV = endpointPair.nodeV();
            V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
            java.util.Objects.requireNonNull(vEdgeValueOrDefault);
            mutableValueGraph.putEdgeValue(nNodeU, nNodeV, vEdgeValueOrDefault);
        }
        return mutableValueGraph;
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
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (subgraphHasCycle(graph, mapNewHashMapWithExpectedSize, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        StandardMutableValueGraph standardMutableValueGraph = iterable instanceof Collection ? (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build() : (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).build();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableValueGraph.addNode(it.next());
        }
        for (N n14 : standardMutableValueGraph.nodes()) {
            for (N n15 : valueGraph.successors((Object) n14)) {
                if (standardMutableValueGraph.nodes().contains(n15)) {
                    V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(n14, n15, null);
                    java.util.Objects.requireNonNull(vEdgeValueOrDefault);
                    standardMutableValueGraph.putEdgeValue(n14, n15, vEdgeValueOrDefault);
                }
            }
        }
        return standardMutableValueGraph;
    }

    public static <N> ImmutableSet<N> reachableNodes(Graph<N> graph, N n14) {
        Preconditions.checkArgument(graph.nodes().contains(n14), "Node %s is not an element of this graph.", n14);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst(n14));
    }

    private static <N> boolean subgraphHasCycle(Graph<N> graph, Map<Object, NodeVisitState> map, N n14) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new NodeAndRemainingSuccessors(n14));
        while (!arrayDeque.isEmpty()) {
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors = (NodeAndRemainingSuccessors) arrayDeque.removeLast();
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors2 = (NodeAndRemainingSuccessors) arrayDeque.peekLast();
            arrayDeque.addLast(nodeAndRemainingSuccessors);
            N n15 = nodeAndRemainingSuccessors.node;
            N n16 = nodeAndRemainingSuccessors2 == null ? null : nodeAndRemainingSuccessors2.node;
            if (nodeAndRemainingSuccessors.remainingSuccessors == null) {
                NodeVisitState nodeVisitState = map.get(n15);
                if (nodeVisitState == NodeVisitState.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
                    if (nodeVisitState == nodeVisitState2) {
                        return true;
                    }
                    map.put(n15, nodeVisitState2);
                    nodeAndRemainingSuccessors.remainingSuccessors = new ArrayDeque(graph.successors((Object) n15));
                }
            }
            if (!nodeAndRemainingSuccessors.remainingSuccessors.isEmpty()) {
                N nRemove = nodeAndRemainingSuccessors.remainingSuccessors.remove();
                if (canTraverseWithoutReusingEdge(graph, nRemove, n16)) {
                    arrayDeque.addLast(new NodeAndRemainingSuccessors(nRemove));
                }
            }
            arrayDeque.removeLast();
            map.put(n15, NodeVisitState.COMPLETE);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> ImmutableGraph<N> transitiveClosure(Graph<N> graph) {
        ImmutableGraph.Builder<N1> builderImmutable = GraphBuilder.from(graph).allowsSelfLoops(true).immutable();
        if (graph.isDirected()) {
            for (N n14 : graph.nodes()) {
                UnmodifiableIterator it = reachableNodes((Graph) graph, (Object) n14).iterator();
                while (it.hasNext()) {
                    builderImmutable.putEdge(n14, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n15 : graph.nodes()) {
                if (!hashSet.contains(n15)) {
                    ImmutableSet immutableSetReachableNodes = reachableNodes((Graph) graph, (Object) n15);
                    hashSet.addAll(immutableSetReachableNodes);
                    int i14 = 1;
                    for (Object obj : immutableSetReachableNodes) {
                        int i15 = i14 + 1;
                        Iterator it3 = Iterables.limit(immutableSetReachableNodes, i14).iterator();
                        while (it3.hasNext()) {
                            builderImmutable.putEdge(obj, it3.next());
                        }
                        i14 = i15;
                    }
                }
            }
        }
        return builderImmutable.build();
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        if (graph.isDirected()) {
            return graph instanceof TransposedGraph ? ((TransposedGraph) graph).graph : new TransposedGraph(graph);
        }
        return graph;
    }

    public static class TransposedGraph<N> extends ForwardingGraph<N> {
        private final Graph<N> graph;

        /* JADX INFO: renamed from: com.google.common.graph.Graphs$TransposedGraph$1, reason: invalid class name */
        public class AnonymousClass1 extends IncidentEdgeSet<N> {
            public AnonymousClass1(BaseGraph baseGraph, Object obj) {
                super(baseGraph, obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ EndpointPair lambda$iterator$0(EndpointPair endpointPair) {
                return EndpointPair.of((Graph<?>) TransposedGraph.this.delegate(), endpointPair.nodeV(), endpointPair.nodeU());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(TransposedGraph.this.delegate().incidentEdges(this.node).iterator(), new g(this, 1));
            }
        }

        public TransposedGraph(Graph<N> graph) {
            this.graph = graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n14) {
            return delegate().outDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> incidentEdges(N n14) {
            return new AnonymousClass1(this, n14);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n14) {
            return delegate().inDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n14) {
            return delegate().successors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n14) {
            return delegate().predecessors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingGraph
        public Graph<N> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n14, N n15) {
            return delegate().hasEdgeConnecting(n15, n14);
        }
    }

    public static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {
        private final Network<N, E> network;

        public TransposedNetwork(Network<N, E> network) {
            this.network = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork
        public Network<N, E> delegate() {
            return this.network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
            return delegate().edgeConnectingOrNull(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
            return delegate().edgesConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N n14) {
            return delegate().outDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> inEdges(N n14) {
            return delegate().outEdges(n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public EndpointPair<N> incidentNodes(E e4) {
            EndpointPair<N> endpointPairIncidentNodes = delegate().incidentNodes(e4);
            return EndpointPair.of((Network<?, ?>) this.network, (Object) endpointPairIncidentNodes.nodeV(), (Object) endpointPairIncidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N n14) {
            return delegate().inDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> outEdges(N n14) {
            return delegate().inEdges(n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n14) {
            return delegate().successors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n14) {
            return delegate().predecessors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(N n14, N n15) {
            return delegate().edgeConnectingOrNull(n15, n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(N n14, N n15) {
            return delegate().edgesConnecting(n15, n14);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N n14, N n15) {
            return delegate().hasEdgeConnecting(n15, n14);
        }
    }

    public static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {
        private final ValueGraph<N, V> graph;

        public TransposedValueGraph(ValueGraph<N, V> valueGraph) {
            this.graph = valueGraph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        public ValueGraph<N, V> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v14) {
            return delegate().edgeValueOrDefault(Graphs.transpose(endpointPair), v14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n14) {
            return delegate().outDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n14) {
            return delegate().inDegree(n14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n14) {
            return delegate().successors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n14) {
            return delegate().predecessors((Object) n14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(N n14, N n15, V v14) {
            return delegate().edgeValueOrDefault(n15, n14, v14);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n14, N n15) {
            return delegate().hasEdgeConnecting(n15, n14);
        }
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(int i14) {
        Preconditions.checkArgument(i14 >= 0, "Not true that %s is non-negative.", i14);
        return i14;
    }

    @CanIgnoreReturnValue
    public static int checkPositive(int i14) {
        Preconditions.checkArgument(i14 > 0, "Not true that %s is positive.", i14);
        return i14;
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (!valueGraph.isDirected()) {
            return valueGraph;
        }
        if (valueGraph instanceof TransposedValueGraph) {
            return ((TransposedValueGraph) valueGraph).graph;
        }
        return new TransposedValueGraph(valueGraph);
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (network instanceof TransposedNetwork) {
            return ((TransposedNetwork) network).network;
        }
        return new TransposedNetwork(network);
    }

    public static <N> EndpointPair<N> transpose(EndpointPair<N> endpointPair) {
        return endpointPair.isOrdered() ? EndpointPair.ordered(endpointPair.target(), endpointPair.source()) : endpointPair;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            mutableGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        Iterator<N> it = network.nodes().iterator();
        while (it.hasNext()) {
            mutableNetwork.addNode(it.next());
        }
        for (E e4 : network.edges()) {
            EndpointPair<N> endpointPairIncidentNodes = network.incidentNodes(e4);
            mutableNetwork.addEdge(endpointPairIncidentNodes.nodeU(), endpointPairIncidentNodes.nodeV(), e4);
        }
        return mutableNetwork;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        StandardMutableGraph standardMutableGraph;
        if (iterable instanceof Collection) {
            standardMutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableGraph.addNode(it.next());
        }
        for (N n14 : standardMutableGraph.nodes()) {
            for (N n15 : graph.successors((Object) n14)) {
                if (standardMutableGraph.nodes().contains(n15)) {
                    standardMutableGraph.putEdge(n14, n15);
                }
            }
        }
        return standardMutableGraph;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        StandardMutableNetwork standardMutableNetwork;
        if (iterable instanceof Collection) {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableNetwork.addNode(it.next());
        }
        for (E e4 : standardMutableNetwork.nodes()) {
            for (E e14 : network.outEdges(e4)) {
                N nAdjacentNode = network.incidentNodes(e14).adjacentNode(e4);
                if (standardMutableNetwork.nodes().contains(nAdjacentNode)) {
                    standardMutableNetwork.addEdge(e4, nAdjacentNode, e14);
                }
            }
        }
        return standardMutableNetwork;
    }
}
