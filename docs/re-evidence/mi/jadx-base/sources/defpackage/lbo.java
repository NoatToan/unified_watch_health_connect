package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lbo implements vif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f14 f24874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24875b;
    public long c;
    public long d;
    public n0i e = n0i.d;

    public lbo(f14 f14Var) {
        this.f24874a = f14Var;
    }

    public void a(long j) {
        this.c = j;
        if (this.f24875b) {
            this.d = this.f24874a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f24875b) {
            return;
        }
        this.d = this.f24874a.elapsedRealtime();
        this.f24875b = true;
    }

    @Override // defpackage.vif
    public n0i c() {
        return this.e;
    }

    @Override // defpackage.vif
    public void d(n0i n0iVar) {
        if (this.f24875b) {
            a(v());
        }
        this.e = n0iVar;
    }

    public void e() {
        if (this.f24875b) {
            a(v());
            this.f24875b = false;
        }
    }

    @Override // defpackage.vif
    public long v() {
        long j = this.c;
        if (!this.f24875b) {
            return j;
        }
        long jElapsedRealtime = this.f24874a.elapsedRealtime() - this.d;
        n0i n0iVar = this.e;
        return j + (n0iVar.f27406a == 1.0f ? g83.c(jElapsedRealtime) : n0iVar.a(jElapsedRealtime));
    }
}
