package com.xiaomi.fitness.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000b\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/cache/DataSnapshot;", "T", "", "fetcher", "Lcom/xiaomi/fitness/cache/DataSnapshot$DataFetcher;", "<init>", "(Lcom/xiaomi/fitness/cache/DataSnapshot$DataFetcher;)V", "mData", "Ljava/lang/Object;", "setInvalidate", "", "get", "()Ljava/lang/Object;", "DataFetcher", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataSnapshot<T> {

    @NotNull
    private final DataFetcher<T> fetcher;

    @Nullable
    private volatile T mData;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/cache/DataSnapshot$DataFetcher;", "T", "", "fetch", "()Ljava/lang/Object;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DataFetcher<T> {
        T fetch();
    }

    public DataSnapshot(@NotNull DataFetcher<T> fetcher) {
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        this.fetcher = fetcher;
    }

    public final T get() {
        T t;
        T t2 = this.mData;
        if (t2 != null) {
            return t2;
        }
        synchronized (this.fetcher) {
            try {
                if (this.mData == null) {
                    this.mData = this.fetcher.fetch();
                }
                t = this.mData;
                Intrinsics.checkNotNull(t);
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final void setInvalidate() {
        this.mData = null;
    }
}
