package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class s extends u {
    public final /* synthetic */ long s;
    public final /* synthetic */ PendingIntent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zzg zzgVar, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = j;
        this.t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzq(this.s, this.t);
        setResult(Status.RESULT_SUCCESS);
    }
}
