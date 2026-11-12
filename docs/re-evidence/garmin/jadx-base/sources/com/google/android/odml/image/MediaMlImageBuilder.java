package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;

/* JADX INFO: loaded from: classes14.dex */
public class MediaMlImageBuilder {
    private final Image zza;
    private int zzb = 0;
    private Rect zzc;

    public MediaMlImageBuilder(Image image) {
        this.zza = image;
        this.zzc = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    public MlImage build() {
        return new MlImage(new zzi(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    public MediaMlImageBuilder setRotation(int i14) {
        MlImage.zzc(i14);
        this.zzb = i14;
        return this;
    }
}
