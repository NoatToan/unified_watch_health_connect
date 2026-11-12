package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    private final AtomicReference<a<T>> a = new AtomicReference<>();
    private final AtomicReference<a<T>> b = new AtomicReference<>();

    public static final class a<E> extends AtomicReference<a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E a;

        public a() {
        }

        public E a() {
            E eB = b();
            f(null);
            return eB;
        }

        public E b() {
            return this.a;
        }

        public a<E> c() {
            return get();
        }

        public void e(a<E> aVar) {
            lazySet(aVar);
        }

        public void f(E e) {
            this.a = e;
        }

        public a(E e) {
            f(e);
        }
    }

    public MpscLinkedQueue() {
        a<T> aVar = new a<>();
        g(aVar);
        h(aVar);
    }

    public a<T> a() {
        return this.b.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public a<T> d() {
        return this.b.get();
    }

    public a<T> f() {
        return this.a.get();
    }

    public void g(a<T> aVar) {
        this.b.lazySet(aVar);
    }

    public a<T> h(a<T> aVar) {
        return this.a.getAndSet(aVar);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return d() == f();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        a<T> aVar = new a<>(t);
        h(aVar).e(aVar);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        a<T> aVarC;
        a<T> aVarA = a();
        a<T> aVarC2 = aVarA.c();
        if (aVarC2 != null) {
            T tA = aVarC2.a();
            g(aVarC2);
            return tA;
        }
        if (aVarA == f()) {
            return null;
        }
        do {
            aVarC = aVarA.c();
        } while (aVarC == null);
        T tA2 = aVarC.a();
        g(aVarC);
        return tA2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }
}
