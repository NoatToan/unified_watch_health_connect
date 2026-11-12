package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53539c;

    public /* synthetic */ b(AbstractBaseGraph abstractBaseGraph, Object obj) {
        this.f53537a = 2;
        this.f53539c = abstractBaseGraph;
        this.f53538b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53537a) {
            case 0:
                return AbstractBaseGraph.lambda$nodePairInvalidatableSet$3(this.f53538b, this.f53539c);
            case 1:
                return AbstractNetwork.lambda$nodePairInvalidatableSet$5(this.f53538b, this.f53539c);
            default:
                return ((AbstractBaseGraph) this.f53539c).lambda$nodeInvalidatableSet$0(this.f53538b);
        }
    }

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f53537a = i14;
        this.f53538b = obj;
        this.f53539c = obj2;
    }
}
