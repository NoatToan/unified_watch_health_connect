package bm;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e f18819b;

    public /* synthetic */ j0(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar, int i14) {
        this.f18818a = i14;
        this.f18819b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f18818a;
        final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = this.f18819b;
        final int i15 = 2;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1705377724, new j0(eVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
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
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.label_total_distance_abbr);
                    String str = (String) ((y0) eVar.v6().f28882v.getValue()).d();
                    if (str == null) {
                        str = "";
                    }
                    boolean zR = mVar2.r(eVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: bm.g0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = objArr2;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: bm.g0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = objArr3;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.h(strQ, str, null, null, null, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1020);
                    String strQ2 = gl1.y.Q(mVar2, R.string.activities_trim_start);
                    String str2 = (String) ((y0) eVar.v6().f28883w.getValue()).d();
                    String str3 = str2 == null ? "" : str2;
                    boolean zR2 = mVar2.r(eVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: bm.g0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: bm.g0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.h(strQ2, str3, null, null, null, false, false, null, null, null, (e23.a) objQ2, mVar2, 0, 0, 1020);
                    String strQ3 = gl1.y.Q(mVar2, R.string.activities_trim_end);
                    String str4 = (String) ((y0) eVar.v6().f28884x.getValue()).d();
                    String str5 = str4 == null ? "" : str4;
                    boolean zR3 = mVar2.r(eVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: bm.g0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                        eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar5.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: bm.g0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i15;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar2 = eVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar6 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar7 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
                                            eVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    p2Var.h(strQ3, str5, null, null, null, false, false, null, null, null, (e23.a) objQ3, mVar2, 0, 0, 1020);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
