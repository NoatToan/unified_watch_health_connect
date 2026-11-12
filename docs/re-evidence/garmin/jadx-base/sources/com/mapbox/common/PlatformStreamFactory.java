package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformStreamFactory {
    protected long peer;

    public static class PlatformStreamFactoryPeerCleaner implements Runnable {
        private long peer;

        public PlatformStreamFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformStreamFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PlatformStreamFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native ReadStream fileReadStream(String str);

    public static native ReadStream memoryReadStream(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new PlatformStreamFactoryPeerCleaner(j8));
    }
}
