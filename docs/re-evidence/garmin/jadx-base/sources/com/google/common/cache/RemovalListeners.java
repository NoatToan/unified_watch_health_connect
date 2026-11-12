package com.google.common.cache;

import cd0.f;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.google.common.cache.d
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.lambda$asynchronous$1(executor, removalListener, removalNotification);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asynchronous$1(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        executor.execute(new f(17, removalListener, removalNotification));
    }
}
