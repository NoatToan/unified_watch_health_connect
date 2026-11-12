package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class OnValueChangedNative implements OnValueChanged {
    private long peer;

    public static class OnValueChangedPeerCleaner implements Runnable {
        private long peer;

        public OnValueChangedPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnValueChangedNative.cleanNativePeer(this.peer);
        }
    }

    private OnValueChangedNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OnValueChangedPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.OnValueChanged
    public native void run(String str, Value value, Value value2);
}
