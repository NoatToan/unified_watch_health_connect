package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends g0 {
    public final /* synthetic */ LocationRequest s;
    public final /* synthetic */ LocationListener t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.s = locationRequest;
        this.t = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzC(this.s, ListenerHolders.createListenerHolder(this.t, zzbj.zzb(), LocationListener.class.getSimpleName()), new h0(this));
    }
}
