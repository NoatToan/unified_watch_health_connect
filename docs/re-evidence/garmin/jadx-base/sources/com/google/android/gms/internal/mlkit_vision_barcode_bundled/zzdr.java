package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
final class zzdr {
    private final Object zza;
    private final int zzb;

    public zzdr(Object obj, int i14) {
        this.zza = obj;
        this.zzb = i14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdr)) {
            return false;
        }
        zzdr zzdrVar = (zzdr) obj;
        return this.zza == zzdrVar.zza && this.zzb == zzdrVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
