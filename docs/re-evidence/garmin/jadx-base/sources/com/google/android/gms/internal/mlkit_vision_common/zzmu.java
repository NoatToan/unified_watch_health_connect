package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes14.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i14, int i15, long j8, int i16, int i17, int i18, int i19) {
        zzmjVar.zzc(zzc(i14, i15, j8, i16, i17, i18, i19), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i14, int i15, long j8, int i16, int i17, int i18, int i19) {
        zzmjVar.zzc(zzc(i14, i15, j8, i16, i17, i18, i19), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i14, int i15, long j8, int i16, int i17, int i18, int i19) {
        return new zzmt(i14, i15, i18, i16, i17, SystemClock.elapsedRealtime() - j8, i19);
    }
}
