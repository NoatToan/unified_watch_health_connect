package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes18.dex */
class a extends EnabledEventsStrategy<ScribeEvent> {
    private final FilesSender e;

    public a(Context context, ScheduledExecutorService scheduledExecutorService, b bVar, ScribeConfig scribeConfig, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, bVar);
        this.e = scribeFilesSender;
        configureRollover(scribeConfig.sendIntervalSeconds);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStrategy
    public FilesSender getFilesSender() {
        return this.e;
    }
}
