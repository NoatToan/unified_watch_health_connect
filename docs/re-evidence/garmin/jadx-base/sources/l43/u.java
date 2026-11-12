package l43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u33.a f110107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n43.v f110108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u33.e f110109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f110110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s33.n f110111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n43.f0 f110112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x33.c cVar, o43.n nVar, t23.c0 c0Var, s33.n nVar2, u33.a aVar, n43.v vVar) {
        super(cVar, nVar, c0Var);
        cVar.getClass();
        nVar.getClass();
        c0Var.getClass();
        nVar2.getClass();
        aVar.getClass();
        this.f110107g = aVar;
        this.f110108h = vVar;
        s33.r rVar = nVar2.f156756d;
        rVar.getClass();
        s33.p pVar = nVar2.f156757e;
        pVar.getClass();
        u33.e eVar = new u33.e(rVar, pVar);
        this.f110109i = eVar;
        this.f110110j = new n0(nVar2, eVar, aVar, new s(this));
        this.f110111k = nVar2;
    }

    @Override // l43.r
    public final n0 D0() {
        return this.f110110j;
    }

    public final void E0(n nVar) {
        nVar.getClass();
        s33.n nVar2 = this.f110111k;
        if (nVar2 == null) {
            vb.h.z("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f110111k = null;
        s33.m mVar = nVar2.f156758f;
        mVar.getClass();
        this.f110112l = new n43.f0(this, mVar, this.f110109i, this.f110107g, this.f110108h, nVar, "scope of " + this, new t(this));
    }

    @Override // t23.h0
    public final i43.l i() {
        n43.f0 f0Var = this.f110112l;
        if (f0Var != null) {
            return f0Var;
        }
        p005kotlin.jvm.internal.s.m("_memberScope");
        throw null;
    }
}
