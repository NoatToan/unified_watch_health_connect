package io.sentry;

import defpackage.m9l;
import defpackage.qkp;
import io.sentry.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    @NotNull
    public static final Double c = Double.valueOf(1.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Random f21931b;

    public z(@NotNull SentryOptions sentryOptions) {
        this((SentryOptions) io.sentry.util.p.c(sentryOptions, "options are required"), null);
    }

    public final Random a() {
        Random random = this.f21931b;
        return random == null ? io.sentry.util.t.a() : random;
    }

    @NotNull
    public qkp b(@NotNull m9l m9lVar) {
        qkp qkpVarG = m9lVar.a().g();
        if (qkpVarG != null) {
            return qkpVarG;
        }
        this.f21930a.getProfilesSampler();
        Double profilesSampleRate = this.f21930a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && c(profilesSampleRate));
        this.f21930a.getTracesSampler();
        qkp qkpVarU = m9lVar.a().u();
        if (qkpVarU != null) {
            return qkpVarU;
        }
        Double tracesSampleRate = this.f21930a.getTracesSampleRate();
        Double d = Boolean.TRUE.equals(this.f21930a.getEnableTracing()) ? c : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = d;
        }
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f21930a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new qkp(Boolean.valueOf(c(dValueOf)), dValueOf, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new qkp(bool, null, bool, null);
    }

    public final boolean c(@NotNull Double d) {
        return d.doubleValue() >= a().nextDouble();
    }

    @TestOnly
    public z(@NotNull SentryOptions sentryOptions, @Nullable Random random) {
        this.f21930a = sentryOptions;
        this.f21931b = random;
    }
}
