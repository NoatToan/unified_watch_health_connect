package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.zzz;

/* JADX INFO: loaded from: classes3.dex */
final class g0 extends y5 {
    public g0(zzcw zzcwVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbq) ((zzq) anyClient).getService()).zza(new zzz((zzcn) new zzei(this)));
    }
}
