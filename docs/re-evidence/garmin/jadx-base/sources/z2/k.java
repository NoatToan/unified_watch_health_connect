package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz2/k;", "Lk6/c0;", "Lh4/d;", "handleReferencePoint", "Lz2/p;", "positionProvider", "<init>", "(Lh4/d;Lz2/p;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements p004k6.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d f201658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f201659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f201660c;

    public k(h4.d dVar, p pVar) {
        this.f201658a = dVar;
        this.f201659b = pVar;
        n4.c.f123541b.getClass();
        this.f201660c = 0L;
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, g6.o oVar, long j14) {
        long jA = this.f201659b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f201660c;
        }
        this.f201660c = jA;
        g6.m.f76012b.getClass();
        return g6.k.e(g6.k.e(lVar.c(), jg.b.N(jA)), this.f201658a.a(j14, 0L, oVar));
    }
}
