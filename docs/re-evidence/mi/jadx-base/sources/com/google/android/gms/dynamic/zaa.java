package com.google.android.gms.dynamic;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zaa implements OnDelegateCreatedListener {
    private final /* synthetic */ DeferredLifecycleHelper zari;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zari = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        this.zari.zare = lifecycleDelegate;
        Iterator it = this.zari.zarg.iterator();
        while (it.hasNext()) {
            ((DeferredLifecycleHelper.zaa) it.next()).zaa(this.zari.zare);
        }
        this.zari.zarg.clear();
        DeferredLifecycleHelper.zaa(this.zari, (Bundle) null);
    }
}
