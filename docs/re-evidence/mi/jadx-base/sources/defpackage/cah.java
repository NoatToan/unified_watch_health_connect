package defpackage;

import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class cah<T, R> implements p4h.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4h<T> f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zta<? super T, ? extends R> f5126b;

    public static final class a<T, R> extends xno<T> {
        public final xno<? super R> c;
        public final zta<? super T, ? extends R> d;
        public boolean e;

        public a(xno<? super R> xnoVar, zta<? super T, ? extends R> ztaVar) {
            this.c = xnoVar;
            this.d = ztaVar;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (this.e) {
                return;
            }
            this.c.onCompleted();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (this.e) {
                p5l.f(th);
            } else {
                this.e = true;
                this.c.onError(th);
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            try {
                this.c.onNext(this.d.call(t));
            } catch (Throwable th) {
                pf8.d(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // defpackage.xno
        public void setProducer(cbi cbiVar) {
            this.c.setProducer(cbiVar);
        }
    }

    public cah(p4h<T> p4hVar, zta<? super T, ? extends R> ztaVar) {
        this.f5125a = p4hVar;
        this.f5126b = ztaVar;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super R> xnoVar) {
        a aVar = new a(xnoVar, this.f5126b);
        xnoVar.add(aVar);
        this.f5125a.B(aVar);
    }
}
