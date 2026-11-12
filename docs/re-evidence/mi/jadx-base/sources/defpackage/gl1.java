package defpackage;

import io.sentry.SentryOptions;
import io.sentry.transport.e;
import io.sentry.transport.q;
import io.sentry.transport.z;
import io.sentry.util.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class gl1 implements yzc {
    @Override // defpackage.yzc
    @NotNull
    public q a(@NotNull SentryOptions sentryOptions, @NotNull iok iokVar) {
        p.c(sentryOptions, "options is required");
        p.c(iokVar, "requestDetails is required");
        return new e(sentryOptions, new z(sentryOptions), sentryOptions.getTransportGate(), iokVar);
    }
}
