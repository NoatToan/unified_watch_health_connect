package com.google.android.gms.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes21.dex */
final class zzl extends TaskApiCall<zzaz, Location> {
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<Location> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzaz) anyClient).getLastLocation());
    }

    zzl(FusedLocationProviderClient fusedLocationProviderClient) {
    }
}
