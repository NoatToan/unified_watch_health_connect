package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class e implements f<Boolean> {
    private final /* synthetic */ String a;

    public e(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.auth.f
    public final /* synthetic */ Boolean a(IBinder iBinder) throws GoogleAuthException, RemoteException, IOException {
        Bundle bundle = (Bundle) zzd.d(zzf.zza(iBinder).zza(this.a));
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzayVarZzc = zzay.zzc(string);
        if (zzay.SUCCESS.equals(zzayVarZzc)) {
            return Boolean.TRUE;
        }
        if (!zzay.zza(zzayVarZzc)) {
            throw new GoogleAuthException(string);
        }
        Logger logger = zzd.c;
        String strValueOf = String.valueOf(zzayVarZzc);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(strValueOf);
        logger.w("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
