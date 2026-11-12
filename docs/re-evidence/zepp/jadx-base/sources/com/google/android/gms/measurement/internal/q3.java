package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
final class q3 {
    private final Clock a;
    private long b;

    public q3(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.a = clock;
    }

    public final void a() {
        this.b = 0L;
    }

    public final void b() {
        this.b = this.a.elapsedRealtime();
    }

    public final boolean c(long j) {
        return this.b == 0 || this.a.elapsedRealtime() - this.b >= 3600000;
    }
}
