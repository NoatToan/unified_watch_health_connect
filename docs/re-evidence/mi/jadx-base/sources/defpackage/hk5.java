package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hk5 implements fk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw3 f20156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20157b;

    public hk5(fw3 fw3Var, long j) {
        this.f20156a = fw3Var;
        this.f20157b = j;
    }

    @Override // defpackage.fk5
    public long c(long j) {
        return this.f20156a.e[(int) j] - this.f20157b;
    }

    @Override // defpackage.fk5
    public long d(long j, long j2) {
        return this.f20156a.d[(int) j];
    }

    @Override // defpackage.fk5
    public long e(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.fk5
    public long f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.fk5
    public long g(long j, long j2) {
        return this.f20156a.a(j + this.f20157b);
    }

    @Override // defpackage.fk5
    public long h(long j) {
        return this.f20156a.f18311a;
    }

    @Override // defpackage.fk5
    public long i() {
        return 0L;
    }

    @Override // defpackage.fk5
    public tbj j(long j) {
        fw3 fw3Var = this.f20156a;
        int i = (int) j;
        return new tbj(null, fw3Var.c[i], fw3Var.f18312b[i]);
    }

    @Override // defpackage.fk5
    public boolean k() {
        return true;
    }

    @Override // defpackage.fk5
    public long l(long j, long j2) {
        return this.f20156a.f18311a;
    }
}
