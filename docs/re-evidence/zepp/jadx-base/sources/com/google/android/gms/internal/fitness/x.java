package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.StartBleScanRequest;

/* JADX INFO: loaded from: classes3.dex */
final class x extends t5 {
    private final /* synthetic */ StartBleScanRequest s;
    private final /* synthetic */ com.google.android.gms.fitness.request.zzad t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zzco zzcoVar, GoogleApiClient googleApiClient, StartBleScanRequest startBleScanRequest, com.google.android.gms.fitness.request.zzad zzadVar) {
        super(googleApiClient);
        this.s = startBleScanRequest;
        this.t = zzadVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbo) ((zzk) anyClient).getService()).zza(new StartBleScanRequest(this.s.getDataTypes(), this.t, this.s.getTimeoutSecs(), new zzei(this)));
    }
}
