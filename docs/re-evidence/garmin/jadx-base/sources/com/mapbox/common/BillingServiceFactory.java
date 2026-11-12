package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingServiceFactory {
    protected long peer;

    public static class BillingServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public BillingServiceFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BillingServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BillingServiceFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native BillingService getInstance();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new BillingServiceFactoryPeerCleaner(j8));
    }
}
