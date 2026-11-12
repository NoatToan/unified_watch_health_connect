package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class k extends p<CredentialRequestResult> {
    private final /* synthetic */ CredentialRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zzj zzjVar, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.s = credentialRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return zzg.zzc(status);
    }

    @Override // com.google.android.gms.internal.p000authapi.p
    public final void g(Context context, zzx zzxVar) throws RemoteException {
        zzxVar.zzc(new m(this), this.s);
    }
}
