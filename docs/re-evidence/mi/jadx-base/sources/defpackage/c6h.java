package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c6h<T> extends xno<T> {
    public final a6h<? super T> c;

    public c6h(a6h<? super T> a6hVar) {
        this.c = a6hVar;
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        this.c.onCompleted();
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        this.c.onError(th);
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        this.c.onNext(t);
    }
}
