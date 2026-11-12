package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes21.dex */
final class zzcy extends zzu {
    private final /* synthetic */ String a_;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzct zzctVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.a_ = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbt) ((zzp) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbl(this.a_, (zzcq) new zzen(this)));
    }
}
