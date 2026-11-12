package a13;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends q03.g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Future<? extends T> f415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f417d;

    public c(Future<? extends T> future, long j8, TimeUnit timeUnit) {
        this.f415b = future;
        this.f416c = j8;
        this.f417d = timeUnit;
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        h13.b bVar = new h13.b(hVar);
        hVar.d(bVar);
        try {
            TimeUnit timeUnit = this.f417d;
            Future<? extends T> future = this.f415b;
            T t7 = timeUnit != null ? future.get(this.f416c, timeUnit) : future.get();
            if (t7 == null) {
                hVar.onError(new NullPointerException("The future returned null"));
                return;
            }
            int i14 = bVar.get();
            do {
                b83.b<? super T> bVar2 = bVar.f80821a;
                if (i14 == 8) {
                    bVar.f80822b = t7;
                    bVar.lazySet(16);
                    bVar2.c(t7);
                    if (bVar.get() != 4) {
                        bVar2.onComplete();
                        return;
                    }
                    return;
                }
                if ((i14 & (-3)) != 0) {
                    return;
                }
                if (i14 == 2) {
                    bVar.lazySet(3);
                    bVar2.c(t7);
                    if (bVar.get() != 4) {
                        bVar2.onComplete();
                        return;
                    }
                    return;
                }
                bVar.f80822b = t7;
                if (bVar.compareAndSet(0, 1)) {
                    return;
                } else {
                    i14 = bVar.get();
                }
            } while (i14 != 4);
            bVar.f80822b = null;
        } catch (Throwable th3) {
            t03.a.a(th3);
            if (bVar.get() == 4) {
                return;
            }
            hVar.onError(th3);
        }
    }
}
