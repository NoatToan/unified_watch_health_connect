package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Callables {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements Callable<T> {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            return (T) this.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> implements AsyncCallable<T> {
        public final /* synthetic */ ListeningExecutorService a;
        public final /* synthetic */ Callable b;

        public b(ListeningExecutorService listeningExecutorService, Callable callable) {
            this.a = listeningExecutorService;
            this.b = callable;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
            return this.a.submit((Callable) this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class c<T> implements Callable<T> {
        public final /* synthetic */ Supplier a;
        public final /* synthetic */ Callable b;

        public c(Supplier supplier, Callable callable) {
            this.a = supplier;
            this.b = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            boolean zD = Callables.d((String) this.a.get(), threadCurrentThread);
            try {
                return (T) this.b.call();
            } finally {
                if (zD) {
                    Callables.d(name, threadCurrentThread);
                }
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ Supplier a;
        public final /* synthetic */ Runnable b;

        public d(Supplier supplier, Runnable runnable) {
            this.a = supplier;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            boolean zD = Callables.d((String) this.a.get(), threadCurrentThread);
            try {
                this.b.run();
            } finally {
                if (zD) {
                    Callables.d(name, threadCurrentThread);
                }
            }
        }
    }

    private Callables() {
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(Callable<T> callable, ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new b(listeningExecutorService, callable);
    }

    @GwtIncompatible
    public static Runnable b(Runnable runnable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new d(supplier, runnable);
    }

    @GwtIncompatible
    public static <T> Callable<T> c(Callable<T> callable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new c(supplier, callable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    public static boolean d(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static <T> Callable<T> returning(@NullableDecl T t) {
        return new a(t);
    }
}
