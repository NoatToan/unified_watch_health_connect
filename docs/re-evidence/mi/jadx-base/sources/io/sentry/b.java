package io.sentry;

import defpackage.ae8;
import defpackage.c8c;
import io.sentry.hints.EventDropReason;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Long> f21661a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21662b;

    public b(@NotNull SentryOptions sentryOptions) {
        this.f21662b = sentryOptions;
    }

    @Override // defpackage.ae8
    @Nullable
    public s a(@NotNull s sVar, @NotNull c8c c8cVar) {
        io.sentry.protocol.o oVarW0;
        String strK;
        Long lJ;
        if (!io.sentry.util.j.h(c8cVar, UncaughtExceptionHandlerIntegration.a.class) || (oVarW0 = sVar.w0()) == null || (strK = oVarW0.k()) == null || (lJ = oVarW0.j()) == null) {
            return sVar;
        }
        Long l = this.f21661a.get(strK);
        if (l == null || l.equals(lJ)) {
            this.f21661a.put(strK, lJ);
            return sVar;
        }
        this.f21662b.getLogger().c(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", sVar.G());
        io.sentry.util.j.r(c8cVar, EventDropReason.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
