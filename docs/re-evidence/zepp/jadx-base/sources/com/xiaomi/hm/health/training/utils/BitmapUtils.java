package com.xiaomi.hm.health.training.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes22.dex */
public class BitmapUtils {
    public static Bitmap connectBitmap(Bitmap bitmap, Bitmap bitmap2, boolean z) {
        int width;
        int iMax;
        if (bitmap == null && bitmap2 == null) {
            return null;
        }
        if (bitmap == null) {
            return bitmap2;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        if (!bitmap.isMutable()) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (bitmapCopy != null) {
                bitmap.recycle();
            }
            bitmap = bitmapCopy;
        }
        if (z) {
            width = Math.max(bitmap.getWidth(), bitmap2.getWidth());
            iMax = bitmap.getHeight() + bitmap2.getHeight();
        } else {
            width = bitmap.getWidth() + bitmap2.getWidth();
            iMax = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, Bitmap.Config.ARGB_4444);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z) {
            canvas.drawBitmap(bitmap2, 0.0f, bitmap.getHeight(), paint);
        } else {
            canvas.drawBitmap(bitmap2, bitmap.getWidth(), 0.0f, paint);
        }
        canvas.save();
        canvas.restore();
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static boolean saveBitmapToFile(String str, Bitmap bitmap, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                try {
                    fileOutputStream.close();
                    return zCompress;
                } catch (IOException unused) {
                    return zCompress;
                }
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }
}
