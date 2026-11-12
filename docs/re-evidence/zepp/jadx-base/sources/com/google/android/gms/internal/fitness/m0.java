package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataUpdateRequest;

/* JADX INFO: loaded from: classes3.dex */
final class m0 extends f {
    private final /* synthetic */ DataUpdateRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(zzde zzdeVar, GoogleApiClient googleApiClient, DataUpdateRequest dataUpdateRequest) {
        super(googleApiClient);
        this.s = dataUpdateRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbu) ((zzad) anyClient).getService()).zza(new DataUpdateRequest(this.s, new zzei(this)));
    }
}
