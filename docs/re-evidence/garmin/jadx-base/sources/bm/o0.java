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
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f f18845b;

    public /* synthetic */ o0(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar, int i14) {
        this.f18844a = i14;
        this.f18845b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f18844a;
        final com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = this.f18845b;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                boolean z14 = false;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                if ((iIntValue & 3) != 2) {
                    z14 = true;
                }
                if (mVar.n(iIntValue & 1, z14)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(356422556, new o0(fVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
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
                    String strQ = gl1.y.Q(mVar2, R.string.activity_stats_details_total_time_label);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar5 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28879q.getValue()).d();
                    String str = aVar5 != null ? aVar5.f28857a : "";
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar6 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28879q.getValue()).d();
                    c0235a.f16962a.put("label_secondary", aVar6 != null ? aVar6.f28858b : "");
                    b92.a aVarB = c0235a.b();
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar7 = p3.m.f135153a;
                    if (zR) {
                        objQ = new e23.a() { // from class: bm.m0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar9 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar10 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar7.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.a() { // from class: bm.m0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar8 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar9 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar10 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    int i17 = b92.a.f16960b;
                    p2Var.h(strQ, str, null, null, aVarB, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1004);
                    String strQ2 = gl1.y.Q(mVar2, R.string.activities_trim_start);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar8 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28880r.getValue()).d();
                    String str2 = aVar8 != null ? aVar8.f28857a : "";
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar9 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28880r.getValue()).d();
                    c0235a2.f16962a.put("label_secondary", aVar9 != null ? aVar9.f28858b : "");
                    b92.a aVarB2 = c0235a2.b();
                    boolean zR2 = mVar2.r(fVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: bm.m0
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                switch (i18) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar10 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar11 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar12 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar7.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: bm.m0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                    switch (i18) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar10 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar11 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar12 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.h(strQ2, str2, null, null, aVarB2, false, false, null, null, null, (e23.a) objQ2, mVar2, 0, 0, 1004);
                    String strQ3 = gl1.y.Q(mVar2, R.string.activities_trim_end);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar10 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28881t.getValue()).d();
                    String str3 = aVar10 != null ? aVar10.f28857a : "";
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a aVar11 = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) ((y0) fVar.v6().f28881t.getValue()).d();
                    c0235a3.f16962a.put("label_secondary", aVar11 != null ? aVar11.f28858b : "");
                    b92.a aVarB3 = c0235a3.b();
                    boolean zR3 = mVar2.r(fVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        final int i18 = 0;
                        objQ3 = new e23.a() { // from class: bm.m0
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                switch (i19) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar12 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar13 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar14 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                        fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar7.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            final int i19 = 0;
                            objQ3 = new e23.a() { // from class: bm.m0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i19;
                                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar2 = fVar;
                                    switch (i110) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar12 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar13 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME);
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar14 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
                                            fVar2.u6(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    p2Var.h(strQ3, str3, null, null, aVarB3, false, false, null, null, null, (e23.a) objQ3, mVar2, 0, 0, 1004);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
