package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpServiceFactory {
    protected long peer;

    public static class HttpServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpServiceFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native HttpServiceInterface getInstance();

    public static native void reset();

    public static native Cancelable setCancellationCallback(HttpServiceCancellationCallback httpServiceCancellationCallback);

    public static native void setHttpServiceInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    public static native void setMaxRequestsPerHost(byte b14);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new HttpServiceFactoryPeerCleaner(j8));
    }

    public static native void setUserDefined(HttpServiceInterface httpServiceInterface);
}
