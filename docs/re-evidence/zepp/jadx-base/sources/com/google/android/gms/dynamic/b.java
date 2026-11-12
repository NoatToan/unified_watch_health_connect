package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class b implements DeferredLifecycleHelper.a {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ DeferredLifecycleHelper b;

    public b(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.b = deferredLifecycleHelper;
        this.a = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final void a(LifecycleDelegate lifecycleDelegate) {
        this.b.a.onCreate(this.a);
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final int zaa() {
        return 1;
    }
}
