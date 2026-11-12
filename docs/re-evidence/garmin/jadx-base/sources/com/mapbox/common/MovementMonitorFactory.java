package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class MovementMonitorFactory {
    protected long peer;

    public static class MovementMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public MovementMonitorFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MovementMonitorFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native MovementMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MovementMonitorFactoryPeerCleaner(j8));
    }

    public static native void setUserDefined(MovementMonitorInterface movementMonitorInterface);
}
