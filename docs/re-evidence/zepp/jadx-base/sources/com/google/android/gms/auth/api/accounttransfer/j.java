package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class j extends com.google.android.gms.internal.auth.zzs {
    private final /* synthetic */ AccountTransferClient.c b;

    public j(AccountTransferClient.c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void onFailure(Status status) {
        this.b.b(status);
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zzd() {
        this.b.a(null);
    }
}
