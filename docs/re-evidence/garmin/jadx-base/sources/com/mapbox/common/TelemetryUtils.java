package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class TelemetryUtils {
    protected long peer;

    public static class TelemetryUtilsPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtils.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryUtils() {
        initialize();
    }

    public static native void cleanNativePeer(long j8);

    public static native TelemetryCollectionState getClientServerEventsCollectionState();

    public static native boolean getEventsCollectionState();

    public static native String getUserID();

    private native void initialize();

    public static native void setEventsCollectionState(boolean z14, TelemetryUtilsResponseCallback telemetryUtilsResponseCallback);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryUtilsPeerCleaner(j8));
    }

    public native void registerTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public native void unregisterTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public TelemetryUtils(long j8) {
        setPeer(j8);
    }
}
