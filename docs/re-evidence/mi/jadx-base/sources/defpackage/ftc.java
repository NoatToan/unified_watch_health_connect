package defpackage;

import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.a;
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
public interface ftc {
    @NotNull
    ftc clone();

    boolean e();

    void f(boolean z);

    @ApiStatus.Internal
    @Nullable
    z g();

    void h(long j);

    @NotNull
    SentryOptions i();

    boolean isEnabled();

    @ApiStatus.Internal
    @Nullable
    wzc j();

    void k();

    @NotNull
    default p l(@NotNull jul julVar) {
        return p(julVar, new c8c());
    }

    void m(@NotNull a aVar);

    void n();

    void o(@NotNull a aVar, @Nullable c8c c8cVar);

    @NotNull
    p p(@NotNull jul julVar, @Nullable c8c c8cVar);

    @NotNull
    wzc q(@NotNull owp owpVar, @NotNull rwp rwpVar);

    @NotNull
    default p r(@NotNull s sVar) {
        return t(sVar, new c8c());
    }

    @NotNull
    p s(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable c8c c8cVar);

    @NotNull
    p t(@NotNull s sVar, @Nullable c8c c8cVar);

    @ApiStatus.Internal
    void u(@NotNull Throwable th, @NotNull qyc qycVar, @NotNull String str);

    void v(@NotNull hgl hglVar);

    @ApiStatus.Internal
    @NotNull
    default p w(@NotNull w wVar, @Nullable y yVar, @Nullable c8c c8cVar) {
        return x(wVar, yVar, c8cVar, null);
    }

    @ApiStatus.Internal
    @NotNull
    p x(@NotNull w wVar, @Nullable y yVar, @Nullable c8c c8cVar, @Nullable j jVar);
}
