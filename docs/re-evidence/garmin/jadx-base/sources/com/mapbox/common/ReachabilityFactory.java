package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class ReachabilityFactory {
    protected long peer;

    public static class ReachabilityFactoryPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ReachabilityFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native ReachabilityInterface reachability(String str);

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ReachabilityFactoryPeerCleaner(j8));
    }
}
