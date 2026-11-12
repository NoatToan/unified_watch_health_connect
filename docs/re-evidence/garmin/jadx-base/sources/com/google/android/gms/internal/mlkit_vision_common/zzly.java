package com.google.android.gms.internal.mlkit_vision_common;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzly extends zzmd {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zza(boolean z14) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zzb(int i14) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzmd zzc(String str) {
        this.zza = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzme zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzma(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb3.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb3.append(" firelogEventType");
        }
        h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }
}
