package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class c implements DeferredLifecycleHelper.a {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ DeferredLifecycleHelper d;

    public c(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = deferredLifecycleHelper;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final void a(LifecycleDelegate lifecycleDelegate) {
        this.d.a.onInflate(this.a, this.b, this.c);
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.a
    public final int zaa() {
        return 0;
    }
}
