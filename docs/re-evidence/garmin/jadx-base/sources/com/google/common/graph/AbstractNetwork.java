package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractGraph<N> {

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        public class C11481 extends AbstractSet<EndpointPair<N>> {
            public C11481() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
                return AbstractNetwork.this.incidentNodes(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AnonymousClass1.this.isOrderingCompatible(endpointPair) && AnonymousClass1.this.nodes().contains(endpointPair.nodeU()) && AnonymousClass1.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(AbstractNetwork.this.edges().iterator(), new g(this, 0));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractNetwork.this.edges().size();
            }
        }

        public AnonymousClass1() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n14) {
            return AbstractNetwork.this.adjacentNodes(n14);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
            return AbstractNetwork.this.allowsParallelEdges() ? super.edges() : new C11481();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
            return ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n14) {
            return AbstractNetwork.this.predecessors((Object) n14);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n14) {
            return AbstractNetwork.this.successors((Object) n14);
        }
    }

    private Predicate<E> connectedPredicate(final N n14, final N n15) {
        return new Predicate<E>(this) { // from class: com.google.common.graph.AbstractNetwork.2
            final /* synthetic */ AbstractNetwork this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.base.Predicate
            public boolean apply(E e4) {
                return this.this$0.incidentNodes(e4).adjacentNode(n14).equals(n15);
            }
        };
    }

    private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(Network<N, E> network) {
        return Maps.asMap(network.edges(), new f(network, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$edgeInvalidatableSet$0(Object obj) {
        return Boolean.valueOf(edges().contains(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$edgeInvalidatableSet$1(Object obj) {
        return String.format("Edge %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodeInvalidatableSet$2(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodeInvalidatableSet$3(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodePairInvalidatableSet$4(Object obj, Object obj2) {
        return Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodePairInvalidatableSet$5(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e4) {
        EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e4);
        return (Set<E>) edgeInvalidatableSet(Sets.difference(Sets.union(incidentEdges(endpointPairIncidentNodes.nodeU()), incidentEdges(endpointPairIncidentNodes.nodeV())), ImmutableSet.of((Object) e4)), e4);
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.graph.Network
    public int degree(N n14) {
        return isDirected() ? IntMath.saturatedAdd(inEdges(n14).size(), outEdges(n14).size()) : IntMath.saturatedAdd(incidentEdges(n14).size(), edgesConnecting(n14, n14).size());
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n14, N n15) {
        Set<E> setEdgesConnecting = edgesConnecting(n14, n15);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        org.apache.commons.lang3.e.s("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", new Object[]{n14, n15});
        return null;
    }

    public final <T> Set<T> edgeInvalidatableSet(Set<T> set, E e4) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new e(this, e4, 1), (Supplier<String>) new c(e4, 2));
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n14, N n15) {
        Set<E> setOutEdges = outEdges(n14);
        Set<E> setInEdges = inEdges(n15);
        return (Set<E>) nodePairInvalidatableSet(setOutEdges.size() <= setInEdges.size() ? Collections.unmodifiableSet(Sets.filter(setOutEdges, connectedPredicate(n14, n15))) : Collections.unmodifiableSet(Sets.filter(setInEdges, connectedPredicate(n15, n14))), n14, n15);
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(network));
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n14, N n15) {
        Preconditions.checkNotNull(n14);
        Preconditions.checkNotNull(n15);
        return nodes().contains(n14) && successors((Object) n14).contains(n15);
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n14) {
        return isDirected() ? inEdges(n14).size() : degree(n14);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, N n14) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new e(this, n14, 0), (Supplier<String>) new c(n14, 1));
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, N n14, N n15) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new a(this, 1, n14, n15), (Supplier<String>) new b(1, n14, n15));
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n14) {
        return isDirected() ? outEdges(n14).size() : degree(n14);
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeIncidentNodesMap(this);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
