package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpServiceInterface {
    void cancelRequest(long j8, ResultCallback resultCallback);

    void cancelUpload(long j8, ResultCallback resultCallback);

    long download(DownloadOptions downloadOptions, DownloadStatusCallback downloadStatusCallback);

    long request(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback);

    void setInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    void setMaxRequestsPerHost(byte b14);

    @Deprecated
    boolean supportsKeepCompression();

    long upload(UploadOptions uploadOptions, UploadStatusCallback uploadStatusCallback);
}
