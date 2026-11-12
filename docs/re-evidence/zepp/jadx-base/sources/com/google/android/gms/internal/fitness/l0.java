package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class l0 extends f {
    private final /* synthetic */ DataUpdateListenerRegistrationRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(zzde zzdeVar, GoogleApiClient googleApiClient, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        super(googleApiClient);
        this.s = dataUpdateListenerRegistrationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbu) ((zzad) anyClient).getService()).zza(new DataUpdateListenerRegistrationRequest(this.s, new zzei(this)));
    }
}
