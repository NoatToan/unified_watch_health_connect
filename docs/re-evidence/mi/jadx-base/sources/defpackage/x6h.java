package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class x6h extends s08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s08 f38756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38757b;

    public x6h(s08 s08Var, float f) {
        this.f38756a = s08Var;
        this.f38757b = f;
    }

    @Override // defpackage.s08
    public boolean a() {
        return this.f38756a.a();
    }

    @Override // defpackage.s08
    public void b(float f, float f2, float f3, d3m d3mVar) {
        this.f38756a.b(f, f2 - this.f38757b, f3, d3mVar);
    }
}
