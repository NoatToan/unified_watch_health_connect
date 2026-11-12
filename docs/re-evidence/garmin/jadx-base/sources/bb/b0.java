package bb;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.l f17104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.l f17105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17106c;

    public b0(long[] jArr, long[] jArr2, long j8) {
        fa.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f17104a = new fa.l(length);
            this.f17105b = new fa.l(length);
        } else {
            int i14 = length + 1;
            fa.l lVar = new fa.l(i14);
            this.f17104a = lVar;
            fa.l lVar2 = new fa.l(i14);
            this.f17105b = lVar2;
            lVar.a(0L);
            lVar2.a(0L);
        }
        this.f17104a.b(jArr);
        this.f17105b.b(jArr2);
        this.f17106c = j8;
    }

    public final void a(long j8, long j14) {
        fa.l lVar = this.f17105b;
        int i14 = lVar.f70034a;
        fa.l lVar2 = this.f17104a;
        if (i14 == 0 && j8 > 0) {
            lVar2.a(0L);
            lVar.a(0L);
        }
        lVar2.a(j14);
        lVar.a(j8);
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f17106c;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        fa.l lVar = this.f17105b;
        if (lVar.f70034a == 0) {
            return new g0.a(h0.f17185c);
        }
        int iB = fa.z.b(lVar, j8);
        long jC = lVar.c(iB);
        fa.l lVar2 = this.f17104a;
        h0 h0Var = new h0(jC, lVar2.c(iB));
        if (h0Var.f17186a == j8 || iB == lVar.f70034a - 1) {
            return new g0.a(h0Var);
        }
        int i14 = iB + 1;
        return new g0.a(h0Var, new h0(lVar.c(i14), lVar2.c(i14)));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return this.f17105b.f70034a > 0;
    }
}
