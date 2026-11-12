package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes14.dex */
public enum zzls {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    zzls(int i14) {
        this.zzg = i14;
    }

    public static zzls zzb(int i14) {
        for (zzls zzlsVar : values()) {
            if (zzlsVar.zzg == i14) {
                return zzlsVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
