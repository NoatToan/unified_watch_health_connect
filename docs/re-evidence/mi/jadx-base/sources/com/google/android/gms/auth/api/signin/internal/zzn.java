package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class zzn extends zzc {
    private final /* synthetic */ zzm zzbm;

    public zzn(zzm zzmVar) {
        this.zzbm = zzmVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zzf(Status status) throws RemoteException {
        this.zzbm.setResult(status);
    }
}
