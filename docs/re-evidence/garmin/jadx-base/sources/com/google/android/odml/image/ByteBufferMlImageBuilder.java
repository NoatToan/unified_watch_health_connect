package com.google.android.odml.image;

import android.graphics.Rect;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class ByteBufferMlImageBuilder {
    private final ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze = 0;
    private Rect zzf;

    public ByteBufferMlImageBuilder(ByteBuffer byteBuffer, int i14, int i15, int i16) {
        this.zza = byteBuffer;
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = i16;
        this.zzf = new Rect(0, 0, i14, i15);
    }

    public MlImage build() {
        return new MlImage(new zzf(this.zza, this.zzd), this.zze, this.zzf, 0L, this.zzb, this.zzc);
    }

    public ByteBufferMlImageBuilder setRotation(int i14) {
        MlImage.zzc(i14);
        this.zze = i14;
        return this;
    }
}
