package com.huami.sync.job;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sync/job/Logging;", "", "Lcom/huami/sync/job/Logger;", "a", "Lcom/huami/sync/job/Logger;", "getLogger$realtime_transmission_release", "()Lcom/huami/sync/job/Logger;", "setLogger$realtime_transmission_release", "(Lcom/huami/sync/job/Logger;)V", "logger", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class Logging {

    @NotNull
    public static final Logging INSTANCE = new Logging();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Logger logger = LoggerKt.getDEFAULT(Logger.INSTANCE);

    private Logging() {
    }

    @NotNull
    public final Logger getLogger$realtime_transmission_release() {
        return logger;
    }

    public final void setLogger$realtime_transmission_release(@NotNull Logger logger2) {
        logger = logger2;
    }
}
