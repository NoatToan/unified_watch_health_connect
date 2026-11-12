package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hz9<V> extends iab<V> {

    public static abstract class a<V> extends hz9<V> implements t00.i<V> {
        @Override // defpackage.t00, defpackage.lhe
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }
}
