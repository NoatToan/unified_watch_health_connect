package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.DataTypeResult;

/* JADX INFO: loaded from: classes21.dex */
final class zzdd extends zzy<DataTypeResult> {
    private final /* synthetic */ String zzfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdd(zzdb zzdbVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zzfc = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbv) ((zzv) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzs(this.zzfc, (zzbn) new zzdf(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return DataTypeResult.zzc(status);
    }
}
