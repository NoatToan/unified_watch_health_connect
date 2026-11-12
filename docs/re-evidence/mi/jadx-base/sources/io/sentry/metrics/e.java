package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MetricType f21747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f21748b;

    @Nullable
    public final MeasurementUnit c;

    @Nullable
    public final Map<String, String> d;

    @NotNull
    public String a() {
        return this.f21748b;
    }

    @Nullable
    public Map<String, String> b() {
        return this.d;
    }

    @NotNull
    public MetricType c() {
        return this.f21747a;
    }

    @Nullable
    public MeasurementUnit d() {
        return this.c;
    }

    public abstract int e();

    @NotNull
    public abstract Iterable<?> f();
}
