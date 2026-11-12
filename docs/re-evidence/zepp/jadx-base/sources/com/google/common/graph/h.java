package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class h<N, V> extends j<N, V> implements MutableValueGraph<N, V> {
    public h(c<? super N> cVar) {
        super(cVar);
    }

    @CanIgnoreReturnValue
    private s<N, V> b(N n) {
        s<N, V> sVarC = c();
        Preconditions.checkState(this.nodeConnections.i(n, sVarC) == null);
        return sVarC;
    }

    private s<N, V> c() {
        return isDirected() ? k.p() : y.i();
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean addNode(N n) {
        Preconditions.checkNotNull(n, "node");
        if (containsNode(n)) {
            return false;
        }
        b(n);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(N n, N n2, V v) {
        Preconditions.checkNotNull(n, "nodeU");
        Preconditions.checkNotNull(n2, "nodeV");
        Preconditions.checkNotNull(v, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n.equals(n2), t.k, n);
        }
        s<N, V> sVarF = this.nodeConnections.f(n);
        if (sVarF == null) {
            sVarF = b(n);
        }
        V vH = sVarF.h(n2, v);
        s<N, V> sVarF2 = this.nodeConnections.f(n2);
        if (sVarF2 == null) {
            sVarF2 = b(n2);
        }
        sVarF2.d(n, v);
        if (vH == null) {
            long j = this.edgeCount + 1;
            this.edgeCount = j;
            Graphs.e(j);
        }
        return vH;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(N n, N n2) {
        Preconditions.checkNotNull(n, "nodeU");
        Preconditions.checkNotNull(n2, "nodeV");
        s<N, V> sVarF = this.nodeConnections.f(n);
        s<N, V> sVarF2 = this.nodeConnections.f(n2);
        if (sVarF == null || sVarF2 == null) {
            return null;
        }
        V vF = sVarF.f(n2);
        if (vF != null) {
            sVarF2.g(n);
            long j = this.edgeCount - 1;
            this.edgeCount = j;
            Graphs.c(j);
        }
        return vF;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean removeNode(N n) {
        Preconditions.checkNotNull(n, "node");
        s<N, V> sVarF = this.nodeConnections.f(n);
        if (sVarF == null) {
            return false;
        }
        if (allowsSelfLoops() && sVarF.f(n) != null) {
            sVarF.g(n);
            this.edgeCount--;
        }
        Iterator<N> it2 = sVarF.b().iterator();
        while (it2.hasNext()) {
            this.nodeConnections.h(it2.next()).g(n);
            this.edgeCount--;
        }
        if (isDirected()) {
            Iterator<N> it3 = sVarF.c().iterator();
            while (it3.hasNext()) {
                Preconditions.checkState(this.nodeConnections.h(it3.next()).f(n) != null);
                this.edgeCount--;
            }
        }
        this.nodeConnections.j(n);
        Graphs.c(this.edgeCount);
        return true;
    }
}
