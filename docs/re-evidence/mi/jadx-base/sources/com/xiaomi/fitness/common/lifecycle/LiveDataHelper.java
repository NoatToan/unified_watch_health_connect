package com.xiaomi.fitness.common.lifecycle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.concurrent.FutureImpl;
import com.xiaomi.fitness.common.concurrent.ListenableFuture;
import com.xiaomi.fitness.common.concurrent.ListenableFutureImpl;
import com.xiaomi.fitness.common.concurrent.SettableFuture;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bJ;\u0010\u000b\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\u0011J'\u0010\u000b\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u0010\u001a\u0002H\u0006¢\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/LiveDataHelper;", "", "<init>", "()V", "asFuture", "Ljava/util/concurrent/Future;", "T", "liveData", "Landroidx/lifecycle/LiveData;", "asListenableFuture", "Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "takeData", "time", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "def", "(Landroidx/lifecycle/LiveData;ILjava/util/concurrent/TimeUnit;Ljava/lang/Object;)Ljava/lang/Object;", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;)Ljava/lang/Object;", "asFutureInternal", "", "future", "Lcom/xiaomi/fitness/common/concurrent/SettableFuture;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveDataHelper {

    @NotNull
    public static final LiveDataHelper INSTANCE = new LiveDataHelper();

    private LiveDataHelper() {
    }

    @JvmStatic
    @NotNull
    public static final <T> Future<T> asFuture(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        FutureImpl futureImpl = new FutureImpl();
        INSTANCE.asFutureInternal(liveData, futureImpl);
        return futureImpl;
    }

    private final <T> void asFutureInternal(final LiveData<T> liveData, final SettableFuture<T> future) {
        Objects.requireNonNull(liveData);
        ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: fie
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataHelper.asFutureInternal$lambda$0(liveData, future);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asFutureInternal$lambda$0(final LiveData liveData, final SettableFuture future) {
        Intrinsics.checkNotNullParameter(future, "$future");
        liveData.observeForever(new Observer<T>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveDataHelper$asFutureInternal$1$1
            @Override // androidx.lifecycle.Observer
            public void onChanged(T t) {
                liveData.removeObserver(this);
                future.set(t);
            }
        });
    }

    @NotNull
    public final <T> ListenableFuture<T> asListenableFuture(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        ListenableFutureImpl listenableFutureImpl = new ListenableFutureImpl();
        asFutureInternal(liveData, listenableFutureImpl);
        return listenableFutureImpl;
    }

    @Nullable
    public final <T> T takeData(@NotNull LiveData<T> liveData, int time, @NotNull TimeUnit timeUnit, @Nullable T def) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return (T) asFuture(liveData).get(time, timeUnit);
        } catch (Exception unused) {
            return def;
        }
    }

    public final <T> T takeData(@NotNull LiveData<T> liveData, T def) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        try {
            return (T) asFuture(liveData).get();
        } catch (Exception unused) {
            return def;
        }
    }
}
