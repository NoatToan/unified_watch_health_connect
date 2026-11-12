package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes18.dex */
class c extends EventsHandler<ScribeEvent> {
    public c(Context context, EventsStrategy<ScribeEvent> eventsStrategy, EventsFilesManager eventsFilesManager, ScheduledExecutorService scheduledExecutorService) {
        super(context, eventsStrategy, eventsFilesManager, scheduledExecutorService);
    }

    public void a(ScribeEvent scribeEvent) {
        recordEventAsync(scribeEvent, false);
    }

    public void b(ScribeEvent scribeEvent) {
        recordEventAsync(scribeEvent, true);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsHandler
    public EventsStrategy<ScribeEvent> getDisabledEventsStrategy() {
        return new DisabledEventsStrategy();
    }
}
