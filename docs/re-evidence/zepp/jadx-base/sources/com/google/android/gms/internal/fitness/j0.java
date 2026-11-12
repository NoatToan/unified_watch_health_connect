package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataDeleteRequest;

/* JADX INFO: loaded from: classes3.dex */
final class j0 extends f {
    private final /* synthetic */ DataDeleteRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zzde zzdeVar, GoogleApiClient googleApiClient, DataDeleteRequest dataDeleteRequest) {
        super(googleApiClient);
        this.s = dataDeleteRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbu) ((zzad) anyClient).getService()).zza(new DataDeleteRequest(this.s, new zzei(this)));
    }
}
