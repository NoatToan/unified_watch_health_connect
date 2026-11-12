package wq;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import i3.mh;
import o53.f0;
import p005kotlin.Unit;
import p006l2.l2;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.h0;
import p5.k0;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uq.e f186553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f186554c;

    public /* synthetic */ g(uq.e eVar, boolean z14, int i14) {
        this.f186552a = i14;
        this.f186553b = eVar;
        this.f186554c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        x0 x0VarB;
        p3.m mVar;
        int i14 = this.f186552a;
        boolean z14 = this.f186554c;
        final uq.e eVar = this.f186553b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1520172403, new g(eVar, z14, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    boolean zB = mVar3.B(eVar);
                    Object objQ = mVar3.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zB) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.l() { // from class: wq.h
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                k0 k0Var = (k0) obj3;
                                switch (objArr2) {
                                    case 0:
                                        k0Var.getClass();
                                        h0.n(k0Var, eVar.f172192d);
                                        break;
                                    default:
                                        k0Var.getClass();
                                        String str = eVar.f172194f;
                                        if (str != null) {
                                            h0.n(k0Var, str);
                                        }
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
                            objQ = new e23.l() { // from class: wq.h
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    k0 k0Var = (k0) obj3;
                                    switch (objArr3) {
                                        case 0:
                                            k0Var.getClass();
                                            h0.n(k0Var, eVar.f172192d);
                                            break;
                                        default:
                                            k0Var.getClass();
                                            String str = eVar.f172194f;
                                            if (str != null) {
                                                h0.n(k0Var, str);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    h4.r rVarC2 = v.c((e23.l) objQ, rVarF, false);
                    l2.a aVar4 = l2.f108642a;
                    long jB = f0.B(4);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    p006l2.d dVarA = l2.a.a(aVar4, jB, x0Var.f157322a.fontSize);
                    String str = eVar.f172191c;
                    d6.p.f57793b.getClass();
                    int i16 = d6.p.f57795d;
                    mVar3.C(721185663);
                    x0 x0VarE = d92.c.e(x0Var);
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57758h;
                    x0 x0VarA = x0.a(x0VarE, 0L, 0L, null, null, 0L, null, null, i17, 0L, null, null, 16744447);
                    if (!z14 || eVar.f172190b) {
                        mVar3.C(-2080399455);
                        x0VarB = d92.c.b(x0VarA, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(-2080300193);
                        x0VarB = d92.c.f(x0VarA, mVar3);
                        mVar3.f();
                    }
                    x0 x0Var2 = x0VarB;
                    mVar3.f();
                    mh.c(str, rVarC2, 0L, dVarA, 0L, null, 0L, null, 0L, i16, false, 1, 0, null, x0Var2, mVar3, 0, 24960, 110580);
                    if (eVar.f172193e == null) {
                        mVar3.C(882379455);
                        mVar3.f();
                        mVar = mVar3;
                    } else {
                        mVar3.C(882379456);
                        h4.r rVarF2 = x2.f(aVar, 1.0f);
                        boolean zB2 = mVar3.B(eVar);
                        Object objQ2 = mVar3.q();
                        if (zB2) {
                            objQ2 = new e23.l() { // from class: wq.h
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    k0 k0Var = (k0) obj3;
                                    switch (i15) {
                                        case 0:
                                            k0Var.getClass();
                                            h0.n(k0Var, eVar.f172192d);
                                            break;
                                        default:
                                            k0Var.getClass();
                                            String str2 = eVar.f172194f;
                                            if (str2 != null) {
                                                h0.n(k0Var, str2);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.l() { // from class: wq.h
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        k0 k0Var = (k0) obj3;
                                        switch (i15) {
                                            case 0:
                                                k0Var.getClass();
                                                h0.n(k0Var, eVar.f172192d);
                                                break;
                                            default:
                                                k0Var.getClass();
                                                String str2 = eVar.f172194f;
                                                if (str2 != null) {
                                                    h0.n(k0Var, str2);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ2);
                            }
                        }
                        h4.r rVarC3 = v.c((e23.l) objQ2, rVarF2, false);
                        long jB2 = f0.B(4);
                        x0 x0Var3 = j92.f.f97934k;
                        mVar = mVar3;
                        mh.c(eVar.f172193e, rVarC3, 0L, l2.a.a(aVar4, jB2, x0Var3.f157322a.fontSize), 0L, null, 0L, null, 0L, i16, false, 1, 0, null, x0.a(d92.c.f(x0Var3, mVar3), 0L, 0L, null, null, 0L, null, null, i17, 0L, null, null, 16744447), mVar, 0, 24960, 110580);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
