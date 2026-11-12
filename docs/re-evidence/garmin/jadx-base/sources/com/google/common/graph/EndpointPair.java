package com.google.common.graph;

import am.j;
import c22.t;
import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    public static final class Ordered<N> extends EndpointPair<N> {
        private Ordered(N n14, N n15) {
            super(n14, n15);
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("<");
            sb3.append(source());
            sb3.append(" -> ");
            return j.k(target(), ">", sb3);
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        private Unordered(N n14, N n15) {
            super(n14, n15);
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            return nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeV().hashCode() + nodeU().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return "[" + nodeU() + ", " + nodeV() + "]";
        }
    }

    private EndpointPair(N n14, N n15) {
        this.nodeU = (N) Preconditions.checkNotNull(n14);
        this.nodeV = (N) Preconditions.checkNotNull(n15);
    }

    public static <N> EndpointPair<N> of(Graph<?> graph, N n14, N n15) {
        return graph.isDirected() ? ordered(n14, n15) : unordered(n14, n15);
    }

    public static <N> EndpointPair<N> ordered(N n14, N n15) {
        return new Ordered(n14, n15);
    }

    public static <N> EndpointPair<N> unordered(N n14, N n15) {
        return new Unordered(n15, n14);
    }

    public final N adjacentNode(N n14) {
        boolean zEquals = n14.equals(this.nodeU);
        N n15 = this.nodeV;
        if (zEquals) {
            return n15;
        }
        if (n14.equals(n15)) {
            return this.nodeU;
        }
        t.i("EndpointPair ", this, " does not contain node ", n14);
        return null;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.nodeU, this.nodeV);
    }

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }

    public abstract N source();

    public abstract N target();

    public static <N> EndpointPair<N> of(Network<?, ?> network, N n14, N n15) {
        return network.isDirected() ? ordered(n14, n15) : unordered(n14, n15);
    }
}
