package l0;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface a<I, O> {
    ListenableFuture<O> apply(I i14);
}
