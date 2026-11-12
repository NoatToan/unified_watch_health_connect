package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sy5<I, O> extends e52<I> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cg4<O> f34097b;

    public sy5(cg4<O> cg4Var) {
        this.f34097b = cg4Var;
    }

    @Override // defpackage.e52
    public void f() {
        this.f34097b.a();
    }

    @Override // defpackage.e52
    public void g(Throwable th) {
        this.f34097b.onFailure(th);
    }

    @Override // defpackage.e52
    public void i(float f) {
        this.f34097b.c(f);
    }

    public cg4<O> o() {
        return this.f34097b;
    }
}
