package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes3.dex */
final class a extends c {
    public final /* synthetic */ GeofencingRequest s;
    public final /* synthetic */ PendingIntent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zzaf zzafVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = geofencingRequest;
        this.t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzv(this.s, this.t, this);
    }
}
