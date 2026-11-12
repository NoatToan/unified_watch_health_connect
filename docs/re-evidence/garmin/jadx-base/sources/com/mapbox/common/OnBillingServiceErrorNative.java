package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class OnBillingServiceErrorNative implements OnBillingServiceError {
    private long peer;

    public static class OnBillingServiceErrorPeerCleaner implements Runnable {
        private long peer;

        public OnBillingServiceErrorPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnBillingServiceErrorNative.cleanNativePeer(this.peer);
        }
    }

    private OnBillingServiceErrorNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OnBillingServiceErrorPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.OnBillingServiceError
    public native void run(BillingServiceError billingServiceError);
}
