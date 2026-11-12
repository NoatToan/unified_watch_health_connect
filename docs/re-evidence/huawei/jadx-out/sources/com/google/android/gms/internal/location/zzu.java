package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes21.dex */
final class zzu extends zzab {
    private final /* synthetic */ Location zzco;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzco);
        setResult(Status.RESULT_SUCCESS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzq zzqVar, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.zzco = location;
    }
}
