package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ne0<T> implements a6h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc0<? super T> f27840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc0<? super Throwable> f27841b;
    public final sc0 c;

    public ne0(tc0<? super T> tc0Var, tc0<? super Throwable> tc0Var2, sc0 sc0Var) {
        this.f27840a = tc0Var;
        this.f27841b = tc0Var2;
        this.c = sc0Var;
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        this.c.call();
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        this.f27841b.call(th);
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        this.f27840a.call(t);
    }
}
