package com.loopj.android.http;

import android.util.Log;
import com.xmlywind.sdk.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

/* JADX INFO: loaded from: classes18.dex */
public abstract class RangeFileAsyncHttpResponseHandler extends FileAsyncHttpResponseHandler {
    private static final String LOG_TAG = "RangeFileAsyncHttp";
    private boolean append;
    private long current;

    public RangeFileAsyncHttpResponseHandler(File file) {
        super(file);
        this.current = 0L;
        this.append = false;
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler, com.loopj.android.http.AsyncHttpResponseHandler
    public byte[] getResponseData(HttpEntity httpEntity) throws IOException {
        int i;
        if (httpEntity == null) {
            return null;
        }
        InputStream content = httpEntity.getContent();
        long contentLength = httpEntity.getContentLength() + this.current;
        FileOutputStream fileOutputStream = new FileOutputStream(getTargetFile(), this.append);
        if (content == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (this.current < contentLength && (i = content.read(bArr)) != -1 && !Thread.currentThread().isInterrupted()) {
                this.current += (long) i;
                fileOutputStream.write(bArr, 0, i);
                sendProgressMessage((int) this.current, (int) contentLength);
            }
            content.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return null;
        } catch (Throwable th) {
            content.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler, com.loopj.android.http.ResponseHandlerInterface
    public void sendResponseMessage(HttpResponse httpResponse) throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        StatusLine statusLine = httpResponse.getStatusLine();
        if (statusLine.getStatusCode() == 416) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null);
            return;
        }
        if (statusLine.getStatusCode() >= 300) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null, new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
        } else {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            Header firstHeader = httpResponse.getFirstHeader("Content-Range");
            if (firstHeader == null) {
                this.append = false;
                this.current = 0L;
            } else {
                Log.v(LOG_TAG, "Content-Rnage: " + firstHeader.getValue());
            }
            sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), getResponseData(httpResponse.getEntity()));
        }
    }

    public void updateRequestHeaders(HttpUriRequest httpUriRequest) {
        if (this.mFile.exists() && this.mFile.canWrite()) {
            this.current = this.mFile.length();
        }
        if (this.current > 0) {
            this.append = true;
            httpUriRequest.setHeader("Range", Constants.RANGE_PARAMS + this.current + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
    }
}
