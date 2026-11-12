package com.xiaomi.hm.health.watermarkcamera.utils;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes22.dex */
public class BitmapUtils {
    private BitmapUtils() {
    }

    public static int calculateInSampleSize(int i, int i2, BitmapFactory.Options options) {
        double dFloor;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i4 <= i2 && i3 <= i) {
            return 1;
        }
        if (i2 == 0) {
            dFloor = Math.floor(i3 / i);
        } else {
            if (i != 0) {
                return Math.max((int) Math.floor(i4 / i2), (int) Math.floor(i3 / i));
            }
            dFloor = Math.floor(i4 / i2);
        }
        return (int) dFloor;
    }

    public static Bitmap decodeBitmapFromByteArray(byte[] bArr, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        int iRound = i3 > i2 ? Math.round(i3 / i2) : 1;
        if (i4 / iRound > i) {
            iRound = Math.round(i4 / i);
        }
        options.inSampleSize = iRound;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Bitmap decodeSampledBitmapFromFile(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(i, i2, options);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    public static boolean saveBitmapToFileWithOptimizeCompress(String str, Bitmap bitmap) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        boolean zCompress = false;
        if (bitmap.getWidth() > 1280 && bitmap.getHeight() > 1280 && (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1280, 1280, false)) != null) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bitmap = bitmapCreateScaledBitmap;
        }
        int allocationByteCount = bitmap.getAllocationByteCount() > 4194304 ? (int) ((4194304 / bitmap.getAllocationByteCount()) * 100.0f) : 100;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, allocationByteCount, fileOutputStream2);
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    return zCompress;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return zCompress;
    }

    public static Drawable tintDrawable(Drawable drawable, ColorStateList colorStateList) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        return drawableWrap;
    }
}
