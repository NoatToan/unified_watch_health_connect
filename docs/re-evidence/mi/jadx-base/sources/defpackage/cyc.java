package defpackage;

import io.sentry.SentryReplayEvent;
import io.sentry.Session;
import io.sentry.e;
import io.sentry.j;
import io.sentry.protocol.p;
import io.sentry.protocol.w;
import io.sentry.s;
import io.sentry.transport.z;
import io.sentry.y;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface cyc {
    void a(@NotNull Session session, @Nullable c8c c8cVar);

    @NotNull
    p b(@NotNull s sVar, @Nullable e eVar, @Nullable c8c c8cVar);

    @NotNull
    p c(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable e eVar, @Nullable c8c c8cVar);

    @ApiStatus.Internal
    @NotNull
    p d(@NotNull w wVar, @Nullable y yVar, @Nullable e eVar, @Nullable c8c c8cVar, @Nullable j jVar);

    @ApiStatus.Internal
    default boolean e() {
        return true;
    }

    void f(boolean z);

    @ApiStatus.Internal
    @Nullable
    z g();

    void h(long j);

    @Nullable
    default p l(@NotNull jul julVar) {
        return p(julVar, null);
    }

    @Nullable
    p p(@NotNull jul julVar, @Nullable c8c c8cVar);
}
