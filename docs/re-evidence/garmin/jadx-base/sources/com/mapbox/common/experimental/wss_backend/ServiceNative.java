package com.mapbox.common.experimental.wss_backend;

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

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void cancelConnection(long j8, ResultCallback resultCallback);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native long connect(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void setPingTimeout(long j8);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void write(long j8, Data data);
}
