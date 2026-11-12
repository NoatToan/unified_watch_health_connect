package com.xiaomi.smarthome.library.http.async;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpRangeUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FileAsyncHandler extends AsyncHandler<File, Error> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final int BUFFER_SIZE = 4096;
    protected final boolean append;
    private volatile boolean isPaused;
    protected final File mFile;
    protected final boolean rangeDownload;

    public FileAsyncHandler(File file) {
        this(file, false);
    }

    public static boolean checkFileAsyncHandlerValidDirectory(File file, boolean z) {
        if (file == null) {
            if (z) {
                CommonUtil.asserts(false, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
            }
            return false;
        }
        if (file.isDirectory()) {
            if (z) {
                CommonUtil.asserts(false, "File passed into FileAsyncHttpResponseHandler constructor must not point to directory");
            }
            return false;
        }
        if (file.getParentFile().isDirectory() || file.getParentFile().mkdirs()) {
            return true;
        }
        if (z) {
            CommonUtil.asserts(false, "Cannot create parent directories for requested File location");
        }
        return false;
    }

    private void processNormalResponse(Response response) {
        int i;
        if (!response.isSuccessful()) {
            sendFailureMessage(new Error(response.code(), ""), null, response);
            return;
        }
        try {
            InputStream inputStreamByteStream = response.body().byteStream();
            long jContentLength = response.body().get$contentLength();
            FileOutputStream fileOutputStream = new FileOutputStream(getTargetFile(), this.append);
            if (inputStreamByteStream != null) {
                try {
                    byte[] bArr = new byte[4096];
                    int i2 = 0;
                    while (!this.isPaused && (i = inputStreamByteStream.read(bArr)) != -1) {
                        i2 += i;
                        fileOutputStream.write(bArr, 0, i);
                        sendProgressMessage(i2, jContentLength);
                    }
                    CommonUtil.silentCloseInputStream(inputStreamByteStream);
                    fileOutputStream.flush();
                    CommonUtil.silentCloseOutputStream(fileOutputStream);
                } catch (Throwable th) {
                    CommonUtil.silentCloseInputStream(inputStreamByteStream);
                    fileOutputStream.flush();
                    CommonUtil.silentCloseOutputStream(fileOutputStream);
                    throw th;
                }
            }
            sendSuccessMessage(getTargetFile(), response);
        } catch (Exception e) {
            sendFailureMessage(new Error(-1, ""), e, response);
        }
    }

    private void processRangeResponse(Response response) {
        long j;
        int i;
        long[] entityLength;
        if (!response.isSuccessful()) {
            sendFailureMessage(new Error(response.code(), ""), null, response);
            return;
        }
        try {
            InputStream inputStreamByteStream = response.body().byteStream();
            long jContentLength = response.body().get$contentLength();
            String strHeader = response.header("Content-Range");
            if (TextUtils.isEmpty(strHeader) || (entityLength = HttpRangeUtil.getEntityLength(strHeader)) == null || entityLength.length < 3) {
                j = 0;
            } else {
                long j2 = entityLength[0];
                long j3 = entityLength[2];
                j = j2;
                jContentLength = j3;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(getTargetFile(), true);
            if (inputStreamByteStream != null) {
                try {
                    byte[] bArr = new byte[4096];
                    int i2 = 0;
                    while (!this.isPaused && (i = inputStreamByteStream.read(bArr)) != -1) {
                        i2 += i;
                        fileOutputStream.write(bArr, 0, i);
                        sendProgressMessage(((long) i2) + j, jContentLength);
                    }
                    CommonUtil.silentCloseInputStream(inputStreamByteStream);
                    fileOutputStream.flush();
                    CommonUtil.silentCloseOutputStream(fileOutputStream);
                } catch (Throwable th) {
                    CommonUtil.silentCloseInputStream(inputStreamByteStream);
                    fileOutputStream.flush();
                    CommonUtil.silentCloseOutputStream(fileOutputStream);
                    throw th;
                }
            }
            if (this.isPaused) {
                return;
            }
            sendSuccessMessage(getTargetFile(), response);
        } catch (Exception e) {
            sendFailureMessage(new Error(-1, ""), e, response);
        }
    }

    public File getTargetFile() {
        return this.mFile;
    }

    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
    public abstract void onFailure(Error error, Exception exc, Response response);

    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
    public abstract void onSuccess(File file, Response response);

    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
    public void processFailure(Call call, IOException iOException) {
        sendFailureMessage(new Error(-1, ""), iOException, null);
    }

    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
    public void processResponse(Response response) {
        if (this.rangeDownload) {
            processRangeResponse(response);
        } else {
            processNormalResponse(response);
        }
    }

    public void setPaused(boolean z) {
        this.isPaused = z;
    }

    public FileAsyncHandler(File file, boolean z) {
        this(file, z, false);
    }

    public FileAsyncHandler(File file, boolean z, boolean z2) {
        this.isPaused = false;
        checkFileAsyncHandlerValidDirectory(file, false);
        this.mFile = file;
        this.append = z;
        this.rangeDownload = z2;
        this.isPaused = false;
    }
}
