package com.loopj.android.http;

import android.os.Message;
import android.util.Log;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

/* JADX INFO: loaded from: classes18.dex */
public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "DataAsyncHttpResponseHandler";
    public static final int PROGRESS_DATA_MESSAGE = 6;

    public static byte[] copyOfRange(byte[] bArr, int i, int i2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, iMin);
        return bArr2;
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public byte[] getResponseData(HttpEntity httpEntity) throws IOException {
        InputStream content;
        if (httpEntity == null || (content = httpEntity.getContent()) == null) {
            return null;
        }
        long contentLength = httpEntity.getContentLength();
        if (contentLength > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        if (contentLength < 0) {
            contentLength = 4096;
        }
        try {
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer((int) contentLength);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = content.read(bArr);
                    if (i == -1 || Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    byteArrayBuffer.append(bArr, 0, i);
                    sendProgressDataMessage(copyOfRange(bArr, 0, i));
                }
                AsyncHttpClient.silentCloseInputStream(content);
                return byteArrayBuffer.toByteArray();
            } catch (Throwable th) {
                AsyncHttpClient.silentCloseInputStream(content);
                throw th;
            }
        } catch (OutOfMemoryError unused) {
            System.gc();
            throw new IOException("File too large to fit into available memory");
        }
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 6) {
            return;
        }
        Object[] objArr = (Object[]) message.obj;
        if (objArr == null || objArr.length < 1) {
            Log.e(LOG_TAG, "PROGRESS_DATA_MESSAGE didn't got enough params");
            return;
        }
        try {
            onProgressData((byte[]) objArr[0]);
        } catch (Throwable th) {
            Log.e(LOG_TAG, "custom onProgressData contains an error", th);
        }
    }

    public void onProgressData(byte[] bArr) {
    }

    public final void sendProgressDataMessage(byte[] bArr) {
        sendMessage(obtainMessage(6, new Object[]{bArr}));
    }
}
