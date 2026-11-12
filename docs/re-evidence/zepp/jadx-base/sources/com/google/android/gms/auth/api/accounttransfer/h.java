package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class h extends AccountTransferClient.c {
    private final /* synthetic */ zzah f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AccountTransferClient accountTransferClient, zzah zzahVar) {
        super(null);
        this.f = zzahVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.b
    public final void c(zzz zzzVar) throws RemoteException {
        zzzVar.zza(this.e, this.f);
    }
}
