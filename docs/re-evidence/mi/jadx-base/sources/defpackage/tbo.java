package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class tbo extends n1a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34547b;

    public tbo(jl8 jl8Var, long j) {
        super(jl8Var);
        rk1.a(jl8Var.getPosition() >= j);
        this.f34547b = j;
    }

    @Override // defpackage.n1a, defpackage.jl8
    public long getLength() {
        return super.getLength() - this.f34547b;
    }

    @Override // defpackage.n1a, defpackage.jl8
    public long getPosition() {
        return super.getPosition() - this.f34547b;
    }

    @Override // defpackage.n1a, defpackage.jl8
    public long n() {
        return super.n() - this.f34547b;
    }
}
