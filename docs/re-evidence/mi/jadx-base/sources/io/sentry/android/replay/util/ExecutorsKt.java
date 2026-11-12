package io.sentry.android.replay.util;

import defpackage.dyc;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000e\u001aI\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lio/sentry/SentryOptions;", "options", "", "gracefullyShutdown", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/SentryOptions;)V", "Ldyc;", "", "taskName", "Ljava/lang/Runnable;", "task", "Ljava/util/concurrent/Future;", "submitSafely", "(Ldyc;Lio/sentry/SentryOptions;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/SentryOptions;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "initialDelay", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/ScheduledFuture;", "scheduleAtFixedRateSafely", "(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/SentryOptions;Ljava/lang/String;JJLjava/util/concurrent/TimeUnit;Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;", "sentry-android-replay_release"}, k = 2, mv = {1, 8, 0})
public final class ExecutorsKt {
    public static final void gracefullyShutdown(@NotNull ExecutorService executorService, @NotNull SentryOptions options) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public static final ScheduledFuture<?> scheduleAtFixedRateSafely(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull final SentryOptions options, @NotNull final String taskName, long j, long j2, @NotNull TimeUnit unit, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: io.sentry.android.replay.util.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(task, options, taskName);
                }
            }, j, j2, unit);
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAtFixedRateSafely$lambda$3(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    @Nullable
    public static final Future<?> submitSafely(@NotNull dyc dycVar, @NotNull final SentryOptions options, @NotNull final String taskName, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(dycVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return dycVar.submit(new Runnable() { // from class: io.sentry.android.replay.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.submitSafely$lambda$1(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$1(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$2(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    @Nullable
    public static final Future<?> submitSafely(@NotNull ExecutorService executorService, @NotNull final SentryOptions options, @NotNull final String taskName, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return executorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.b
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.submitSafely$lambda$2(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }
}
