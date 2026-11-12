package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: loaded from: classes3.dex */
final class d extends zzaj {
    private final /* synthetic */ c b;

    public d(c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zza(ProxyResponse proxyResponse) {
        this.b.setResult(new g(proxyResponse));
    }
}
