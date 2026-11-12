package bb;

/* JADX INFO: loaded from: classes.dex */
public final class u implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17256b;

    public u(v vVar, long j8) {
        this.f17255a = vVar;
        this.f17256b = j8;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f17255a.e();
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        v vVar = this.f17255a;
        fa.a.f(vVar.f17267k);
        v.a aVar = vVar.f17267k;
        long[] jArr = aVar.f17269a;
        long[] jArr2 = aVar.f17270b;
        int iE = fa.z.e(jArr, fa.z.j((((long) vVar.f17261e) * j8) / 1000000, 0L, vVar.f17266j - 1), false);
        long j14 = iE == -1 ? 0L : jArr[iE];
        long j15 = iE != -1 ? jArr2[iE] : 0L;
        long j16 = (j14 * 1000000) / ((long) vVar.f17261e);
        long j17 = this.f17256b;
        h0 h0Var = new h0(j16, j15 + j17);
        if (h0Var.f17186a == j8 || iE == jArr.length - 1) {
            return new g0.a(h0Var);
        }
        int i14 = iE + 1;
        return new g0.a(h0Var, new h0((jArr[i14] * 1000000) / ((long) vVar.f17261e), j17 + jArr2[i14]));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }
}
