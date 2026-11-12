package com.google.android.gms.internal.mlkit_common;

import am.j;
import com.google.mlkit.common.sdkinternal.ModelType;
import fb1.c;
import hb.a;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzrx extends zzsj {
    private final zzmu zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzna zzf;
    private final int zzg;

    public /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z14, boolean z15, ModelType modelType, zzna zznaVar, int i14, zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z14;
        this.zzd = z15;
        this.zze = modelType;
        this.zzf = zznaVar;
        this.zzg = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        zzna zznaVar = this.zzf;
        ModelType modelType = this.zze;
        String string = this.zza.toString();
        String string2 = modelType.toString();
        String string3 = zznaVar.toString();
        StringBuilder sbL = a.l("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=");
        sbL.append(this.zzb);
        sbL.append(", shouldLogRoughDownloadTime=");
        sbL.append(this.zzc);
        sbL.append(", shouldLogExactDownloadTime=");
        c.w(", modelType=", string2, ", downloadStatus=", sbL, this.zzd);
        sbL.append(string3);
        sbL.append(", failureStatusCode=");
        return j.q(sbL, this.zzg, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }
}
