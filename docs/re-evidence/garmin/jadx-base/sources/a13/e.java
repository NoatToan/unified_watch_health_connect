package a13;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends q03.g<T> implements x03.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f421b;

    public e(T t7) {
        this.f421b = t7;
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        hVar.d(new h13.d(hVar, this.f421b));
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f421b;
    }
}
