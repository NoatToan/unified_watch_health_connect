package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class HttpServiceInterfaceNative implements HttpServiceInterface {
    protected long peer;

    public static class HttpServiceInterfacePeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public HttpServiceInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new HttpServiceInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelRequest(long j8, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelUpload(long j8, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long download(DownloadOptions downloadOptions, DownloadStatusCallback downloadStatusCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long request(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setMaxRequestsPerHost(byte b14);

    @Override // com.mapbox.common.HttpServiceInterface
    @Deprecated
    public native boolean supportsKeepCompression();

    @Override // com.mapbox.common.HttpServiceInterface
    public native long upload(UploadOptions uploadOptions, UploadStatusCallback uploadStatusCallback);
}
