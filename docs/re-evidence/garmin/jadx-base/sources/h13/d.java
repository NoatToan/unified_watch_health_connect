package h13;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends AtomicInteger implements x03.e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f80825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b83.b<? super T> f80826b;

    public d(b83.b<? super T> bVar, T t7) {
        this.f80826b = bVar;
        this.f80825a = t7;
    }

    @Override // b83.c
    public final void b(long j8) {
        if (e.d(j8) && compareAndSet(0, 1)) {
            T t7 = this.f80825a;
            b83.b<? super T> bVar = this.f80826b;
            bVar.c(t7);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }

    @Override // b83.c
    public final void cancel() {
        lazySet(2);
    }

    @Override // x03.h
    public final void clear() {
        lazySet(1);
    }

    @Override // x03.d
    public final int e() {
        return 1;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // x03.h
    public final boolean offer(T t7) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // x03.h
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f80825a;
    }
}
