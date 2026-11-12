package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aqi {
    static <T> Callable<T> d(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: aqh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aqi.c(supplier, callable);
            }
        };
    }

    static /* synthetic */ Object c(Supplier supplier, Callable callable) throws Exception {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zA = a((String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zA) {
                a(name, threadCurrentThread);
            }
        }
    }

    static Runnable a(final Runnable runnable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: aqn
            @Override // java.lang.Runnable
            public final void run() {
                aqi.a(supplier, runnable);
            }
        };
    }

    static /* synthetic */ void a(Supplier supplier, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zA = a((String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zA) {
                a(name, threadCurrentThread);
            }
        }
    }

    private static boolean a(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
