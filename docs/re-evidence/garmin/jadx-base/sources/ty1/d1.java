package ty1;

import c2.x2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.t f167091b;

    public /* synthetic */ d1(com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar, int i14) {
        this.f167090a = i14;
        this.f167091b = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167090a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar = this.f167091b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1929830573, new d1(tVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar2, 54);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (tVar.A6().C2) {
                        mVar2.C(818365591);
                        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) o53.f0.G(tVar.A6().G5(), mVar2).getF182175a();
                        if (fVar == null) {
                            tVar.A6().J6(null);
                        } else if (tVar.f46258d == null) {
                            tVar.f46258d = fVar;
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(818859545);
                        mVar2.f();
                    }
                    AddTIEventViewModel addTIEventViewModelA6 = tVar.A6();
                    boolean z14 = tVar.A6().f46443w2;
                    int i16 = tVar.v6().G2;
                    int i17 = tVar.A6().H2;
                    boolean z15 = tVar.A6().C2;
                    boolean zR = mVar2.r(tVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zR) {
                        objQ = new e1(tVar, i15);
                        mVar2.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e1(tVar, i15);
                            mVar2.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar2.r(tVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new f1(tVar, 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f1(tVar, 0);
                            mVar2.K(objQ2);
                        }
                    }
                    yy1.v.d(addTIEventViewModelA6, z14, i16, i17, z15, lVar, (e23.a) objQ2, mVar2, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
