package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ILogger {
    void a(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th);

    void b(@NotNull SentryLevel sentryLevel, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr);

    void c(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr);

    boolean d(@Nullable SentryLevel sentryLevel);
}
