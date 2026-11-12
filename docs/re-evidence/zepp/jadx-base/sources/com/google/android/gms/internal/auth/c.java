package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes3.dex */
final class c extends a {
    private final /* synthetic */ ProxyRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zzar zzarVar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.s = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.a
    public final void g(Context context, zzan zzanVar) throws RemoteException {
        zzanVar.zza(new d(this), this.s);
    }
}
