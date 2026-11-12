package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes14.dex */
final class zzav extends zzaj {
    private final /* synthetic */ zzau zzcg;

    public zzav(zzau zzauVar) {
        this.zzcg = zzauVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zzb(String str) {
        zzau zzauVar = this.zzcg;
        if (str != null) {
            zzauVar.setResult(new zzax(str));
        } else {
            zzauVar.setResult(zzaq.zzc(new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
