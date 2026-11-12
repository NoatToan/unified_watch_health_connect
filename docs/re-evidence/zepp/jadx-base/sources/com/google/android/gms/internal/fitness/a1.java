package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzv;
import com.google.android.gms.fitness.request.SensorRequest;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends p {
    private final /* synthetic */ SensorRequest s;
    private final /* synthetic */ zzv t;
    private final /* synthetic */ PendingIntent u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(zzdx zzdxVar, GoogleApiClient googleApiClient, SensorRequest sensorRequest, zzv zzvVar, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = sensorRequest;
        this.t = zzvVar;
        this.u = pendingIntent;
    }

    @Override // com.google.android.gms.internal.fitness.p, com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return createFailedResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzby) ((zzap) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzap(this.s, this.t, this.u, new zzei(this)));
    }

    @Override // com.google.android.gms.internal.fitness.p
    /* JADX INFO: renamed from: g */
    public final Status createFailedResult(Status status) {
        return status;
    }
}
