package g02;

import c2.l2;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f74497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f74499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f74500e;

    public /* synthetic */ o(p3.p1 p1Var, s5.x0 x0Var, String str, String str2) {
        this.f74496a = 2;
        this.f74497b = p1Var;
        this.f74500e = x0Var;
        this.f74498c = str;
        this.f74499d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74496a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    float f14 = 1;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarA = x2.a(aVar2, f14, f14);
                    i3.c1.f87691a.getClass();
                    l2 l2Var = i3.c1.f87693c;
                    l2 l2VarE = c2.l.e(0.0f, l2Var.f22737b, 0.0f, l2Var.f22739d, 5);
                    final p3.p1 p1Var = this.f74497b;
                    boolean zB = mVar.B(p1Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new et1.a2(p1Var, 25);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new et1.a2(p1Var, 25);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    final int i15 = 0;
                    final String str = this.f74498c;
                    final String str2 = this.f74499d;
                    final s5.x0 x0Var = this.f74500e;
                    i3.h1.c(aVar4, rVarA, false, null, null, null, l2VarE, null, z3.f.c(-250842381, new e23.q() { // from class: g02.p
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i16 = i15;
                            String str3 = str2;
                            String str4 = str;
                            p3.p1 p1Var2 = p1Var;
                            switch (i16) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((t2) obj3).getClass();
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                            str3 = str4;
                                        }
                                        mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131070);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    ((t2) obj3).getClass();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                            str3 = str4;
                                        }
                                        mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar3, 0, 0, 131070);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 805306416, 380);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    float f15 = 1;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarA2 = x2.a(aVar5, f15, f15);
                    i3.c1.f87691a.getClass();
                    l2 l2Var2 = i3.c1.f87693c;
                    l2 l2VarE2 = c2.l.e(0.0f, l2Var2.f22737b, 0.0f, l2Var2.f22739d, 5);
                    final p3.p1 p1Var2 = this.f74497b;
                    boolean zB2 = mVar2.B(p1Var2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new i11.i(p1Var2, 10);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i11.i(p1Var2, 10);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ2;
                    final int i16 = 1;
                    final String str3 = this.f74498c;
                    final String str4 = this.f74499d;
                    final s5.x0 x0Var2 = this.f74500e;
                    i3.h1.c(aVar7, rVarA2, false, null, null, null, l2VarE2, null, z3.f.c(37861276, new e23.q() { // from class: g02.p
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i17 = i16;
                            String str5 = str4;
                            String str6 = str3;
                            p3.p1 p1Var3 = p1Var2;
                            switch (i17) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    ((t2) obj3).getClass();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                            str5 = str6;
                                        }
                                        mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar3, 0, 0, 131070);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    ((t2) obj3).getClass();
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        p3.x1 x1Var4 = p3.n.f135158a;
                                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                            str5 = str6;
                                        }
                                        mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar4, 0, 0, 131070);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, 805306416, 380);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarF = x2.f(aVar8, 1.0f);
                    i3.c1.f87691a.getClass();
                    l2 l2Var3 = i3.c1.f87693c;
                    h4.r rVarC = c2.l.C(rVarF, 0.0f, l2Var3.f22737b, 0.0f, l2Var3.f22739d, 5);
                    p3.p1 p1Var3 = this.f74497b;
                    boolean zB3 = mVar3.B(p1Var3);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new ly0.f(p1Var3, 24);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ly0.f(p1Var3, 24);
                            mVar3.K(objQ3);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarC, false, null, null, (e23.a) objQ3, 15);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, mVar3, 54);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    u2 u2Var = u2.f22900a;
                    u4.d dVarA = ((Boolean) p1Var3.getF182175a()).booleanValue() ? v62.k1.a(t62.b.f162798a) : v62.h1.a(t62.b.f162798a);
                    o4.e0.a aVar10 = o4.e0.f128843b;
                    s5.x0 x0Var3 = this.f74500e;
                    o4.r rVarA3 = o4.e0.a.a(aVar10, x0Var3.c());
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    u1.y0.b(dVarA, "", x2.q(aVar8, j92.b.f97899b.f97920e), rVarA3, mVar3, 48, 56);
                    mh.c(((Boolean) p1Var3.getF182175a()).booleanValue() ? this.f74498c : this.f74499d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar3, 0, 0, 131070);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(p3.p1 p1Var, String str, String str2, s5.x0 x0Var, int i14) {
        this.f74496a = i14;
        this.f74497b = p1Var;
        this.f74498c = str;
        this.f74499d = str2;
        this.f74500e = x0Var;
    }
}
