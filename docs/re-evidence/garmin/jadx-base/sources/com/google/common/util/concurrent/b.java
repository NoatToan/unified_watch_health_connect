package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractService f53597b;

    public /* synthetic */ b(AbstractService abstractService, int i14) {
        this.f53596a = i14;
        this.f53597b = abstractService;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53596a) {
            case 0:
                return ((AbstractExecutionThreadService.AnonymousClass1) this.f53597b).lambda$doStart$0();
            default:
                return ((AbstractScheduledService.ServiceDelegate) this.f53597b).lambda$doStart$0();
        }
    }
}
