package com.xiaomi.fitness.common.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SingleHolder;", "T", "A", "", "creator", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "instance", "Ljava/lang/Object;", "getInstance", "arg", "(Ljava/lang/Object;)Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SingleHolder<T, A> {

    @NotNull
    private final Function1<A, T> creator;

    @Nullable
    private volatile T instance;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleHolder(@NotNull Function1<? super A, ? extends T> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.creator = creator;
    }

    public final T getInstance(A arg) {
        T tInvoke;
        T t = this.instance;
        if (t != null) {
            return t;
        }
        synchronized (getClass()) {
            T t2 = this.instance;
            if (t2 == null) {
                tInvoke = this.creator.invoke(arg);
                this.instance = tInvoke;
            } else {
                tInvoke = t2;
            }
        }
        return tInvoke;
    }
}
