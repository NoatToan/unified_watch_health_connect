package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class zzk extends zzg {
    private final /* synthetic */ zzj zzan;

    public zzk(zzj zzjVar) {
        this.zzan = zzjVar;
    }

    @Override // com.google.android.gms.internal.p001authapi.zzg, com.google.android.gms.internal.p001authapi.zzu
    public final void zzc(Status status, Credential credential) {
        this.zzan.setResult(new zzh(status, credential));
    }

    @Override // com.google.android.gms.internal.p001authapi.zzg, com.google.android.gms.internal.p001authapi.zzu
    public final void zzc(Status status) {
        this.zzan.setResult(zzh.zzd(status));
    }
}
