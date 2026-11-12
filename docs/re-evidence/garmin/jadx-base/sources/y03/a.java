package y03;

import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, R> implements p<T>, x03.c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<? super R> f193049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s03.b f193050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x03.c<T> f193051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f193052d;

    public a(p<? super R> pVar) {
        this.f193049a = pVar;
    }

    @Override // q03.p
    public final void a(s03.b bVar) {
        if (v03.c.g(this.f193050b, bVar)) {
            this.f193050b = bVar;
            if (bVar instanceof x03.c) {
                this.f193051c = (x03.c) bVar;
            }
            this.f193049a.a(this);
        }
    }

    @Override // s03.b
    public final boolean b() {
        return this.f193050b.b();
    }

    @Override // x03.h
    public final void clear() {
        this.f193051c.clear();
    }

    @Override // s03.b
    public final void dispose() {
        this.f193050b.dispose();
    }

    public int e() {
        return 0;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return this.f193051c.isEmpty();
    }

    @Override // x03.h
    public final boolean offer(R r14) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // q03.p
    public final void onComplete() {
        if (this.f193052d) {
            return;
        }
        this.f193052d = true;
        this.f193049a.onComplete();
    }

    @Override // q03.p
    public final void onError(Throwable th3) {
        if (this.f193052d) {
            k13.a.b(th3);
        } else {
            this.f193052d = true;
            this.f193049a.onError(th3);
        }
    }
}
