package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k9g<T> implements fdm<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a<T>> f23633a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>> f23634b = new AtomicReference<>();

    public static final class a<E> extends AtomicReference<a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public E f23635a;

        public a() {
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public E b() {
            return this.f23635a;
        }

        public a<E> c() {
            return get();
        }

        public void d(a<E> aVar) {
            lazySet(aVar);
        }

        public void e(E e) {
            this.f23635a = e;
        }

        public a(E e) {
            e(e);
        }
    }

    public k9g() {
        a<T> aVar = new a<>();
        d(aVar);
        e(aVar);
    }

    public a<T> a() {
        return this.f23634b.get();
    }

    public a<T> b() {
        return this.f23634b.get();
    }

    public a<T> c() {
        return this.f23633a.get();
    }

    @Override // defpackage.jdm
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(a<T> aVar) {
        this.f23634b.lazySet(aVar);
    }

    public a<T> e(a<T> aVar) {
        return this.f23633a.getAndSet(aVar);
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // defpackage.jdm
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        a<T> aVar = new a<>(t);
        e(aVar).d(aVar);
        return true;
    }

    @Override // defpackage.fdm, defpackage.jdm
    public T poll() {
        a<T> aVarC;
        a<T> aVarA = a();
        a<T> aVarC2 = aVarA.c();
        if (aVarC2 != null) {
            T tA = aVarC2.a();
            d(aVarC2);
            return tA;
        }
        if (aVarA == c()) {
            return null;
        }
        do {
            aVarC = aVarA.c();
        } while (aVarC == null);
        T tA2 = aVarC.a();
        d(aVarC);
        return tA2;
    }
}
