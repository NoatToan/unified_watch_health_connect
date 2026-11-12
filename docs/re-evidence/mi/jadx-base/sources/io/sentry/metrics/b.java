package io.sentry.metrics;

import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b extends e {
    public double e;
    public double f;
    public double g;
    public double h;
    public int i;

    @Override // io.sentry.metrics.e
    public int e() {
        return 5;
    }

    @Override // io.sentry.metrics.e
    @NotNull
    public Iterable<?> f() {
        return Arrays.asList(Double.valueOf(this.e), Double.valueOf(this.f), Double.valueOf(this.g), Double.valueOf(this.h), Integer.valueOf(this.i));
    }

    public int g() {
        return this.i;
    }

    public double h() {
        return this.g;
    }

    public double i() {
        return this.f;
    }

    public double j() {
        return this.h;
    }
}
