package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.zzaw;

/* JADX INFO: loaded from: classes3.dex */
final class f1 extends u {
    private final /* synthetic */ PendingIntent s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(zzeb zzebVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzca) ((zzav) anyClient).getService()).zza(new zzaw(this.s, (zzcn) new zzei(this)));
    }
}
