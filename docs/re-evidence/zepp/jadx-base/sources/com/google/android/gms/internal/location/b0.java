package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends g0 {
    public final /* synthetic */ LocationRequest s;
    public final /* synthetic */ LocationListener t;
    public final /* synthetic */ Looper u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.s = locationRequest;
        this.t = locationListener;
        this.u = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzC(this.s, ListenerHolders.createListenerHolder(this.t, zzbj.zza(this.u), LocationListener.class.getSimpleName()), new h0(this));
    }
}
