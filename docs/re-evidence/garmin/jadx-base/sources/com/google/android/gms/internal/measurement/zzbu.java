package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.v;
import com.google.maps.android.BuildConfig;
import org.apache.commons.text.StringSubstitutor;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbu(String str, boolean z14, int i14, zzbr zzbrVar, zzbs zzbsVar, int i15, byte[] bArr) {
        this.zzc = str;
        this.zzd = i14;
        this.zze = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i14 = this.zzd;
                int iZze = zzcaVar.zze();
                if (i14 == 0) {
                    throw null;
                }
                if (i14 == iZze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i15 = this.zze;
                    int iZzf = zzcaVar.zzf();
                    if (i15 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i14 = this.zzd;
        if (i14 == 0) {
            throw null;
        }
        int i15 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i14;
        if (this.zze != 0) {
            return (i15 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i14 = this.zzd;
        String str2 = BuildConfig.TRAVIS;
        if (i14 == 1) {
            str = "ALL_CHECKS";
        } else if (i14 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i14 != 3) {
            str = i14 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zze == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzc;
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + v.a(73, str3) + 91 + 1);
        sn.a.t(sb3, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return e0.h(sb3, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
