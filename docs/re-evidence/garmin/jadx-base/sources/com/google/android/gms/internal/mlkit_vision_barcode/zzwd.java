package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class zzwd extends zzwh {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzwd(String str, boolean z14, int i14, zzwc zzwcVar) {
        this.zza = str;
        this.zzb = z14;
        this.zzc = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzwh) {
            zzwh zzwhVar = (zzwh) obj;
            if (this.zza.equals(zzwhVar.zzb()) && this.zzb == zzwhVar.zzc() && this.zzc == zzwhVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb3.append(this.zza);
        sb3.append(", enableFirelog=");
        sb3.append(this.zzb);
        sb3.append(", firelogEventType=");
        return j.q(sb3, this.zzc, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final boolean zzc() {
        return this.zzb;
    }
}
