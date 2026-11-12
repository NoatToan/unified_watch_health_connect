package defpackage;

import io.sentry.SentryOptions;
import io.sentry.j;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public interface xzc {
    @Nullable
    j a(@NotNull wzc wzcVar, @Nullable List<sqh> list, @NotNull SentryOptions sentryOptions);

    void b(@NotNull wzc wzcVar);

    void close();

    boolean isRunning();

    void start();
}
