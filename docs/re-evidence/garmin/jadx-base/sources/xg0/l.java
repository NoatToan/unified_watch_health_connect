package xg0;

import f5.z0;
import i3.h7;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f190785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.h f190786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f190787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190788e;

    public /* synthetic */ l(m mVar, wg0.h hVar, Integer num, wg0.a aVar, int i14) {
        this.f190784a = i14;
        this.f190785b = mVar;
        this.f190786c = hVar;
        this.f190787d = num;
        this.f190788e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        final int i14 = 2;
        final int i15 = 1;
        Object[] objArr = 0;
        switch (this.f190784a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = m.I0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1580239328, new l(this.f190785b, this.f190786c, this.f190787d, this.f190788e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                final m mVar2 = this.f190785b;
                c2 c2Var = mVar2.H0;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = m.I0;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(aVar, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar2);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    c2.u uVar = c2.u.f22885a;
                    mVar3.C(431185486);
                    boolean zR = mVar3.r(mVar2);
                    Object objQ = mVar3.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: xg0.j
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        mVar2.H0.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        mVar2.H0.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        mVar2.H0.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        mVar2.H0.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: xg0.j
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            mVar2.H0.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        case 2:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    h7.a((e23.a) objQ, null, false, null, null, z3.f.c(189390980, new sg2.c(uVar), mVar3), mVar3, 1572864, 62);
                    p3.m mVar4 = mVar3;
                    int i18 = m.b.f190815b[this.f190786c.ordinal()];
                    wg0.a aVar4 = this.f190788e;
                    if (i18 == 1) {
                        mVar4.C(-124619406);
                        boolean zBooleanValue = ((Boolean) c2Var.getF182175a()).booleanValue();
                        boolean zR2 = mVar4.r(mVar2);
                        Object objQ2 = mVar4.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: xg0.j
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            mVar2.H0.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        case 2:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: xg0.j
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                mVar2.H0.setValue(Boolean.TRUE);
                                                break;
                                            case 1:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            case 2:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ2);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ2;
                        Integer num = this.f190787d;
                        if (num != null) {
                            f.a(zBooleanValue, aVar5, num.intValue(), aVar4, mVar2.f190791c, mVar4, 0);
                            mVar4 = mVar4;
                            mVar4.f();
                        } else {
                            mVar4.f();
                        }
                    } else if (i18 != 2) {
                        final int i19 = 3;
                        if (i18 != 3) {
                            throw n23.j.m(mVar4, -124621259);
                        }
                        mVar4.C(-124592141);
                        boolean zBooleanValue2 = ((Boolean) c2Var.getF182175a()).booleanValue();
                        boolean zR3 = mVar4.r(mVar2);
                        Object objQ3 = mVar4.q();
                        if (zR3) {
                            objQ3 = new e23.a() { // from class: xg0.j
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            mVar2.H0.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        case 2:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e23.a() { // from class: xg0.j
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                mVar2.H0.setValue(Boolean.TRUE);
                                                break;
                                            case 1:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            case 2:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ3);
                            }
                        }
                        u.a(zBooleanValue2, (e23.a) objQ3, aVar4, mVar2.f190791c, mVar4, 0);
                        mVar4.f();
                    } else {
                        mVar4.C(-124604785);
                        boolean zBooleanValue3 = ((Boolean) c2Var.getF182175a()).booleanValue();
                        boolean zR4 = mVar4.r(mVar2);
                        Object objQ4 = mVar4.q();
                        if (zR4) {
                            objQ4 = new e23.a() { // from class: xg0.j
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            mVar2.H0.setValue(Boolean.TRUE);
                                            break;
                                        case 1:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        case 2:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            mVar2.H0.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ4);
                        } else {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: xg0.j
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                mVar2.H0.setValue(Boolean.TRUE);
                                                break;
                                            case 1:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            case 2:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                mVar2.H0.setValue(Boolean.FALSE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ4);
                            }
                        }
                        g0.a(zBooleanValue3, (e23.a) objQ4, aVar4, mVar2.f190791c, mVar4, 0);
                        mVar4.f();
                    }
                    mVar4.f();
                    mVar4.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
