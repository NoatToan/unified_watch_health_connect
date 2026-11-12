package com.mapbox.common.http_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes2.dex */
final class ServiceNative implements Service {
    protected long peer;

    public static class ServicePeerCleaner implements Runnable {
        private long peer;

        public ServicePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ServiceNative.cleanNativePeer(this.peer);
        }
    }

    public ServiceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ServicePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.http_backend.Service
    public native void cancelRequest(long j8, ResultCallback resultCallback);

    @Override // com.mapbox.common.http_backend.Service
    public native long request(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.http_backend.Service
    public native void setMaxRequestsPerHost(byte b14);

    @Override // com.mapbox.common.http_backend.Service
    public native boolean supportsKeepCompression();
}
