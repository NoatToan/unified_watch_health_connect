package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class h extends com.google.android.gms.signin.internal.zab {
    private final WeakReference<zaaf> b;

    public h(zaaf zaafVar) {
        this.b = new WeakReference<>(zaafVar);
    }

    @Override // com.google.android.gms.signin.internal.zab, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zaa(zak zakVar) {
        zaaf zaafVar = this.b.get();
        if (zaafVar == null) {
            return;
        }
        zaafVar.a.c(new k(this, zaafVar, zaafVar, zakVar));
    }
}
