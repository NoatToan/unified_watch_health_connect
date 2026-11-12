package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.zzai;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends s5<BleDevicesResult> {
    public a0(zzco zzcoVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return BleDevicesResult.zzb(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbo) ((zzk) anyClient).getService()).zza(new zzai((zzem) new c0(this, null)));
    }
}
