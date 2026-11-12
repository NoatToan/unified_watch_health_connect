package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
abstract class r<N, V> extends AbstractValueGraph<N, V> {
    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n) {
        return b().adjacentNodes(n);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return b().allowsSelfLoops();
    }

    public abstract ValueGraph<N, V> b();

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
    public int degree(N n) {
        return b().degree(n);
    }

    @Override // com.google.common.graph.a
    public long edgeCount() {
        return b().edges().size();
    }

    @NullableDecl
    public V edgeValueOrDefault(N n, N n2, @NullableDecl V v) {
        return b().edgeValueOrDefault(n, n2, v);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(N n, N n2) {
        return b().hasEdgeConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
    public int inDegree(N n) {
        return b().inDegree(n);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public boolean isDirected() {
        return b().isDirected();
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return b().nodeOrder();
    }

    @Override // com.google.common.graph.e, com.google.common.graph.Graph
    public Set<N> nodes() {
        return b().nodes();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.a, com.google.common.graph.e, com.google.common.graph.Graph
    public int outDegree(N n) {
        return b().outDegree(n);
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n) {
        return b().predecessors((Object) n);
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n) {
        return b().successors((Object) n);
    }
}
