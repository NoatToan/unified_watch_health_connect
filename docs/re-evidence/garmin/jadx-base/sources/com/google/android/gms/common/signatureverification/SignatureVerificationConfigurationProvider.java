package com.google.android.gms.common.signatureverification;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public class SignatureVerificationConfigurationProvider {
    private static final SignatureVerificationConfiguration zza = zzd.zzc();

    private SignatureVerificationConfigurationProvider() {
    }

    public static SignatureVerificationConfiguration zza() {
        return zza;
    }
}
