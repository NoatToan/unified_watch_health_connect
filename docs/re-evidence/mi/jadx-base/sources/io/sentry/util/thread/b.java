package io.sentry.util.thread;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21899a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21900b = new b();

    public static b b() {
        return f21900b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return d(Thread.currentThread());
    }

    public boolean c(long j) {
        return f21899a == j;
    }

    public boolean d(@NotNull Thread thread) {
        return c(thread.getId());
    }
}
