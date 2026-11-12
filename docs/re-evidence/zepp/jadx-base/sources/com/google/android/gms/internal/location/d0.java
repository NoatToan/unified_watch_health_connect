package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends g0 {
    public final /* synthetic */ LocationRequest s;
    public final /* synthetic */ PendingIntent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.s = locationRequest;
        this.t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzE(this.s, this.t, new h0(this));
    }
}
