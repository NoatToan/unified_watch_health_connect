package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class m extends zzh {
    private final /* synthetic */ k b;

    public m(k kVar) {
        this.b = kVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzc(Status status, Credential credential) {
        this.b.setResult(new zzg(status, credential));
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzd(Status status) {
        this.b.setResult(zzg.zzc(status));
    }
}
