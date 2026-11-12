package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class d implements f<Bundle> {
    private final /* synthetic */ Account a;

    public d(Account account) {
        this.a = account;
    }

    @Override // com.google.android.gms.auth.f
    public final /* synthetic */ Bundle a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle) zzd.d(zzf.zza(iBinder).zza(this.a));
    }
}
