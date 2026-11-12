package com.google.mlkit.vision.common.internal;

import am.j;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.odml.image.BitmapExtractor;
import com.google.android.odml.image.ByteBufferExtractor;
import com.google.android.odml.image.ImageProperties;
import com.google.android.odml.image.MediaImageExtractor;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class CommonConvertUtils {
    @KeepForSdk
    public static InputImage convertMlImagetoInputImage(MlImage mlImage) {
        InputImage inputImageFromBitmap;
        Integer numValueOf;
        ImageProperties imageProperties = mlImage.getContainedImageProperties().get(0);
        int storageType = imageProperties.getStorageType();
        if (storageType != 1) {
            inputImageFromBitmap = null;
            if (storageType == 2) {
                ByteBuffer byteBufferExtract = ByteBufferExtractor.extract(mlImage);
                int imageFormat = imageProperties.getImageFormat();
                if (imageFormat != 4) {
                    numValueOf = imageFormat != 5 ? null : Integer.valueOf(InputImage.IMAGE_FORMAT_YV12);
                } else {
                    numValueOf = 17;
                }
                if (numValueOf != null) {
                    zza(numValueOf.intValue(), 3, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), byteBufferExtract.limit(), mlImage.getRotation());
                    inputImageFromBitmap = InputImage.fromByteBuffer(byteBufferExtract, mlImage.getWidth(), mlImage.getHeight(), mlImage.getRotation(), numValueOf.intValue());
                }
            } else if (storageType == 3) {
                Image imageExtract = MediaImageExtractor.extract(mlImage);
                zza(imageExtract.getFormat(), 5, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), imageExtract.getFormat() == 256 ? imageExtract.getPlanes()[0].getBuffer().limit() : (imageExtract.getPlanes()[0].getBuffer().limit() * 3) / 2, mlImage.getRotation());
                inputImageFromBitmap = InputImage.fromMediaImage(imageExtract, mlImage.getRotation());
            }
        } else {
            Bitmap bitmapExtract = BitmapExtractor.extract(mlImage);
            zza(-1, 1, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), bitmapExtract.getAllocationByteCount(), mlImage.getRotation());
            inputImageFromBitmap = InputImage.fromBitmap(bitmapExtract, mlImage.getRotation());
        }
        if (inputImageFromBitmap != null) {
            zzmw.zza();
        }
        return inputImageFromBitmap;
    }

    @KeepForSdk
    public static int convertToAndroidImageFormat(@InputImage.ImageFormat int i14) {
        int i15 = 17;
        if (i14 != 17) {
            i15 = 35;
            if (i14 != 35) {
                i15 = InputImage.IMAGE_FORMAT_YV12;
                if (i14 != 842094169) {
                    return 0;
                }
            }
        }
        return i15;
    }

    @KeepForSdk
    public static int convertToMVRotation(int i14) {
        if (i14 == 0) {
            return 0;
        }
        if (i14 == 90) {
            return 1;
        }
        if (i14 == 180) {
            return 2;
        }
        if (i14 == 270) {
            return 3;
        }
        h.s(j.h(i14, "Invalid rotation: "));
        return 0;
    }

    @KeepForSdk
    public static void transformPointArray(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i14 = 0; i14 < pointArr.length; i14++) {
            Point point = pointArr[i14];
            int i15 = i14 + i14;
            fArr[i15] = point.x;
            fArr[i15 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i16 = 0; i16 < pointArr.length; i16++) {
            int i17 = i16 + i16;
            pointArr[i16].set((int) fArr[i17], (int) fArr[i17 + 1]);
        }
    }

    @KeepForSdk
    public static void transformPointF(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    @KeepForSdk
    public static void transformPointList(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i14 = 0; i14 < list.size(); i14++) {
            int i15 = i14 + i14;
            fArr[i15] = list.get(i14).x;
            fArr[i15 + 1] = list.get(i14).y;
        }
        matrix.mapPoints(fArr);
        for (int i16 = 0; i16 < list.size(); i16++) {
            int i17 = i16 + i16;
            list.get(i16).set(fArr[i17], fArr[i17 + 1]);
        }
    }

    @KeepForSdk
    public static void transformRect(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void zza(int i14, int i15, long j8, int i16, int i17, int i18, int i19) {
        zzmu.zzb(zzms.zzb("vision-common"), i14, i15, j8, i16, i17, i18, i19);
    }
}
