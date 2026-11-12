package n12;

import c2.x2;
import p005kotlin.Unit;
import p3.x1;
import v62.m6;
import v62.w3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.c f122340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f122341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0.d f122342d;

    public /* synthetic */ w0(v0.c cVar, v0 v0Var, v0.d dVar, int i14) {
        this.f122339a = i14;
        this.f122340b = cVar;
        this.f122341c = v0Var;
        this.f122342d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ec  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f122339a;
        final v0.d dVar = this.f122342d;
        final v0 v0Var = this.f122341c;
        v0.c cVar = this.f122340b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = v0.d.f122330c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(646222079, new w0(cVar, v0Var, dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = v0.d.f122330c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = cVar instanceof v0.c.a;
                    p3.m.a aVar = p3.m.f135153a;
                    if (z14) {
                        mVar2.C(1558638018);
                        g6.f.a aVar2 = g6.f.f75994b;
                        h4.r rVarQ = x2.q(h4.r.S, 106);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarY = c2.l.y(rVarQ, eVar.f97918c);
                        boolean zR = mVar2.r(v0Var) | mVar2.r(dVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: n12.x0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = objArr2;
                                    v0.d dVar2 = dVar;
                                    v0 v0Var2 = v0Var;
                                    switch (i18) {
                                        case 0:
                                            int i19 = v0.d.f122330c;
                                            u uVar = v0Var2.f122322d;
                                            if (uVar != null) {
                                                uVar.onClick(dVar2.f122331a);
                                            }
                                            break;
                                        default:
                                            int i24 = v0.d.f122330c;
                                            v vVar = v0Var2.f122321c;
                                            if (vVar != null) {
                                                vVar.onClick(dVar2.f122331a);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int objArr3 = objArr == true ? 1 : 0;
                                objQ = new e23.a() { // from class: n12.x0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i18 = objArr3;
                                        v0.d dVar2 = dVar;
                                        v0 v0Var2 = v0Var;
                                        switch (i18) {
                                            case 0:
                                                int i19 = v0.d.f122330c;
                                                u uVar = v0Var2.f122322d;
                                                if (uVar != null) {
                                                    uVar.onClick(dVar2.f122331a);
                                                }
                                                break;
                                            default:
                                                int i24 = v0.d.f122330c;
                                                v vVar = v0Var2.f122321c;
                                                if (vVar != null) {
                                                    vVar.onClick(dVar2.f122331a);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ);
                            }
                        }
                        g02.i.a(u1.w.d(rVarY, false, null, null, (e23.a) objQ, 15), m6.a(t62.b.f162798a), lc.u0.f(mVar2), d92.b.a(mVar2).d().a().b(), j92.b.f97901d.f97905d, eVar.f97921f, null, mVar2, 0, 192);
                        mVar2.f();
                    } else if (cVar instanceof v0.c.b) {
                        mVar2.C(1559385025);
                        g6.f.a aVar3 = g6.f.f75994b;
                        h4.r rVarQ2 = x2.q(h4.r.S, 106);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarY2 = c2.l.y(rVarQ2, eVar2.f97918c);
                        boolean zR2 = mVar2.r(v0Var) | mVar2.r(dVar);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: n12.x0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    v0.d dVar2 = dVar;
                                    v0 v0Var2 = v0Var;
                                    switch (i18) {
                                        case 0:
                                            int i19 = v0.d.f122330c;
                                            u uVar = v0Var2.f122322d;
                                            if (uVar != null) {
                                                uVar.onClick(dVar2.f122331a);
                                            }
                                            break;
                                        default:
                                            int i24 = v0.d.f122330c;
                                            v vVar = v0Var2.f122321c;
                                            if (vVar != null) {
                                                vVar.onClick(dVar2.f122331a);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: n12.x0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i18 = i15;
                                        v0.d dVar2 = dVar;
                                        v0 v0Var2 = v0Var;
                                        switch (i18) {
                                            case 0:
                                                int i19 = v0.d.f122330c;
                                                u uVar = v0Var2.f122322d;
                                                if (uVar != null) {
                                                    uVar.onClick(dVar2.f122331a);
                                                }
                                                break;
                                            default:
                                                int i24 = v0.d.f122330c;
                                                v vVar = v0Var2.f122321c;
                                                if (vVar != null) {
                                                    vVar.onClick(dVar2.f122331a);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        g02.i.a(u1.w.d(rVarY2, false, null, null, (e23.a) objQ2, 15), w3.a(t62.b.f162798a), lc.u0.f(mVar2), d92.b.a(mVar2).d().a().b(), j92.b.f97901d.f97905d, eVar2.f97921f, null, mVar2, 0, 192);
                        mVar2.f();
                    } else {
                        mVar2.C(-1750789629);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
