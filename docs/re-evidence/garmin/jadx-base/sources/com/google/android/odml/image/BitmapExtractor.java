package com.google.android.odml.image;

import android.graphics.Bitmap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class BitmapExtractor {
    private BitmapExtractor() {
    }

    public static Bitmap extract(MlImage mlImage) {
        zzg zzgVarZza = mlImage.zza();
        if (zzgVarZza.zzb().getStorageType() == 1) {
            return ((zze) zzgVarZza).zza();
        }
        h.s("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
        return null;
    }
}
