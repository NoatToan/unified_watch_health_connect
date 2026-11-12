package com.xiaomi.smarthome.library.common.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import com.amap.api.maps.utils.SpatialRelationUtil;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class ImageUtils {
    private static final float eps = 1.0E-7f;
    private static final double epsf = 1.0E-7d;

    private ImageUtils() {
    }

    public static Bitmap decodeFile(String str) {
        if (str != null && new File(str).exists()) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    public static boolean doubleEquals(double d, double d2) {
        return Math.abs(d - d2) <= epsf;
    }

    public static boolean floatEquals(float f, float f2) {
        return Math.abs(f - f2) <= eps;
    }

    public static void getCircleBitmap(Bitmap bitmap, Bitmap bitmap2) {
        try {
            Canvas canvas = new Canvas(bitmap2);
            Paint paint = new Paint();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= height) {
                width = height;
            }
            Rect rect = new Rect(0, 0, width, width);
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, width / 2, width / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
        } catch (OutOfMemoryError unused) {
        }
    }

    public static int getExifOrientation(String str) {
        ExifInterface exifInterface;
        int attributeInt;
        try {
            exifInterface = new ExifInterface(str);
        } catch (Exception unused) {
            exifInterface = null;
        }
        if (exifInterface != null && (attributeInt = exifInterface.getAttributeInt("Orientation", -1)) != -1) {
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt == 8) {
                return 270;
            }
        }
        return 0;
    }

    public static <T> int indexOf(T[] tArr, T t) {
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        if (width > height) {
            float f = i / width;
            matrix.postScale(f, f);
        } else {
            float f2 = i / height;
            matrix.postScale(f2, f2);
        }
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap rotate(Bitmap bitmap, int i) {
        int i2 = i % SpatialRelationUtil.A_CIRCLE_DEGREE;
        if (i2 == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i2, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == bitmapCreateBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, String str) {
        int exifOrientation = getExifOrientation(str);
        if (exifOrientation <= 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(exifOrientation);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (bitmapCreateBitmap == null) {
            return bitmap;
        }
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    public static Bitmap transform(Matrix matrix, Bitmap bitmap, int i, int i2, boolean z) {
        Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        Matrix matrix3 = matrix;
        int width = bitmap.getWidth() - i;
        int height = bitmap.getHeight() - i2;
        if (!z && (width < 0 || height < 0)) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            int iMax = Math.max(0, width / 2);
            int iMax2 = Math.max(0, height / 2);
            Rect rect = new Rect(iMax, iMax2, Math.min(i, bitmap.getWidth()) + iMax, Math.min(i2, bitmap.getHeight()) + iMax2);
            int iWidth = (i - rect.width()) / 2;
            int iHeight = (i2 - rect.height()) / 2;
            canvas.drawBitmap(bitmap, rect, new Rect(iWidth, iHeight, i - iWidth, i2 - iHeight), (Paint) null);
            return bitmapCreateBitmap2;
        }
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float f = i;
        float f2 = i2;
        if (width2 / height2 <= f / f2) {
            float f3 = f / width2;
            if (f3 < 0.9f || f3 > 1.0f) {
                matrix.setScale(f3, f3);
            } else {
                matrix2 = null;
            }
            if (matrix2 != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
            } else {
                bitmapCreateBitmap = bitmap;
            }
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap, Math.max(0, bitmapCreateBitmap.getWidth() - i) / 2, Math.max(0, bitmapCreateBitmap.getHeight() - i2) / 2, i, i2);
            if (bitmapCreateBitmap != bitmap) {
                bitmapCreateBitmap.recycle();
            }
            return bitmapCreateBitmap3;
        }
        float f4 = f2 / height2;
        if (f4 < 0.9f || f4 > 1.0f) {
            matrix.setScale(f4, f4);
        } else {
            matrix3 = null;
        }
        matrix2 = matrix3;
        if (matrix2 != null) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
        } else {
            bitmapCreateBitmap = bitmap;
        }
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateBitmap, Math.max(0, bitmapCreateBitmap.getWidth() - i) / 2, Math.max(0, bitmapCreateBitmap.getHeight() - i2) / 2, i, i2);
        if (bitmapCreateBitmap != bitmap) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCreateBitmap4;
    }
}
