package com.google.android.gms.internal.measurement;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzbt extends zzbz {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzbz zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzbz zzb(boolean z14) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzca zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzbu(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb3.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb3.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb3.append(" filePurpose");
        }
        h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzbz zzd(int i14) {
        this.zzc = i14;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzbz zze(int i14) {
        this.zzd = 1;
        return this;
    }
}
