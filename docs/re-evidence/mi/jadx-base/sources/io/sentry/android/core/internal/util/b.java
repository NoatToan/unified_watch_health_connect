package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b implements io.sentry.transport.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.transport.p f21505a = new b();

    public static io.sentry.transport.p b() {
        return f21505a;
    }

    @Override // io.sentry.transport.p
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
