package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class j extends m {
    private final /* synthetic */ i b;

    public j(i iVar) {
        this.b = iVar;
    }

    @Override // com.google.android.gms.internal.auth.m, com.google.android.gms.auth.account.zza
    public final void zzc(Account account) {
        this.b.setResult(new n(account != null ? Status.RESULT_SUCCESS : zzh.a, account));
    }
}
