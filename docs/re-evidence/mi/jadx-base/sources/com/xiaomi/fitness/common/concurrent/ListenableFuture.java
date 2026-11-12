package com.xiaomi.fitness.common.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J \u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "V", "Ljava/util/concurrent/Future;", "addListener", "", "cb", "Lcom/xiaomi/fitness/common/concurrent/OnFinish;", "executor", "Ljava/util/concurrent/Executor;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ListenableFuture<V> extends Future<V> {
    void addListener(@NotNull OnFinish<V> cb);

    void addListener(@NotNull OnFinish<V> cb, @Nullable Executor executor);
}
