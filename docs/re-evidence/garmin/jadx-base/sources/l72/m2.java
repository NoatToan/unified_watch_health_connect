package l72;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m2 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f111165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f111166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f111167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.a f111168e;

    public /* synthetic */ m2(boolean z14, e23.a aVar, e23.a aVar2, b92.a aVar3, int i14) {
        this.f111164a = i14;
        this.f111165b = z14;
        this.f111166c = aVar;
        this.f111167d = aVar2;
        this.f111168e = aVar3;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f111164a;
        p3.m.a aVar = p3.m.f135153a;
        b92.a aVar2 = this.f111168e;
        e23.a aVar3 = this.f111166c;
        boolean z14 = this.f111165b;
        boolean z15 = true;
        switch (i14) {
            case 0:
                e23.a aVar4 = aVar3;
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                p2 p2Var = p2.f111205a;
                rVar.getClass();
                mVar.C(-105752296);
                p3.x1 x1Var = p3.n.f135158a;
                e23.a aVar5 = this.f111167d;
                boolean z16 = z14 && !(aVar4 == null && aVar5 == null);
                if (aVar4 == null) {
                    mVar.C(2039518792);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new o2(1);
                        mVar.K(objQ);
                    }
                    aVar4 = (e23.a) objQ;
                } else {
                    mVar.C(1451263909);
                }
                mVar.f();
                h4.r rVarF = u1.w.f(236, aVar5, aVar4, rVar, aVar2 != null ? aVar2.f16961a.get("onClickLabel") : null, z16);
                mVar.f();
                return rVarF;
            case 1:
                e23.a aVar6 = aVar3;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                p2 p2Var2 = p2.f111205a;
                rVar2.getClass();
                mVar2.C(661625548);
                p3.x1 x1Var2 = p3.n.f135158a;
                e23.a aVar7 = this.f111167d;
                if (!z14 || (aVar6 == null && aVar7 == null)) {
                    z15 = false;
                }
                if (aVar6 == null) {
                    mVar2.C(881952788);
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o2(0);
                        mVar2.K(objQ2);
                    }
                    aVar6 = (e23.a) objQ2;
                } else {
                    mVar2.C(166997081);
                }
                mVar2.f();
                h4.r rVarF2 = u1.w.f(236, aVar7, aVar6, rVar2, aVar2 != null ? aVar2.f16961a.get("onClickLabel") : null, z15);
                mVar2.f();
                return rVarF2;
            default:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                p2 p2Var3 = p2.f111205a;
                rVar3.getClass();
                mVar3.C(-1140006898);
                p3.x1 x1Var3 = p3.n.f135158a;
                e23.a aVar8 = this.f111167d;
                boolean z17 = z14 && !(aVar3 == null && aVar8 == null);
                if (aVar3 == null) {
                    mVar3.C(-1638915182);
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new l01.b(29);
                        mVar3.K(objQ3);
                    }
                    aVar3 = (e23.a) objQ3;
                } else {
                    mVar3.C(-329963237);
                }
                mVar3.f();
                h4.r rVarF3 = u1.w.f(236, aVar8, aVar3, rVar3, aVar2 != null ? aVar2.f16961a.get("onClickLabel") : null, z17);
                mVar3.f();
                return rVarF3;
        }
    }
}
