package io.sentry.android.core;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static q0 f21579b = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Boolean f21580a = null;

    @NotNull
    public static q0 a() {
        return f21579b;
    }

    @Nullable
    public Boolean b() {
        return this.f21580a;
    }

    public synchronized void c(boolean z) {
        this.f21580a = Boolean.valueOf(z);
    }
}
