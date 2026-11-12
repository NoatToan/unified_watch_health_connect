package com.google.android.gms.common;

import com.garmin.proto.generated.a;

/* JADX INFO: loaded from: classes14.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i14, boolean z14, String str2, Throwable th3, com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z14;
        this.zzc = str2;
        this.zzd = th3;
    }

    public static PackageVerificationResult zza(String str, String str2, Throwable th3, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th3, null);
    }

    public static PackageVerificationResult zzd(String str, int i14, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i14, true, null, null, null);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th3 = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th3 != null) {
            throw new SecurityException(strConcat, th3);
        }
        a.h(strConcat);
    }
}
