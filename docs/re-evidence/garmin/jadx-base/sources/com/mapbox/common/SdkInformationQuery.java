package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkInformationQuery implements SdkInformationQueryInterface {
    protected long peer;

    public static class SdkInformationQueryPeerCleaner implements Runnable {
        private long peer;

        public SdkInformationQueryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInformationQuery.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformationQuery(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native List<SdkInformation> getSdkInformation();

    public static native SdkInformation getSdkInformationByName(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInformationQueryPeerCleaner(j8));
    }
}
