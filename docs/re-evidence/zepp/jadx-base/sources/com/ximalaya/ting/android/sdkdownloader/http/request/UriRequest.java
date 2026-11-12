package com.ximalaya.ting.android.sdkdownloader.http.request;

import com.ximalaya.ting.android.sdkdownloader.http.ProgressHandler;
import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.loader.FileLoader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes22.dex */
public abstract class UriRequest implements Closeable {
    public final FileLoader loader;
    public final RequestParams params;
    public final String queryUrl;
    public ClassLoader callingClassLoader = null;
    public ProgressHandler progressHandler = null;

    public UriRequest(RequestParams requestParams) throws Throwable {
        this.params = requestParams;
        this.queryUrl = buildQueryUrl(requestParams);
        FileLoader fileLoader = new FileLoader();
        this.loader = fileLoader;
        fileLoader.setParams(requestParams);
    }

    public String buildQueryUrl(RequestParams requestParams) {
        return requestParams.getUri();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract void closeAndRemove();

    public abstract long getContentLength();

    public abstract InputStream getInputStream() throws IOException;

    public RequestParams getParams() {
        return this.params;
    }

    public String getRequestUri() {
        return this.queryUrl;
    }

    public abstract int getResponseCode() throws IOException;

    public abstract String getResponseHeader(String str);

    public abstract String getResponseMessage() throws IOException;

    public abstract boolean isLoading();

    public Object loadResult() throws Throwable {
        return this.loader.load(this);
    }

    public abstract void sendRequest() throws Throwable;

    public void setCallingClassLoader(ClassLoader classLoader) {
        this.callingClassLoader = classLoader;
    }

    public void setProgressHandler(ProgressHandler progressHandler) {
        this.progressHandler = progressHandler;
        this.loader.setProgressHandler(progressHandler);
    }

    public String toString() {
        return getRequestUri();
    }
}
