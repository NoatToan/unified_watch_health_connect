package com.loopj.android.http;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* JADX INFO: loaded from: classes18.dex */
public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOG_TAG = "FileAsyncHttpResponseHandler";
    public final File mFile;

    public FileAsyncHttpResponseHandler(File file) {
        this.mFile = file;
    }

    public boolean deleteTargetFile() {
        return getTargetFile() != null && getTargetFile().delete();
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public byte[] getResponseData(HttpEntity httpEntity) throws IOException {
        if (httpEntity == null) {
            return null;
        }
        InputStream content = httpEntity.getContent();
        long contentLength = httpEntity.getContentLength();
        FileOutputStream fileOutputStream = new FileOutputStream(getTargetFile());
        if (content == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[4096];
            int i = 0;
            while (true) {
                int i2 = content.read(bArr);
                if (i2 == -1 || Thread.currentThread().isInterrupted()) {
                    break;
                }
                i += i2;
                fileOutputStream.write(bArr, 0, i2);
                sendProgressMessage(i, (int) contentLength);
            }
            AsyncHttpClient.silentCloseInputStream(content);
            fileOutputStream.flush();
            AsyncHttpClient.silentCloseOutputStream(fileOutputStream);
            return null;
        } catch (Throwable th) {
            AsyncHttpClient.silentCloseInputStream(content);
            fileOutputStream.flush();
            AsyncHttpClient.silentCloseOutputStream(fileOutputStream);
            throw th;
        }
    }

    public File getTargetFile() {
        return this.mFile;
    }

    public File getTemporaryFile(Context context) {
        try {
            return File.createTempFile("temp_", "_handled", context.getCacheDir());
        } catch (Throwable th) {
            Log.e(LOG_TAG, "Cannot create temporary file", th);
            return null;
        }
    }

    public abstract void onFailure(int i, Header[] headerArr, Throwable th, File file);

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public final void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        onFailure(i, headerArr, th, getTargetFile());
    }

    public abstract void onSuccess(int i, Header[] headerArr, File file);

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public final void onSuccess(int i, Header[] headerArr, byte[] bArr) {
        onSuccess(i, headerArr, getTargetFile());
    }

    public FileAsyncHttpResponseHandler(Context context) {
        this.mFile = getTemporaryFile(context);
    }
}
