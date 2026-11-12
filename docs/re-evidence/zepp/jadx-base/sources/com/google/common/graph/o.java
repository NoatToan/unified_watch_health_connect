package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class o<N> extends AbstractIterator<EndpointPair<N>> {
    private final e<N> c;
    private final Iterator<N> d;
    public N e;
    public Iterator<N> f;

    public static final class b<N> extends o<N> {
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EndpointPair<N> computeNext() {
            while (!this.f.hasNext()) {
                if (!b()) {
                    return endOfData();
                }
            }
            return EndpointPair.ordered(this.e, this.f.next());
        }

        private b(e<N> eVar) {
            super(eVar);
        }
    }

    public static final class c<N> extends o<N> {
        private Set<N> g;

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EndpointPair<N> computeNext() {
            while (true) {
                if (this.f.hasNext()) {
                    N next = this.f.next();
                    if (!this.g.contains(next)) {
                        return EndpointPair.unordered(this.e, next);
                    }
                } else {
                    this.g.add(this.e);
                    if (!b()) {
                        this.g = null;
                        return endOfData();
                    }
                }
            }
        }

        private c(e<N> eVar) {
            super(eVar);
            this.g = Sets.newHashSetWithExpectedSize(eVar.nodes().size());
        }
    }

    public static <N> o<N> c(e<N> eVar) {
        return eVar.isDirected() ? new b(eVar) : new c(eVar);
    }

    public final boolean b() {
        Preconditions.checkState(!this.f.hasNext());
        if (!this.d.hasNext()) {
            return false;
        }
        N next = this.d.next();
        this.e = next;
        this.f = this.c.successors((Object) next).iterator();
        return true;
    }

    private o(e<N> eVar) {
        this.e = null;
        this.f = ImmutableSet.of().iterator();
        this.c = eVar;
        this.d = eVar.nodes().iterator();
    }
}
