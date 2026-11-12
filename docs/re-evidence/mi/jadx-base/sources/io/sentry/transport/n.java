package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f21865a = new n();

    public static p b() {
        return f21865a;
    }

    @Override // io.sentry.transport.p
    public final long a() {
        return System.currentTimeMillis();
    }
}
