package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;

/* JADX INFO: loaded from: classes3.dex */
final class k0 extends f {
    private final /* synthetic */ DataSet s;
    private final /* synthetic */ boolean t = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zzde zzdeVar, GoogleApiClient googleApiClient, DataSet dataSet, boolean z) {
        super(googleApiClient);
        this.s = dataSet;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbu) ((zzad) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzj(this.s, (zzcn) new zzei(this), false));
    }
}
