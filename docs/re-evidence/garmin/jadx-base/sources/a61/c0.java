package a61;

import l72.x0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o71.e f1557c;

    public /* synthetic */ c0(com.garmin.android.apps.connectmobile.performance.b bVar, o71.e eVar, int i14) {
        this.f1555a = i14;
        this.f1556b = bVar;
        this.f1557c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1555a;
        o71.e eVar = this.f1557c;
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1556b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-806625916, new c0(bVar, eVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                int iA = mVar2.a();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar2.C(-743352065);
                    int i17 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39873b[bVar.f39856c.ordinal()];
                    if (i17 == 1) {
                        mVar2.C(-743309100);
                        x0 x0Var = x0.f111346a;
                        g6.f.a aVar5 = g6.f.f75994b;
                        x0Var.e(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, 16, 7), z3.f.c(-1716218741, new e0(eVar, bVar), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                        mVar2.f();
                    } else if (i17 == 2) {
                        mVar2.C(-741435274);
                        x0 x0Var2 = x0.f111346a;
                        g6.f.a aVar6 = g6.f.f75994b;
                        x0Var2.e(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, 16, 7), z3.f.c(749130612, new e0(bVar, eVar, i16), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                        mVar2.f();
                    } else {
                        if (i17 != 3) {
                            mVar2.C(-740368967);
                            mVar2.f();
                            mVar2.w(iA);
                            return Unit.INSTANCE;
                        }
                        mVar2.C(-740885706);
                        x0 x0Var3 = x0.f111346a;
                        g6.f.a aVar7 = g6.f.f75994b;
                        x0Var3.e(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, 16, 7), z3.f.c(-1879962989, new e0(bVar, eVar, i15), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                        mVar2.f();
                    }
                    mVar2.f();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
