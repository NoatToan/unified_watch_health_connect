package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
final class zabc extends zabr {
    private WeakReference<zaaw> zahl;

    public zabc(zaaw zaawVar) {
        this.zahl = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zas() {
        zaaw zaawVar = this.zahl.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.resume();
    }
}
