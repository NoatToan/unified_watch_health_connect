package m13;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2203a[] f115916c = new C2203a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2203a[] f115917d = new C2203a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<C2203a<T>[]> f115918a = new AtomicReference<>(f115917d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f115919b;

    /* JADX INFO: renamed from: m13.a$a, reason: collision with other inner class name */
    public static final class C2203a<T> extends AtomicBoolean implements s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<? super T> f115920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<T> f115921b;

        public C2203a(p<? super T> pVar, a<T> aVar) {
            this.f115920a = pVar;
            this.f115921b = aVar;
        }

        @Override // s03.b
        public final boolean b() {
            return get();
        }

        @Override // s03.b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f115921b.i(this);
            }
        }
    }

    @Override // q03.p
    public final void a(s03.b bVar) {
        if (this.f115918a.get() == f115916c) {
            bVar.dispose();
        }
    }

    @Override // q03.p
    public final void c(T t7) {
        w03.b.a(t7, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C2203a<T> c2203a : this.f115918a.get()) {
            if (!c2203a.get()) {
                c2203a.f115920a.c(t7);
            }
        }
    }

    @Override // q03.l
    public final void f(p<? super T> pVar) {
        C2203a<T> c2203a = new C2203a<>(pVar, this);
        pVar.a(c2203a);
        while (true) {
            AtomicReference<C2203a<T>[]> atomicReference = this.f115918a;
            C2203a<T>[] c2203aArr = atomicReference.get();
            if (c2203aArr == f115916c) {
                Throwable th3 = this.f115919b;
                if (th3 != null) {
                    pVar.onError(th3);
                    return;
                } else {
                    pVar.onComplete();
                    return;
                }
            }
            int length = c2203aArr.length;
            C2203a<T>[] c2203aArr2 = new C2203a[length + 1];
            System.arraycopy(c2203aArr, 0, c2203aArr2, 0, length);
            c2203aArr2[length] = c2203a;
            do {
                if (atomicReference.compareAndSet(c2203aArr, c2203aArr2)) {
                    if (c2203a.get()) {
                        i(c2203a);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c2203aArr);
        }
    }

    public final void i(C2203a<T> c2203a) {
        C2203a<T>[] c2203aArr;
        while (true) {
            AtomicReference<C2203a<T>[]> atomicReference = this.f115918a;
            C2203a<T>[] c2203aArr2 = atomicReference.get();
            if (c2203aArr2 == f115916c || c2203aArr2 == (c2203aArr = f115917d)) {
                return;
            }
            int length = c2203aArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i14 = -1;
                    break;
                } else if (c2203aArr2[i14] == c2203a) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 < 0) {
                return;
            }
            if (length != 1) {
                c2203aArr = new C2203a[length - 1];
                System.arraycopy(c2203aArr2, 0, c2203aArr, 0, i14);
                System.arraycopy(c2203aArr2, i14 + 1, c2203aArr, i14, (length - i14) - 1);
            }
            while (!atomicReference.compareAndSet(c2203aArr2, c2203aArr)) {
                if (atomicReference.get() != c2203aArr2) {
                }
            }
            return;
        }
    }

    @Override // q03.p
    public final void onComplete() {
        AtomicReference<C2203a<T>[]> atomicReference = this.f115918a;
        C2203a<T>[] c2203aArr = atomicReference.get();
        C2203a<T>[] c2203aArr2 = f115916c;
        if (c2203aArr == c2203aArr2) {
            return;
        }
        C2203a<T>[] andSet = atomicReference.getAndSet(c2203aArr2);
        for (C2203a<T> c2203a : andSet) {
            if (!c2203a.get()) {
                c2203a.f115920a.onComplete();
            }
        }
    }

    @Override // q03.p
    public final void onError(Throwable th3) {
        w03.b.a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<C2203a<T>[]> atomicReference = this.f115918a;
        C2203a<T>[] c2203aArr = atomicReference.get();
        C2203a<T>[] c2203aArr2 = f115916c;
        if (c2203aArr == c2203aArr2) {
            k13.a.b(th3);
            return;
        }
        this.f115919b = th3;
        C2203a<T>[] andSet = atomicReference.getAndSet(c2203aArr2);
        for (C2203a<T> c2203a : andSet) {
            if (c2203a.get()) {
                k13.a.b(th3);
            } else {
                c2203a.f115920a.onError(th3);
            }
        }
    }
}
