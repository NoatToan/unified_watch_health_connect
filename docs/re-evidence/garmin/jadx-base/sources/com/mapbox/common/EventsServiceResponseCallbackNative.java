package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
final class EventsServiceResponseCallbackNative implements EventsServiceResponseCallback {
    private long peer;

    public static class EventsServiceResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceResponseCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private EventsServiceResponseCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new EventsServiceResponseCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
