package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class c extends AccountTransferClient.c {
    private final /* synthetic */ zzaf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountTransferClient accountTransferClient, zzaf zzafVar) {
        super(null);
        this.f = zzafVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.b
    public final void c(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.e, this.f);
    }
}
