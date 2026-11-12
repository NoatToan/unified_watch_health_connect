package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.transport.p f21511b;
    public final int d;

    @NotNull
    public final AtomicInteger c = new AtomicInteger(0);

    @NotNull
    public final AtomicLong e = new AtomicLong(0);

    public g(@NotNull io.sentry.transport.p pVar, long j, int i) {
        this.f21511b = pVar;
        this.f21510a = j;
        this.d = i <= 0 ? 1 : i;
    }

    public boolean a() {
        long jA = this.f21511b.a();
        if (this.e.get() == 0 || this.e.get() + this.f21510a <= jA) {
            this.c.set(0);
            this.e.set(jA);
            return false;
        }
        if (this.c.incrementAndGet() < this.d) {
            return false;
        }
        this.c.set(0);
        return true;
    }
}
