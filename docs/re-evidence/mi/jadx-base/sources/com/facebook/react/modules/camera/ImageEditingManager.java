package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import coil.util.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.cm8;
import defpackage.ndj;
import defpackage.sk1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ImageEditingManager.NAME)
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    public static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");

    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    public static class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7368a;

        public class a implements FilenameFilter {
            public a() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith(ImageEditingManager.TEMP_FILE_PREFIX);
            }
        }

        public final void a(File file) {
            File[] fileArrListFiles = file.listFiles(new a());
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    file2.delete();
                }
            }
        }

        public b(ReactContext reactContext) {
            super(reactContext);
            this.f7368a = reactContext;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            a(this.f7368a.getCacheDir());
            File externalCacheDir = this.f7368a.getExternalCacheDir();
            if (externalCacheDir != null) {
                a(externalCacheDir);
            }
        }
    }

    public static class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7371b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public int g;
        public int h;
        public final Callback i;
        public final Callback j;

        public final Bitmap crop(BitmapFactory.Options options) throws IOException {
            InputStream inputStreamOpenBitmapInputStream = openBitmapInputStream();
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenBitmapInputStream, false);
            try {
                int i = this.c;
                int i2 = this.d;
                return bitmapRegionDecoderNewInstance.decodeRegion(new Rect(i, i2, this.e + i, this.f + i2), options);
            } finally {
                if (inputStreamOpenBitmapInputStream != null) {
                    inputStreamOpenBitmapInputStream.close();
                }
                bitmapRegionDecoderNewInstance.recycle();
            }
        }

        public final Bitmap cropAndResize(int i, int i2, BitmapFactory.Options options) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            sk1.c(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream inputStreamOpenBitmapInputStream = openBitmapInputStream();
            try {
                BitmapFactory.decodeStream(inputStreamOpenBitmapInputStream, null, options2);
                if (inputStreamOpenBitmapInputStream != null) {
                    inputStreamOpenBitmapInputStream.close();
                }
                int i3 = this.e;
                int i4 = this.f;
                float f6 = i;
                float f7 = i2;
                float f8 = f6 / f7;
                if (i3 / i4 > f8) {
                    f = i4 * f8;
                    f5 = i4;
                    f2 = this.c + ((i3 - f) / 2.0f);
                    f3 = this.d;
                    f4 = f7 / i4;
                } else {
                    f = i3;
                    float f9 = i3 / f8;
                    f2 = this.c;
                    f3 = this.d + ((i4 - f9) / 2.0f);
                    f4 = f6 / i3;
                    f5 = f9;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(i3, i4, i, i2);
                options2.inJustDecodeBounds = false;
                InputStream inputStreamOpenBitmapInputStream2 = openBitmapInputStream();
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenBitmapInputStream2, null, options);
                    if (bitmapDecodeStream == null) {
                        throw new IOException("Cannot decode bitmap: " + this.f7371b);
                    }
                    if (inputStreamOpenBitmapInputStream2 != null) {
                        inputStreamOpenBitmapInputStream2.close();
                    }
                    int iFloor = (int) Math.floor(f2 / options.inSampleSize);
                    int iFloor2 = (int) Math.floor(f3 / options.inSampleSize);
                    int iFloor3 = (int) Math.floor(f / options.inSampleSize);
                    int iFloor4 = (int) Math.floor(f5 / options.inSampleSize);
                    float f10 = f4 * options.inSampleSize;
                    Matrix matrix = new Matrix();
                    matrix.setScale(f10, f10);
                    return Bitmap.createBitmap(bitmapDecodeStream, iFloor, iFloor2, iFloor3, iFloor4, matrix, true);
                } catch (Throwable th) {
                    if (inputStreamOpenBitmapInputStream2 != null) {
                        inputStreamOpenBitmapInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (inputStreamOpenBitmapInputStream == null) {
                    throw th2;
                }
                inputStreamOpenBitmapInputStream.close();
                throw th2;
            }
        }

        public final InputStream openBitmapInputStream() throws IOException {
            InputStream inputStreamOpenInputStream = ImageEditingManager.isLocalUri(this.f7371b) ? this.f7370a.getContentResolver().openInputStream(Uri.parse(this.f7371b)) : new URL(this.f7371b).openConnection().getInputStream();
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.f7371b);
        }

        public void setTargetSize(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.g = i;
            this.h = i2;
        }

        public c(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            this.g = 0;
            this.h = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f7370a = reactContext;
            this.f7371b = str;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.i = callback;
            this.j = callback2;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            int i;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i2 = this.g;
                Bitmap bitmapCrop = (i2 <= 0 || (i = this.h) <= 0) ? crop(options) : cropAndResize(i2, i, options);
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File fileCreateTempFile = ImageEditingManager.createTempFile(this.f7370a, str);
                ImageEditingManager.writeCompressedBitmapToFile(bitmapCrop, str, fileCreateTempFile);
                if (str.equals(Utils.MIME_TYPE_JPEG)) {
                    ImageEditingManager.copyExif(this.f7370a, Uri.parse(this.f7371b), fileCreateTempFile);
                }
                this.i.invoke(Uri.fromFile(fileCreateTempFile).toString());
            } catch (Exception e) {
                this.j.invoke(e.getMessage());
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) throws IOException {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            cm8.C("ReactNative", "Couldn't get real path for uri: " + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File createTempFile(Context context, String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), externalCacheDir);
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
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static String getFileExtensionForType(String str) {
        if ("image/png".equals(str)) {
            return ".png";
        }
        return Utils.MIME_TYPE_WEBP.equals(str) ? ".webp" : ".jpg";
    }

    private static File getFileFromUri(Context context, Uri uri) {
        Cursor cursorQuery;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals(MiuiCursorConstants.CONTENT) || (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        Iterator<String> it = LOCAL_URI_PREFIXES.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
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

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap map = readableMap.hasKey("offset") ? readableMap.getMap("offset") : null;
        ReadableMap map2 = readableMap.hasKey(MediaStoreUtil.MediaInfo.SIZE) ? readableMap.getMap(MediaStoreUtil.MediaInfo.SIZE) : null;
        if (map == null || map2 == null || !map.hasKey("x") || !map.hasKey("y") || !map2.hasKey("width") || !map2.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        }
        if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        }
        c cVar = new c(getReactApplicationContext(), str, (int) map.getDouble("x"), (int) map.getDouble("y"), (int) map2.getDouble("width"), (int) map2.getDouble("height"), callback, callback2);
        if (readableMap.hasKey("displaySize")) {
            ReadableMap map3 = readableMap.getMap("displaySize");
            cVar.setTargetSize((int) map3.getDouble("width"), (int) map3.getDouble("height"));
        }
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
