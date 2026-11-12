package d13;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T> extends AtomicInteger implements x03.c<T>, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.p<? super T> f57226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f57227b;

    public r(q03.p<? super T> pVar, T t7) {
        this.f57226a = pVar;
        this.f57227b = t7;
    }

    @Override // s03.b
    public final boolean b() {
        return get() == 3;
    }

    @Override // x03.h
    public final void clear() {
        lazySet(3);
    }

    @Override // s03.b
    public final void dispose() {
        set(3);
    }

    @Override // x03.d
    public final int e() {
        lazySet(1);
        return 1;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // x03.h
    public final boolean offer(T t7) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // x03.h
    public final T poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f57227b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            T t7 = this.f57227b;
            q03.p<? super T> pVar = this.f57226a;
            pVar.c(t7);
            if (get() == 2) {
                lazySet(3);
                pVar.onComplete();
            }
        }
    }
}
