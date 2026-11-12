package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f135790d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f135791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f135792c;

    private a0(w1 w1Var, w1 w1Var2) {
        this.f135791b = w1Var;
        this.f135792c = w1Var2;
    }

    @Override // p43.w1
    public final boolean a() {
        return this.f135791b.a() || this.f135792c.a();
    }

    @Override // p43.w1
    public final boolean b() {
        return this.f135791b.b() || this.f135792c.b();
    }

    @Override // p43.w1
    public final u23.h c(u23.h hVar) {
        hVar.getClass();
        return this.f135792c.c(this.f135791b.c(hVar));
    }

    @Override // p43.w1
    public final t1 d(n0 n0Var) {
        t1 t1VarD = this.f135791b.d(n0Var);
        return t1VarD == null ? this.f135792c.d(n0Var) : t1VarD;
    }

    @Override // p43.w1
    public final n0 f(g2 g2Var, n0 n0Var) {
        n0Var.getClass();
        g2Var.getClass();
        return this.f135792c.f(g2Var, this.f135791b.f(g2Var, n0Var));
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a0(w1 w1Var, w1 w1Var2, p005kotlin.jvm.internal.j jVar) {
        this(w1Var, w1Var2);
    }
}
