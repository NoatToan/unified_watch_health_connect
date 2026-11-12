package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkInfoRegistryFactory implements SdkInfoRegistryFactoryInterface {
    protected long peer;

    public static class SdkInfoRegistryFactoryPeerCleaner implements Runnable {
        private long peer;

        public SdkInfoRegistryFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistryFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInfoRegistryFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native SdkInfoRegistry getInstance();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryFactoryPeerCleaner(j8));
    }
}
