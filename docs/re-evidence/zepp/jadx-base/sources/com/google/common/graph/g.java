package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
final class g<N, E> extends i<N, E> implements MutableNetwork<N, E> {
    public g(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private x<N, E> c(N n) {
        x<N, E> xVarD = d();
        Preconditions.checkState(this.nodeConnections.i(n, xVarD) == null);
        return xVarD;
    }

    private x<N, E> d() {
        if (isDirected()) {
            return allowsParallelEdges() ? l.p() : m.n();
        }
        return allowsParallelEdges() ? z.p() : a0.m();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n, N n2, E e) {
        Preconditions.checkNotNull(n, "nodeU");
        Preconditions.checkNotNull(n2, "nodeV");
        Preconditions.checkNotNull(e, "edge");
        if (containsEdge(e)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e);
            EndpointPair endpointPairB = EndpointPair.b(this, n, n2);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairB), t.h, e, endpointPairIncidentNodes, endpointPairB);
            return false;
        }
        x<N, E> xVarF = this.nodeConnections.f(n);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(xVarF == null || !xVarF.b().contains(n2), t.j, n, n2);
        }
        boolean zEquals = n.equals(n2);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, t.k, n);
        }
        if (xVarF == null) {
            xVarF = c(n);
        }
        xVarF.i(e, n2);
        x<N, E> xVarF2 = this.nodeConnections.f(n2);
        if (xVarF2 == null) {
            xVarF2 = c(n2);
        }
        xVarF2.j(e, n, zEquals);
        this.edgeToReferenceNode.i(e, n);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n) {
        Preconditions.checkNotNull(n, "node");
        if (containsNode(n)) {
            return false;
        }
        c(n);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e) {
        Preconditions.checkNotNull(e, "edge");
        N nF = this.edgeToReferenceNode.f(e);
        boolean z = false;
        if (nF == null) {
            return false;
        }
        x<N, E> xVarF = this.nodeConnections.f(nF);
        N nD = xVarF.d(e);
        x<N, E> xVarF2 = this.nodeConnections.f(nD);
        xVarF.f(e);
        if (allowsSelfLoops() && nF.equals(nD)) {
            z = true;
        }
        xVarF2.h(e, z);
        this.edgeToReferenceNode.j(e);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n) {
        Preconditions.checkNotNull(n, "node");
        x<N, E> xVarF = this.nodeConnections.f(n);
        if (xVarF == null) {
            return false;
        }
        UnmodifiableIterator<E> it2 = ImmutableList.copyOf((Collection) xVarF.k()).iterator();
        while (it2.hasNext()) {
            removeEdge(it2.next());
        }
        this.nodeConnections.j(n);
        return true;
    }
}
