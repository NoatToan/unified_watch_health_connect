package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface EventsServiceInterface {
    void flush(FlushOperationResultCallback flushOperationResultCallback);

    void registerObserver(EventsServiceObserver eventsServiceObserver);

    void sendCrashEvent(CrashEvent crashEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    void sendEvent(Event event, EventsServiceResponseCallback eventsServiceResponseCallback);

    void sendTurnstileEvent(TurnstileEvent turnstileEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    void unregisterObserver(EventsServiceObserver eventsServiceObserver);
}
