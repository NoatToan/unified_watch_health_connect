package h13;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b83.b<? super T> f80821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f80822b;

    public b(b83.b<? super T> bVar) {
        this.f80821a = bVar;
    }

    @Override // b83.c
    public final void b(long j8) {
        T t7;
        if (e.d(j8)) {
            do {
                int i14 = get();
                if ((i14 & (-2)) != 0) {
                    return;
                }
                if (i14 == 1) {
                    if (!compareAndSet(1, 3) || (t7 = this.f80822b) == null) {
                        return;
                    }
                    this.f80822b = null;
                    b83.b<? super T> bVar = this.f80821a;
                    bVar.c(t7);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // b83.c
    public final void cancel() {
        set(4);
        this.f80822b = null;
    }

    @Override // x03.h
    public final void clear() {
        lazySet(32);
        this.f80822b = null;
    }

    @Override // x03.d
    public final int e() {
        lazySet(8);
        return 2;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // x03.h
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t7 = this.f80822b;
        this.f80822b = null;
        return t7;
    }
}
