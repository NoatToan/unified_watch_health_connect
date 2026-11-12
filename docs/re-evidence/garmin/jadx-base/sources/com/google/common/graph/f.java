package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f53548b;

    public /* synthetic */ f(Network network, int i14) {
        this.f53547a = i14;
        this.f53548b = network;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53547a) {
            case 0:
                return this.f53548b.incidentNodes(obj);
            case 1:
                return ImmutableNetwork.lambda$sourceNodeFn$0(this.f53548b, obj);
            default:
                return ImmutableNetwork.lambda$targetNodeFn$1(this.f53548b, obj);
        }
    }
}
