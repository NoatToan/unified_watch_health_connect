package com.ximalaya.ting.android.sdkdownloader.http.request;

import android.annotation.TargetApi;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ximalaya.ting.android.sdkdownloader.exception.HttpException;
import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.loader.FileLoader;
import com.ximalaya.ting.android.sdkdownloader.util.IOUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public final class HttpRequest extends UriRequest {
    private boolean a;
    private InputStream b;
    private Call c;
    private Response d;
    private int e;

    public HttpRequest(RequestParams requestParams) throws Throwable {
        super(requestParams);
        this.a = false;
        this.b = null;
        this.e = 0;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Call call = this.c;
        if (call != null) {
            call.cancel();
        }
        InputStream inputStream = this.b;
        if (inputStream != null) {
            IOUtil.closeQuietly(inputStream);
            this.b = null;
        }
        FileLoader fileLoader = this.loader;
        if (fileLoader != null) {
            fileLoader.close();
        }
        Response response = this.d;
        if (response != null) {
            response.close();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public void closeAndRemove() {
        Call call = this.c;
        if (call != null) {
            call.cancel();
        }
        InputStream inputStream = this.b;
        if (inputStream != null) {
            IOUtil.closeQuietly(inputStream);
            this.b = null;
        }
        FileLoader fileLoader = this.loader;
        if (fileLoader != null) {
            fileLoader.closeAndRemove();
        }
        Response response = this.d;
        if (response != null) {
            response.close();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public long getContentLength() {
        int iAvailable;
        Response response = this.d;
        long jContentLength = 0;
        try {
            if (response != null) {
                try {
                    jContentLength = response.body().contentLength();
                } catch (Throwable unused) {
                }
                if (jContentLength >= 1) {
                    return jContentLength;
                }
                iAvailable = getInputStream().available();
            } else {
                iAvailable = getInputStream().available();
            }
            jContentLength = iAvailable;
            return jContentLength;
        } catch (Throwable unused2) {
            return jContentLength;
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public InputStream getInputStream() throws IOException {
        Response response = this.d;
        if (response != null && this.b == null) {
            this.b = response.body().byteStream();
        }
        return this.b;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public String getRequestUri() {
        String str = this.queryUrl;
        Response response = this.d;
        return response != null ? response.request().url().toString() : str;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public int getResponseCode() throws IOException {
        if (this.d != null) {
            return this.e;
        }
        return getInputStream() != null ? 200 : 404;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public String getResponseHeader(String str) {
        Response response = this.d;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public String getResponseMessage() throws IOException {
        Response response = this.d;
        if (response != null) {
            return URLDecoder.decode(response.message(), this.params.getCharset());
        }
        return null;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public boolean isLoading() {
        return this.a;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    public Object loadResult() throws Throwable {
        this.a = true;
        return super.loadResult();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest
    @TargetApi(19)
    public void sendRequest() throws Throwable {
        this.a = false;
        this.e = 0;
        Call callA = a.a(this.params, this.progressHandler);
        this.c = callA;
        Response responseExecute = FirebasePerfOkHttpClient.execute(callA);
        this.d = responseExecute;
        int iCode = responseExecute.code();
        this.e = iCode;
        if (iCode == 204 || iCode == 205) {
            throw new HttpException(this.e, getResponseMessage());
        }
        if (iCode < 300) {
            this.a = true;
            return;
        }
        HttpException httpException = new HttpException(this.e, getResponseMessage());
        try {
            httpException.setResult(IOUtil.readStr(getInputStream(), this.params.getCharset()));
            throw httpException;
        } catch (Throwable unused) {
            throw httpException;
        }
    }
}
