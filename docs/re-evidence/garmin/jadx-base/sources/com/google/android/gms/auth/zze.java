package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import java.io.IOException;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zze implements zzj<TokenData> {
    private final /* synthetic */ Bundle val$options;
    private final /* synthetic */ Account zzo;
    private final /* synthetic */ String zzp;

    public zze(Account account, String str, Bundle bundle) {
        this.zzo = account;
        this.zzp = str;
        this.val$options = bundle;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ TokenData zzb(IBinder iBinder) throws GoogleAuthException, IOException {
        Bundle bundle = (Bundle) zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzo, this.zzp, this.val$options));
        TokenData tokenDataZza = TokenData.zza(bundle, "tokenDetails");
        if (tokenDataZza != null) {
            return tokenDataZza;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzayVarZzc = zzay.zzc(string);
        if (!zzay.zza(zzayVarZzc)) {
            if (!zzay.NETWORK_ERROR.equals(zzayVarZzc) && !zzay.SERVICE_UNAVAILABLE.equals(zzayVarZzc) && !zzay.INTNERNAL_ERROR.equals(zzayVarZzc)) {
                throw new GoogleAuthException(string);
            }
            h.C(string);
            return null;
        }
        Logger logger = zzd.zzn;
        String strValueOf = String.valueOf(zzayVarZzc);
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 31);
        sb3.append("isUserRecoverableError status: ");
        sb3.append(strValueOf);
        logger.w("GoogleAuthUtil", sb3.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
