package fz1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import h5.e0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d f73996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f73997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f73998d;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar, r rVar, boolean z14, int i14) {
        this.f73995a = 1;
        this.f73996b = dVar;
        this.f73997c = rVar;
        this.f73998d = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73995a;
        boolean z14 = this.f73998d;
        r rVar = this.f73997c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar = this.f73996b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2144910839, new i(this.f73996b, this.f73997c, this.f73998d, 2, (byte) 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                dVar.u6(rVar, z14, mVar, p0.t(1));
                return Unit.INSTANCE;
            default:
                int iIntValue2 = num.intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81537o, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    dVar.u6(rVar, z14, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar, r rVar, boolean z14, int i14, byte b14) {
        this.f73995a = i14;
        this.f73996b = dVar;
        this.f73997c = rVar;
        this.f73998d = z14;
    }
}
