package com.google.android.gms.dynamic;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
final class a<T> implements OnDelegateCreatedListener<T> {
    private final /* synthetic */ DeferredLifecycleHelper a;

    public a(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.a = deferredLifecycleHelper;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        this.a.a = lifecycleDelegate;
        Iterator it2 = this.a.c.iterator();
        while (it2.hasNext()) {
            ((DeferredLifecycleHelper.a) it2.next()).a(this.a.a);
        }
        this.a.c.clear();
        DeferredLifecycleHelper.a(this.a, null);
    }
}
