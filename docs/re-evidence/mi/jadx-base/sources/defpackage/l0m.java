package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class l0m<V> extends t00.j<V> {
    public static <V> l0m<V> F() {
        return new l0m<>();
    }

    @Override // defpackage.t00
    public boolean B(V v) {
        return super.B(v);
    }

    @Override // defpackage.t00
    public boolean C(Throwable th) {
        return super.C(th);
    }

    @Override // t00.j, defpackage.t00, defpackage.lhe
    public /* bridge */ /* synthetic */ void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // t00.j, defpackage.t00, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // t00.j, defpackage.t00, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get() throws ExecutionException, InterruptedException {
        return super.get();
    }

    @Override // t00.j, defpackage.t00, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // t00.j, defpackage.t00, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isDone() {
        return super.isDone();
    }

    @Override // t00.j, defpackage.t00, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return super.get(j, timeUnit);
    }
}
