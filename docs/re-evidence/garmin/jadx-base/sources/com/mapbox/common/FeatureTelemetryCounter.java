package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class FeatureTelemetryCounter {
    protected long peer;

    public static class FeatureTelemetryCounterPeerCleaner implements Runnable {
        private long peer;

        public FeatureTelemetryCounterPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureTelemetryCounter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public FeatureTelemetryCounter(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native FeatureTelemetryCounter create(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new FeatureTelemetryCounterPeerCleaner(j8));
    }

    public native String getName();

    public native int getValue();

    public native void increment();

    public native void reset();
}
