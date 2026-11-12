package com.google.android.odml.image;

import android.media.Image;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class MediaImageExtractor {
    private MediaImageExtractor() {
    }

    public static Image extract(MlImage mlImage) {
        zzg zzgVarZza = mlImage.zza();
        if (zzgVarZza.zzb().getStorageType() == 3) {
            return ((zzi) zzgVarZza).zza();
        }
        h.s("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
        return null;
    }
}
