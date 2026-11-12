package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
abstract class a<N> implements e<N> {

    /* JADX INFO: renamed from: com.google.common.graph.a$a, reason: collision with other inner class name */
    public class C0215a extends AbstractSet<EndpointPair<N>> {
        public C0215a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            return o.c(a.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return a.this.isDirected() == endpointPair.isOrdered() && a.this.nodes().contains(endpointPair.nodeU()) && a.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Ints.saturatedCast(a.this.edgeCount());
        }
    }

    public static abstract class b<N> extends AbstractSet<EndpointPair<N>> {
        public final N a;
        public final e<N> b;

        /* JADX INFO: renamed from: com.google.common.graph.a$b$a, reason: collision with other inner class name */
        public static final class C0216a<N> extends b<N> {

            /* JADX INFO: renamed from: com.google.common.graph.a$b$a$a, reason: collision with other inner class name */
            public class C0217a implements Function<N, EndpointPair<N>> {
                public C0217a() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EndpointPair<N> apply(N n) {
                    return EndpointPair.ordered(n, C0216a.this.a);
                }
            }

            /* JADX INFO: renamed from: com.google.common.graph.a$b$a$b, reason: collision with other inner class name */
            public class C0218b implements Function<N, EndpointPair<N>> {
                public C0218b() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EndpointPair<N> apply(N n) {
                    return EndpointPair.ordered(C0216a.this.a, n);
                }
            }

            public /* synthetic */ C0216a(e eVar, Object obj, C0215a c0215a) {
                this(eVar, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.b.predecessors((Object) this.a).iterator(), new C0217a()), Iterators.transform(Sets.difference(this.b.successors((Object) this.a), ImmutableSet.of(this.a)).iterator(), new C0218b())));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (!endpointPair.isOrdered()) {
                    return false;
                }
                Object objSource = endpointPair.source();
                Object objTarget = endpointPair.target();
                return (this.a.equals(objSource) && this.b.successors((Object) this.a).contains(objTarget)) || (this.a.equals(objTarget) && this.b.predecessors((Object) this.a).contains(objSource));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return (this.b.inDegree(this.a) + this.b.outDegree(this.a)) - (this.b.successors((Object) this.a).contains(this.a) ? 1 : 0);
            }

            private C0216a(e<N> eVar, N n) {
                super(eVar, n, null);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.a$b$b, reason: collision with other inner class name */
        public static final class C0219b<N> extends b<N> {

            /* JADX INFO: renamed from: com.google.common.graph.a$b$b$a, reason: collision with other inner class name */
            public class C0220a implements Function<N, EndpointPair<N>> {
                public C0220a() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EndpointPair<N> apply(N n) {
                    return EndpointPair.unordered(C0219b.this.a, n);
                }
            }

            public /* synthetic */ C0219b(e eVar, Object obj, C0215a c0215a) {
                this(eVar, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return Iterators.unmodifiableIterator(Iterators.transform(this.b.adjacentNodes(this.a).iterator(), new C0220a()));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (endpointPair.isOrdered()) {
                    return false;
                }
                Set<N> setAdjacentNodes = this.b.adjacentNodes(this.a);
                Object objNodeU = endpointPair.nodeU();
                Object objNodeV = endpointPair.nodeV();
                return (this.a.equals(objNodeV) && setAdjacentNodes.contains(objNodeU)) || (this.a.equals(objNodeU) && setAdjacentNodes.contains(objNodeV));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.b.adjacentNodes(this.a).size();
            }

            private C0219b(e<N> eVar, N n) {
                super(eVar, n, null);
            }
        }

        public /* synthetic */ b(e eVar, Object obj, C0215a c0215a) {
            this(eVar, obj);
        }

        public static <N> b<N> a(e<N> eVar, N n) {
            C0215a c0215a = null;
            return eVar.isDirected() ? new C0216a(eVar, n, c0215a) : new C0219b(eVar, n, c0215a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        private b(e<N> eVar, N n) {
            this.b = eVar;
            this.a = n;
        }
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public int degree(N n) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n).size(), successors((Object) n).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n)) ? 1 : 0);
    }

    public long edgeCount() {
        Iterator<N> it2 = nodes().iterator();
        long jDegree = 0;
        while (it2.hasNext()) {
            jDegree += (long) degree(it2.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<EndpointPair<N>> edges() {
        return new C0215a();
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((Object) n).contains(n2);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public int inDegree(N n) {
        return isDirected() ? predecessors((Object) n).size() : degree(n);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<EndpointPair<N>> incidentEdges(N n) {
        Preconditions.checkNotNull(n);
        Preconditions.checkArgument(nodes().contains(n), t.f, n);
        return b.a(this, n);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public int outDegree(N n) {
        return isDirected() ? successors((Object) n).size() : degree(n);
    }
}
