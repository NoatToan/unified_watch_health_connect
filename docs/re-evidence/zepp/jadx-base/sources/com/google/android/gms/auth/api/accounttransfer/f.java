package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class f extends AccountTransferClient.b<DeviceMetaData> {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzv zzvVar) {
        super(null);
        this.e = zzvVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.b
    public final void c(zzz zzzVar) throws RemoteException {
        zzzVar.zza(new g(this, this), this.e);
    }
}
