package com.huami.sync.job;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"", "message", "", "log", "Lcom/huami/sync/job/Logger;", "logger", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class LoggingKt {
    public static final void log(@Nullable String str) {
        Logging.INSTANCE.getLogger$realtime_transmission_release().log(str);
    }

    public static final void logger(@NotNull Logger logger) {
        Logging.INSTANCE.setLogger$realtime_transmission_release(logger);
    }
}
