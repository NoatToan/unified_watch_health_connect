package l72;

import com.garmin.android.apps.connectmobile.R;
import i3.dd;
import i3.i7;
import i3.uc;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a3 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f110895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110896c;

    public /* synthetic */ a3(boolean z14, e23.a aVar) {
        this.f110894a = 1;
        this.f110895b = z14;
        this.f110896c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0065  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15 = this.f110894a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = this.f110895b;
        Object obj5 = this.f110896c;
        switch (i15) {
            case 0:
                uc ucVar = (uc) obj5;
                a2.j jVar = (a2.j) obj;
                String str = (String) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                c3 c3Var = c3.f110949a;
                jVar.getClass();
                int i16 = 4;
                if ((iIntValue & 6) == 0) {
                    i14 = (mVar.B(jVar) ? 4 : 2) | iIntValue;
                } else {
                    i14 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i14 |= mVar.B(str) ? 32 : 16;
                }
                if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    dd ddVar = dd.f87874a;
                    h4.r.a aVar2 = h4.r.S;
                    boolean z15 = (i14 & 112) == 32;
                    Object objQ = mVar.q();
                    if (z15) {
                        objQ = new n2(str, i16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n2(str, i16);
                            mVar.K(objQ);
                        }
                    }
                    ddVar.a(jVar, p5.v.c((e23.l) objQ, aVar2, false), ucVar, this.f110895b, 0L, mVar, (i14 & 14) | 196608, 16);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var2 = p3.n.f135158a;
                ro0.d.b(z14, null, (e23.a) obj5, (p3.m) obj3, 0);
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                if (zBooleanValue) {
                    mVar2.C(-85939162);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.n1.a(t62.b.f162798a);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarM = c2.x2.m(aVar3, j92.b.f97901d.f97904c);
                    boolean zB = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new ub0.h(lVar, 19);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ub0.h(lVar, 19);
                            mVar2.K(objQ2);
                        }
                    }
                    i7.b(dVarA, null, u1.w.d(rVarM, false, null, null, (e23.a) objQ2, 15), sn.a.b(mVar2), mVar2, 48, 0);
                    mVar2.f();
                } else if (z14) {
                    mVar2.C(-85349294);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    float f14 = cVar.f97904c;
                    float f15 = cVar.f97903b;
                    h4.r rVarN = c2.x2.n(aVar4, f14, f14);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarN, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    i7.a(n5.c.a(R.drawable.ic_exclamation, mVar2, 0), null, u1.n.e(l4.k.b(c2.u.f22885a.c(c2.x2.u(c2.x2.h(aVar4, f15), f15), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar2).f().f(), o4.m1.f128891a), d92.b.a(mVar2).f().f63508c, mVar2, 48, 0);
                    mVar2.y();
                    mVar2.f();
                } else {
                    mVar2.C(-84335439);
                    mVar2.f();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a3(Object obj, boolean z14, int i14) {
        this.f110894a = i14;
        this.f110896c = obj;
        this.f110895b = z14;
    }
}
