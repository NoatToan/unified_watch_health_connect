package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.zzay;

/* JADX INFO: loaded from: classes3.dex */
final class c1 extends u {
    private final /* synthetic */ Session s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(zzeb zzebVar, GoogleApiClient googleApiClient, Session session) {
        super(googleApiClient);
        this.s = session;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzca) ((zzav) anyClient).getService()).zza(new zzay(this.s, (zzcn) new zzei(this)));
    }
}
