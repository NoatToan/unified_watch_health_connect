package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractNetwork f53545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53546c;

    public /* synthetic */ e(AbstractNetwork abstractNetwork, Object obj, int i14) {
        this.f53544a = i14;
        this.f53545b = abstractNetwork;
        this.f53546c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53544a) {
            case 0:
                return this.f53545b.lambda$nodeInvalidatableSet$2(this.f53546c);
            default:
                return this.f53545b.lambda$edgeInvalidatableSet$0(this.f53546c);
        }
    }
}
