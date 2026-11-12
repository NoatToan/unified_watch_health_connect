package com.huami.sync.job;

import com.facebook.share.internal.MessengerShareContentUtility;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/huami/sync/job/Logger$Companion;", "Lcom/huami/sync/job/Logger;", "getDEFAULT", "(Lcom/huami/sync/job/Logger$Companion;)Lcom/huami/sync/job/Logger;", MessengerShareContentUtility.PREVIEW_DEFAULT, "getSIMPLE", "SIMPLE", "getEMPTY", "EMPTY", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class LoggerKt {
    @NotNull
    public static final Logger getDEFAULT(@NotNull Logger.Companion companion) {
        return new Android();
    }

    @NotNull
    public static final Logger getEMPTY(@NotNull Logger.Companion companion) {
        return new Logger() { // from class: com.huami.sync.job.LoggerKt$EMPTY$1
            @Override // com.huami.sync.job.Logger
            public void log(@Nullable String message) {
            }
        };
    }

    @NotNull
    public static final Logger getSIMPLE(@NotNull Logger.Companion companion) {
        return new a();
    }
}
