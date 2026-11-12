package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class MetricsService {
    protected long peer;

    public static class MetricsServicePeerCleaner implements Runnable {
        private long peer;

        public MetricsServicePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MetricsService(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServicePeerCleaner(j8));
    }

    public native void addMetricsSource(MetricsSource metricsSource);

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    public native void removeMetricsSource(MetricsSource metricsSource);

    public native void serialize(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void serializePretty(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void setTag(String str);

    public native void start(Long l14);

    public native void stop();

    public native void subscribeToConfigUpdates();
}
