package com.google.android.gms.common.api.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @CanIgnoreReturnValue
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zac(runnable);
            return this;
        }
        h.z("The target activity has already been GC'd");
        return null;
    }
}
