package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
public final class RemovalListeners {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class a<K, V> implements RemovalListener<K, V> {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ RemovalListener b;

        /* JADX INFO: renamed from: com.google.common.cache.RemovalListeners$a$a, reason: collision with other inner class name */
        public class RunnableC0166a implements Runnable {
            public final /* synthetic */ RemovalNotification a;

            public RunnableC0166a(RemovalNotification removalNotification) {
                this.a = removalNotification;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onRemoval(this.a);
            }
        }

        public a(Executor executor, RemovalListener removalListener) {
            this.a = executor;
            this.b = removalListener;
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<K, V> removalNotification) {
            this.a.execute(new RunnableC0166a(removalNotification));
        }
    }

    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(RemovalListener<K, V> removalListener, Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new a(executor, removalListener);
    }
}
