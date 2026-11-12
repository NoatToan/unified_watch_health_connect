package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class f extends zzaj {
    private final /* synthetic */ e b;

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zzb(String str) {
        if (str != null) {
            this.b.setResult(new zzax(str));
        } else {
            this.b.setResult(b.h(new Status(3006)));
        }
    }
}
