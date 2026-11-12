package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class i extends AccountTransferClient.c {
    private final /* synthetic */ zzab f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AccountTransferClient accountTransferClient, zzab zzabVar) {
        super(null);
        this.f = zzabVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.b
    public final void c(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.e, this.f);
    }
}
