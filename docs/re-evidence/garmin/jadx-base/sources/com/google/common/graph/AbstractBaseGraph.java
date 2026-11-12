package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    public class AnonymousClass2 extends IncidentEdgeSet<N> {
        public AnonymousClass2(BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
            return EndpointPair.ordered(obj, this.node);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$1(Object obj) {
            return EndpointPair.ordered(this.node, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$2(Object obj) {
            return EndpointPair.unordered(this.node, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            boolean zIsDirected = this.graph.isDirected();
            BaseGraph<N> baseGraph = this.graph;
            N n14 = this.node;
            if (!zIsDirected) {
                Iterator<N> it = baseGraph.adjacentNodes(n14).iterator();
                final int i14 = 2;
                return Iterators.unmodifiableIterator(Iterators.transform(it, new Function(this) { // from class: com.google.common.graph.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f53543b;

                    {
                        this.f53543b = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        switch (i14) {
                            case 0:
                                return this.f53543b.lambda$iterator$0(obj);
                            case 1:
                                return this.f53543b.lambda$iterator$1(obj);
                            default:
                                return this.f53543b.lambda$iterator$2(obj);
                        }
                    }
                }));
            }
            Iterator<N> it3 = baseGraph.predecessors((Object) n14).iterator();
            final int i15 = 0;
            final int i16 = 1;
            return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(it3, new Function(this) { // from class: com.google.common.graph.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f53543b;

                {
                    this.f53543b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    switch (i15) {
                        case 0:
                            return this.f53543b.lambda$iterator$0(obj);
                        case 1:
                            return this.f53543b.lambda$iterator$1(obj);
                        default:
                            return this.f53543b.lambda$iterator$2(obj);
                    }
                }
            }), Iterators.transform(Sets.difference(this.graph.successors((Object) this.node), ImmutableSet.of(this.node)).iterator(), new Function(this) { // from class: com.google.common.graph.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f53543b;

                {
                    this.f53543b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    switch (i16) {
                        case 0:
                            return this.f53543b.lambda$iterator$0(obj);
                        case 1:
                            return this.f53543b.lambda$iterator$1(obj);
                        default:
                            return this.f53543b.lambda$iterator$2(obj);
                    }
                }
            })));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodeInvalidatableSet$0(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodeInvalidatableSet$1(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodePairInvalidatableSet$2(Object obj, Object obj2) {
        return Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodePairInvalidatableSet$3(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n14) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n14).size(), successors((Object) n14).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n14);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n14)) ? 1 : 0);
    }

    public long edgeCount() {
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n14) {
        return isDirected() ? predecessors((Object) n14).size() : degree(n14);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n14) {
        Preconditions.checkNotNull(n14);
        Preconditions.checkArgument(nodes().contains(n14), "Node %s is not an element of this graph.", n14);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new AnonymousClass2(this, n14), n14);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, N n14) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new b(this, n14), (Supplier<String>) new c(n14, 0));
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, N n14, N n15) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new a(this, 0, n14, n15), (Supplier<String>) new b(0, n14, n15));
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n14) {
        return isDirected() ? successors((Object) n14).size() : degree(n14);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n14, N n15) {
        Preconditions.checkNotNull(n14);
        Preconditions.checkNotNull(n15);
        return nodes().contains(n14) && successors((Object) n14).contains(n15);
    }
}
