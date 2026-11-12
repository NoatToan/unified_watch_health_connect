package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class d extends AccountTransferClient.b<byte[]> {
    private final /* synthetic */ zzad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountTransferClient accountTransferClient, zzad zzadVar) {
        super(null);
        this.e = zzadVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.b
    public final void c(zzz zzzVar) throws RemoteException {
        zzzVar.zza(new e(this, this), this.e);
    }
}
