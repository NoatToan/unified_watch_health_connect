package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class xug implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xug f39480a = new xug();

    public static xug e() {
        return f39480a;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th) {
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull SentryLevel sentryLevel, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable SentryLevel sentryLevel) {
        return false;
    }
}
