package com.huawei.health.h5pro.jsbridge.system.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class BitmapUtils {

    public interface OnCompressPictureCallback {
        void onFailure(String str);

        void onSuccess(File file, String str);
    }

    private BitmapUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(File file, long j, boolean z, OnCompressPictureCallback onCompressPictureCallback) {
        File file2;
        OnCompressPictureCallback onCompressPictureCallback2;
        long length = file.length();
        LogUtil.i("H5PRO_BitmapUtils", "compressToTargetSize: targetSize -> " + j + ", sourceFileSize -> " + length);
        Bitmap bitmapDecodeFileToBitmap = decodeFileToBitmap(file);
        if (bitmapDecodeFileToBitmap == null) {
            LogUtil.w("H5PRO_BitmapUtils", "[RELEASE]compressToTargetSize: bitmap is null -> " + file.getAbsoluteFile());
            onCompressPictureCallback.onFailure("bitmap is null");
            return;
        }
        int width = bitmapDecodeFileToBitmap.getWidth();
        int height = bitmapDecodeFileToBitmap.getHeight();
        LogUtil.i("H5PRO_BitmapUtils", "compressToTargetSize: bitmapWidth -> " + width + ", bitmapHeight -> " + height + ", bitmapByteCount -> " + bitmapDecodeFileToBitmap.getByteCount());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iMax = length / j >= 10 ? Math.max(width / 1000, 2) : 2;
        int i = width / iMax;
        int i2 = height / iMax;
        LogUtil.i("H5PRO_BitmapUtils", "compressToTargetSize: compressRatio -> " + iMax);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        if (isPngImage(file.getAbsolutePath())) {
            config = Bitmap.Config.ARGB_8888;
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        while (true) {
            byteArrayOutputStream.reset();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            Bitmap.Config config2 = config;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeFileToBitmap, (Rect) null, new Rect(0, 0, i, i2), (Paint) null);
            bitmapCreateBitmap.compress(compressFormat, 80, byteArrayOutputStream);
            if (!bitmapCreateBitmap.isRecycled()) {
                bitmapCreateBitmap.recycle();
            }
            iMax++;
            i = width / iMax;
            i2 = height / iMax;
            if (iMax > 12) {
                break;
            }
            int i3 = width;
            int i4 = height;
            if (byteArrayOutputStream.size() <= j || i < 500 || i2 < 500) {
                break;
            }
            width = i3;
            height = i4;
            config = config2;
        }
        if (!bitmapDecodeFileToBitmap.isRecycled()) {
            bitmapDecodeFileToBitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        LogUtil.i("H5PRO_BitmapUtils", "compressToTargetSize: compressRatio -> " + iMax + ", resultFileSize -> " + byteArray.length);
        String strEncodeToString = Base64.encodeToString(byteArray, 16);
        if (z) {
            try {
                file2 = file;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(byteArray);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    LogUtil.e("H5PRO_BitmapUtils", "compressToTargetSize: exception-> " + e.getMessage());
                    onCompressPictureCallback2 = onCompressPictureCallback;
                    onCompressPictureCallback2.onFailure(e.getMessage());
                    Locale locale = Locale.ENGLISH;
                    onCompressPictureCallback2.onSuccess(file2, "data:" + GeneralUtil.getMimeType(file.getAbsolutePath()) + ";base64," + strEncodeToString);
                }
            } catch (IOException e2) {
                e = e2;
                file2 = file;
            }
        } else {
            file2 = file;
        }
        onCompressPictureCallback2 = onCompressPictureCallback;
        Locale locale2 = Locale.ENGLISH;
        onCompressPictureCallback2.onSuccess(file2, "data:" + GeneralUtil.getMimeType(file.getAbsolutePath()) + ";base64," + strEncodeToString);
    }

    private static int c(String str) {
        int i = 0;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_BitmapUtils", "getPictureRotate: invalid file path");
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 8) {
                i = 270;
            }
        } catch (Exception e) {
            LogUtil.e("H5PRO_BitmapUtils", "[RELEASE]getPictureRotate: exception -> " + e.getMessage());
        }
        LogUtil.i("H5PRO_BitmapUtils", "[RELEASE]getPictureRotate: rotate -> " + i);
        return i;
    }

    private static File c(Context context, String str) {
        File file = new File(context.getCacheDir(), "save_bitmap" + File.separator + str);
        try {
            file = file.getCanonicalFile();
        } catch (IOException e) {
            LogUtil.e("H5PRO_BitmapUtils", "getSaveFilePath: exception -> " + e.getMessage());
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file;
    }

    public static void compress(File file, long j, OnCompressPictureCallback onCompressPictureCallback) {
        compress(file, j, true, onCompressPictureCallback);
    }

    public static Bitmap cropBitmap(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
    }

    public static Bitmap decodeFileToBitmap(File file) {
        Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(file));
        } catch (FileNotFoundException | OutOfMemoryError e) {
            LogUtil.e("H5PRO_BitmapUtils", "decodeFileToBitmap: exception -> " + e.getMessage());
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream == null) {
            LogUtil.w("H5PRO_BitmapUtils", "decodeFileToBitmap: bitmap is null");
            return bitmapDecodeStream;
        }
        int iC = c(file.getAbsolutePath());
        if (iC == 0) {
            return bitmapDecodeStream;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(iC);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        if (!bitmapDecodeStream.isRecycled()) {
            bitmapDecodeStream.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(File file, long j, boolean z, OnCompressPictureCallback onCompressPictureCallback) {
        String absolutePath = file.getAbsolutePath();
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath);
        if (bitmapDecodeFile == null) {
            LogUtil.w("H5PRO_BitmapUtils", "[RELEASE]compressToMaxSideLength: bitmap is null -> " + file.getAbsoluteFile());
            onCompressPictureCallback.onFailure("bitmap is null");
            return;
        }
        LogUtil.i("H5PRO_BitmapUtils", "compressToMaxSideLength -> " + bitmapDecodeFile.getByteCount());
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        int iMax = Math.max(width, height);
        if (iMax <= j) {
            onCompressPictureCallback.onSuccess(file, "");
            return;
        }
        float f = j / iMax;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        int iC = c(absolutePath);
        if (iC != 0) {
            matrix.postRotate(iC);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(isPngImage(absolutePath) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        LogUtil.i("H5PRO_BitmapUtils", "compressToMaxSideLength: resultFileSize -> " + byteArray.length);
        String strEncodeToString = Base64.encodeToString(byteArray, 16);
        if (z) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                LogUtil.e("H5PRO_BitmapUtils", "compressToMaxSideLength: exception-> " + e.getMessage());
                onCompressPictureCallback.onFailure(e.getMessage());
                return;
            }
        }
        Locale locale = Locale.ENGLISH;
        onCompressPictureCallback.onSuccess(file, "data:" + GeneralUtil.getMimeType(absolutePath) + ";base64," + strEncodeToString);
    }

    public static void equalRatioCompress(final File file, final int i, final boolean z, final OnCompressPictureCallback onCompressPictureCallback) {
        if (file == null || !file.exists()) {
            onCompressPictureCallback.onFailure("compress: the file does not exist");
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.4
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 <= 0) {
                    onCompressPictureCallback.onSuccess(file, "");
                } else {
                    BitmapUtils.e(file, i2, z, onCompressPictureCallback);
                }
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public static boolean isPngImage(String str) {
        return !TextUtils.isEmpty(str) && str.toUpperCase(Locale.ROOT).endsWith(".PNG");
    }

    public static String saveBitmap(Context context, String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        File fileC;
        String str2 = "";
        if (bitmap != null && !TextUtils.isEmpty(str) && (fileC = c(context, str)) != null) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileC, false));
                try {
                    bitmap.compress(compressFormat, 100, bufferedOutputStream);
                    String canonicalPath = fileC.getCanonicalPath();
                    try {
                        bufferedOutputStream.close();
                        return canonicalPath;
                    } catch (IOException e) {
                        e = e;
                        str2 = canonicalPath;
                        LogUtil.e("H5PRO_BitmapUtils", "saveBitmap: exception -> " + e.getMessage());
                        return str2;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                LogUtil.e("H5PRO_BitmapUtils", "saveBitmap: exception -> " + e.getMessage());
                return str2;
            }
        }
        return str2;
    }

    public static Bitmap compress(File file, long j) {
        if (file == null || !file.exists()) {
            LogUtil.w("H5PRO_BitmapUtils", "compress: the sourceImageFile does not exist");
            return null;
        }
        return compress(BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options()), j);
    }

    public static String parseBitmapToBase64(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        String strEncodeToString;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bitmap != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    } catch (IOException e) {
                        e = e;
                        LogUtil.e("H5PRO_BitmapUtils", "parseBitmapToBase64: " + e.getMessage());
                        CommonUtil.closeStream(byteArrayOutputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    CommonUtil.closeStream(byteArrayOutputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtil.closeStream(byteArrayOutputStream2);
                throw th;
            }
        } else {
            strEncodeToString = null;
        }
        CommonUtil.closeStream(byteArrayOutputStream2);
        return strEncodeToString;
    }

    public static Bitmap compress(Bitmap bitmap, long j) {
        if (j <= 0 || bitmap == null) {
            LogUtil.w("H5PRO_BitmapUtils", "compress: Invalid parameter");
            return bitmap;
        }
        if (bitmap.getByteCount() <= j) {
            return bitmap;
        }
        Bitmap bitmapCropBitmap = cropBitmap(bitmap);
        if (bitmapCropBitmap.getByteCount() <= j) {
            return bitmapCropBitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        bitmapCropBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length > j && i >= 10) {
            i -= 10;
            byteArrayOutputStream.reset();
            bitmapCropBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }

    public static void compress(final File file, final long j, final boolean z, final OnCompressPictureCallback onCompressPictureCallback) {
        if (file != null && file.exists()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.media.BitmapUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    if (j > 0) {
                        long length = file.length();
                        long j2 = j;
                        if (length > j2) {
                            BitmapUtils.a(file, j2, z, onCompressPictureCallback);
                            return;
                        }
                    }
                    onCompressPictureCallback.onSuccess(file, "");
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        onCompressPictureCallback.onFailure("compress: the file does not exist");
    }
}
