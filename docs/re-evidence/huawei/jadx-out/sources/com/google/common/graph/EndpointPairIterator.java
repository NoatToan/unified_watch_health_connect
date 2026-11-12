package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    private final BaseGraph<N> graph;

    @CheckForNull
    N node;
    private final Iterator<N> nodeIterator;
    Iterator<N> successorIterator;

    static <N> EndpointPairIterator<N> of(BaseGraph<N> baseGraph) {
        return baseGraph.isDirected() ? new c(baseGraph) : new a(baseGraph);
    }

    private EndpointPairIterator(BaseGraph<N> baseGraph) {
        this.node = null;
        this.successorIterator = ImmutableSet.of().iterator();
        this.graph = baseGraph;
        this.nodeIterator = baseGraph.nodes().iterator();
    }

    final boolean advance() {
        Preconditions.checkState(!this.successorIterator.hasNext());
        if (!this.nodeIterator.hasNext()) {
            return false;
        }
        N next = this.nodeIterator.next();
        this.node = next;
        this.successorIterator = this.graph.successors((Object) next).iterator();
        return true;
    }

    static final class c<N> extends EndpointPairIterator<N> {
        private c(BaseGraph<N> baseGraph) {
            super(baseGraph);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public EndpointPair<N> computeNext() {
            while (!this.successorIterator.hasNext()) {
                if (!advance()) {
                    return endOfData();
                }
            }
            return EndpointPair.ordered(Objects.requireNonNull(this.node), this.successorIterator.next());
        }
    }

    static final class a<N> extends EndpointPairIterator<N> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private Set<N> f4551c;

        private a(BaseGraph<N> baseGraph) {
            super(baseGraph);
            this.f4551c = Sets.a(baseGraph.nodes().size() + 1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EndpointPair<N> computeNext() {
            do {
                Objects.requireNonNull(this.f4551c);
                while (this.successorIterator.hasNext()) {
                    N next = this.successorIterator.next();
                    if (!this.f4551c.contains(next)) {
                        return EndpointPair.unordered(Objects.requireNonNull(this.node), next);
                    }
                }
                this.f4551c.add(this.node);
            } while (advance());
            this.f4551c = null;
            return endOfData();
        }
    }
}
