package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class r extends zabm {
    private WeakReference<zaar> a;

    public r(zaar zaarVar) {
        this.a = new WeakReference<>(zaarVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabm
    public final void zaa() {
        zaar zaarVar = this.a.get();
        if (zaarVar == null) {
            return;
        }
        zaarVar.l();
    }
}
