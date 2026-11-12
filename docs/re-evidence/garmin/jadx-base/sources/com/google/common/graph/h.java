package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class h implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53552b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f53551a = i14;
        this.f53552b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53551a) {
            case 0:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$0(this.f53552b, obj);
            case 1:
                return EndpointPair.ordered(this.f53552b, obj);
            case 2:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$2(this.f53552b, (DirectedGraphConnections.NodeConnection) obj);
            default:
                return EndpointPair.unordered(this.f53552b, obj);
        }
    }
}
