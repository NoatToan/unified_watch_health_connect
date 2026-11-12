package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.v;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class c implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21506a = new c();

    public static c b() {
        return f21506a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return e(Thread.currentThread());
    }

    public boolean c(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }

    public boolean d(@NotNull v vVar) {
        Long l = vVar.l();
        return l != null && c(l.longValue());
    }

    public boolean e(@NotNull Thread thread) {
        return c(thread.getId());
    }
}
