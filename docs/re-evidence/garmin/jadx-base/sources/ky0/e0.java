package ky0;

import c2.x2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f107286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107287c;

    public /* synthetic */ e0(boolean z14, p3.p1 p1Var, int i14) {
        this.f107285a = i14;
        this.f107286b = z14;
        this.f107287c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f107285a;
        p3.m.a aVar = p3.m.f135153a;
        p3.p1 p1Var = this.f107287c;
        boolean z14 = this.f107286b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    mVar.C(-1597121719);
                    w13.c cVar = f2.f107312e;
                    ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new b82.g1(gl1.y.Q(mVar, ((f2) it.next()).f107313a), null, null, null, 14, null));
                    }
                    mVar.f();
                    i53.f fVarJ = i53.a.j(arrayList);
                    if (z14) {
                        mVar.C(2029022373);
                        g6.c cVar2 = (g6.c) mVar.A(kotlin.t1.f91490h);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        float fH0 = cVar2.H0(d92.c.e(j92.f.f97932i).f157323b.f157308c);
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97920e;
                        h4.r rVarF = x2.f(c2.l.B(aVar2, f14, eVar.f97921f, f14, f14), 1.0f);
                        float f15 = fH0 + eVar.f97919d;
                        g6.f.a aVar3 = g6.f.f75994b;
                        h4.r rVarH = x2.h(rVarF, f15);
                        int iOrdinal = ((f2) p1Var.getF182175a()).ordinal();
                        Object objQ = mVar.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k(p1Var, 4);
                            mVar.K(objQ);
                        }
                        b82.k1.a(fVarJ, iOrdinal, rVarH, null, 0.0f, (e23.l) objQ, mVar, 196608, 24);
                        mVar.f();
                    } else {
                        mVar.C(2029844989);
                        mVar.f();
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        mVar2.C(-1060656055);
                        Object objQ2 = mVar2.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new zk1.d(p1Var, 5);
                            mVar2.K(objQ2);
                        }
                        zo1.r0.e((e23.a) objQ2, mVar2, 6);
                        mVar2.f();
                    } else {
                        mVar2.C(-1060472039);
                        zo1.r0.f(mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (z14) {
                        mVar3.C(-1146250442);
                        Object objQ3 = mVar3.q();
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new zk1.d(p1Var, 9);
                            mVar3.K(objQ3);
                        }
                        zo1.r0.e((e23.a) objQ3, mVar3, 6);
                        mVar3.f();
                    } else {
                        mVar3.C(-1146082050);
                        zo1.r0.f(mVar3, 0);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
