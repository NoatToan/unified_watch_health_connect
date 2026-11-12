package defpackage;

import io.sentry.SpanStatus;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface wzc extends qyc {
    @ApiStatus.Internal
    void b(@NotNull SpanStatus spanStatus, boolean z, @Nullable c8c c8cVar);

    void c();

    @NotNull
    String getName();

    @NotNull
    p i();

    @NotNull
    TransactionNameSource k();

    @Nullable
    a5n p();
}
