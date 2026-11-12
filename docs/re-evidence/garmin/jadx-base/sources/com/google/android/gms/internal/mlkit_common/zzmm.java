package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes14.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i14) {
        this.zzd = i14;
    }

    public static zzmm zzb(int i14) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i14) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
