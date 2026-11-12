package z2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lz2/r1;", "Lz2/q1;", "", "initialIncrementId", "<init>", "(J)V", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 implements q1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f201764l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d4.l f201765m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f201766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f201767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.m0<y> f201768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f201769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f201770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a6.c f201771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1 f201772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f201773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f201774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f201775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.c2 f201776k;

    static {
        yu1.a aVar = new yu1.a((byte) 0, 29);
        yq.d dVar = new yq.d(19);
        d4.l lVar = d4.m.f57455a;
        f201765m = new d4.l(aVar, dVar);
    }

    private r1(long j8) {
        this.f201767b = new ArrayList();
        this.f201768c = p1.w.a();
        this.f201769d = new AtomicLong(j8);
        p1.m0 m0Var = p1.w.f134861a;
        m0Var.getClass();
        this.f201776k = p3.p0.n(m0Var);
    }

    public static r1 j(long j8) {
        return new r1(j8);
    }

    @Override // z2.q1
    public final void a(y yVar) {
        long f201695a = yVar.getF201695a();
        p1.m0<y> m0Var = this.f201768c;
        if (m0Var.a(f201695a)) {
            this.f201767b.remove(yVar);
            m0Var.g(yVar.getF201695a());
            h0 h0Var = this.f201775j;
            if (h0Var != null) {
                h0Var.invoke(Long.valueOf(yVar.getF201695a()));
            }
        }
    }

    @Override // z2.q1
    public final void b(long j8) {
        this.f201766a = false;
        h0 h0Var = this.f201770e;
        if (h0Var != null) {
            h0Var.invoke(Long.valueOf(j8));
        }
    }

    @Override // z2.q1
    public final void c() {
        i0 i0Var = this.f201773h;
        if (i0Var != null) {
            i0Var.invoke();
        }
    }

    @Override // z2.q1
    public final void d(f5.c0 c0Var, long j8, d0 d0Var, boolean z14) {
        a6.c cVar = this.f201771f;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z14), c0Var, n4.c.a(j8), d0Var);
        }
    }

    @Override // z2.q1
    public final long e() {
        AtomicLong atomicLong = this.f201769d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // z2.q1
    public final void f(long j8) {
        h0 h0Var = this.f201774i;
        if (h0Var != null) {
            h0Var.invoke(Long.valueOf(j8));
        }
    }

    @Override // z2.q1
    public final boolean g(f5.c0 c0Var, long j8, long j14, d0 d0Var, boolean z14) {
        e1 e1Var = this.f201772g;
        if (e1Var != null) {
            return ((Boolean) e1Var.invoke(Boolean.valueOf(z14), c0Var, n4.c.a(j8), n4.c.a(j14), Boolean.FALSE, d0Var)).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z2.q1
    public final p1.v<b0> h() {
        return (p1.v) this.f201776k.getF182175a();
    }

    @Override // z2.q1
    public final y i(n nVar) {
        long j8 = nVar.f201695a;
        if (j8 == 0) {
            b2.e.a("The selectable contains an invalid id: " + j8);
        }
        p1.m0<y> m0Var = this.f201768c;
        if (m0Var.a(j8)) {
            b2.e.a("Another selectable with the id: " + nVar + ".selectableId has already subscribed.");
        }
        m0Var.h(j8, nVar);
        this.f201767b.add(nVar);
        this.f201766a = false;
        return nVar;
    }

    public final ArrayList k(f5.c0 c0Var) {
        boolean z14 = this.f201766a;
        ArrayList arrayList = this.f201767b;
        if (!z14) {
            p13.c0.u(arrayList, new ww0.d(new yr.d(c0Var, 20), 5));
            this.f201766a = true;
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz2/r1$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public r1() {
        this(1L);
    }
}
