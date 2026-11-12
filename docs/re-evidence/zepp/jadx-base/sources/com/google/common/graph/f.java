package com.google.common.graph;

/* JADX INFO: loaded from: classes3.dex */
final class f<N> extends p<N> implements MutableGraph<N> {
    private final MutableValueGraph<N, t.a> a;

    public f(c<? super N> cVar) {
        this.a = new h(cVar);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N n) {
        return this.a.addNode(n);
    }

    @Override // com.google.common.graph.p
    public e<N> delegate() {
        return this.a;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N n, N n2) {
        return this.a.putEdgeValue(n, n2, t.a.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N n, N n2) {
        return this.a.removeEdge(n, n2) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N n) {
        return this.a.removeNode(n);
    }
}
