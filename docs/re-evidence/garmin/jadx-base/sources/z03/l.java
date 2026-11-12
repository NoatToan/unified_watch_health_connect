package z03;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<? extends q03.f> f200775a;

    public l(Iterable<? extends q03.f> iterable) {
        this.f200775a = iterable;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        s03.a aVar = new s03.a();
        dVar.a(aVar);
        try {
            Iterator<? extends q03.f> it = this.f200775a.iterator();
            w03.b.a(it, "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            i13.b bVar = new i13.b();
            while (!aVar.f155449b) {
                try {
                    if (it.hasNext()) {
                        if (aVar.f155449b) {
                            return;
                        }
                        try {
                            q03.f next = it.next();
                            w03.b.a(next, "The iterator returned a null CompletableSource");
                            q03.f fVar = next;
                            if (aVar.f155449b) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            fVar.a(new k(dVar, aVar, bVar, atomicInteger));
                        } catch (Throwable th3) {
                            t03.a.a(th3);
                            bVar.a(th3);
                        }
                    }
                } catch (Throwable th4) {
                    t03.a.a(th4);
                    bVar.a(th4);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thB = bVar.b();
                    if (thB == null) {
                        dVar.onComplete();
                        return;
                    } else {
                        dVar.onError(thB);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th5) {
            t03.a.a(th5);
            dVar.onError(th5);
        }
    }
}
