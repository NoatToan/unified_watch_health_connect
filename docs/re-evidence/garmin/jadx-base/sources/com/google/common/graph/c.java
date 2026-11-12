package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53541b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f53540a = i14;
        this.f53541b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53540a) {
            case 0:
                return AbstractBaseGraph.lambda$nodeInvalidatableSet$1(this.f53541b);
            case 1:
                return AbstractNetwork.lambda$nodeInvalidatableSet$3(this.f53541b);
            default:
                return AbstractNetwork.lambda$edgeInvalidatableSet$1(this.f53541b);
        }
    }
}
