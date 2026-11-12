package io.sentry.exception;

import io.sentry.protocol.g;
import io.sentry.util.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    @NotNull
    private final g exceptionMechanism;
    private final boolean snapshot;

    @NotNull
    private final Thread thread;

    @NotNull
    private final Throwable throwable;

    public ExceptionMechanismException(@NotNull g gVar, @NotNull Throwable th, @NotNull Thread thread, boolean z) {
        this.exceptionMechanism = (g) p.c(gVar, "Mechanism is required.");
        this.throwable = (Throwable) p.c(th, "Throwable is required.");
        this.thread = (Thread) p.c(thread, "Thread is required.");
        this.snapshot = z;
    }

    @NotNull
    public g getExceptionMechanism() {
        return this.exceptionMechanism;
    }

    @NotNull
    public Thread getThread() {
        return this.thread;
    }

    @NotNull
    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSnapshot() {
        return this.snapshot;
    }

    public ExceptionMechanismException(@NotNull g gVar, @NotNull Throwable th, @NotNull Thread thread) {
        this(gVar, th, thread, false);
    }
}
