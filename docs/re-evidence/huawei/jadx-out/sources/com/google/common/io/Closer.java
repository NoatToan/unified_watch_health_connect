package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import defpackage.apa;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Closer implements Closeable {
    private static final Suppressor d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Suppressor f4610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private Throwable f4611b;
    private final Deque<Closeable> e = new ArrayDeque(4);

    interface Suppressor {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        Suppressor suppressorC = b.c();
        if (suppressorC == null) {
            suppressorC = a.f4612c;
        }
        d = suppressorC;
    }

    public static Closer b() {
        return new Closer(d);
    }

    Closer(Suppressor suppressor) {
        this.f4610a = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    @ParametricNullness
    public <C extends Closeable> C b(@ParametricNullness C c2) {
        if (c2 != null) {
            this.e.addFirst(c2);
        }
        return c2;
    }

    public RuntimeException e(Throwable th) throws Throwable {
        Preconditions.checkNotNull(th);
        this.f4611b = th;
        Throwables.propagateIfPossible(th, IOException.class);
        throw new RuntimeException(th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.f4611b;
        while (!this.e.isEmpty()) {
            Closeable closeableRemoveFirst = this.e.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f4610a.suppress(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f4611b != null || th == null) {
            return;
        }
        Throwables.propagateIfPossible(th, IOException.class);
        throw new AssertionError(th);
    }

    static final class a implements Suppressor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final a f4612c = new a();

        a() {
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            apa.f645a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    static final class b implements Suppressor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f4613b;

        @CheckForNull
        static b c() {
            try {
                return new b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        private b(Method method) {
            this.f4613b = method;
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f4613b.invoke(th, th2);
            } catch (Throwable unused) {
                a.f4612c.suppress(closeable, th, th2);
            }
        }
    }
}
