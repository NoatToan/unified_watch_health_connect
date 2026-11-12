package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final Context mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = context;
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i;
        this.mRequiredHeight = i2;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || bitmap.getByteCount() <= MAX_BITMAP_SIZE) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void copyFile(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i <= 0) {
                            BitmapLoadUtils.close(fileOutputStream2);
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            this.mInputUri = this.mOutputUri;
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    BitmapLoadUtils.close(fileOutputStream);
                    BitmapLoadUtils.close(inputStreamOpenInputStream);
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    private void downloadFile(Uri uri, Uri uri2) throws Throwable {
        Closeable closeable;
        Response response;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        BufferedSource bufferedSource = null;
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                BufferedSource bufferedSourceSource = responseExecute.body().source();
                try {
                    OutputStream outputStreamOpenOutputStream = this.mContext.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Sink sink = Okio.sink(outputStreamOpenOutputStream);
                    bufferedSourceSource.readAll(sink);
                    BitmapLoadUtils.close(bufferedSourceSource);
                    BitmapLoadUtils.close(sink);
                    BitmapLoadUtils.close(responseExecute.body());
                    okHttpClient.dispatcher().cancelAll();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th) {
                    th = th;
                    response = responseExecute;
                    closeable = null;
                    bufferedSource = bufferedSourceSource;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    if (response != null) {
                        BitmapLoadUtils.close(response.body());
                    }
                    okHttpClient.dispatcher().cancelAll();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                response = responseExecute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            response = null;
        }
    }

    private void processInputUri() throws Throwable {
        String scheme = this.mInputUri.getScheme();
        StringBuilder sb = new StringBuilder();
        sb.append("Uri scheme: ");
        sb.append(scheme);
        if ("http".equals(scheme) || Constants.URI_SCHEME.equals(scheme)) {
            downloadFile(this.mInputUri, this.mOutputUri);
            return;
        }
        if (MiuiCursorConstants.CONTENT.equals(scheme)) {
            copyFile(this.mInputUri, this.mOutputUri);
            return;
        }
        if ("file".equals(scheme)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid Uri scheme ");
        sb2.append(scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    @Override // android.os.AsyncTask
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z) {
                try {
                    InputStream inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            return new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        if (!checkSize(bitmapDecodeStream, options)) {
                            z = true;
                        }
                    } finally {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                    }
                } catch (IOException e) {
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e));
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(this.mContext, this.mInputUri);
            int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
            Matrix matrix = new Matrix();
            if (iExifToDegrees != 0) {
                matrix.preRotate(iExifToDegrees);
            }
            if (iExifToTranslation != 1) {
                matrix.postScale(iExifToTranslation, 1.0f);
            }
            return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeStream, matrix), exifInfo) : new BitmapWorkerResult(bitmapDecodeStream, exifInfo);
        } catch (IOException | NullPointerException e2) {
            return new BitmapWorkerResult(e2);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc != null) {
            this.mBitmapLoadCallback.onFailure(exc);
            return;
        }
        BitmapLoadCallback bitmapLoadCallback = this.mBitmapLoadCallback;
        Bitmap bitmap = bitmapWorkerResult.mBitmapResult;
        ExifInfo exifInfo = bitmapWorkerResult.mExifInfo;
        String path = this.mInputUri.getPath();
        Uri uri = this.mOutputUri;
        bitmapLoadCallback.onBitmapLoaded(bitmap, exifInfo, path, uri == null ? null : uri.getPath());
    }

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(Bitmap bitmap, ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }
}
