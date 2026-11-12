package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes14.dex */
public final class zzmw {
    private static zzmw zza;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        try {
            if (zza == null) {
                zza = new zzmw();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
