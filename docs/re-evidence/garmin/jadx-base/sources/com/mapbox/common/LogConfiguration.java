package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class LogConfiguration {
    protected long peer;

    public static class LogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public LogConfigurationPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LogConfiguration(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native LoggingLevel getLoggingLevel();

    public static native LoggingLevel getLoggingLevel(String str);

    public static native void registerLogWriterBackend(LogWriterBackend logWriterBackend);

    public static native void resetLoggingLevel(String str);

    public static native void setLoggingLevel(LoggingLevel loggingLevel);

    public static native void setLoggingLevel(String str, LoggingLevel loggingLevel);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new LogConfigurationPeerCleaner(j8));
    }
}
