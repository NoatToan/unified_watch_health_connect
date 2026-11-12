package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceData {
    protected long peer;

    public static class ResourceDataPeerCleaner implements Runnable {
        private long peer;

        public ResourceDataPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceData.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceData(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ResourceDataPeerCleaner(j8));
    }

    public native DataRef getData();
}
