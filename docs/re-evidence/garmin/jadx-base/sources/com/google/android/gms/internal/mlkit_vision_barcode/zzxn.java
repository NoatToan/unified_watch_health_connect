package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzxn {
    public static zzxn zzg(Iterable iterable, int i14, int i15, float f14) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i14;
        int iMin2 = i15;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f15 = i14;
        float f16 = i15;
        return new zzxg((iMin + 0.0f) / f15, (iMin2 + 0.0f) / f16, (iMax + 0.0f) / f15, (iMax2 + 0.0f) / f16, 0.0f);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (!zzh()) {
            return 0.0f;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    public final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
