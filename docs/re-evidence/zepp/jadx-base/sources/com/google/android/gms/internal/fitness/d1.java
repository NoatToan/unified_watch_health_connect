package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionInsertRequest;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends u {
    private final /* synthetic */ SessionInsertRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(zzeb zzebVar, GoogleApiClient googleApiClient, SessionInsertRequest sessionInsertRequest) {
        super(googleApiClient);
        this.s = sessionInsertRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzca) ((zzav) anyClient).getService()).zza(new SessionInsertRequest(this.s, new zzei(this)));
    }
}
