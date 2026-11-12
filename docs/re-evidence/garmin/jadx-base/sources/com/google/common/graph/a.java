package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53536d;

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f53533a = i14;
        this.f53536d = obj;
        this.f53534b = obj2;
        this.f53535c = obj3;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53533a) {
            case 0:
                return ((AbstractBaseGraph) this.f53536d).lambda$nodePairInvalidatableSet$2(this.f53534b, this.f53535c);
            default:
                return ((AbstractNetwork) this.f53536d).lambda$nodePairInvalidatableSet$4(this.f53534b, this.f53535c);
        }
    }
}
