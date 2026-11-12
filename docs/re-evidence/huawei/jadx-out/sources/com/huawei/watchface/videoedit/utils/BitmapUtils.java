package com.huawei.watchface.videoedit.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes20.dex */
public final class BitmapUtils {
    private static final int BUFFER_SIZE = 32768;
    private static final int CONST_EIGHT = 8;
    private static final double DEFAULT_BORDER_WIDTH = 0.5d;
    private static final int DEFAULT_COMPRESS_RATIO = 2;
    private static final int DEFAULT_QUALITY = 100;
    private static final int DEFAULT_VALUE = 0;
    private static final int MAX_SIZE_THUMB = 27648;
    private static final int MIN_QUALITY_GAP = 10;
    private static final int THUMB_MAX_SIZE = 600;
    private static final int THUMB_MIN_SIZE = 150;
    private static final int THUMB_RATIO = 4;

    private BitmapUtils() {
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, boolean z) {
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmapToByteArray(bitmap, 100, z);
        }
        HwLog.w(HwLog.TAG, "bitmapToByteArray sourceBitmap is null or recycled");
        return null;
    }

    public static int computeSampleSizeLarger(float f) {
        int iIntValue;
        try {
            iIntValue = BigDecimal.valueOf(1.0d).divide(BigDecimal.valueOf(f), RoundingMode.FLOOR).intValue();
        } catch (ArithmeticException unused) {
            iIntValue = 0;
        }
        if (iIntValue <= 1) {
            return 1;
        }
        return iIntValue <= 8 ? Utils.prevPowerOf2(iIntValue) : (iIntValue / 8) * 8;
    }

    public static Bitmap decodeImageFromFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (OutOfMemoryError unused) {
            HwLog.w(HwLog.TAG, "decodeImageFromFile OOM");
            return null;
        }
    }

    private static Bitmap extractMaxThumbNail(Bitmap bitmap) {
        if (bitmap == null) {
            HwLog.w(HwLog.TAG, "extractMaxThumbNail() sourceBitmap == null!");
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        HwLog.i(HwLog.TAG, "extractMaxThumbNail() original width : " + width + " original height : " + height + "size = " + bitmap.getByteCount());
        double d = ((height > width ? height : width) * 1.0d) / 600.0d;
        double d2 = 4.0d * d > 1.0d ? d : 1.0d;
        int i = (int) (((double) height) / d2);
        int i2 = (int) (((double) width) / d2);
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i2, i);
        HwLog.i(HwLog.TAG, "extractMaxThumbNail() after width : " + i2 + " original height : " + i + "size = " + bitmap.getByteCount());
        return bitmapExtractThumbnail;
    }

    public static byte[] getByteArrayOfThumbBitmap(Bitmap bitmap, boolean z) {
        byte[] bArr = null;
        if (bitmap == null) {
            HwLog.w(HwLog.TAG, "getByteArrayOfThumbBitmap() sourceBitmap = null!");
            return null;
        }
        Bitmap bitmapExtractMaxThumbNail = extractMaxThumbNail(bitmap);
        if (bitmapExtractMaxThumbNail == null) {
            HwLog.w(HwLog.TAG, "getByteArrayOfThumbBitmap() sourceBitmap == null!");
        } else {
            int i = 100;
            int i2 = 0;
            int i3 = 0;
            int i4 = 100;
            while (true) {
                i2++;
                byte[] bArrBitmapToByteArray = bitmapToByteArray(bitmapExtractMaxThumbNail, i, false);
                if (i2 == 1 && bArrBitmapToByteArray.length < MAX_SIZE_THUMB) {
                    bArr = bArrBitmapToByteArray;
                    break;
                }
                int i5 = i - i3;
                if (i5 <= 10) {
                    break;
                }
                if (bArrBitmapToByteArray.length >= MAX_SIZE_THUMB) {
                    i4 = i;
                    i -= i5 / 2;
                } else {
                    i3 = i;
                    i = ((i4 - i) / 2) + i;
                    bArr = bArrBitmapToByteArray;
                }
            }
            if (z) {
                bitmap.recycle();
            }
        }
        if (bArr != null) {
            HwLog.i(HwLog.TAG, "getByteArrayOfThumbBitmap() result size = " + bArr.length);
        }
        return bArr;
    }

    private static ColorSpace getColorSpace(Bitmap bitmap) {
        ColorSpace colorSpace = bitmap.getColorSpace();
        return colorSpace == null ? ColorSpace.get(ColorSpace.Named.SRGB) : colorSpace;
    }

    private static Bitmap.Config getConfig(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static float getFullScreenNailScale(float f, float f2, float f3, float f4) {
        return Utils.getMax(Utils.getMin(f3 / f, f4 / f2), Utils.getMin(f3 / f2, f4 / f));
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0030: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:6:0x0030 */
    public static Bitmap loadImage(String str, float f) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        options.inSampleSize = computeSampleSizeLarger(f);
        Closeable closeable2 = null;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    DfxGuard.getPolicy().onDecodeImage();
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                    Utils.closeSilently(fileInputStream);
                } catch (IOException e) {
                    e = e;
                    HwLog.d(HwLog.TAG, "load pic failed because IOException" + HwLog.printException((Exception) e));
                    Utils.closeSilently(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    HwLog.d(HwLog.TAG, "load pic failed" + HwLog.printException(e));
                    Utils.closeSilently(fileInputStream);
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    HwLog.e(HwLog.TAG, "load pic OutOfMemoryError " + HwLog.printException((Error) e));
                    Utils.closeSilently(fileInputStream);
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                Utils.closeSilently(closeable2);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            Utils.closeSilently(closeable2);
            throw th;
        }
        if (bitmapDecodeStream == null) {
            return bitmapDecodeStream;
        }
        HwLog.d(HwLog.TAG, "before bmp width is " + bitmapDecodeStream.getWidth() + "bitmap height is " + bitmapDecodeStream.getHeight() + " scale is " + f);
        float f2 = f * ((float) options.inSampleSize);
        Bitmap bitmapResizeBitmapByScale = resizeBitmapByScale(bitmapDecodeStream, f2 <= 1.0f ? f2 : 1.0f, true);
        HwLog.d(HwLog.TAG, "after resize bmp width is " + bitmapResizeBitmapByScale.getWidth() + "bitmap height is " + bitmapResizeBitmapByScale.getHeight() + " sc is " + f2 + "options.inSampleSize" + options.inSampleSize);
        return bitmapResizeBitmapByScale;
    }

    private static Bitmap resizeBitmapByScale(Bitmap bitmap, float f, boolean z) {
        int iRound = Math.round(bitmap.getWidth() * f);
        int iRound2 = Math.round(bitmap.getHeight() * f);
        if (iRound == bitmap.getWidth() && iRound2 == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, getConfig(bitmap), true, getColorSpace(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(f, f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(6));
        if (z) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i, boolean z) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (z && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static boolean saveBmpToFile(Bitmap bitmap, String str) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            HwLog.i(HwLog.TAG, "saveBmpToFile: bitmap is null or path is empty");
            return false;
        }
        try {
            FileOutputStream fileOutputStreamB = PversionSdUtils.b(new File(str));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamB);
                fileOutputStreamB.flush();
                fileOutputStreamB.close();
                return true;
            } catch (Throwable th) {
                if (fileOutputStreamB != null) {
                    try {
                        fileOutputStreamB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            HwLog.w(HwLog.TAG, "saveBmpToFile:IOException exception: " + HwLog.printException((Exception) e));
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            HwLog.w(HwLog.TAG, "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: " + HwLog.printException(e));
            return false;
        } catch (IllegalStateException e3) {
            e = e3;
            HwLog.w(HwLog.TAG, "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: " + HwLog.printException(e));
            return false;
        }
    }

    public static Bitmap scaleThumbBitmap(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            HwLog.w(HwLog.TAG, "scaleThumbBitmap sourceBitmap null");
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateScaledBitmap = bitmap;
        while (true) {
            if (width <= i && height <= i2 && bitmapCreateScaledBitmap.getByteCount() <= 32768) {
                HwLog.i(HwLog.TAG, "scaleThumbBitmap picture size = " + bitmapCreateScaledBitmap.getByteCount() + "width = " + width + " height = " + height);
                return bitmapCreateScaledBitmap;
            }
            HwLog.i(HwLog.TAG, "scaleThumbBitmap error bitmap too big , width = " + width + " height = " + height + "byteCount = " + bitmapCreateScaledBitmap.getByteCount());
            width = (int) ((((double) width) / Math.sqrt(2.0d)) + 0.5d);
            height = (int) ((((double) height) / Math.sqrt(2.0d)) + 0.5d);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        }
    }

    private static byte[] bitmapToByteArray(Bitmap bitmap, int i, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(i == 100 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            HwLog.e(HwLog.TAG, "bitmapToByteArray IOException");
            return byteArray;
        }
    }
}
