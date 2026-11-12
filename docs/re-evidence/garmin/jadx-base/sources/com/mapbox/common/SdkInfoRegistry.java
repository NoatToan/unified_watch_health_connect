package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkInfoRegistry implements SdkInfoRegistryInterface {
    protected long peer;

    public static class SdkInfoRegistryPeerCleaner implements Runnable {
        private long peer;

        public SdkInfoRegistryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistry.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInfoRegistry(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryPeerCleaner(j8));
    }

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native List<SdkInformation> getSdkInformation();

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native void registerSdkInformation(SdkInformation sdkInformation);
}
