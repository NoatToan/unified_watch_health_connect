package io.sentry.transport;

import defpackage.c8c;
import defpackage.jul;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface q extends Closeable {
    default boolean e() {
        return true;
    }

    void f(boolean z) throws IOException;

    @Nullable
    z g();

    void h(long j);

    void u(@NotNull jul julVar, @NotNull c8c c8cVar) throws IOException;

    default void z(@NotNull jul julVar) throws IOException {
        u(julVar, new c8c());
    }
}
