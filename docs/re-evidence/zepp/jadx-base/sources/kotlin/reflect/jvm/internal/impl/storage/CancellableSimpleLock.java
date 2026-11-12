package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    @NotNull
    private final Runnable b;

    @NotNull
    private final Function1<InterruptedException, Unit> c;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(@NotNull Lock lock, @NotNull Runnable runnable, @NotNull Function1<? super InterruptedException, Unit> function1) {
        super(lock);
        this.b = runnable;
        this.c = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.b.run();
            } catch (InterruptedException e) {
                this.c.invoke(e);
                return;
            }
        }
    }

    public CancellableSimpleLock(@NotNull Runnable runnable, @NotNull Function1<? super InterruptedException, Unit> function1) {
        this(new ReentrantLock(), runnable, function1);
    }
}
