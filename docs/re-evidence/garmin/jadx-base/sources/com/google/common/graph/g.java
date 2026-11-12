package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53550b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f53549a = i14;
        this.f53550b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53549a) {
            case 0:
                return ((AbstractNetwork.AnonymousClass1.C11481) this.f53550b).lambda$iterator$0(obj);
            case 1:
                return ((Graphs.TransposedGraph.AnonymousClass1) this.f53550b).lambda$iterator$0((EndpointPair) obj);
            default:
                return AbstractValueGraph.lambda$edgeValueMap$0((ValueGraph) this.f53550b, (EndpointPair) obj);
        }
    }
}
