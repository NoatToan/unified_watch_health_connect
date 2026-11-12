package defpackage;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fkb {
    public static void a(z5h<?> z5hVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                z5hVar.onError(thTerminate);
            } else {
                z5hVar.onComplete();
            }
        }
    }

    public static void b(yno<?> ynoVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                ynoVar.onError(thTerminate);
            } else {
                ynoVar.onComplete();
            }
        }
    }

    public static void c(z5h<?> z5hVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            t5l.p(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            z5hVar.onError(atomicThrowable.terminate());
        }
    }

    public static void d(yno<?> ynoVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            t5l.p(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            ynoVar.onError(atomicThrowable.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(z5h<? super T> z5hVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            z5hVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    z5hVar.onError(thTerminate);
                } else {
                    z5hVar.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(yno<? super T> ynoVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ynoVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    ynoVar.onError(thTerminate);
                } else {
                    ynoVar.onComplete();
                }
            }
        }
    }
}
