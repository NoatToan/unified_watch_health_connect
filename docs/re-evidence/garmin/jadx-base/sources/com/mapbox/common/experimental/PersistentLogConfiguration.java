package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
public final class PersistentLogConfiguration {
    protected long peer;

    public static class PersistentLogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public PersistentLogConfigurationPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentLogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentLogConfiguration(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    @MapboxExperimental
    public static native boolean getFileAllowHeader();

    @MapboxExperimental
    public static native Long getFileFlushBufferSize();

    @MapboxExperimental
    public static native LoggingLevel getFileFlushImmediateFromLogLevel();

    @MapboxExperimental
    public static native Long getFileFlushLines();

    @MapboxExperimental
    public static native Long getFileFlushSeconds();

    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevel();

    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevelForCategory(String str);

    @MapboxExperimental
    public static native long getFileMaxSize();

    @MapboxExperimental
    public static native String getFilePath();

    @MapboxExperimental
    public static native boolean getFilePerCategory();

    @MapboxExperimental
    public static native long getFileRotateCount();

    @MapboxExperimental
    public static native void resetFileLoggingLevelForCategory(String str);

    @MapboxExperimental
    public static native void setFileAllowHeader(boolean z14);

    @MapboxExperimental
    public static native void setFileFlushConfig(Long l14, Long l15, Long l16, LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevel(LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevelForCategory(String str, LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileMaxSize(long j8);

    @MapboxExperimental
    public static native void setFilePath(String str);

    @MapboxExperimental
    public static native void setFilePerCategory(boolean z14);

    @MapboxExperimental
    public static native void setFileRotateCount(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new PersistentLogConfigurationPeerCleaner(j8));
    }
}
