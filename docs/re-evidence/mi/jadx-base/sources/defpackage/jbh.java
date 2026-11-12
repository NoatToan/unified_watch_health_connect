package defpackage;

import rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class jbh<T> implements p4h.b<Boolean, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zta<? super T, Boolean> f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22620b;

    public class a extends xno<T> {
        public boolean c;
        public boolean d;
        public final /* synthetic */ SingleDelayedProducer e;
        public final /* synthetic */ xno f;

        public a(SingleDelayedProducer singleDelayedProducer, xno xnoVar) {
            this.e = singleDelayedProducer;
            this.f = xnoVar;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.c) {
                this.e.setValue(Boolean.FALSE);
            } else {
                this.e.setValue(Boolean.valueOf(jbh.this.f22620b));
            }
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (this.d) {
                p5l.f(th);
            } else {
                this.d = true;
                this.f.onError(th);
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            this.c = true;
            try {
                if (jbh.this.f22619a.call(t).booleanValue()) {
                    this.d = true;
                    this.e.setValue(Boolean.valueOf(true ^ jbh.this.f22620b));
                    unsubscribe();
                }
            } catch (Throwable th) {
                pf8.f(th, this, t);
            }
        }
    }

    public jbh(zta<? super T, Boolean> ztaVar, boolean z) {
        this.f22619a = ztaVar;
        this.f22620b = z;
    }

    @Override // defpackage.zta
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xno<? super T> call(xno<? super Boolean> xnoVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(xnoVar);
        a aVar = new a(singleDelayedProducer, xnoVar);
        xnoVar.add(aVar);
        xnoVar.setProducer(singleDelayedProducer);
        return aVar;
    }
}
