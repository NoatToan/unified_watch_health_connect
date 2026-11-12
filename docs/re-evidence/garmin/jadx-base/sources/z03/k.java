package z03;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements q03.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.d f200771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s03.a f200772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i13.b f200773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f200774d;

    public k(q03.d dVar, s03.a aVar, i13.b bVar, AtomicInteger atomicInteger) {
        this.f200771a = dVar;
        this.f200772b = aVar;
        this.f200773c = bVar;
        this.f200774d = atomicInteger;
    }

    @Override // q03.d
    public final void a(s03.b bVar) {
        this.f200772b.a(bVar);
    }

    public final void b() {
        if (this.f200774d.decrementAndGet() == 0) {
            Throwable thB = this.f200773c.b();
            q03.d dVar = this.f200771a;
            if (thB == null) {
                dVar.onComplete();
            } else {
                dVar.onError(thB);
            }
        }
    }

    @Override // q03.d
    public final void onComplete() {
        b();
    }

    @Override // q03.d
    public final void onError(Throwable th3) {
        if (this.f200773c.a(th3)) {
            b();
        } else {
            k13.a.b(th3);
        }
    }
}
