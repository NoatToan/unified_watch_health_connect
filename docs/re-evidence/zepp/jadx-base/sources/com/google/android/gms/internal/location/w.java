package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes3.dex */
final class w extends g0 {
    public final /* synthetic */ LocationCallback s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zzz zzzVar, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.s = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzH(ListenerHolders.createListenerKey(this.s, LocationCallback.class.getSimpleName()), new h0(this));
    }
}
