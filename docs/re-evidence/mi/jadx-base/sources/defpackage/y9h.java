package defpackage;

import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class y9h<T> implements p4h.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4h<T> f39959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zta<? super T, Boolean> f39960b;

    public static final class a<T> extends xno<T> {
        public final xno<? super T> c;
        public final zta<? super T, Boolean> d;
        public boolean e;

        public a(xno<? super T> xnoVar, zta<? super T, Boolean> ztaVar) {
            this.c = xnoVar;
            this.d = ztaVar;
            request(0L);
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
                if (this.d.call(t).booleanValue()) {
                    this.c.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                pf8.d(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // defpackage.xno
        public void setProducer(cbi cbiVar) {
            super.setProducer(cbiVar);
            this.c.setProducer(cbiVar);
        }
    }

    public y9h(p4h<T> p4hVar, zta<? super T, Boolean> ztaVar) {
        this.f39959a = p4hVar;
        this.f39960b = ztaVar;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super T> xnoVar) {
        a aVar = new a(xnoVar, this.f39960b);
        xnoVar.add(aVar);
        this.f39959a.B(aVar);
    }
}
