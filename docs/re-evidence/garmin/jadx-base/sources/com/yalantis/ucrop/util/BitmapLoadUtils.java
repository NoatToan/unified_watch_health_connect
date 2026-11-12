package com.yalantis.ucrop.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.WindowManager;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.BitmapLoadTask;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapLoadUtils {
    private static final String TAG = "BitmapLoadUtils";

    public static int calculateInSampleSize(BitmapFactory.Options options, int i14, int i15) {
        int i16 = options.outHeight;
        int i17 = options.outWidth;
        int i18 = 1;
        if (i16 <= i15 && i17 <= i14) {
            return 1;
        }
        while (true) {
            if (i16 / i18 <= i15 && i17 / i18 <= i14) {
                return i18;
            }
            i18 *= 2;
        }
    }

    public static int calculateMaxBitmapSize(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(point.x, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        return maxTextureSize > 0 ? Math.min(iSqrt, maxTextureSize) : iSqrt;
    }

    public static void close(Closeable closeable) {
        if (closeable == null || !(closeable instanceof Closeable)) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void decodeBitmapInBackground(Context context, Uri uri, Uri uri2, int i14, int i15, BitmapLoadCallback bitmapLoadCallback) {
        new BitmapLoadTask(context, uri, uri2, i14, i15, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int exifToDegrees(int i14) {
        switch (i14) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i14) {
        return (i14 == 2 || i14 == 7 || i14 == 4 || i14 == 5) ? -1 : 1;
    }

    public static int getExifOrientation(Context context, Uri uri) {
        int orientation = 0;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return 0;
            }
            orientation = new ImageHeaderParser(inputStreamOpenInputStream).getOrientation();
            close(inputStreamOpenInputStream);
            return orientation;
        } catch (IOException unused) {
            uri.toString();
            return orientation;
        }
    }

    public static Bitmap transformBitmap(Bitmap bitmap, Matrix matrix) {
        try {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                return !bitmap.sameAs(bitmapCreateBitmap) ? bitmapCreateBitmap : bitmap;
            } catch (OutOfMemoryError unused) {
                return bitmap;
            }
        } catch (OutOfMemoryError unused2) {
            return bitmap;
        }
    }
}
