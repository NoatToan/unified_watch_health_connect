package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes14.dex */
public final class zzsv {
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        try {
            if (zza == null) {
                zza = new zzsv();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
