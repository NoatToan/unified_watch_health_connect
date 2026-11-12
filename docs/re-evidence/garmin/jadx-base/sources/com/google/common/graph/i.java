package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class i implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53555c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f53553a = i14;
        this.f53555c = obj;
        this.f53554b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53553a) {
            case 0:
                return ImmutableNetwork.lambda$adjacentNodeFn$2((Network) this.f53555c, this.f53554b, obj);
            default:
                return ImmutableValueGraph.lambda$connectionsOf$0((ValueGraph) this.f53555c, this.f53554b, obj);
        }
    }
}
