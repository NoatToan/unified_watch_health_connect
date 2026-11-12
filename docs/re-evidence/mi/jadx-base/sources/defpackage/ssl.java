package defpackage;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ssl implements rsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final psl f33951a;

    public ssl(@NotNull psl pslVar) {
        this.f33951a = (psl) p.c(pslVar, "SendFireAndForgetDirPath is required");
    }

    @Override // defpackage.rsl
    @Nullable
    public osl c(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        p.c(ftcVar, "Hub is required");
        p.c(sentryOptions, "SentryOptions is required");
        String strA = this.f33951a.a();
        if (strA != null && a(strA, sentryOptions.getLogger())) {
            return b(new yc8(ftcVar, sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), strA, sentryOptions.getLogger());
        }
        sentryOptions.getLogger().c(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }
}
