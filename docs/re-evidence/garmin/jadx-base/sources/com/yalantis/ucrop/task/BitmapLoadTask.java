package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import fb1.c;
import j20.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import vb.h;
import w63.g;
import w63.h0;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final Context mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(Context context, Uri uri, Uri uri2, int i14, int i15, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = context;
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i14;
        this.mRequiredHeight = i15;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= MAX_BITMAP_SIZE) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void copyFile(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        if (uri2 == null) {
            x.l("Output Uri is null - cannot copy image");
            return;
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
                        int i14 = inputStreamOpenInputStream.read(bArr);
                        if (i14 <= 0) {
                            BitmapLoadUtils.close(fileOutputStream2);
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            this.mInputUri = this.mOutputUri;
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, i14);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    BitmapLoadUtils.close(fileOutputStream);
                    BitmapLoadUtils.close(inputStreamOpenInputStream);
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamOpenInputStream = null;
        }
    }

    private void downloadFile(Uri uri, Uri uri2) throws Throwable {
        Response responseExecute;
        w63.x xVar;
        if (uri2 == null) {
            x.l("Output Uri is null - cannot download image");
            return;
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        g gVar = null;
        try {
            responseExecute = okHttpClient.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                g gVarSource = responseExecute.body().getBodySource();
                try {
                    OutputStream outputStreamOpenOutputStream = this.mContext.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    xVar = new w63.x(outputStreamOpenOutputStream, new h0());
                    try {
                        gVarSource.V3(xVar);
                        BitmapLoadUtils.close(gVarSource);
                        BitmapLoadUtils.close(xVar);
                        BitmapLoadUtils.close(responseExecute.body());
                        okHttpClient.dispatcher().cancelAll();
                        this.mInputUri = this.mOutputUri;
                    } catch (Throwable th3) {
                        th = th3;
                        gVar = gVarSource;
                        BitmapLoadUtils.close(gVar);
                        BitmapLoadUtils.close(xVar);
                        if (responseExecute != null) {
                            BitmapLoadUtils.close(responseExecute.body());
                        }
                        okHttpClient.dispatcher().cancelAll();
                        this.mInputUri = this.mOutputUri;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xVar = null;
                }
            } catch (Throwable th5) {
                th = th5;
                xVar = null;
            }
        } catch (Throwable th6) {
            th = th6;
            responseExecute = null;
            xVar = null;
        }
    }

    private void processInputUri() throws Throwable {
        String scheme = this.mInputUri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            downloadFile(this.mInputUri, this.mOutputUri);
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            copyFile(this.mInputUri, this.mOutputUri);
        } else {
            if ("file".equals(scheme)) {
                return;
            }
            h.s(c.n("Invalid Uri scheme", scheme));
        }
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
            boolean z14 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z14) {
                try {
                    InputStream inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            return new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        if (!checkSize(bitmapDecodeStream, options)) {
                            z14 = true;
                        }
                    } finally {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                    }
                } catch (IOException e4) {
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e4));
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
        } catch (IOException | NullPointerException e14) {
            return new BitmapWorkerResult(e14);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        BitmapLoadCallback bitmapLoadCallback = this.mBitmapLoadCallback;
        if (exc != null) {
            bitmapLoadCallback.onFailure(exc);
            return;
        }
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
