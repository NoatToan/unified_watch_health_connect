package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;

/* JADX INFO: loaded from: classes3.dex */
final class y extends t5 {
    private final /* synthetic */ BleDevice s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zzco zzcoVar, GoogleApiClient googleApiClient, BleDevice bleDevice) {
        super(googleApiClient);
        this.s = bleDevice;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbo) ((zzk) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzd(this.s.getAddress(), this.s, (zzcn) new zzei(this)));
    }
}
