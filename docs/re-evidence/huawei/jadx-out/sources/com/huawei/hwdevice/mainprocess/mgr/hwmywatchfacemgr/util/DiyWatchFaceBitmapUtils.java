package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Utils;
import com.huawei.watchface.utils.ColorPickerUtil;
import defpackage.mca;
import defpackage.qqf;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class DiyWatchFaceBitmapUtils {
    private static final int BITMAP_COMPRESS_QUALITY = 100;
    private static final float RADIUS_WEAR_RECT = 24.0f;
    private static final String TAG = "DiyWatchFaceBitmapUtils";
    private static final String TAG_RELEASE = "DEVMGR_DiyWatchFaceBitmapUtils";

    public static int colorPickerBitmap(Bitmap bitmap, Rect rect) {
        if (bitmap == null || rect == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "colorPickerBitmap bitmap or rect is null");
            return -1;
        }
        LogUtil.a(TAG, "colorPickerBitmap Rect left:", Integer.valueOf(rect.left), "Rect top:", Integer.valueOf(rect.top), "Rect right:", Integer.valueOf(rect.right), "Rect bottom:", Integer.valueOf(rect.bottom));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int rowBytes = bitmap.getRowBytes();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArrColorInt2bgra = colorInt2bgra(iArr);
        if (bArrColorInt2bgra.length == 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "colorPickerBitmap data length is 0");
            return -1;
        }
        int iProcessNewBitmap = ColorPickerUtil.processNewBitmap(bArrColorInt2bgra, width, height, rowBytes * height, rect.left, rect.top, rect.width(), rect.height());
        ReleaseLogUtil.d(TAG_RELEASE, "colorPickerBitmap color :", Integer.valueOf(iProcessNewBitmap));
        ReleaseLogUtil.d(TAG_RELEASE, "colorPickerBitmap hex :", Utils.int2Hex(iProcessNewBitmap));
        return iProcessNewBitmap;
    }

    public static int obtainWidgetColor(Bitmap bitmap, Rect rect) {
        if (bitmap == null || rect == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "obtainWidgetColor bitmap or rect is null!");
            return -1;
        }
        int iColorPickerBitmap = colorPickerBitmap(bitmap, rect);
        ReleaseLogUtil.d(TAG_RELEASE, "obtainWidgetColor pickedColor", Integer.valueOf(iColorPickerBitmap));
        return iColorPickerBitmap;
    }

    public static byte[] colorInt2bgra(int[] iArr) {
        if (iArr == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "colorInt2bgra colorInt is null");
            return new byte[0];
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            int i3 = iArr[i];
            bArr[i2] = (byte) (i3 & 255);
            bArr[i2 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i3 >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i3 >> 24) & 255);
        }
        return bArr;
    }

    public static boolean createBinFile(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "createSizeBinFile pngPath is empty");
            return false;
        }
        Bitmap bitmapE = qqf.e(str);
        if (bitmapE == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "createSizeBinFile decode source bitmap file null");
            return false;
        }
        LogUtil.a(TAG, "createBinFile bmWidth:", Integer.valueOf(bitmapE.getWidth()), ", bmHeight:", Integer.valueOf(bitmapE.getHeight()));
        mca.e(str, str2, i);
        return true;
    }

    public static void createSizeBinFile(String str, String str2, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "createSizeBinFile pngPath is empty");
            return;
        }
        Bitmap bitmapE = qqf.e(str);
        if (bitmapE == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "createSizeBinFile decode source bitmap file null");
            return;
        }
        if (i2 == 0 || i3 == 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "createSizeBinFile dial width or height is 0");
            return;
        }
        int width = bitmapE.getWidth();
        int height = bitmapE.getHeight();
        LogUtil.a(TAG, "createSizeBinFile bmWidth:", Integer.valueOf(width), ", bmHeight:", Integer.valueOf(height), ", width:", Integer.valueOf(i2), ",height:", Integer.valueOf(i3));
        if (i2 == width && i3 == height) {
            ReleaseLogUtil.d(TAG_RELEASE, "createSizeBinFile finish");
            mca.e(str, str2, i);
        } else {
            ReleaseLogUtil.d(TAG_RELEASE, "createSizeBinFile bitmap width or height is not dial width or height");
        }
    }

    public static Bitmap tintBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "tintBitmap bitmap is null");
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap tintColorBitmap(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            ReleaseLogUtil.e(TAG_RELEASE, "tintColorBitmap bitmap is null or isRecycled");
            return null;
        }
        if (i == 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "tintColorBitmap tintColor is 0");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = (width * i2) + i3;
                int i5 = iArr[i4];
                int i6 = (((((16711680 & i5) >> 16) * 76) + (((65280 & i5) >> 8) * 150)) + ((i5 & 255) * 30)) >> 8;
                iArr[i4] = (i5 & (-16777216)) | (i6 << 16) | (i6 << 8) | i6;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        new Canvas(bitmapCreateBitmap).drawColor(i, PorterDuff.Mode.MULTIPLY);
        return bitmapCreateBitmap;
    }

    public static void saveBitmapToFile(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bitmap == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveBitmapToFile bitmap is null");
            return;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            String strC = CommonUtil.c(str);
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.e(TAG_RELEASE, "saveBitmapToFile legalPath is empty");
                IoUtils.c(null);
                IoUtils.c(null);
                return;
            }
            File file = new File(strC);
            if (!file.exists()) {
                ReleaseLogUtil.d(TAG_RELEASE, "saveBitmapToFile isMkdirs :", Boolean.valueOf(file.mkdirs()));
            }
            File fileD = FileUtils.d(file, str2);
            if (fileD.exists()) {
                FileUtils.j(fileD);
            }
            fileOutputStream = new FileOutputStream(fileD);
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                        bufferedOutputStream2.flush();
                        IoUtils.c(bufferedOutputStream2);
                        IoUtils.c(fileOutputStream);
                    } catch (IOException e) {
                        e = e;
                        bufferedOutputStream = bufferedOutputStream2;
                        ReleaseLogUtil.a(TAG_RELEASE, "saveBitmapToFile IOException :", ExceptionUtils.c(e));
                        IoUtils.c(bufferedOutputStream);
                        IoUtils.c(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        IoUtils.c(bufferedOutputStream);
                        IoUtils.c(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream;
                bufferedOutputStream = bufferedOutputStream;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public static void cropPngToRectF(String str, int i, int i2, int i3) throws IOException {
        float f;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        float f2 = i;
        RectF rectF = new RectF(0.0f, 0.0f, f2, i2);
        if (i == i2) {
            if (i3 > 0) {
                f = i3;
            } else {
                f = f2 / 2.0f;
            }
        } else if (i3 > 0) {
            f = i3;
        } else {
            f = RADIUS_WEAR_RECT;
        }
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str)));
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public static Bitmap getVideoFrameAtTimeOne(String str) {
        Bitmap frameAtTime = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getVideoFrameAtTimeOne -- videoPath is empty");
            return null;
        }
        File file = WatchFaceUtil.getFile(str);
        if (file == null || !file.exists()) {
            LogUtil.j(TAG, "getVideoFrameAtTimeOne -- video not exit");
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(1L, 2);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e) {
                            LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IOException:", ExceptionUtils.c(e));
                        }
                    } catch (Exception e2) {
                        LogUtil.e(TAG, "getVideoFrameAtTimeOne -- Exception:", ExceptionUtils.c(e2));
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e3) {
                            LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IOException:", ExceptionUtils.c(e3));
                        }
                    }
                } catch (IllegalArgumentException e4) {
                    LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IllegalArgumentException:", ExceptionUtils.c(e4));
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException e5) {
                        LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IOException:", ExceptionUtils.c(e5));
                    }
                }
            } catch (RuntimeException e6) {
                LogUtil.e(TAG, "getVideoFrameAtTimeOne -- RuntimeException:", ExceptionUtils.c(e6));
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e7) {
                    LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IOException:", ExceptionUtils.c(e7));
                }
            }
            if (frameAtTime != null) {
                return frameAtTime;
            }
            LogUtil.a(TAG, "getVideoFrameAtTimeOne getFrameAtTime previewBitmap is null, so try createVideoThumbnail");
            return ThumbnailUtils.createVideoThumbnail(str, 1);
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e8) {
                LogUtil.e(TAG, "getVideoFrameAtTimeOne -- IOException:", ExceptionUtils.c(e8));
            }
            throw th;
        }
    }
}
