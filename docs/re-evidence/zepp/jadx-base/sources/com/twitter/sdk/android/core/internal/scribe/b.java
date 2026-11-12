package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
class b extends EventsFilesManager<ScribeEvent> {
    public static final String b = "se";
    public static final String c = ".tap";

    public b(Context context, EventTransform<ScribeEvent> eventTransform, CurrentTimeProvider currentTimeProvider, QueueFileEventStorage queueFileEventStorage, int i) throws IOException {
        super(context, eventTransform, currentTimeProvider, queueFileEventStorage, i);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsFilesManager
    public String generateUniqueRollOverFileName() {
        return b + "_" + UUID.randomUUID().toString() + "_" + this.currentTimeProvider.getCurrentTimeMillis() + c;
    }
}
