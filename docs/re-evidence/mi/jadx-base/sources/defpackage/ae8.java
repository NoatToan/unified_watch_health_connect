package defpackage;

import io.sentry.SentryReplayEvent;
import io.sentry.protocol.w;
import io.sentry.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ae8 {
    @Nullable
    default s a(@NotNull s sVar, @NotNull c8c c8cVar) {
        return sVar;
    }

    @Nullable
    default w b(@NotNull w wVar, @NotNull c8c c8cVar) {
        return wVar;
    }

    @Nullable
    default SentryReplayEvent c(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull c8c c8cVar) {
        return sentryReplayEvent;
    }
}
