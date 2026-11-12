package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class f<V> extends com.google.common.util.concurrent.c<Object, V> {

    public final class a extends f<V>.c<ListenableFuture<V>> {
        private final AsyncCallable<V> f;

        public a(AsyncCallable<V> asyncCallable, Executor executor) {
            super(executor);
            this.f = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.o
        public String f() {
            return this.f.toString();
        }

        @Override // com.google.common.util.concurrent.o
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> e() throws Exception {
            this.d = false;
            return (ListenableFuture) Preconditions.checkNotNull(this.f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f);
        }

        @Override // com.google.common.util.concurrent.f.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void h(ListenableFuture<V> listenableFuture) {
            f.this.setFuture(listenableFuture);
        }
    }

    public final class b extends f<V>.c<V> {
        private final Callable<V> f;

        public b(Callable<V> callable, Executor executor) {
            super(executor);
            this.f = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.o
        public V e() throws Exception {
            this.d = false;
            return this.f.call();
        }

        @Override // com.google.common.util.concurrent.o
        public String f() {
            return this.f.toString();
        }

        @Override // com.google.common.util.concurrent.f.c
        public void h(V v) {
            f.this.set(v);
        }
    }

    public abstract class c<T> extends o<T> {
        private final Executor c;
        public boolean d = true;

        public c(Executor executor) {
            this.c = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.o
        public final void a(T t, Throwable th) {
            if (th == null) {
                h(t);
                return;
            }
            if (th instanceof ExecutionException) {
                f.this.setException(th.getCause());
            } else if (th instanceof CancellationException) {
                f.this.cancel(false);
            } else {
                f.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.o
        public final boolean c() {
            return f.this.isDone();
        }

        public final void g() {
            try {
                this.c.execute(this);
            } catch (RejectedExecutionException e) {
                if (this.d) {
                    f.this.setException(e);
                }
            }
        }

        public abstract void h(T t);
    }

    public final class d extends com.google.common.util.concurrent.c<Object, V>.a {
        private c i;

        public d(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, c cVar) {
            super(immutableCollection, z, false);
            this.i = cVar;
        }

        @Override // com.google.common.util.concurrent.c.a
        public void l(boolean z, int i, @NullableDecl Object obj) {
        }

        @Override // com.google.common.util.concurrent.c.a
        public void n() {
            c cVar = this.i;
            if (cVar != null) {
                cVar.g();
            } else {
                Preconditions.checkState(f.this.isDone());
            }
        }

        @Override // com.google.common.util.concurrent.c.a
        public void r() {
            c cVar = this.i;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.google.common.util.concurrent.c.a
        public void t() {
            super.t();
            this.i = null;
        }
    }

    public f(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, AsyncCallable<V> asyncCallable) {
        A(new d(immutableCollection, z, new a(asyncCallable, executor)));
    }

    public f(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, Callable<V> callable) {
        A(new d(immutableCollection, z, new b(callable, executor)));
    }
}
