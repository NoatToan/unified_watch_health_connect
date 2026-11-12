package com.google.android.odml.image;

import android.graphics.Rect;
import com.google.android.gms.internal.measurement.a;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class MlImage implements Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;
    private final zzg zza;
    private final int zzb;
    private final Rect zzc;
    private final int zzd;
    private final int zze;
    private int zzf;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    public static final class Internal {
        private final MlImage zza;

        public /* synthetic */ Internal(MlImage mlImage, zzj zzjVar) {
            this.zza = mlImage;
        }

        public void acquire() {
            this.zza.zzd();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    public MlImage(zzg zzgVar, int i14, Rect rect, long j8, int i15, int i16) {
        this.zza = zzgVar;
        this.zzb = i14;
        Rect rect2 = new Rect();
        this.zzc = rect2;
        rect2.set(rect);
        this.zzd = i15;
        this.zze = i16;
        this.zzf = 1;
    }

    public static void zzc(int i14) {
        if (i14 == 0 || i14 == 90 || i14 == 180 || i14 == 270) {
            return;
        }
        a.h(68, "Rotation value ", " is not valid. Use only 0, 90, 180 or 270.", i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        this.zzf++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i14 = this.zzf - 1;
        this.zzf = i14;
        if (i14 == 0) {
            this.zza.zzc();
        }
    }

    public List<ImageProperties> getContainedImageProperties() {
        return Collections.singletonList(this.zza.zzb());
    }

    public int getHeight() {
        return this.zze;
    }

    public Internal getInternal() {
        return new Internal(this, null);
    }

    public int getRotation() {
        return this.zzb;
    }

    public int getWidth() {
        return this.zzd;
    }

    public final zzg zza() {
        return this.zza;
    }
}
