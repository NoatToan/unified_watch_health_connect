package defpackage;

import rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class iem<T> extends sem<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xno<? super T> f21061b;

    public iem(xno<? super T> xnoVar) {
        this.f21061b = xnoVar;
    }

    @Override // defpackage.sem
    public void b(Throwable th) {
        this.f21061b.onError(th);
    }

    @Override // defpackage.sem
    public void c(T t) {
        this.f21061b.setProducer(new SingleProducer(this.f21061b, t));
    }
}
