package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class EventsServiceObserverNative implements EventsServiceObserver {
    protected long peer;

    public static class EventsServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public EventsServiceObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new EventsServiceObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didEncounterError(EventsServiceError eventsServiceError, Value value);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didSendEvents(Value value);
}
