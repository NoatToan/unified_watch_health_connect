package o83;

/* JADX INFO: loaded from: classes11.dex */
public final class p<T> extends j83.m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j83.n<? super T> f130945b;

    public p(j83.n<? super T> nVar) {
        this.f130945b = nVar;
    }

    @Override // j83.m
    public final void b(Throwable th3) {
        this.f130945b.onError(th3);
    }

    @Override // j83.m
    public final void c(T t7) {
        j83.n<? super T> nVar = this.f130945b;
        nVar.i(new p83.b(nVar, t7));
    }
}
