package com.google.android.odml.image;

import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class ByteBufferExtractor {
    private ByteBufferExtractor() {
    }

    public static ByteBuffer extract(MlImage mlImage) {
        zzg zzgVarZza = mlImage.zza();
        if (zzgVarZza.zzb().getStorageType() == 2) {
            return ((zzf) zzgVarZza).zza().asReadOnlyBuffer();
        }
        h.s("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
        return null;
    }
}
