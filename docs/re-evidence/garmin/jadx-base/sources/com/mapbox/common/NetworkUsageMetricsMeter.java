package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkUsageMetricsMeter {
    protected long peer;

    public static class NetworkUsageMetricsMeterPeerCleaner implements Runnable {
        private long peer;

        public NetworkUsageMetricsMeterPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUsageMetricsMeter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public NetworkUsageMetricsMeter(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native void onBytesTransferred(String str, int i14, int i15);

    public static native void onHttpCodeReceived(int i14);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new NetworkUsageMetricsMeterPeerCleaner(j8));
    }
}
