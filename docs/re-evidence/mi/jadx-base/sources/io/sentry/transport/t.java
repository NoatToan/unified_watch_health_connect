package io.sentry.transport;

import defpackage.c8c;
import defpackage.jul;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f21869a = new t();

    @NotNull
    public static t a() {
        return f21869a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.q
    public void f(boolean z) throws IOException {
    }

    @Override // io.sentry.transport.q
    @Nullable
    public z g() {
        return null;
    }

    @Override // io.sentry.transport.q
    public void h(long j) {
    }

    @Override // io.sentry.transport.q
    public void u(@NotNull jul julVar, @NotNull c8c c8cVar) throws IOException {
    }
}
