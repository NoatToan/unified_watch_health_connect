package da0;

import i3.mh;
import i3.v5;
import java.util.Iterator;
import l72.i3;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f58798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f58799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f58800d;

    public /* synthetic */ l0(i53.c cVar, p1 p1Var, e23.l lVar) {
        this.f58797a = 2;
        this.f58798b = cVar;
        this.f58800d = p1Var;
        this.f58799c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ae  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final long jC;
        final long jC2;
        long jC3;
        z3.e eVar;
        int i14 = this.f58797a;
        p3.m.a aVar = p3.m.f135153a;
        final e23.l lVar = this.f58799c;
        final p1 p1Var = this.f58800d;
        i53.c<i3> cVar = this.f58798b;
        boolean z14 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    if (cVar == null) {
                        mVar.C(-1027814553);
                        mVar.f();
                    } else {
                        mVar.C(-1027814552);
                        for (final i3 i3Var : cVar) {
                            if (i3Var.f111065c) {
                                mVar.C(-964527453);
                                d92.b.f58623a.getClass();
                                jC = d92.b.a(mVar).k().b();
                            } else {
                                mVar.C(-964526266);
                                d92.b.f58623a.getClass();
                                jC = o4.d0.c(0.5f, d92.b.a(mVar).k().b(), 14);
                            }
                            mVar.f();
                            boolean z15 = i3Var.f111065c;
                            final int i16 = z14 ? 1 : 0;
                            z3.e eVarC = z3.f.c(202281580, new e23.p() { // from class: da0.g0
                                @Override // e23.p
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i17 = i16;
                                    i3 i3Var2 = i3Var;
                                    switch (i17) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                x1 x1Var2 = p3.n.f135158a;
                                                mh.c(i3Var2.f111064b, null, jC, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262138);
                                            } else {
                                                mVar2.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar3 = (p3.m) obj4;
                                            int iIntValue3 = ((Integer) obj5).intValue();
                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                x1 x1Var3 = p3.n.f135158a;
                                                mh.c(i3Var2.f111064b, null, jC, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar3, 0, 0, 262138);
                                            } else {
                                                mVar3.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar);
                            boolean zB = mVar.B(lVar) | mVar.r(i3Var);
                            Object objQ = mVar.q();
                            if (zB) {
                                final int i17 = z14 ? 1 : 0;
                                objQ = new e23.a() { // from class: da0.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                p1Var.setValue(Boolean.FALSE);
                                                e23.l lVar2 = lVar;
                                                if (lVar2 != null) {
                                                    lVar2.invoke(i3Var);
                                                }
                                                break;
                                            default:
                                                p1Var.setValue(Boolean.FALSE);
                                                e23.l lVar3 = lVar;
                                                if (lVar3 != null) {
                                                    lVar3.invoke(i3Var);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ);
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    final int i18 = z14 ? 1 : 0;
                                    objQ = new e23.a() { // from class: da0.h0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    p1Var.setValue(Boolean.FALSE);
                                                    e23.l lVar2 = lVar;
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(i3Var);
                                                    }
                                                    break;
                                                default:
                                                    p1Var.setValue(Boolean.FALSE);
                                                    e23.l lVar3 = lVar;
                                                    if (lVar3 != null) {
                                                        lVar3.invoke(i3Var);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar.K(objQ);
                                }
                            }
                            i3.u.b(eVarC, (e23.a) objQ, null, null, null, z15, null, null, mVar, 6, 476);
                        }
                        mVar.f();
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    for (final i3 i3Var2 : cVar) {
                        o4.d0 d0Var = i3Var2.f111068f;
                        boolean z16 = i3Var2.f111065c;
                        if (d0Var == null) {
                            mVar2.C(1933066303);
                            d92.b.f58623a.getClass();
                            jC2 = d92.b.a(mVar2).k().b();
                            mVar2.f();
                        } else {
                            mVar2.C(1933065094);
                            mVar2.f();
                            jC2 = d0Var.f128833a;
                        }
                        if (!z16) {
                            jC2 = o4.d0.c(o4.d0.e(jC2) * 0.5f, jC2, 14);
                        }
                        o4.d0 d0Var2 = i3Var2.f111069g;
                        if (d0Var2 == null) {
                            mVar2.C(1933073375);
                            d92.b.f58623a.getClass();
                            long jB = d92.b.a(mVar2).f().b();
                            mVar2.f();
                            jC3 = jB;
                        } else {
                            mVar2.C(1933072197);
                            mVar2.f();
                            jC3 = d0Var2.f128833a;
                        }
                        if (!z16) {
                            jC3 = o4.d0.c(o4.d0.e(jC3) * 0.5f, jC3, 14);
                        }
                        if (i3Var2.f111070h) {
                            mVar2.C(-204058236);
                            long jE = q2.e(d92.b.f58623a, mVar2);
                            p3.m mVar3 = mVar2;
                            g6.f.a aVar2 = g6.f.f75994b;
                            v5.a(1, 48, 1, jE, null, mVar3);
                            mVar2 = mVar3;
                            mVar2.f();
                        } else {
                            mVar2.C(-203969142);
                            mVar2.f();
                        }
                        u4.d dVar = i3Var2.f111066d;
                        if (dVar == null) {
                            mVar2.C(-203784910);
                            mVar2.f();
                            eVar = null;
                        } else {
                            mVar2.C(-203784909);
                            z3.e eVarC2 = z3.f.c(1444216120, new j21.r(dVar, jC3, 1, (byte) 0), mVar2);
                            mVar2.f();
                            eVar = eVarC2;
                        }
                        boolean z17 = i3Var2.f111065c;
                        z3.e eVarC3 = z3.f.c(612652136, new e23.p() { // from class: da0.g0
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                int i19 = i15;
                                i3 i3Var3 = i3Var2;
                                switch (i19) {
                                    case 0:
                                        p3.m mVar4 = (p3.m) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            mh.c(i3Var3.f111064b, null, jC2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar4, 0, 0, 262138);
                                        } else {
                                            mVar4.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar5 = (p3.m) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            mh.c(i3Var3.f111064b, null, jC2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar5, 0, 0, 262138);
                                        } else {
                                            mVar5.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2);
                        boolean zB2 = mVar2.B(lVar) | mVar2.r(i3Var2);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new e23.a() { // from class: da0.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            e23.l lVar2 = lVar;
                                            if (lVar2 != null) {
                                                lVar2.invoke(i3Var2);
                                            }
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            e23.l lVar3 = lVar;
                                            if (lVar3 != null) {
                                                lVar3.invoke(i3Var2);
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
                                objQ2 = new e23.a() { // from class: da0.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                p1Var.setValue(Boolean.FALSE);
                                                e23.l lVar2 = lVar;
                                                if (lVar2 != null) {
                                                    lVar2.invoke(i3Var2);
                                                }
                                                break;
                                            default:
                                                p1Var.setValue(Boolean.FALSE);
                                                e23.l lVar3 = lVar;
                                                if (lVar3 != null) {
                                                    lVar3.invoke(i3Var2);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        p3.m mVar4 = mVar2;
                        i3.u.b(eVarC3, (e23.a) objQ2, null, eVar, null, z17, null, null, mVar4, 6, 468);
                        mVar2 = mVar4;
                        aVar = aVar;
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    Iterator<E> it = cVar.iterator();
                    while (it.hasNext()) {
                        je0.j jVar = (je0.j) it.next();
                        mVar5.N(-1540957353, jVar != null ? jVar.f98544a : null);
                        z3.e eVarC4 = z3.f.c(694193737, new tr2.o(jVar, 22), mVar5);
                        boolean zB3 = mVar5.B(p1Var) | mVar5.B(lVar) | mVar5.k(jVar == null ? -1 : jVar.ordinal());
                        Object objQ3 = mVar5.q();
                        if (zB3) {
                            objQ3 = new ug2.b0(p1Var, 4, lVar, jVar);
                            mVar5.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new ug2.b0(p1Var, 4, lVar, jVar);
                                mVar5.K(objQ3);
                            }
                        }
                        i3.u.b(eVarC4, (e23.a) objQ3, null, null, null, false, null, null, mVar5, 6, 508);
                        mVar5.Q();
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l0(i53.c cVar, e23.l lVar, p1 p1Var, int i14) {
        this.f58797a = i14;
        this.f58798b = cVar;
        this.f58799c = lVar;
        this.f58800d = p1Var;
    }
}
