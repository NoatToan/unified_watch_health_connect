package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qe0<T> extends xno<T> {
    public final tc0<? super T> c;
    public final tc0<Throwable> d;
    public final sc0 e;

    public qe0(tc0<? super T> tc0Var, tc0<Throwable> tc0Var2, sc0 sc0Var) {
        this.c = tc0Var;
        this.d = tc0Var2;
        this.e = sc0Var;
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        this.e.call();
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        this.d.call(th);
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        this.c.call(t);
    }
}
