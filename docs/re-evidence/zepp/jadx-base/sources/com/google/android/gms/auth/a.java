package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a implements f<TokenData> {
    private final /* synthetic */ Account a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;

    public a(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    @Override // com.google.android.gms.auth.f
    public final /* synthetic */ TokenData a(IBinder iBinder) throws IOException, GoogleAuthException, RemoteException {
        Bundle bundle = (Bundle) zzd.d(zzf.zza(iBinder).zza(this.a, this.b, this.c));
        TokenData tokenDataZza = TokenData.zza(bundle, "tokenDetails");
        if (tokenDataZza != null) {
            return tokenDataZza;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzayVarZzc = zzay.zzc(string);
        if (!zzay.zza(zzayVarZzc)) {
            if (zzay.NETWORK_ERROR.equals(zzayVarZzc) || zzay.SERVICE_UNAVAILABLE.equals(zzayVarZzc) || zzay.INTNERNAL_ERROR.equals(zzayVarZzc)) {
                throw new IOException(string);
            }
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
