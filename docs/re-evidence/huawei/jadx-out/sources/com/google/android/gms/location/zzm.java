package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes21.dex */
final class zzm extends TaskApiCall<zzaz, LocationAvailability> {
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<LocationAvailability> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzaz) anyClient).zza());
    }

    zzm(FusedLocationProviderClient fusedLocationProviderClient) {
    }
}
