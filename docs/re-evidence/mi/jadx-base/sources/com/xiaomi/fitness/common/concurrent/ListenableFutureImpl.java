package com.xiaomi.fitness.common.concurrent;

import android.util.Pair;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0002J\"\u0010\u0011\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002R&\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ListenableFutureImpl;", "V", "Lcom/xiaomi/fitness/common/concurrent/FutureImpl;", "Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "<init>", "()V", "mExecutorList", "", "Landroid/util/Pair;", "Lcom/xiaomi/fitness/common/concurrent/OnFinish;", "Ljava/util/concurrent/Executor;", "addListener", "", "cb", "executor", "onDone", "performExecuteList", "performRunnable", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListenableFutureImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFutureImpl.kt\ncom/xiaomi/fitness/common/concurrent/ListenableFutureImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,65:1\n37#2:66\n36#2,3:67\n*S KotlinDebug\n*F\n+ 1 ListenableFutureImpl.kt\ncom/xiaomi/fitness/common/concurrent/ListenableFutureImpl\n*L\n31#1:66\n31#1:67,3\n*E\n"})
public final class ListenableFutureImpl<V> extends FutureImpl<V> implements ListenableFuture<V> {

    @NotNull
    private static final String TAG = "ListenableFutureImpl";

    @NotNull
    private final List<Pair<OnFinish<V>, Executor>> mExecutorList = new LinkedList();

    private final void performExecuteList() {
        synchronized (this.mExecutorList) {
            if (this.mExecutorList.isEmpty()) {
                return;
            }
            Object[] array = this.mExecutorList.toArray(new Pair[0]);
            this.mExecutorList.clear();
            Unit unit = Unit.INSTANCE;
            if (array.length == 0) {
                return;
            }
            for (Pair pair : (Pair[]) array) {
                Object obj = pair.first;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.common.concurrent.OnFinish<V of com.xiaomi.fitness.common.concurrent.ListenableFutureImpl>");
                Object obj2 = pair.second;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.concurrent.Executor");
                performRunnable((OnFinish) obj, (Executor) obj2);
            }
        }
    }

    private final void performRunnable(final OnFinish<V> cb, Executor executor) {
        if (cb == null) {
            return;
        }
        try {
            final V v = get();
            if (executor != null) {
                executor.execute(new Runnable() { // from class: mhe
                    @Override // java.lang.Runnable
                    public final void run() {
                        cb.onFinish(v);
                    }
                });
            } else {
                try {
                    cb.onFinish(v);
                } catch (Exception unused) {
                }
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.xiaomi.fitness.common.concurrent.ListenableFuture
    public void addListener(@NotNull OnFinish<V> cb, @Nullable Executor executor) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        synchronized (this.mExecutorList) {
            List<Pair<OnFinish<V>, Executor>> list = this.mExecutorList;
            Objects.requireNonNull(cb);
            Pair<OnFinish<V>, Executor> pairCreate = Pair.create(cb, executor);
            Intrinsics.checkNotNullExpressionValue(pairCreate, "create(...)");
            list.add(pairCreate);
        }
    }

    @Override // com.xiaomi.fitness.common.concurrent.FutureImpl
    public void onDone() {
        super.onDone();
        performExecuteList();
    }

    @Override // com.xiaomi.fitness.common.concurrent.ListenableFuture
    public void addListener(@NotNull OnFinish<V> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        addListener(cb, null);
    }
}
