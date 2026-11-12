package com.baidu.ocr.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ImageUtil {
    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static void resize(String str, String str2, int i, int i2) {
        resize(str, str2, i, i2, 80);
    }

    public static void resize(String str, String str2, int i, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            Matrix matrix = new Matrix();
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt != 0) {
                matrix.preRotate(ExifUtil.exifToDegrees(attributeInt));
            }
            int iMin = Math.min(Math.min(options.outWidth, options.outHeight), Math.max(i, i2));
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int iCalculateInSampleSize = calculateInSampleSize(options2, iMin, iMin);
            options2.inSampleSize = iCalculateInSampleSize;
            options2.inScaled = true;
            options2.inDensity = options2.outWidth;
            options2.inTargetDensity = iMin * iCalculateInSampleSize;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, i3, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                try {
                    fileOutputStream.close();
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
