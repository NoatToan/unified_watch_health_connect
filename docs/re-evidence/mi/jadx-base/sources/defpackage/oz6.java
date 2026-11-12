package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class oz6 implements Future<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz6 f29836a;

    public oz6(jz6 jz6Var) {
        this.f29836a = jz6Var;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f29836a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }
}
