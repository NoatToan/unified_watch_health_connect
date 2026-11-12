package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Thread f21386a;

    public ApplicationNotResponding(@Nullable String str, @NotNull Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.p.c(thread, "Thread must be provided.");
        this.f21386a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    @NotNull
    public Thread a() {
        return this.f21386a;
    }
}
