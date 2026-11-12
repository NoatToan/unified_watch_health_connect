package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends k {
    private final /* synthetic */ DataSource s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zzdo zzdoVar, GoogleApiClient googleApiClient, DataSource dataSource) {
        super(googleApiClient);
        this.s = dataSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbw) ((zzaj) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbm((DataType) null, this.s, (zzcn) new zzei(this)));
    }
}
