package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class c extends zzc {
    private final /* synthetic */ a b;

    public c(a aVar) {
        this.b = aVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzc(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            zzq.zzd(this.b.s).zzc(this.b.t, googleSignInAccount);
        }
        this.b.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
