package b13;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends q03.i<T> implements x03.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f14443a;

    public h(T t7) {
        this.f14443a = t7;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        jVar.a(v03.d.INSTANCE);
        jVar.onSuccess(this.f14443a);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f14443a;
    }
}
