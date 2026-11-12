package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class gem<T> implements xdm.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4h.a<T> f18898a;

    public static final class a<T> extends xno<T> {
        public final sem<? super T> c;
        public T d;
        public int e;

        public a(sem<? super T> semVar) {
            this.c = semVar;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            int i = this.e;
            if (i == 0) {
                this.c.b(new NoSuchElementException());
            } else if (i == 1) {
                this.e = 2;
                T t = this.d;
                this.d = null;
                this.c.c(t);
            }
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (this.e == 2) {
                p5l.f(th);
            } else {
                this.d = null;
                this.c.b(th);
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            int i = this.e;
            if (i == 0) {
                this.e = 1;
                this.d = t;
            } else if (i == 1) {
                this.e = 2;
                this.c.b(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public gem(p4h.a<T> aVar) {
        this.f18898a = aVar;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(sem<? super T> semVar) {
        a aVar = new a(semVar);
        semVar.a(aVar);
        this.f18898a.call(aVar);
    }
}
