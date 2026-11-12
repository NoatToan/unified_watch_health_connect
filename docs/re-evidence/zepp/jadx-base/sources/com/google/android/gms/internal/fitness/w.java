package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes3.dex */
final class w extends t5 {
    private final /* synthetic */ com.google.android.gms.fitness.request.zzad s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zzco zzcoVar, GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.zzad zzadVar) {
        super(googleApiClient);
        this.s = zzadVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbo) ((zzk) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbg(this.s, new zzei(this)));
    }
}
