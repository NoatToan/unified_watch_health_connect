package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class l extends m {
    private final /* synthetic */ k b;

    public l(k kVar) {
        this.b = kVar;
    }

    @Override // com.google.android.gms.internal.auth.m, com.google.android.gms.auth.account.zza
    public final void zza(boolean z) {
        this.b.setResult(new p(z ? Status.RESULT_SUCCESS : zzh.a));
    }
}
