package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Subscription;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends k {
    private final /* synthetic */ Subscription s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(zzdo zzdoVar, GoogleApiClient googleApiClient, Subscription subscription) {
        super(googleApiClient);
        this.s = subscription;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbw) ((zzaj) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbi(this.s, false, (zzcn) new zzei(this)));
    }
}
