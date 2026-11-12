package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oei<T> extends qno<T> {
    public static final a[] c = new a[0];
    public static final a[] d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f29073a = new AtomicReference<>(d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f29074b;

    public static final class a<T> extends AtomicBoolean implements jz6 {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f29075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oei<T> f29076b;

        public a(z5h<? super T> z5hVar, oei<T> oeiVar) {
            this.f29075a = z5hVar;
            this.f29076b = oeiVar;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f29075a.onComplete();
        }

        public void b(Throwable th) {
            if (get()) {
                t5l.p(th);
            } else {
                this.f29075a.onError(th);
            }
        }

        public void c(T t) {
            if (get()) {
                return;
            }
            this.f29075a.onNext(t);
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f29076b.m0(this);
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> oei<T> l0() {
        return new oei<>();
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        a<T> aVar = new a<>(z5hVar, this);
        z5hVar.onSubscribe(aVar);
        if (k0(aVar)) {
            if (aVar.isDisposed()) {
                m0(aVar);
            }
        } else {
            Throwable th = this.f29074b;
            if (th != null) {
                z5hVar.onError(th);
            } else {
                z5hVar.onComplete();
            }
        }
    }

    public boolean k0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f29073a.get();
            if (aVarArr == c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!d8i.a(this.f29073a, aVarArr, aVarArr2));
        return true;
    }

    public void m0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f29073a.get();
            if (aVarArr == c || aVarArr == d) {
                return;
            }
            int length = aVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!d8i.a(this.f29073a, aVarArr, aVarArr2));
    }

    @Override // defpackage.z5h
    public void onComplete() {
        a<T>[] aVarArr = this.f29073a.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f29073a.getAndSet(aVarArr2)) {
            aVar.a();
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        x3h.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f29073a.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            t5l.p(th);
            return;
        }
        this.f29074b = th;
        for (a<T> aVar : this.f29073a.getAndSet(aVarArr2)) {
            aVar.b(th);
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        x3h.d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f29073a.get()) {
            aVar.c(t);
        }
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (this.f29073a.get() == c) {
            jz6Var.dispose();
        }
    }
}
