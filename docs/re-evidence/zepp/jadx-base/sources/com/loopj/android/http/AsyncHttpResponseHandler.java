package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.ByteArrayBuffer;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AsyncHttpResponseHandler implements ResponseHandlerInterface {
    public static final int BUFFER_SIZE = 4096;
    public static final int CANCEL_MESSAGE = 6;
    public static final String DEFAULT_CHARSET = "UTF-8";
    public static final int FAILURE_MESSAGE = 1;
    public static final int FINISH_MESSAGE = 3;
    private static final String LOG_TAG = "AsyncHttpResponse";
    public static final int PROGRESS_MESSAGE = 4;
    public static final int RETRY_MESSAGE = 5;
    public static final int START_MESSAGE = 2;
    public static final int SUCCESS_MESSAGE = 0;
    private Handler handler;
    private boolean useSynchronousMode;
    private String responseCharset = "UTF-8";
    private URI requestURI = null;
    private Header[] requestHeaders = null;

    public static class ResponderHandler extends Handler {
        private final AsyncHttpResponseHandler mResponder;

        public ResponderHandler(AsyncHttpResponseHandler asyncHttpResponseHandler) {
            this.mResponder = asyncHttpResponseHandler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.mResponder.handleMessage(message);
        }
    }

    public AsyncHttpResponseHandler() {
        setUseSynchronousMode(false);
    }

    public String getCharset() {
        String str = this.responseCharset;
        return str == null ? "UTF-8" : str;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public Header[] getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public URI getRequestURI() {
        return this.requestURI;
    }

    public byte[] getResponseData(HttpEntity httpEntity) throws IOException {
        InputStream content;
        if (httpEntity == null || (content = httpEntity.getContent()) == null) {
            return null;
        }
        long contentLength = httpEntity.getContentLength();
        if (contentLength > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        try {
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength <= 0 ? 4096 : (int) contentLength);
            try {
                byte[] bArr = new byte[4096];
                int i = 0;
                while (true) {
                    int i2 = content.read(bArr);
                    if (i2 == -1 || Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    i += i2;
                    byteArrayBuffer.append(bArr, 0, i2);
                    sendProgressMessage(i, (int) (contentLength <= 0 ? 1L : contentLength));
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

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public boolean getUseSynchronousMode() {
        return this.useSynchronousMode;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                if (objArr != null && objArr.length >= 3) {
                    onSuccess(((Integer) objArr[0]).intValue(), (Header[]) objArr[1], (byte[]) objArr[2]);
                } else {
                    Log.e(LOG_TAG, "SUCCESS_MESSAGE didn't got enough params");
                }
                break;
            case 1:
                Object[] objArr2 = (Object[]) message.obj;
                if (objArr2 != null && objArr2.length >= 4) {
                    onFailure(((Integer) objArr2[0]).intValue(), (Header[]) objArr2[1], (byte[]) objArr2[2], (Throwable) objArr2[3]);
                } else {
                    Log.e(LOG_TAG, "FAILURE_MESSAGE didn't got enough params");
                }
                break;
            case 2:
                onStart();
                break;
            case 3:
                onFinish();
                break;
            case 4:
                Object[] objArr3 = (Object[]) message.obj;
                if (objArr3 == null || objArr3.length < 2) {
                    Log.e(LOG_TAG, "PROGRESS_MESSAGE didn't got enough params");
                } else {
                    try {
                        onProgress(((Integer) objArr3[0]).intValue(), ((Integer) objArr3[1]).intValue());
                    } catch (Throwable th) {
                        Log.e(LOG_TAG, "custom onProgress contains an error", th);
                        return;
                    }
                }
                break;
            case 5:
                Object[] objArr4 = (Object[]) message.obj;
                if (objArr4 != null && objArr4.length == 1) {
                    onRetry(((Integer) objArr4[0]).intValue());
                } else {
                    Log.e(LOG_TAG, "RETRY_MESSAGE didn't get enough params");
                }
                break;
            case 6:
                onCancel();
                break;
        }
    }

    public Message obtainMessage(int i, Object obj) {
        Handler handler = this.handler;
        if (handler != null) {
            return Message.obtain(handler, i, obj);
        }
        Message messageObtain = Message.obtain();
        if (messageObtain == null) {
            return messageObtain;
        }
        messageObtain.what = i;
        messageObtain.obj = obj;
        return messageObtain;
    }

    public void onCancel() {
    }

    public abstract void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th);

    public void onFinish() {
    }

    public void onProgress(int i, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Double.valueOf(i2 > 0 ? ((((double) i) * 1.0d) / ((double) i2)) * 100.0d : -1.0d);
        Log.v(LOG_TAG, String.format("Progress %d from %d (%2.0f%%)", objArr));
    }

    public void onRetry(int i) {
    }

    public void onStart() {
    }

    public abstract void onSuccess(int i, Header[] headerArr, byte[] bArr);

    public void postRunnable(Runnable runnable) {
        Handler handler;
        if (runnable != null) {
            if (getUseSynchronousMode() || (handler = this.handler) == null) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendCancelMessage() {
        sendMessage(obtainMessage(6, null));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFailureMessage(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        sendMessage(obtainMessage(1, new Object[]{Integer.valueOf(i), headerArr, bArr, th}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFinishMessage() {
        sendMessage(obtainMessage(3, null));
    }

    public void sendMessage(Message message) {
        if (getUseSynchronousMode() || this.handler == null) {
            handleMessage(message);
        } else {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            this.handler.sendMessage(message);
        }
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendProgressMessage(int i, int i2) {
        sendMessage(obtainMessage(4, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void sendResponseMessage(HttpResponse httpResponse) throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        StatusLine statusLine = httpResponse.getStatusLine();
        byte[] responseData = getResponseData(httpResponse.getEntity());
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        if (statusLine.getStatusCode() >= 300) {
            sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData, new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
        } else {
            sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData);
        }
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendRetryMessage(int i) {
        sendMessage(obtainMessage(5, new Object[]{Integer.valueOf(i)}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendStartMessage() {
        sendMessage(obtainMessage(2, null));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendSuccessMessage(int i, Header[] headerArr, byte[] bArr) {
        sendMessage(obtainMessage(0, new Object[]{Integer.valueOf(i), headerArr, bArr}));
    }

    public void setCharset(String str) {
        this.responseCharset = str;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestHeaders(Header[] headerArr) {
        this.requestHeaders = headerArr;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestURI(URI uri) {
        this.requestURI = uri;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setUseSynchronousMode(boolean z) {
        if (!z && Looper.myLooper() == null) {
            z = true;
            Log.w(LOG_TAG, "Current thread has not called Looper.prepare().Forcing synchronous mode");
        }
        if (!z && this.handler == null) {
            this.handler = new ResponderHandler(this);
        } else if (z && this.handler != null) {
            this.handler = null;
        }
        this.useSynchronousMode = z;
    }
}
