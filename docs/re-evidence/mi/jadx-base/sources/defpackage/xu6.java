package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class xu6 implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f39473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ILogger f39474b;

    public xu6(@NotNull SentryOptions sentryOptions, @Nullable ILogger iLogger) {
        this.f39473a = (SentryOptions) p.c(sentryOptions, "SentryOptions is required.");
        this.f39474b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th) {
        if (this.f39474b == null || !d(sentryLevel)) {
            return;
        }
        this.f39474b.a(sentryLevel, str, th);
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull SentryLevel sentryLevel, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        if (this.f39474b == null || !d(sentryLevel)) {
            return;
        }
        this.f39474b.b(sentryLevel, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        if (this.f39474b == null || !d(sentryLevel)) {
            return;
        }
        this.f39474b.c(sentryLevel, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable SentryLevel sentryLevel) {
        return sentryLevel != null && this.f39473a.isDebug() && sentryLevel.ordinal() >= this.f39473a.getDiagnosticLevel().ordinal();
    }
}
