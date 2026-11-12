package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public interface dyc {
    @NotNull
    Future<?> a(@NotNull Runnable runnable, long j) throws RejectedExecutionException;

    void b(long j);

    boolean isClosed();

    @NotNull
    Future<?> submit(@NotNull Runnable runnable) throws RejectedExecutionException;
}
