package com.google.android.play.core.splitinstall;

import defpackage.ejt;
import defpackage.hjt;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public enum zzo implements ejt {
    INSTANCE;

    private static final AtomicReference zzb = new AtomicReference(null);

    @Override // defpackage.ejt
    public final hjt zza() {
        return (hjt) zzb.get();
    }

    public final void zzb(hjt hjtVar) {
        zzb.set(hjtVar);
    }
}
