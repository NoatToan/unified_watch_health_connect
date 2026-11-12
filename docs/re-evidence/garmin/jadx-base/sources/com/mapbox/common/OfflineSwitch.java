package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class OfflineSwitch {
    protected long peer;

    public static class OfflineSwitchPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitch.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public OfflineSwitch(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native OfflineSwitch getInstance();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineSwitchPeerCleaner(j8));
    }

    public native boolean isMapboxStackConnected();

    public native void registerObserver(OfflineSwitchObserver offlineSwitchObserver);

    public native void setMapboxStackConnected(boolean z14);

    public native void unregisterObserver(OfflineSwitchObserver offlineSwitchObserver);
}
