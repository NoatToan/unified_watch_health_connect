package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class InputImage implements MLTaskInput {

    @KeepForSdk
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile Bitmap zza;
    private volatile ByteBuffer zzb;
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;

    @ImageFormat
    private final int zzg;
    private final Matrix zzh;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    private InputImage(ByteBuffer byteBuffer, int i14, int i15, int i16, @ImageFormat int i17) {
        boolean z14;
        if (i17 == 842094169) {
            z14 = true;
        } else if (i17 == 17) {
            i17 = 17;
            z14 = true;
        } else {
            z14 = false;
        }
        Preconditions.checkArgument(z14);
        this.zzb = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i14 * i15, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i14;
        this.zze = i15;
        zza(i16);
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = null;
    }

    public static InputImage fromBitmap(Bitmap bitmap, int i14) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i14);
        zzc(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i14);
        return inputImage;
    }

    public static InputImage fromByteArray(byte[] bArr, int i14, int i15, int i16, @ImageFormat int i17) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i14, i15, i16, i17);
        zzc(i17, 2, jElapsedRealtime, i15, i14, bArr.length, i16);
        return inputImage;
    }

    public static InputImage fromByteBuffer(ByteBuffer byteBuffer, int i14, int i15, int i16, @ImageFormat int i17) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i14, i15, i16, i17);
        zzc(i17, 3, jElapsedRealtime, i15, i14, byteBuffer.limit(), i16);
        return inputImage;
    }

    public static InputImage fromFilePath(Context context, Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(bitmapZza, 0);
        zzc(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
        return inputImage;
    }

    @KeepForSdk
    public static InputImage fromMediaImage(Image image, int i14, Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i14, matrix);
    }

    private static int zza(int i14) {
        boolean z14 = true;
        if (i14 != 0 && i14 != 90 && i14 != 180) {
            if (i14 == 270) {
                i14 = 270;
            } else {
                z14 = false;
            }
        }
        Preconditions.checkArgument(z14, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i14;
    }

    private static InputImage zzb(Image image, int i14, Matrix matrix) {
        Image image2;
        int i15;
        int iLimit;
        InputImage inputImage;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        zza(i14);
        boolean z14 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z14 = false;
        }
        Preconditions.checkArgument(z14, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i15 = i14;
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i14), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i15 = i14;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i15, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzc(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i15);
        return inputImage;
    }

    private static void zzc(int i14, int i15, long j8, int i16, int i17, int i18, int i19) {
        zzmu.zza(zzms.zzb("vision-common"), i14, i15, j8, i16, i17, i18, i19);
    }

    @KeepForSdk
    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    @KeepForSdk
    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    @KeepForSdk
    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    @KeepForSdk
    @ImageFormat
    public int getFormat() {
        return this.zzg;
    }

    @KeepForSdk
    public int getHeight() {
        return this.zze;
    }

    @KeepForSdk
    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    @KeepForSdk
    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    @KeepForSdk
    public int getRotationDegrees() {
        return this.zzf;
    }

    @KeepForSdk
    public int getWidth() {
        return this.zzd;
    }

    public static InputImage fromMediaImage(Image image, int i14) {
        return zzb(image, i14, null);
    }

    private InputImage(Image image, int i14, int i15, int i16, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i14;
        this.zze = i15;
        zza(i16);
        this.zzf = i16;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(Bitmap bitmap, int i14) {
        this.zza = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i14);
        this.zzf = i14;
        this.zzg = -1;
        this.zzh = null;
    }
}
