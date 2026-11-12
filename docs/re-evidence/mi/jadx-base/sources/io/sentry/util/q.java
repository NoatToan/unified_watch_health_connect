package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class q<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final A f21894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final B f21895b;

    public q(@Nullable A a2, @Nullable B b2) {
        this.f21894a = a2;
        this.f21895b = b2;
    }

    @Nullable
    public A a() {
        return this.f21894a;
    }

    @Nullable
    public B b() {
        return this.f21895b;
    }
}
