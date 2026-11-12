package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class h implements IConnectionStatusProvider {
    @Override // io.sentry.IConnectionStatusProvider
    @Nullable
    public String a() {
        return null;
    }

    @Override // io.sentry.IConnectionStatusProvider
    @NotNull
    public IConnectionStatusProvider.ConnectionStatus b() {
        return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void c(@NotNull IConnectionStatusProvider.a aVar) {
    }

    @Override // io.sentry.IConnectionStatusProvider
    public boolean d(@NotNull IConnectionStatusProvider.a aVar) {
        return false;
    }
}
