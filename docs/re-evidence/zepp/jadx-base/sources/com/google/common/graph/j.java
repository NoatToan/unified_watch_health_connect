package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
class j<N, V> extends AbstractValueGraph<N, V> {
    private final boolean a;
    private final boolean b;
    private final ElementOrder<N> c;
    public long edgeCount;
    public final u<N, s<N, V>> nodeConnections;

    public j(c<? super N> cVar) {
        this(cVar, cVar.c.b(cVar.d.or(10).intValue()), 0L);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n) {
        return checkedConnections(n).a();
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.b;
    }

    public final s<N, V> checkedConnections(N n) {
        s<N, V> sVarF = this.nodeConnections.f(n);
        if (sVarF != null) {
            return sVarF;
        }
        Preconditions.checkNotNull(n);
        throw new IllegalArgumentException("Node " + n + " is not an element of this graph.");
    }

    public final boolean containsNode(@NullableDecl N n) {
        return this.nodeConnections.e(n);
    }

    @Override // com.google.common.graph.a
    public long edgeCount() {
        return this.edgeCount;
    }

    @NullableDecl
    public V edgeValueOrDefault(N n, N n2, @NullableDecl V v) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        s<N, V> sVarF = this.nodeConnections.f(n);
        V vE = sVarF == null ? null : sVarF.e(n2);
        return vE == null ? v : vE;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        s<N, V> sVarF = this.nodeConnections.f(n);
        return sVarF != null && sVarF.b().contains(n2);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.a;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return this.c;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<N> nodes() {
        return this.nodeConnections.k();
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n) {
        return checkedConnections(n).c();
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n) {
        return checkedConnections(n).b();
    }

    public j(c<? super N> cVar, Map<N, s<N, V>> map, long j) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = (ElementOrder<N>) cVar.c.a();
        this.nodeConnections = map instanceof TreeMap ? new v<>(map) : new u<>(map);
        this.edgeCount = Graphs.c(j);
    }
}
