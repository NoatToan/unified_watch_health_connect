package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class evg implements dyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evg f17103a = new evg();

    @NotNull
    public static dyc e() {
        return f17103a;
    }

    public static /* synthetic */ Object f() throws Exception {
        return null;
    }

    public static /* synthetic */ Object g() throws Exception {
        return null;
    }

    @Override // defpackage.dyc
    @NotNull
    public Future<?> a(@NotNull Runnable runnable, long j) {
        return new FutureTask(new Callable() { // from class: cvg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return evg.f();
            }
        });
    }

    @Override // defpackage.dyc
    public void b(long j) {
    }

    @Override // defpackage.dyc
    public boolean isClosed() {
        return false;
    }

    @Override // defpackage.dyc
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) {
        return new FutureTask(new Callable() { // from class: dvg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return evg.g();
            }
        });
    }
}
