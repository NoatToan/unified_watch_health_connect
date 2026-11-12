package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16691a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f16692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f16694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f16695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f16696f;

    public /* synthetic */ n0(p3.p1 p1Var, e23.l lVar, e23.l lVar2, boolean z14, p3.p1 p1Var2) {
        this.f16692b = p1Var;
        this.f16694d = lVar;
        this.f16695e = lVar2;
        this.f16693c = z14;
        this.f16696f = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f16691a;
        p3.m.a aVar = p3.m.f135153a;
        p3.p1 p1Var = this.f16696f;
        e23.l lVar = this.f16695e;
        e23.l lVar2 = this.f16694d;
        boolean z14 = this.f16693c;
        p3.p1 p1Var2 = this.f16692b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                t0 t0Var = t0.f16792a;
                ((r1.e0) obj).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar2, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                Boolean bool = (Boolean) p1Var2.getF182175a();
                bool.getClass();
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                Object objQ = mVar.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b71.o(4);
                    mVar.K(objQ);
                }
                r1.b.a(bool, rVarC, (e23.l) objQ, gVar, "", null, z3.f.c(295756008, new z(lVar2, lVar, z14, p1Var), mVar), mVar, 1600896, 32);
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar3, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                Boolean bool2 = (Boolean) p1Var2.getF182175a();
                bool2.getClass();
                h4.d.f81522a.getClass();
                h4.g gVar2 = h4.d.a.f81528f;
                Object objQ2 = mVar2.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new d81.t(29);
                    mVar2.K(objQ2);
                }
                r1.b.a(bool2, rVarC2, (e23.l) objQ2, gVar2, "", null, z3.f.c(1741616977, new z(z14, lVar2, lVar, p1Var), mVar2), mVar2, 1600896, 32);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n0(p3.p1 p1Var, boolean z14, e23.l lVar, e23.l lVar2, p3.p1 p1Var2) {
        this.f16692b = p1Var;
        this.f16693c = z14;
        this.f16694d = lVar;
        this.f16695e = lVar2;
        this.f16696f = p1Var2;
    }
}
