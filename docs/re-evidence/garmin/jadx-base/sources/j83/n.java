package j83;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n<T> implements f<T>, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s83.k f97758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n<?> f97759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f97760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97761d;

    public n(n<?> nVar, boolean z14) {
        this.f97761d = Long.MIN_VALUE;
        this.f97759b = nVar;
        this.f97758a = (!z14 || nVar == null) ? new s83.k() : nVar.f97758a;
    }

    public final void b(o oVar) {
        this.f97758a.a(oVar);
    }

    @Override // j83.o
    public final boolean e() {
        return this.f97758a.f157986b;
    }

    @Override // j83.o
    public final void f() {
        this.f97758a.f();
    }

    public void g() {
    }

    public final void h(long j8) {
        if (j8 < 0) {
            vb.h.s(org.apache.commons.lang3.e.e(j8, "number requested cannot be negative: "));
            return;
        }
        synchronized (this) {
            g gVar = this.f97760c;
            if (gVar != null) {
                gVar.b(j8);
                return;
            }
            long j14 = this.f97761d;
            if (j14 == Long.MIN_VALUE) {
                this.f97761d = j8;
            } else {
                long j15 = j14 + j8;
                if (j15 < 0) {
                    this.f97761d = Long.MAX_VALUE;
                } else {
                    this.f97761d = j15;
                }
            }
        }
    }

    public void i(g gVar) {
        long j8;
        n<?> nVar;
        boolean z14;
        synchronized (this) {
            j8 = this.f97761d;
            this.f97760c = gVar;
            nVar = this.f97759b;
            z14 = nVar != null && j8 == Long.MIN_VALUE;
        }
        if (z14) {
            nVar.i(gVar);
        } else if (j8 == Long.MIN_VALUE) {
            gVar.b(Long.MAX_VALUE);
        } else {
            gVar.b(j8);
        }
    }

    public n(n<?> nVar) {
        this(nVar, true);
    }

    public n() {
        this(null, false);
    }
}
