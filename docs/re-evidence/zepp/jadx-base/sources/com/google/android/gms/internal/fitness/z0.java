package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzv;
import com.google.android.gms.fitness.request.zzar;

/* JADX INFO: loaded from: classes3.dex */
final class z0 extends p {
    private final /* synthetic */ zzv s;
    private final /* synthetic */ PendingIntent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(zzdx zzdxVar, GoogleApiClient googleApiClient, zzv zzvVar, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = zzvVar;
        this.t = pendingIntent;
    }

    @Override // com.google.android.gms.internal.fitness.p, com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return createFailedResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzby) ((zzap) anyClient).getService()).zza(new zzar(this.s, this.t, new zzei(this)));
    }

    @Override // com.google.android.gms.internal.fitness.p
    /* JADX INFO: renamed from: g */
    public final Status createFailedResult(Status status) {
        return status;
    }
}
