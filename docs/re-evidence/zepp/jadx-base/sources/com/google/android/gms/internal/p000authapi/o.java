package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class o extends p<Status> {
    private final /* synthetic */ Credential s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zzj zzjVar, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.s = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.p
    public final void g(Context context, zzx zzxVar) throws RemoteException {
        zzxVar.zzc(new q(this), new zzt(this.s));
    }
}
