package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class e extends zzc {
    private final /* synthetic */ b b;

    public e(b bVar) {
        this.b = bVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzr
    public final void zze(Status status) throws RemoteException {
        this.b.setResult(status);
    }
}
