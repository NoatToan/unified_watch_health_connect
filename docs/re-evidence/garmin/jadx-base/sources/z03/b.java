package z03;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<? extends q03.f> f200753a;

    public static final class a extends AtomicInteger implements q03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends q03.f> f200755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v03.f f200756c = new v03.f();

        public a(q03.d dVar, Iterator<? extends q03.f> it) {
            this.f200754a = dVar;
            this.f200755b = it;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            v03.f fVar = this.f200756c;
            fVar.getClass();
            v03.c.d(fVar, bVar);
        }

        public final void b() {
            q03.d dVar = this.f200754a;
            v03.f fVar = this.f200756c;
            if (!fVar.b() && getAndIncrement() == 0) {
                Iterator<? extends q03.f> it = this.f200755b;
                while (!fVar.b()) {
                    try {
                        if (!it.hasNext()) {
                            dVar.onComplete();
                            return;
                        }
                        try {
                            q03.f next = it.next();
                            w03.b.a(next, "The CompletableSource returned is null");
                            next.a(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th3) {
                            t03.a.a(th3);
                            dVar.onError(th3);
                            return;
                        }
                    } catch (Throwable th4) {
                        t03.a.a(th4);
                        dVar.onError(th4);
                        return;
                    }
                }
            }
        }

        @Override // q03.d
        public final void onComplete() {
            b();
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200754a.onError(th3);
        }
    }

    public b(Iterable<? extends q03.f> iterable) {
        this.f200753a = iterable;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        try {
            Iterator<? extends q03.f> it = this.f200753a.iterator();
            w03.b.a(it, "The iterator returned is null");
            a aVar = new a(dVar, it);
            dVar.a(aVar.f200756c);
            aVar.b();
        } catch (Throwable th3) {
            t03.a.a(th3);
            dVar.a(v03.d.INSTANCE);
            dVar.onError(th3);
        }
    }
}
