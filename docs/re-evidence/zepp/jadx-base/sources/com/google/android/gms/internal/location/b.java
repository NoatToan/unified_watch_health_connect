package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzbq;

/* JADX INFO: loaded from: classes3.dex */
final class b extends c {
    public final /* synthetic */ zzbq s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zzaf zzafVar, GoogleApiClient googleApiClient, zzbq zzbqVar) {
        super(googleApiClient);
        this.s = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzw(this.s, this);
    }
}
