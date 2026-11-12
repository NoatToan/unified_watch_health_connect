package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes3.dex */
final class g implements DeferredLifecycleHelper.a {
    private final /* synthetic */ DeferredLifecycleHelper a;

    public g(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.a = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final void a(LifecycleDelegate lifecycleDelegate) {
        this.a.a.onStart();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final int zaa() {
        return 4;
    }
}
