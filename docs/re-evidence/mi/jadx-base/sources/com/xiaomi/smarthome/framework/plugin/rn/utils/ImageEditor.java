package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import coil.util.Utils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import defpackage.sk1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ImageEditor {
    private static final int COMPRESS_QUALITY = 90;

    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    public static class CropOption {
        public String resizeMode;
        public int x = 0;
        public int y = 0;
        public int width = 0;
        public int height = 0;
        public int displayWidth = 0;
        public int displayHeight = 0;
    }

    public static class CropTask extends GuardedAsyncTask<Void, Void> {
        final CommonCallback<String> mCallback;
        final Context mContext;
        final int mHeight;
        File mInput;
        File mOutput;
        int mTargetHeight;
        int mTargetWidth;
        final int mWidth;
        final int mX;
        final int mY;

        private Bitmap crop(BitmapFactory.Options options) throws IOException {
            InputStream inputStreamOpenBitmapInputStream = openBitmapInputStream();
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenBitmapInputStream, false);
            try {
                int i = this.mX;
                int i2 = this.mY;
                return bitmapRegionDecoderNewInstance.decodeRegion(new Rect(i, i2, this.mWidth + i, this.mHeight + i2), options);
            } finally {
                if (inputStreamOpenBitmapInputStream != null) {
                    inputStreamOpenBitmapInputStream.close();
                }
                bitmapRegionDecoderNewInstance.recycle();
            }
        }

        private Bitmap cropAndResize(int i, int i2, BitmapFactory.Options options) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            sk1.c(options);
            int i3 = this.mWidth;
            int i4 = this.mHeight;
            float f6 = i;
            float f7 = i2;
            float f8 = f6 / f7;
            if (i3 / i4 > f8) {
                f = i4 * f8;
                f5 = i4;
                f2 = this.mX + ((i3 - f) / 2.0f);
                f3 = this.mY;
                f4 = f7 / i4;
            } else {
                f = i3;
                float f9 = i3 / f8;
                f2 = this.mX;
                f3 = this.mY + ((i4 - f9) / 2.0f);
                f4 = f6 / i3;
                f5 = f9;
            }
            options.inSampleSize = ImageEditor.getDecodeSampleSize(i3, i4, i, i2);
            InputStream inputStreamOpenBitmapInputStream = openBitmapInputStream();
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenBitmapInputStream, null, options);
                if (bitmapDecodeStream == null) {
                    throw new IOException("Cannot decode bitmap: " + this.mInput);
                }
                if (inputStreamOpenBitmapInputStream != null) {
                    inputStreamOpenBitmapInputStream.close();
                }
                int iRound = Math.round(f2 / options.inSampleSize);
                int iRound2 = Math.round(f3 / options.inSampleSize);
                int iRound3 = Math.round(f / options.inSampleSize);
                int iRound4 = Math.round(f5 / options.inSampleSize);
                float f10 = f4 * options.inSampleSize;
                Matrix matrix = new Matrix();
                matrix.setScale(f10, f10);
                return Bitmap.createBitmap(bitmapDecodeStream, iRound, iRound2, iRound3, iRound4, matrix, true);
            } catch (Throwable th) {
                if (inputStreamOpenBitmapInputStream != null) {
                    inputStreamOpenBitmapInputStream.close();
                }
                throw th;
            }
        }

        private InputStream openBitmapInputStream() throws IOException {
            return new FileInputStream(this.mInput);
        }

        public void setTargetSize(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.mTargetWidth = i;
            this.mTargetHeight = i2;
        }

        private CropTask(ReactContext reactContext, String str, File file, int i, int i2, int i3, int i4, CommonCallback<String> commonCallback) {
            super(reactContext);
            this.mTargetWidth = 0;
            this.mTargetHeight = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.mContext = reactContext;
            this.mOutput = file;
            this.mX = i;
            this.mY = i2;
            this.mWidth = i3;
            this.mHeight = i4;
            this.mCallback = commonCallback;
            this.mInput = new File(str);
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            int i;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i2 = this.mTargetWidth;
                Bitmap bitmapCrop = (i2 <= 0 || (i = this.mTargetHeight) <= 0) ? crop(options) : cropAndResize(i2, i, options);
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                ImageEditor.writeCompressedBitmapToFile(bitmapCrop, str, this.mOutput);
                if (str.equals(Utils.MIME_TYPE_JPEG)) {
                    ImageEditor.copyExif(this.mInput, this.mOutput);
                }
                this.mCallback.onSuccess(Uri.fromFile(this.mOutput).toString());
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "ImageEditor", e.getMessage());
                this.mCallback.onFailed(-99, "unknown Error");
            }
        }
    }

    public static CropOption convertRNParams2CropOptions(ReadableMap readableMap) {
        ReadableMap map;
        CropOption cropOption = null;
        ReadableMap map2 = readableMap.hasKey("offset") ? readableMap.getMap("offset") : null;
        ReadableMap map3 = readableMap.hasKey(MediaStoreUtil.MediaInfo.SIZE) ? readableMap.getMap(MediaStoreUtil.MediaInfo.SIZE) : null;
        if (map2 != null && map3 != null && map2.hasKey("x") && map2.hasKey("y") && map3.hasKey("width") && map3.hasKey("height")) {
            cropOption = new CropOption();
            cropOption.x = (int) map2.getDouble("x");
            cropOption.y = (int) map2.getDouble("y");
            cropOption.width = (int) map3.getDouble("width");
            cropOption.height = (int) map3.getDouble("height");
            if (readableMap.hasKey("displaySize") && (map = readableMap.getMap("displaySize")) != null) {
                cropOption.displayWidth = (int) map.getDouble("width");
                cropOption.displayHeight = (int) map.getDouble("height");
            }
        }
        return cropOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(File file, File file2) throws IOException {
        if (file == null) {
            return;
        }
        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file2.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    public static void cropImage(ReactContext reactContext, String str, File file, CropOption cropOption, CommonCallback<String> commonCallback) {
        int i;
        CropTask cropTask = new CropTask(reactContext, str, file, cropOption.x, cropOption.y, cropOption.width, cropOption.height, commonCallback);
        int i2 = cropOption.displayWidth;
        if (i2 > 0 && (i = cropOption.displayHeight) > 0) {
            cropTask.setTargetSize(i2, i);
        }
        cropTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        return Utils.MIME_TYPE_WEBP.equals(str) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }
}
