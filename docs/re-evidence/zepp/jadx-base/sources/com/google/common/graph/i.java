package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
class i<N, E> extends AbstractNetwork<N, E> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final ElementOrder<N> d;
    private final ElementOrder<E> e;
    public final u<E, N> edgeToReferenceNode;
    public final u<N, x<N, E>> nodeConnections;

    public i(NetworkBuilder<? super N, ? super E> networkBuilder) {
        this(networkBuilder, networkBuilder.c.b(networkBuilder.d.or(10).intValue()), networkBuilder.f.b(networkBuilder.g.or(20).intValue()));
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n) {
        return checkedConnections(n).a();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.b;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.c;
    }

    public final x<N, E> checkedConnections(N n) {
        x<N, E> xVarF = this.nodeConnections.f(n);
        if (xVarF != null) {
            return xVarF;
        }
        Preconditions.checkNotNull(n);
        throw new IllegalArgumentException(String.format(t.f, n));
    }

    public final N checkedReferenceNode(E e) {
        N nF = this.edgeToReferenceNode.f(e);
        if (nF != null) {
            return nF;
        }
        Preconditions.checkNotNull(e);
        throw new IllegalArgumentException(String.format(t.g, e));
    }

    public final boolean containsEdge(@NullableDecl E e) {
        return this.edgeToReferenceNode.e(e);
    }

    public final boolean containsNode(@NullableDecl N n) {
        return this.nodeConnections.e(n);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return this.e;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return this.edgeToReferenceNode.k();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
        x<N, E> xVarCheckedConnections = checkedConnections(n);
        if (!this.c && n == n2) {
            return ImmutableSet.of();
        }
        Preconditions.checkArgument(containsNode(n2), t.f, n2);
        return xVarCheckedConnections.l(n2);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n) {
        return checkedConnections(n).e();
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n) {
        return checkedConnections(n).k();
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e) {
        N nCheckedReferenceNode = checkedReferenceNode(e);
        return EndpointPair.b(this, nCheckedReferenceNode, this.nodeConnections.f(nCheckedReferenceNode).d(e));
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.a;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return this.d;
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return this.nodeConnections.k();
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n) {
        return checkedConnections(n).g();
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n) {
        return checkedConnections(n).c();
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n) {
        return checkedConnections(n).b();
    }

    public i(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, x<N, E>> map, Map<E, N> map2) {
        this.a = networkBuilder.a;
        this.b = networkBuilder.e;
        this.c = networkBuilder.b;
        this.d = (ElementOrder<N>) networkBuilder.c.a();
        this.e = (ElementOrder<E>) networkBuilder.f.a();
        this.nodeConnections = map instanceof TreeMap ? new v<>(map) : new u<>(map);
        this.edgeToReferenceNode = new u<>(map2);
    }
}
