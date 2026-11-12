package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible(emulated = true)
abstract class o<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable a;
    private static final Runnable b;

    public static final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        a = new b();
        b = new b();
    }

    public abstract void a(@NullableDecl T t, @NullableDecl Throwable th);

    public final void b() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, b)) {
            ((Thread) runnable).interrupt();
            set(a);
        }
    }

    public abstract boolean c();

    public abstract T e() throws Exception;

    public abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        T tE;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !c();
            if (z) {
                try {
                    tE = e();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, a)) {
                        while (get() == b) {
                            Thread.yield();
                        }
                    }
                    if (z) {
                        a(null, th);
                        return;
                    }
                    return;
                }
            } else {
                tE = null;
            }
            if (!compareAndSet(threadCurrentThread, a)) {
                while (get() == b) {
                    Thread.yield();
                }
            }
            if (z) {
                a(tE, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
