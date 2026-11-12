package a61;

import b82.g1;
import b82.k1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import kotlin.t1;
import lc.u0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1552b;

    public /* synthetic */ b0(com.garmin.android.apps.connectmobile.performance.b bVar, int i14) {
        this.f1551a = i14;
        this.f1552b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15 = this.f1551a;
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1552b;
        int i16 = 1;
        switch (i15) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1297222267, new b0(bVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39874c[bVar.f39859f.z4().ordinal()];
                    if (i17 == 1) {
                        i14 = 0;
                    } else {
                        if (i17 != 2) {
                            u0.r();
                            return null;
                        }
                        i14 = 1;
                    }
                    i53.f fVarA = i53.a.a(new g1(gl1.y.Q(mVar2, R.string.strength_training_exercises), null, null, null, 14, null), new g1(gl1.y.Q(mVar2, R.string.strength_training_muscles), null, null, null, 14, null));
                    g6.c cVar = (g6.c) mVar2.A(t1.f91490h);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    float fH0 = cVar.H0(d92.c.e(j92.f.f97932i).f157323b.f157308c);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58625c.getClass();
                    float f14 = fH0 + j92.b.f97899b.f97920e;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarH = x2.h(aVar3, f14);
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new z(bVar, 2);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new z(bVar, 2);
                            mVar2.K(objQ);
                        }
                    }
                    k1.a(fVarA, i14, rVarH, null, 0.0f, (e23.l) objQ, mVar2, 3072, 16);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
