package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class BillingService {
    protected long peer;

    public static class BillingServicePeerCleaner implements Runnable {
        private long peer;

        public BillingServicePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BillingService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BillingService(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new BillingServicePeerCleaner(j8));
    }

    public native void beginBillingSession(SdkInformation sdkInformation, SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError, long j8);

    public native String getSessionSKUTokenIfValid(SessionSKUIdentifier sessionSKUIdentifier);

    public native BillingSessionStatus getSessionStatus(SessionSKUIdentifier sessionSKUIdentifier);

    public native String getUserSKUToken(UserSKUIdentifier userSKUIdentifier);

    public native void pauseBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void resumeBillingSession(SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void stopBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void triggerMaploadBillingEvent(MaploadSKUIdentifier maploadSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void triggerUserBillingEvent(SdkInformation sdkInformation, UserSKUIdentifier userSKUIdentifier, OnBillingServiceError onBillingServiceError);
}
