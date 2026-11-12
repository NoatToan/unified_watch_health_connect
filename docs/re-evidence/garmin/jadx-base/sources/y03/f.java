package y03;

import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> extends b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<? super T> f193061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f193062b;

    public f(p<? super T> pVar) {
        this.f193061a = pVar;
    }

    @Override // s03.b
    public final boolean b() {
        return get() == 4;
    }

    @Override // x03.h
    public final void clear() {
        lazySet(32);
        this.f193062b = null;
    }

    public void dispose() {
        set(4);
        this.f193062b = null;
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
        T t7 = this.f193062b;
        this.f193062b = null;
        lazySet(32);
        return t7;
    }
}
